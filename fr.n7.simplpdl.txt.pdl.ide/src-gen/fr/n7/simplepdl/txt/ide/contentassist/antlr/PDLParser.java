/*
 * generated by Xtext 2.12.0
 */
package fr.n7.simplepdl.txt.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.n7.simplepdl.txt.ide.contentassist.antlr.internal.InternalPDLParser;
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PDLParser extends AbstractContentAssistParser {

	@Inject
	private PDLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalPDLParser createParser() {
		InternalPDLParser result = new InternalPDLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getProcessElementAccess().getAlternatives(), "rule__ProcessElement__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getWorkSequenceTypeAccess().getAlternatives(), "rule__WorkSequenceType__Alternatives");
					put(grammarAccess.getProcessAccess().getGroup(), "rule__Process__Group__0");
					put(grammarAccess.getProcessAccess().getGroup_4(), "rule__Process__Group_4__0");
					put(grammarAccess.getProcessAccess().getGroup_4_3(), "rule__Process__Group_4_3__0");
					put(grammarAccess.getWorkDefinitionAccess().getGroup(), "rule__WorkDefinition__Group__0");
					put(grammarAccess.getWorkSequenceAccess().getGroup(), "rule__WorkSequence__Group__0");
					put(grammarAccess.getGuidanceAccess().getGroup(), "rule__Guidance__Group__0");
					put(grammarAccess.getResourcesAccess().getGroup(), "rule__Resources__Group__0");
					put(grammarAccess.getRequeteDeRessourceAccess().getGroup(), "rule__RequeteDeRessource__Group__0");
					put(grammarAccess.getGuidanceLinkAccess().getGroup(), "rule__GuidanceLink__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getProcessAccess().getNameAssignment_2(), "rule__Process__NameAssignment_2");
					put(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_2(), "rule__Process__ProcessElementsAssignment_4_2");
					put(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_3_1(), "rule__Process__ProcessElementsAssignment_4_3_1");
					put(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2(), "rule__WorkDefinition__NameAssignment_2");
					put(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1(), "rule__WorkSequence__LinkTypeAssignment_1");
					put(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3(), "rule__WorkSequence__PredecessorAssignment_3");
					put(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5(), "rule__WorkSequence__SuccessorAssignment_5");
					put(grammarAccess.getGuidanceAccess().getTextAssignment_1(), "rule__Guidance__TextAssignment_1");
					put(grammarAccess.getResourcesAccess().getNameAssignment_1(), "rule__Resources__NameAssignment_1");
					put(grammarAccess.getResourcesAccess().getQuantiteAssignment_3(), "rule__Resources__QuantiteAssignment_3");
					put(grammarAccess.getRequeteDeRessourceAccess().getQuantiteAssignment_2(), "rule__RequeteDeRessource__QuantiteAssignment_2");
					put(grammarAccess.getRequeteDeRessourceAccess().getResourcesAssignment_4(), "rule__RequeteDeRessource__ResourcesAssignment_4");
					put(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionAssignment_6(), "rule__RequeteDeRessource__WorkdefinitionAssignment_6");
					put(grammarAccess.getGuidanceLinkAccess().getGuidanceAssignment_2(), "rule__GuidanceLink__GuidanceAssignment_2");
					put(grammarAccess.getGuidanceLinkAccess().getWorkdefinitionAssignment_4(), "rule__GuidanceLink__WorkdefinitionAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
