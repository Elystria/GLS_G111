package fr.n7.simplepdl.txt.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'startToStart'", "'finishToStart'", "'startToFinish'", "'finishToFinish'", "'Process'", "'{'", "'}'", "'processElements'", "','", "'WorkDefinition'", "'linksToPredecessors'", "'('", "')'", "'linksToSuccessors'", "'linktoresource'", "'WorkSequence'", "'linkType'", "'predecessor'", "'successor'", "'Guidance'", "'text'", "'elements'", "'Resources'", "'quantite'", "'RequeteDeRessource'", "'resources'", "'workdefinition'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL.g"; }


    	private PDLGrammarAccess grammarAccess;

    	public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProcess"
    // InternalPDL.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL.g:54:1: ( ruleProcess EOF )
            // InternalPDL.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL.g:78:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalPDL.g:79:1: ( ruleProcessElement EOF )
            // InternalPDL.g:80:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL.g:87:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:91:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // InternalPDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            {
            // InternalPDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            // InternalPDL.g:93:3: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // InternalPDL.g:94:3: ( rule__ProcessElement__Alternatives )
            // InternalPDL.g:94:4: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleEString"
    // InternalPDL.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPDL.g:104:1: ( ruleEString EOF )
            // InternalPDL.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPDL.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPDL.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPDL.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalPDL.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPDL.g:119:3: ( rule__EString__Alternatives )
            // InternalPDL.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL.g:128:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDL.g:129:1: ( ruleWorkDefinition EOF )
            // InternalPDL.g:130:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL.g:137:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:141:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalPDL.g:142:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalPDL.g:142:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalPDL.g:143:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalPDL.g:144:3: ( rule__WorkDefinition__Group__0 )
            // InternalPDL.g:144:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL.g:153:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL.g:154:1: ( ruleWorkSequence EOF )
            // InternalPDL.g:155:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL.g:162:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:166:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL.g:167:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL.g:167:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL.g:168:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL.g:169:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL.g:169:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL.g:178:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalPDL.g:179:1: ( ruleGuidance EOF )
            // InternalPDL.g:180:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL.g:187:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:191:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalPDL.g:192:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalPDL.g:192:2: ( ( rule__Guidance__Group__0 ) )
            // InternalPDL.g:193:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalPDL.g:194:3: ( rule__Guidance__Group__0 )
            // InternalPDL.g:194:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleResources"
    // InternalPDL.g:203:1: entryRuleResources : ruleResources EOF ;
    public final void entryRuleResources() throws RecognitionException {
        try {
            // InternalPDL.g:204:1: ( ruleResources EOF )
            // InternalPDL.g:205:1: ruleResources EOF
            {
             before(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_1);
            ruleResources();

            state._fsp--;

             after(grammarAccess.getResourcesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // InternalPDL.g:212:1: ruleResources : ( ( rule__Resources__Group__0 ) ) ;
    public final void ruleResources() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:216:2: ( ( ( rule__Resources__Group__0 ) ) )
            // InternalPDL.g:217:2: ( ( rule__Resources__Group__0 ) )
            {
            // InternalPDL.g:217:2: ( ( rule__Resources__Group__0 ) )
            // InternalPDL.g:218:3: ( rule__Resources__Group__0 )
            {
             before(grammarAccess.getResourcesAccess().getGroup()); 
            // InternalPDL.g:219:3: ( rule__Resources__Group__0 )
            // InternalPDL.g:219:4: rule__Resources__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleRequeteDeRessource"
    // InternalPDL.g:228:1: entryRuleRequeteDeRessource : ruleRequeteDeRessource EOF ;
    public final void entryRuleRequeteDeRessource() throws RecognitionException {
        try {
            // InternalPDL.g:229:1: ( ruleRequeteDeRessource EOF )
            // InternalPDL.g:230:1: ruleRequeteDeRessource EOF
            {
             before(grammarAccess.getRequeteDeRessourceRule()); 
            pushFollow(FOLLOW_1);
            ruleRequeteDeRessource();

            state._fsp--;

             after(grammarAccess.getRequeteDeRessourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequeteDeRessource"


    // $ANTLR start "ruleRequeteDeRessource"
    // InternalPDL.g:237:1: ruleRequeteDeRessource : ( ( rule__RequeteDeRessource__Group__0 ) ) ;
    public final void ruleRequeteDeRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:241:2: ( ( ( rule__RequeteDeRessource__Group__0 ) ) )
            // InternalPDL.g:242:2: ( ( rule__RequeteDeRessource__Group__0 ) )
            {
            // InternalPDL.g:242:2: ( ( rule__RequeteDeRessource__Group__0 ) )
            // InternalPDL.g:243:3: ( rule__RequeteDeRessource__Group__0 )
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getGroup()); 
            // InternalPDL.g:244:3: ( rule__RequeteDeRessource__Group__0 )
            // InternalPDL.g:244:4: rule__RequeteDeRessource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequeteDeRessourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequeteDeRessource"


    // $ANTLR start "entryRuleEInt"
    // InternalPDL.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalPDL.g:254:1: ( ruleEInt EOF )
            // InternalPDL.g:255:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPDL.g:262:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:266:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalPDL.g:267:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalPDL.g:267:2: ( ( rule__EInt__Group__0 ) )
            // InternalPDL.g:268:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalPDL.g:269:3: ( rule__EInt__Group__0 )
            // InternalPDL.g:269:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL.g:278:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:282:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL.g:283:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL.g:283:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL.g:284:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL.g:285:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL.g:285:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // InternalPDL.g:293:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleResources ) | ( ruleRequeteDeRessource ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:297:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleResources ) | ( ruleRequeteDeRessource ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 30:
                {
                alt1=3;
                }
                break;
            case 33:
                {
                alt1=4;
                }
                break;
            case 35:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPDL.g:298:2: ( ruleWorkDefinition )
                    {
                    // InternalPDL.g:298:2: ( ruleWorkDefinition )
                    // InternalPDL.g:299:3: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:304:2: ( ruleWorkSequence )
                    {
                    // InternalPDL.g:304:2: ( ruleWorkSequence )
                    // InternalPDL.g:305:3: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:310:2: ( ruleGuidance )
                    {
                    // InternalPDL.g:310:2: ( ruleGuidance )
                    // InternalPDL.g:311:3: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:316:2: ( ruleResources )
                    {
                    // InternalPDL.g:316:2: ( ruleResources )
                    // InternalPDL.g:317:3: ruleResources
                    {
                     before(grammarAccess.getProcessElementAccess().getResourcesParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleResources();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getResourcesParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPDL.g:322:2: ( ruleRequeteDeRessource )
                    {
                    // InternalPDL.g:322:2: ( ruleRequeteDeRessource )
                    // InternalPDL.g:323:3: ruleRequeteDeRessource
                    {
                     before(grammarAccess.getProcessElementAccess().getRequeteDeRessourceParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRequeteDeRessource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRequeteDeRessourceParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPDL.g:332:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:336:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPDL.g:337:2: ( RULE_STRING )
                    {
                    // InternalPDL.g:337:2: ( RULE_STRING )
                    // InternalPDL.g:338:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:343:2: ( RULE_ID )
                    {
                    // InternalPDL.g:343:2: ( RULE_ID )
                    // InternalPDL.g:344:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL.g:353:1: rule__WorkSequenceType__Alternatives : ( ( ( 'startToStart' ) ) | ( ( 'finishToStart' ) ) | ( ( 'startToFinish' ) ) | ( ( 'finishToFinish' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:357:1: ( ( ( 'startToStart' ) ) | ( ( 'finishToStart' ) ) | ( ( 'startToFinish' ) ) | ( ( 'finishToFinish' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPDL.g:358:2: ( ( 'startToStart' ) )
                    {
                    // InternalPDL.g:358:2: ( ( 'startToStart' ) )
                    // InternalPDL.g:359:3: ( 'startToStart' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 
                    // InternalPDL.g:360:3: ( 'startToStart' )
                    // InternalPDL.g:360:4: 'startToStart'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:364:2: ( ( 'finishToStart' ) )
                    {
                    // InternalPDL.g:364:2: ( ( 'finishToStart' ) )
                    // InternalPDL.g:365:3: ( 'finishToStart' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 
                    // InternalPDL.g:366:3: ( 'finishToStart' )
                    // InternalPDL.g:366:4: 'finishToStart'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:370:2: ( ( 'startToFinish' ) )
                    {
                    // InternalPDL.g:370:2: ( ( 'startToFinish' ) )
                    // InternalPDL.g:371:3: ( 'startToFinish' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 
                    // InternalPDL.g:372:3: ( 'startToFinish' )
                    // InternalPDL.g:372:4: 'startToFinish'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:376:2: ( ( 'finishToFinish' ) )
                    {
                    // InternalPDL.g:376:2: ( ( 'finishToFinish' ) )
                    // InternalPDL.g:377:3: ( 'finishToFinish' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 
                    // InternalPDL.g:378:3: ( 'finishToFinish' )
                    // InternalPDL.g:378:4: 'finishToFinish'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDL.g:386:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:390:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL.g:391:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDL.g:398:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:402:1: ( ( () ) )
            // InternalPDL.g:403:1: ( () )
            {
            // InternalPDL.g:403:1: ( () )
            // InternalPDL.g:404:2: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0()); 
            // InternalPDL.g:405:2: ()
            // InternalPDL.g:405:3: 
            {
            }

             after(grammarAccess.getProcessAccess().getProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDL.g:413:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:417:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL.g:418:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDL.g:425:1: rule__Process__Group__1__Impl : ( 'Process' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:429:1: ( ( 'Process' ) )
            // InternalPDL.g:430:1: ( 'Process' )
            {
            // InternalPDL.g:430:1: ( 'Process' )
            // InternalPDL.g:431:2: 'Process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDL.g:440:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:444:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL.g:445:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDL.g:452:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:456:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // InternalPDL.g:457:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // InternalPDL.g:457:1: ( ( rule__Process__NameAssignment_2 ) )
            // InternalPDL.g:458:2: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // InternalPDL.g:459:2: ( rule__Process__NameAssignment_2 )
            // InternalPDL.g:459:3: rule__Process__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDL.g:467:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:471:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL.g:472:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDL.g:479:1: rule__Process__Group__3__Impl : ( '{' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:483:1: ( ( '{' ) )
            // InternalPDL.g:484:1: ( '{' )
            {
            // InternalPDL.g:484:1: ( '{' )
            // InternalPDL.g:485:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDL.g:494:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:498:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalPDL.g:499:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDL.g:506:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )? ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:510:1: ( ( ( rule__Process__Group_4__0 )? ) )
            // InternalPDL.g:511:1: ( ( rule__Process__Group_4__0 )? )
            {
            // InternalPDL.g:511:1: ( ( rule__Process__Group_4__0 )? )
            // InternalPDL.g:512:2: ( rule__Process__Group_4__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_4()); 
            // InternalPDL.g:513:2: ( rule__Process__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL.g:513:3: rule__Process__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalPDL.g:521:1: rule__Process__Group__5 : rule__Process__Group__5__Impl ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:525:1: ( rule__Process__Group__5__Impl )
            // InternalPDL.g:526:2: rule__Process__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalPDL.g:532:1: rule__Process__Group__5__Impl : ( '}' ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:536:1: ( ( '}' ) )
            // InternalPDL.g:537:1: ( '}' )
            {
            // InternalPDL.g:537:1: ( '}' )
            // InternalPDL.g:538:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group_4__0"
    // InternalPDL.g:548:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:552:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // InternalPDL.g:553:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0"


    // $ANTLR start "rule__Process__Group_4__0__Impl"
    // InternalPDL.g:560:1: rule__Process__Group_4__0__Impl : ( 'processElements' ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:564:1: ( ( 'processElements' ) )
            // InternalPDL.g:565:1: ( 'processElements' )
            {
            // InternalPDL.g:565:1: ( 'processElements' )
            // InternalPDL.g:566:2: 'processElements'
            {
             before(grammarAccess.getProcessAccess().getProcessElementsKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessElementsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0__Impl"


    // $ANTLR start "rule__Process__Group_4__1"
    // InternalPDL.g:575:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl rule__Process__Group_4__2 ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:579:1: ( rule__Process__Group_4__1__Impl rule__Process__Group_4__2 )
            // InternalPDL.g:580:2: rule__Process__Group_4__1__Impl rule__Process__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1"


    // $ANTLR start "rule__Process__Group_4__1__Impl"
    // InternalPDL.g:587:1: rule__Process__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:591:1: ( ( '{' ) )
            // InternalPDL.g:592:1: ( '{' )
            {
            // InternalPDL.g:592:1: ( '{' )
            // InternalPDL.g:593:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1__Impl"


    // $ANTLR start "rule__Process__Group_4__2"
    // InternalPDL.g:602:1: rule__Process__Group_4__2 : rule__Process__Group_4__2__Impl rule__Process__Group_4__3 ;
    public final void rule__Process__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:606:1: ( rule__Process__Group_4__2__Impl rule__Process__Group_4__3 )
            // InternalPDL.g:607:2: rule__Process__Group_4__2__Impl rule__Process__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__2"


    // $ANTLR start "rule__Process__Group_4__2__Impl"
    // InternalPDL.g:614:1: rule__Process__Group_4__2__Impl : ( ( rule__Process__ProcessElementsAssignment_4_2 ) ) ;
    public final void rule__Process__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:618:1: ( ( ( rule__Process__ProcessElementsAssignment_4_2 ) ) )
            // InternalPDL.g:619:1: ( ( rule__Process__ProcessElementsAssignment_4_2 ) )
            {
            // InternalPDL.g:619:1: ( ( rule__Process__ProcessElementsAssignment_4_2 ) )
            // InternalPDL.g:620:2: ( rule__Process__ProcessElementsAssignment_4_2 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_2()); 
            // InternalPDL.g:621:2: ( rule__Process__ProcessElementsAssignment_4_2 )
            // InternalPDL.g:621:3: rule__Process__ProcessElementsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__ProcessElementsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__2__Impl"


    // $ANTLR start "rule__Process__Group_4__3"
    // InternalPDL.g:629:1: rule__Process__Group_4__3 : rule__Process__Group_4__3__Impl rule__Process__Group_4__4 ;
    public final void rule__Process__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:633:1: ( rule__Process__Group_4__3__Impl rule__Process__Group_4__4 )
            // InternalPDL.g:634:2: rule__Process__Group_4__3__Impl rule__Process__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__3"


    // $ANTLR start "rule__Process__Group_4__3__Impl"
    // InternalPDL.g:641:1: rule__Process__Group_4__3__Impl : ( ( rule__Process__Group_4_3__0 )* ) ;
    public final void rule__Process__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:645:1: ( ( ( rule__Process__Group_4_3__0 )* ) )
            // InternalPDL.g:646:1: ( ( rule__Process__Group_4_3__0 )* )
            {
            // InternalPDL.g:646:1: ( ( rule__Process__Group_4_3__0 )* )
            // InternalPDL.g:647:2: ( rule__Process__Group_4_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_4_3()); 
            // InternalPDL.g:648:2: ( rule__Process__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPDL.g:648:3: rule__Process__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Process__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__3__Impl"


    // $ANTLR start "rule__Process__Group_4__4"
    // InternalPDL.g:656:1: rule__Process__Group_4__4 : rule__Process__Group_4__4__Impl ;
    public final void rule__Process__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:660:1: ( rule__Process__Group_4__4__Impl )
            // InternalPDL.g:661:2: rule__Process__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__4"


    // $ANTLR start "rule__Process__Group_4__4__Impl"
    // InternalPDL.g:667:1: rule__Process__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:671:1: ( ( '}' ) )
            // InternalPDL.g:672:1: ( '}' )
            {
            // InternalPDL.g:672:1: ( '}' )
            // InternalPDL.g:673:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__4__Impl"


    // $ANTLR start "rule__Process__Group_4_3__0"
    // InternalPDL.g:683:1: rule__Process__Group_4_3__0 : rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 ;
    public final void rule__Process__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:687:1: ( rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 )
            // InternalPDL.g:688:2: rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__0"


    // $ANTLR start "rule__Process__Group_4_3__0__Impl"
    // InternalPDL.g:695:1: rule__Process__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:699:1: ( ( ',' ) )
            // InternalPDL.g:700:1: ( ',' )
            {
            // InternalPDL.g:700:1: ( ',' )
            // InternalPDL.g:701:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__0__Impl"


    // $ANTLR start "rule__Process__Group_4_3__1"
    // InternalPDL.g:710:1: rule__Process__Group_4_3__1 : rule__Process__Group_4_3__1__Impl ;
    public final void rule__Process__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:714:1: ( rule__Process__Group_4_3__1__Impl )
            // InternalPDL.g:715:2: rule__Process__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__1"


    // $ANTLR start "rule__Process__Group_4_3__1__Impl"
    // InternalPDL.g:721:1: rule__Process__Group_4_3__1__Impl : ( ( rule__Process__ProcessElementsAssignment_4_3_1 ) ) ;
    public final void rule__Process__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:725:1: ( ( ( rule__Process__ProcessElementsAssignment_4_3_1 ) ) )
            // InternalPDL.g:726:1: ( ( rule__Process__ProcessElementsAssignment_4_3_1 ) )
            {
            // InternalPDL.g:726:1: ( ( rule__Process__ProcessElementsAssignment_4_3_1 ) )
            // InternalPDL.g:727:2: ( rule__Process__ProcessElementsAssignment_4_3_1 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_3_1()); 
            // InternalPDL.g:728:2: ( rule__Process__ProcessElementsAssignment_4_3_1 )
            // InternalPDL.g:728:3: rule__Process__ProcessElementsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ProcessElementsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalPDL.g:737:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:741:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalPDL.g:742:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalPDL.g:749:1: rule__WorkDefinition__Group__0__Impl : ( () ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:753:1: ( ( () ) )
            // InternalPDL.g:754:1: ( () )
            {
            // InternalPDL.g:754:1: ( () )
            // InternalPDL.g:755:2: ()
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 
            // InternalPDL.g:756:2: ()
            // InternalPDL.g:756:3: 
            {
            }

             after(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalPDL.g:764:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:768:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalPDL.g:769:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalPDL.g:776:1: rule__WorkDefinition__Group__1__Impl : ( 'WorkDefinition' ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:780:1: ( ( 'WorkDefinition' ) )
            // InternalPDL.g:781:1: ( 'WorkDefinition' )
            {
            // InternalPDL.g:781:1: ( 'WorkDefinition' )
            // InternalPDL.g:782:2: 'WorkDefinition'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalPDL.g:791:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:795:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // InternalPDL.g:796:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalPDL.g:803:1: rule__WorkDefinition__Group__2__Impl : ( ( rule__WorkDefinition__NameAssignment_2 ) ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:807:1: ( ( ( rule__WorkDefinition__NameAssignment_2 ) ) )
            // InternalPDL.g:808:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            {
            // InternalPDL.g:808:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            // InternalPDL.g:809:2: ( rule__WorkDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 
            // InternalPDL.g:810:2: ( rule__WorkDefinition__NameAssignment_2 )
            // InternalPDL.g:810:3: rule__WorkDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__3"
    // InternalPDL.g:818:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:822:1: ( rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 )
            // InternalPDL.g:823:2: rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__3"


    // $ANTLR start "rule__WorkDefinition__Group__3__Impl"
    // InternalPDL.g:830:1: rule__WorkDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:834:1: ( ( '{' ) )
            // InternalPDL.g:835:1: ( '{' )
            {
            // InternalPDL.g:835:1: ( '{' )
            // InternalPDL.g:836:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__4"
    // InternalPDL.g:845:1: rule__WorkDefinition__Group__4 : rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 ;
    public final void rule__WorkDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:849:1: ( rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 )
            // InternalPDL.g:850:2: rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__WorkDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__4"


    // $ANTLR start "rule__WorkDefinition__Group__4__Impl"
    // InternalPDL.g:857:1: rule__WorkDefinition__Group__4__Impl : ( ( rule__WorkDefinition__Group_4__0 )? ) ;
    public final void rule__WorkDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:861:1: ( ( ( rule__WorkDefinition__Group_4__0 )? ) )
            // InternalPDL.g:862:1: ( ( rule__WorkDefinition__Group_4__0 )? )
            {
            // InternalPDL.g:862:1: ( ( rule__WorkDefinition__Group_4__0 )? )
            // InternalPDL.g:863:2: ( rule__WorkDefinition__Group_4__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_4()); 
            // InternalPDL.g:864:2: ( rule__WorkDefinition__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPDL.g:864:3: rule__WorkDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__5"
    // InternalPDL.g:872:1: rule__WorkDefinition__Group__5 : rule__WorkDefinition__Group__5__Impl rule__WorkDefinition__Group__6 ;
    public final void rule__WorkDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:876:1: ( rule__WorkDefinition__Group__5__Impl rule__WorkDefinition__Group__6 )
            // InternalPDL.g:877:2: rule__WorkDefinition__Group__5__Impl rule__WorkDefinition__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__WorkDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__5"


    // $ANTLR start "rule__WorkDefinition__Group__5__Impl"
    // InternalPDL.g:884:1: rule__WorkDefinition__Group__5__Impl : ( ( rule__WorkDefinition__Group_5__0 )? ) ;
    public final void rule__WorkDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:888:1: ( ( ( rule__WorkDefinition__Group_5__0 )? ) )
            // InternalPDL.g:889:1: ( ( rule__WorkDefinition__Group_5__0 )? )
            {
            // InternalPDL.g:889:1: ( ( rule__WorkDefinition__Group_5__0 )? )
            // InternalPDL.g:890:2: ( rule__WorkDefinition__Group_5__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_5()); 
            // InternalPDL.g:891:2: ( rule__WorkDefinition__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPDL.g:891:3: rule__WorkDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__5__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__6"
    // InternalPDL.g:899:1: rule__WorkDefinition__Group__6 : rule__WorkDefinition__Group__6__Impl rule__WorkDefinition__Group__7 ;
    public final void rule__WorkDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:903:1: ( rule__WorkDefinition__Group__6__Impl rule__WorkDefinition__Group__7 )
            // InternalPDL.g:904:2: rule__WorkDefinition__Group__6__Impl rule__WorkDefinition__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__WorkDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__6"


    // $ANTLR start "rule__WorkDefinition__Group__6__Impl"
    // InternalPDL.g:911:1: rule__WorkDefinition__Group__6__Impl : ( ( rule__WorkDefinition__Group_6__0 )? ) ;
    public final void rule__WorkDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:915:1: ( ( ( rule__WorkDefinition__Group_6__0 )? ) )
            // InternalPDL.g:916:1: ( ( rule__WorkDefinition__Group_6__0 )? )
            {
            // InternalPDL.g:916:1: ( ( rule__WorkDefinition__Group_6__0 )? )
            // InternalPDL.g:917:2: ( rule__WorkDefinition__Group_6__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_6()); 
            // InternalPDL.g:918:2: ( rule__WorkDefinition__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPDL.g:918:3: rule__WorkDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__6__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__7"
    // InternalPDL.g:926:1: rule__WorkDefinition__Group__7 : rule__WorkDefinition__Group__7__Impl ;
    public final void rule__WorkDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:930:1: ( rule__WorkDefinition__Group__7__Impl )
            // InternalPDL.g:931:2: rule__WorkDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__7"


    // $ANTLR start "rule__WorkDefinition__Group__7__Impl"
    // InternalPDL.g:937:1: rule__WorkDefinition__Group__7__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:941:1: ( ( '}' ) )
            // InternalPDL.g:942:1: ( '}' )
            {
            // InternalPDL.g:942:1: ( '}' )
            // InternalPDL.g:943:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__7__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__0"
    // InternalPDL.g:953:1: rule__WorkDefinition__Group_4__0 : rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1 ;
    public final void rule__WorkDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:957:1: ( rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1 )
            // InternalPDL.g:958:2: rule__WorkDefinition__Group_4__0__Impl rule__WorkDefinition__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__WorkDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__0"


    // $ANTLR start "rule__WorkDefinition__Group_4__0__Impl"
    // InternalPDL.g:965:1: rule__WorkDefinition__Group_4__0__Impl : ( 'linksToPredecessors' ) ;
    public final void rule__WorkDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:969:1: ( ( 'linksToPredecessors' ) )
            // InternalPDL.g:970:1: ( 'linksToPredecessors' )
            {
            // InternalPDL.g:970:1: ( 'linksToPredecessors' )
            // InternalPDL.g:971:2: 'linksToPredecessors'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__1"
    // InternalPDL.g:980:1: rule__WorkDefinition__Group_4__1 : rule__WorkDefinition__Group_4__1__Impl rule__WorkDefinition__Group_4__2 ;
    public final void rule__WorkDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:984:1: ( rule__WorkDefinition__Group_4__1__Impl rule__WorkDefinition__Group_4__2 )
            // InternalPDL.g:985:2: rule__WorkDefinition__Group_4__1__Impl rule__WorkDefinition__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__1"


    // $ANTLR start "rule__WorkDefinition__Group_4__1__Impl"
    // InternalPDL.g:992:1: rule__WorkDefinition__Group_4__1__Impl : ( '(' ) ;
    public final void rule__WorkDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:996:1: ( ( '(' ) )
            // InternalPDL.g:997:1: ( '(' )
            {
            // InternalPDL.g:997:1: ( '(' )
            // InternalPDL.g:998:2: '('
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__2"
    // InternalPDL.g:1007:1: rule__WorkDefinition__Group_4__2 : rule__WorkDefinition__Group_4__2__Impl rule__WorkDefinition__Group_4__3 ;
    public final void rule__WorkDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1011:1: ( rule__WorkDefinition__Group_4__2__Impl rule__WorkDefinition__Group_4__3 )
            // InternalPDL.g:1012:2: rule__WorkDefinition__Group_4__2__Impl rule__WorkDefinition__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__2"


    // $ANTLR start "rule__WorkDefinition__Group_4__2__Impl"
    // InternalPDL.g:1019:1: rule__WorkDefinition__Group_4__2__Impl : ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 ) ) ;
    public final void rule__WorkDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1023:1: ( ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 ) ) )
            // InternalPDL.g:1024:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 ) )
            {
            // InternalPDL.g:1024:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 ) )
            // InternalPDL.g:1025:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_2()); 
            // InternalPDL.g:1026:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 )
            // InternalPDL.g:1026:3: rule__WorkDefinition__LinksToPredecessorsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToPredecessorsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__3"
    // InternalPDL.g:1034:1: rule__WorkDefinition__Group_4__3 : rule__WorkDefinition__Group_4__3__Impl rule__WorkDefinition__Group_4__4 ;
    public final void rule__WorkDefinition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1038:1: ( rule__WorkDefinition__Group_4__3__Impl rule__WorkDefinition__Group_4__4 )
            // InternalPDL.g:1039:2: rule__WorkDefinition__Group_4__3__Impl rule__WorkDefinition__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__3"


    // $ANTLR start "rule__WorkDefinition__Group_4__3__Impl"
    // InternalPDL.g:1046:1: rule__WorkDefinition__Group_4__3__Impl : ( ( rule__WorkDefinition__Group_4_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1050:1: ( ( ( rule__WorkDefinition__Group_4_3__0 )* ) )
            // InternalPDL.g:1051:1: ( ( rule__WorkDefinition__Group_4_3__0 )* )
            {
            // InternalPDL.g:1051:1: ( ( rule__WorkDefinition__Group_4_3__0 )* )
            // InternalPDL.g:1052:2: ( rule__WorkDefinition__Group_4_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_4_3()); 
            // InternalPDL.g:1053:2: ( rule__WorkDefinition__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPDL.g:1053:3: rule__WorkDefinition__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__WorkDefinition__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4__4"
    // InternalPDL.g:1061:1: rule__WorkDefinition__Group_4__4 : rule__WorkDefinition__Group_4__4__Impl ;
    public final void rule__WorkDefinition__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1065:1: ( rule__WorkDefinition__Group_4__4__Impl )
            // InternalPDL.g:1066:2: rule__WorkDefinition__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__4"


    // $ANTLR start "rule__WorkDefinition__Group_4__4__Impl"
    // InternalPDL.g:1072:1: rule__WorkDefinition__Group_4__4__Impl : ( ')' ) ;
    public final void rule__WorkDefinition__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1076:1: ( ( ')' ) )
            // InternalPDL.g:1077:1: ( ')' )
            {
            // InternalPDL.g:1077:1: ( ')' )
            // InternalPDL.g:1078:2: ')'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4_3__0"
    // InternalPDL.g:1088:1: rule__WorkDefinition__Group_4_3__0 : rule__WorkDefinition__Group_4_3__0__Impl rule__WorkDefinition__Group_4_3__1 ;
    public final void rule__WorkDefinition__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1092:1: ( rule__WorkDefinition__Group_4_3__0__Impl rule__WorkDefinition__Group_4_3__1 )
            // InternalPDL.g:1093:2: rule__WorkDefinition__Group_4_3__0__Impl rule__WorkDefinition__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_4_3__0__Impl"
    // InternalPDL.g:1100:1: rule__WorkDefinition__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1104:1: ( ( ',' ) )
            // InternalPDL.g:1105:1: ( ',' )
            {
            // InternalPDL.g:1105:1: ( ',' )
            // InternalPDL.g:1106:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_4_3__1"
    // InternalPDL.g:1115:1: rule__WorkDefinition__Group_4_3__1 : rule__WorkDefinition__Group_4_3__1__Impl ;
    public final void rule__WorkDefinition__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1119:1: ( rule__WorkDefinition__Group_4_3__1__Impl )
            // InternalPDL.g:1120:2: rule__WorkDefinition__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_4_3__1__Impl"
    // InternalPDL.g:1126:1: rule__WorkDefinition__Group_4_3__1__Impl : ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1130:1: ( ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 ) ) )
            // InternalPDL.g:1131:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 ) )
            {
            // InternalPDL.g:1131:1: ( ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 ) )
            // InternalPDL.g:1132:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_3_1()); 
            // InternalPDL.g:1133:2: ( rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 )
            // InternalPDL.g:1133:3: rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_4_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__0"
    // InternalPDL.g:1142:1: rule__WorkDefinition__Group_5__0 : rule__WorkDefinition__Group_5__0__Impl rule__WorkDefinition__Group_5__1 ;
    public final void rule__WorkDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1146:1: ( rule__WorkDefinition__Group_5__0__Impl rule__WorkDefinition__Group_5__1 )
            // InternalPDL.g:1147:2: rule__WorkDefinition__Group_5__0__Impl rule__WorkDefinition__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__WorkDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__0"


    // $ANTLR start "rule__WorkDefinition__Group_5__0__Impl"
    // InternalPDL.g:1154:1: rule__WorkDefinition__Group_5__0__Impl : ( 'linksToSuccessors' ) ;
    public final void rule__WorkDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1158:1: ( ( 'linksToSuccessors' ) )
            // InternalPDL.g:1159:1: ( 'linksToSuccessors' )
            {
            // InternalPDL.g:1159:1: ( 'linksToSuccessors' )
            // InternalPDL.g:1160:2: 'linksToSuccessors'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__1"
    // InternalPDL.g:1169:1: rule__WorkDefinition__Group_5__1 : rule__WorkDefinition__Group_5__1__Impl rule__WorkDefinition__Group_5__2 ;
    public final void rule__WorkDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1173:1: ( rule__WorkDefinition__Group_5__1__Impl rule__WorkDefinition__Group_5__2 )
            // InternalPDL.g:1174:2: rule__WorkDefinition__Group_5__1__Impl rule__WorkDefinition__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__1"


    // $ANTLR start "rule__WorkDefinition__Group_5__1__Impl"
    // InternalPDL.g:1181:1: rule__WorkDefinition__Group_5__1__Impl : ( '(' ) ;
    public final void rule__WorkDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1185:1: ( ( '(' ) )
            // InternalPDL.g:1186:1: ( '(' )
            {
            // InternalPDL.g:1186:1: ( '(' )
            // InternalPDL.g:1187:2: '('
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__2"
    // InternalPDL.g:1196:1: rule__WorkDefinition__Group_5__2 : rule__WorkDefinition__Group_5__2__Impl rule__WorkDefinition__Group_5__3 ;
    public final void rule__WorkDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1200:1: ( rule__WorkDefinition__Group_5__2__Impl rule__WorkDefinition__Group_5__3 )
            // InternalPDL.g:1201:2: rule__WorkDefinition__Group_5__2__Impl rule__WorkDefinition__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__2"


    // $ANTLR start "rule__WorkDefinition__Group_5__2__Impl"
    // InternalPDL.g:1208:1: rule__WorkDefinition__Group_5__2__Impl : ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 ) ) ;
    public final void rule__WorkDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1212:1: ( ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 ) ) )
            // InternalPDL.g:1213:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 ) )
            {
            // InternalPDL.g:1213:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 ) )
            // InternalPDL.g:1214:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_5_2()); 
            // InternalPDL.g:1215:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 )
            // InternalPDL.g:1215:3: rule__WorkDefinition__LinksToSuccessorsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToSuccessorsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__3"
    // InternalPDL.g:1223:1: rule__WorkDefinition__Group_5__3 : rule__WorkDefinition__Group_5__3__Impl rule__WorkDefinition__Group_5__4 ;
    public final void rule__WorkDefinition__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1227:1: ( rule__WorkDefinition__Group_5__3__Impl rule__WorkDefinition__Group_5__4 )
            // InternalPDL.g:1228:2: rule__WorkDefinition__Group_5__3__Impl rule__WorkDefinition__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__3"


    // $ANTLR start "rule__WorkDefinition__Group_5__3__Impl"
    // InternalPDL.g:1235:1: rule__WorkDefinition__Group_5__3__Impl : ( ( rule__WorkDefinition__Group_5_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1239:1: ( ( ( rule__WorkDefinition__Group_5_3__0 )* ) )
            // InternalPDL.g:1240:1: ( ( rule__WorkDefinition__Group_5_3__0 )* )
            {
            // InternalPDL.g:1240:1: ( ( rule__WorkDefinition__Group_5_3__0 )* )
            // InternalPDL.g:1241:2: ( rule__WorkDefinition__Group_5_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_5_3()); 
            // InternalPDL.g:1242:2: ( rule__WorkDefinition__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPDL.g:1242:3: rule__WorkDefinition__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__WorkDefinition__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5__4"
    // InternalPDL.g:1250:1: rule__WorkDefinition__Group_5__4 : rule__WorkDefinition__Group_5__4__Impl ;
    public final void rule__WorkDefinition__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1254:1: ( rule__WorkDefinition__Group_5__4__Impl )
            // InternalPDL.g:1255:2: rule__WorkDefinition__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__4"


    // $ANTLR start "rule__WorkDefinition__Group_5__4__Impl"
    // InternalPDL.g:1261:1: rule__WorkDefinition__Group_5__4__Impl : ( ')' ) ;
    public final void rule__WorkDefinition__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1265:1: ( ( ')' ) )
            // InternalPDL.g:1266:1: ( ')' )
            {
            // InternalPDL.g:1266:1: ( ')' )
            // InternalPDL.g:1267:2: ')'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_5_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5_3__0"
    // InternalPDL.g:1277:1: rule__WorkDefinition__Group_5_3__0 : rule__WorkDefinition__Group_5_3__0__Impl rule__WorkDefinition__Group_5_3__1 ;
    public final void rule__WorkDefinition__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1281:1: ( rule__WorkDefinition__Group_5_3__0__Impl rule__WorkDefinition__Group_5_3__1 )
            // InternalPDL.g:1282:2: rule__WorkDefinition__Group_5_3__0__Impl rule__WorkDefinition__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_5_3__0__Impl"
    // InternalPDL.g:1289:1: rule__WorkDefinition__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1293:1: ( ( ',' ) )
            // InternalPDL.g:1294:1: ( ',' )
            {
            // InternalPDL.g:1294:1: ( ',' )
            // InternalPDL.g:1295:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_5_3__1"
    // InternalPDL.g:1304:1: rule__WorkDefinition__Group_5_3__1 : rule__WorkDefinition__Group_5_3__1__Impl ;
    public final void rule__WorkDefinition__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1308:1: ( rule__WorkDefinition__Group_5_3__1__Impl )
            // InternalPDL.g:1309:2: rule__WorkDefinition__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_5_3__1__Impl"
    // InternalPDL.g:1315:1: rule__WorkDefinition__Group_5_3__1__Impl : ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1319:1: ( ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 ) ) )
            // InternalPDL.g:1320:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 ) )
            {
            // InternalPDL.g:1320:1: ( ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 ) )
            // InternalPDL.g:1321:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_5_3_1()); 
            // InternalPDL.g:1322:2: ( rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 )
            // InternalPDL.g:1322:3: rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_5_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__0"
    // InternalPDL.g:1331:1: rule__WorkDefinition__Group_6__0 : rule__WorkDefinition__Group_6__0__Impl rule__WorkDefinition__Group_6__1 ;
    public final void rule__WorkDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1335:1: ( rule__WorkDefinition__Group_6__0__Impl rule__WorkDefinition__Group_6__1 )
            // InternalPDL.g:1336:2: rule__WorkDefinition__Group_6__0__Impl rule__WorkDefinition__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__WorkDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__0"


    // $ANTLR start "rule__WorkDefinition__Group_6__0__Impl"
    // InternalPDL.g:1343:1: rule__WorkDefinition__Group_6__0__Impl : ( 'linktoresource' ) ;
    public final void rule__WorkDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1347:1: ( ( 'linktoresource' ) )
            // InternalPDL.g:1348:1: ( 'linktoresource' )
            {
            // InternalPDL.g:1348:1: ( 'linktoresource' )
            // InternalPDL.g:1349:2: 'linktoresource'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinktoresourceKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLinktoresourceKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__1"
    // InternalPDL.g:1358:1: rule__WorkDefinition__Group_6__1 : rule__WorkDefinition__Group_6__1__Impl rule__WorkDefinition__Group_6__2 ;
    public final void rule__WorkDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1362:1: ( rule__WorkDefinition__Group_6__1__Impl rule__WorkDefinition__Group_6__2 )
            // InternalPDL.g:1363:2: rule__WorkDefinition__Group_6__1__Impl rule__WorkDefinition__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__1"


    // $ANTLR start "rule__WorkDefinition__Group_6__1__Impl"
    // InternalPDL.g:1370:1: rule__WorkDefinition__Group_6__1__Impl : ( '(' ) ;
    public final void rule__WorkDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1374:1: ( ( '(' ) )
            // InternalPDL.g:1375:1: ( '(' )
            {
            // InternalPDL.g:1375:1: ( '(' )
            // InternalPDL.g:1376:2: '('
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__2"
    // InternalPDL.g:1385:1: rule__WorkDefinition__Group_6__2 : rule__WorkDefinition__Group_6__2__Impl rule__WorkDefinition__Group_6__3 ;
    public final void rule__WorkDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1389:1: ( rule__WorkDefinition__Group_6__2__Impl rule__WorkDefinition__Group_6__3 )
            // InternalPDL.g:1390:2: rule__WorkDefinition__Group_6__2__Impl rule__WorkDefinition__Group_6__3
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__2"


    // $ANTLR start "rule__WorkDefinition__Group_6__2__Impl"
    // InternalPDL.g:1397:1: rule__WorkDefinition__Group_6__2__Impl : ( ( rule__WorkDefinition__LinktoresourceAssignment_6_2 ) ) ;
    public final void rule__WorkDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1401:1: ( ( ( rule__WorkDefinition__LinktoresourceAssignment_6_2 ) ) )
            // InternalPDL.g:1402:1: ( ( rule__WorkDefinition__LinktoresourceAssignment_6_2 ) )
            {
            // InternalPDL.g:1402:1: ( ( rule__WorkDefinition__LinktoresourceAssignment_6_2 ) )
            // InternalPDL.g:1403:2: ( rule__WorkDefinition__LinktoresourceAssignment_6_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinktoresourceAssignment_6_2()); 
            // InternalPDL.g:1404:2: ( rule__WorkDefinition__LinktoresourceAssignment_6_2 )
            // InternalPDL.g:1404:3: rule__WorkDefinition__LinktoresourceAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinktoresourceAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinktoresourceAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__3"
    // InternalPDL.g:1412:1: rule__WorkDefinition__Group_6__3 : rule__WorkDefinition__Group_6__3__Impl rule__WorkDefinition__Group_6__4 ;
    public final void rule__WorkDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1416:1: ( rule__WorkDefinition__Group_6__3__Impl rule__WorkDefinition__Group_6__4 )
            // InternalPDL.g:1417:2: rule__WorkDefinition__Group_6__3__Impl rule__WorkDefinition__Group_6__4
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__3"


    // $ANTLR start "rule__WorkDefinition__Group_6__3__Impl"
    // InternalPDL.g:1424:1: rule__WorkDefinition__Group_6__3__Impl : ( ( rule__WorkDefinition__Group_6_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1428:1: ( ( ( rule__WorkDefinition__Group_6_3__0 )* ) )
            // InternalPDL.g:1429:1: ( ( rule__WorkDefinition__Group_6_3__0 )* )
            {
            // InternalPDL.g:1429:1: ( ( rule__WorkDefinition__Group_6_3__0 )* )
            // InternalPDL.g:1430:2: ( rule__WorkDefinition__Group_6_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_6_3()); 
            // InternalPDL.g:1431:2: ( rule__WorkDefinition__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPDL.g:1431:3: rule__WorkDefinition__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__WorkDefinition__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6__4"
    // InternalPDL.g:1439:1: rule__WorkDefinition__Group_6__4 : rule__WorkDefinition__Group_6__4__Impl ;
    public final void rule__WorkDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1443:1: ( rule__WorkDefinition__Group_6__4__Impl )
            // InternalPDL.g:1444:2: rule__WorkDefinition__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__4"


    // $ANTLR start "rule__WorkDefinition__Group_6__4__Impl"
    // InternalPDL.g:1450:1: rule__WorkDefinition__Group_6__4__Impl : ( ')' ) ;
    public final void rule__WorkDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1454:1: ( ( ')' ) )
            // InternalPDL.g:1455:1: ( ')' )
            {
            // InternalPDL.g:1455:1: ( ')' )
            // InternalPDL.g:1456:2: ')'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_6_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__0"
    // InternalPDL.g:1466:1: rule__WorkDefinition__Group_6_3__0 : rule__WorkDefinition__Group_6_3__0__Impl rule__WorkDefinition__Group_6_3__1 ;
    public final void rule__WorkDefinition__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1470:1: ( rule__WorkDefinition__Group_6_3__0__Impl rule__WorkDefinition__Group_6_3__1 )
            // InternalPDL.g:1471:2: rule__WorkDefinition__Group_6_3__0__Impl rule__WorkDefinition__Group_6_3__1
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__0__Impl"
    // InternalPDL.g:1478:1: rule__WorkDefinition__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1482:1: ( ( ',' ) )
            // InternalPDL.g:1483:1: ( ',' )
            {
            // InternalPDL.g:1483:1: ( ',' )
            // InternalPDL.g:1484:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__1"
    // InternalPDL.g:1493:1: rule__WorkDefinition__Group_6_3__1 : rule__WorkDefinition__Group_6_3__1__Impl ;
    public final void rule__WorkDefinition__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1497:1: ( rule__WorkDefinition__Group_6_3__1__Impl )
            // InternalPDL.g:1498:2: rule__WorkDefinition__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_6_3__1__Impl"
    // InternalPDL.g:1504:1: rule__WorkDefinition__Group_6_3__1__Impl : ( ( rule__WorkDefinition__LinktoresourceAssignment_6_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1508:1: ( ( ( rule__WorkDefinition__LinktoresourceAssignment_6_3_1 ) ) )
            // InternalPDL.g:1509:1: ( ( rule__WorkDefinition__LinktoresourceAssignment_6_3_1 ) )
            {
            // InternalPDL.g:1509:1: ( ( rule__WorkDefinition__LinktoresourceAssignment_6_3_1 ) )
            // InternalPDL.g:1510:2: ( rule__WorkDefinition__LinktoresourceAssignment_6_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinktoresourceAssignment_6_3_1()); 
            // InternalPDL.g:1511:2: ( rule__WorkDefinition__LinktoresourceAssignment_6_3_1 )
            // InternalPDL.g:1511:3: rule__WorkDefinition__LinktoresourceAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinktoresourceAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinktoresourceAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_6_3__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL.g:1520:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1524:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL.g:1525:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDL.g:1532:1: rule__WorkSequence__Group__0__Impl : ( 'WorkSequence' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1536:1: ( ( 'WorkSequence' ) )
            // InternalPDL.g:1537:1: ( 'WorkSequence' )
            {
            // InternalPDL.g:1537:1: ( 'WorkSequence' )
            // InternalPDL.g:1538:2: 'WorkSequence'
            {
             before(grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDL.g:1547:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1551:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL.g:1552:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDL.g:1559:1: rule__WorkSequence__Group__1__Impl : ( '{' ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1563:1: ( ( '{' ) )
            // InternalPDL.g:1564:1: ( '{' )
            {
            // InternalPDL.g:1564:1: ( '{' )
            // InternalPDL.g:1565:2: '{'
            {
             before(grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDL.g:1574:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1578:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalPDL.g:1579:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDL.g:1586:1: rule__WorkSequence__Group__2__Impl : ( 'linkType' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1590:1: ( ( 'linkType' ) )
            // InternalPDL.g:1591:1: ( 'linkType' )
            {
            // InternalPDL.g:1591:1: ( 'linkType' )
            // InternalPDL.g:1592:2: 'linkType'
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getLinkTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalPDL.g:1601:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1605:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalPDL.g:1606:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalPDL.g:1613:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1617:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_3 ) ) )
            // InternalPDL.g:1618:1: ( ( rule__WorkSequence__LinkTypeAssignment_3 ) )
            {
            // InternalPDL.g:1618:1: ( ( rule__WorkSequence__LinkTypeAssignment_3 ) )
            // InternalPDL.g:1619:2: ( rule__WorkSequence__LinkTypeAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_3()); 
            // InternalPDL.g:1620:2: ( rule__WorkSequence__LinkTypeAssignment_3 )
            // InternalPDL.g:1620:3: rule__WorkSequence__LinkTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalPDL.g:1628:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1632:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalPDL.g:1633:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalPDL.g:1640:1: rule__WorkSequence__Group__4__Impl : ( 'predecessor' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1644:1: ( ( 'predecessor' ) )
            // InternalPDL.g:1645:1: ( 'predecessor' )
            {
            // InternalPDL.g:1645:1: ( 'predecessor' )
            // InternalPDL.g:1646:2: 'predecessor'
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalPDL.g:1655:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6 ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1659:1: ( rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6 )
            // InternalPDL.g:1660:2: rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalPDL.g:1667:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__PredecessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1671:1: ( ( ( rule__WorkSequence__PredecessorAssignment_5 ) ) )
            // InternalPDL.g:1672:1: ( ( rule__WorkSequence__PredecessorAssignment_5 ) )
            {
            // InternalPDL.g:1672:1: ( ( rule__WorkSequence__PredecessorAssignment_5 ) )
            // InternalPDL.g:1673:2: ( rule__WorkSequence__PredecessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_5()); 
            // InternalPDL.g:1674:2: ( rule__WorkSequence__PredecessorAssignment_5 )
            // InternalPDL.g:1674:3: rule__WorkSequence__PredecessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__WorkSequence__Group__6"
    // InternalPDL.g:1682:1: rule__WorkSequence__Group__6 : rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7 ;
    public final void rule__WorkSequence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1686:1: ( rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7 )
            // InternalPDL.g:1687:2: rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__WorkSequence__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__6"


    // $ANTLR start "rule__WorkSequence__Group__6__Impl"
    // InternalPDL.g:1694:1: rule__WorkSequence__Group__6__Impl : ( 'successor' ) ;
    public final void rule__WorkSequence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1698:1: ( ( 'successor' ) )
            // InternalPDL.g:1699:1: ( 'successor' )
            {
            // InternalPDL.g:1699:1: ( 'successor' )
            // InternalPDL.g:1700:2: 'successor'
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__6__Impl"


    // $ANTLR start "rule__WorkSequence__Group__7"
    // InternalPDL.g:1709:1: rule__WorkSequence__Group__7 : rule__WorkSequence__Group__7__Impl rule__WorkSequence__Group__8 ;
    public final void rule__WorkSequence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1713:1: ( rule__WorkSequence__Group__7__Impl rule__WorkSequence__Group__8 )
            // InternalPDL.g:1714:2: rule__WorkSequence__Group__7__Impl rule__WorkSequence__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__WorkSequence__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__7"


    // $ANTLR start "rule__WorkSequence__Group__7__Impl"
    // InternalPDL.g:1721:1: rule__WorkSequence__Group__7__Impl : ( ( rule__WorkSequence__SuccessorAssignment_7 ) ) ;
    public final void rule__WorkSequence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1725:1: ( ( ( rule__WorkSequence__SuccessorAssignment_7 ) ) )
            // InternalPDL.g:1726:1: ( ( rule__WorkSequence__SuccessorAssignment_7 ) )
            {
            // InternalPDL.g:1726:1: ( ( rule__WorkSequence__SuccessorAssignment_7 ) )
            // InternalPDL.g:1727:2: ( rule__WorkSequence__SuccessorAssignment_7 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_7()); 
            // InternalPDL.g:1728:2: ( rule__WorkSequence__SuccessorAssignment_7 )
            // InternalPDL.g:1728:3: rule__WorkSequence__SuccessorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__7__Impl"


    // $ANTLR start "rule__WorkSequence__Group__8"
    // InternalPDL.g:1736:1: rule__WorkSequence__Group__8 : rule__WorkSequence__Group__8__Impl ;
    public final void rule__WorkSequence__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1740:1: ( rule__WorkSequence__Group__8__Impl )
            // InternalPDL.g:1741:2: rule__WorkSequence__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__8"


    // $ANTLR start "rule__WorkSequence__Group__8__Impl"
    // InternalPDL.g:1747:1: rule__WorkSequence__Group__8__Impl : ( '}' ) ;
    public final void rule__WorkSequence__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1751:1: ( ( '}' ) )
            // InternalPDL.g:1752:1: ( '}' )
            {
            // InternalPDL.g:1752:1: ( '}' )
            // InternalPDL.g:1753:2: '}'
            {
             before(grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__8__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDL.g:1763:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1767:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDL.g:1768:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalPDL.g:1775:1: rule__Guidance__Group__0__Impl : ( 'Guidance' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1779:1: ( ( 'Guidance' ) )
            // InternalPDL.g:1780:1: ( 'Guidance' )
            {
            // InternalPDL.g:1780:1: ( 'Guidance' )
            // InternalPDL.g:1781:2: 'Guidance'
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getGuidanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalPDL.g:1790:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1794:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // InternalPDL.g:1795:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalPDL.g:1802:1: rule__Guidance__Group__1__Impl : ( '{' ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1806:1: ( ( '{' ) )
            // InternalPDL.g:1807:1: ( '{' )
            {
            // InternalPDL.g:1807:1: ( '{' )
            // InternalPDL.g:1808:2: '{'
            {
             before(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__2"
    // InternalPDL.g:1817:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1821:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // InternalPDL.g:1822:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // InternalPDL.g:1829:1: rule__Guidance__Group__2__Impl : ( 'text' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1833:1: ( ( 'text' ) )
            // InternalPDL.g:1834:1: ( 'text' )
            {
            // InternalPDL.g:1834:1: ( 'text' )
            // InternalPDL.g:1835:2: 'text'
            {
             before(grammarAccess.getGuidanceAccess().getTextKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTextKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__Guidance__Group__3"
    // InternalPDL.g:1844:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1848:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // InternalPDL.g:1849:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3"


    // $ANTLR start "rule__Guidance__Group__3__Impl"
    // InternalPDL.g:1856:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__TextAssignment_3 ) ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1860:1: ( ( ( rule__Guidance__TextAssignment_3 ) ) )
            // InternalPDL.g:1861:1: ( ( rule__Guidance__TextAssignment_3 ) )
            {
            // InternalPDL.g:1861:1: ( ( rule__Guidance__TextAssignment_3 ) )
            // InternalPDL.g:1862:2: ( rule__Guidance__TextAssignment_3 )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment_3()); 
            // InternalPDL.g:1863:2: ( rule__Guidance__TextAssignment_3 )
            // InternalPDL.g:1863:3: rule__Guidance__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3__Impl"


    // $ANTLR start "rule__Guidance__Group__4"
    // InternalPDL.g:1871:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl rule__Guidance__Group__5 ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1875:1: ( rule__Guidance__Group__4__Impl rule__Guidance__Group__5 )
            // InternalPDL.g:1876:2: rule__Guidance__Group__4__Impl rule__Guidance__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Guidance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4"


    // $ANTLR start "rule__Guidance__Group__4__Impl"
    // InternalPDL.g:1883:1: rule__Guidance__Group__4__Impl : ( ( rule__Guidance__Group_4__0 )? ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1887:1: ( ( ( rule__Guidance__Group_4__0 )? ) )
            // InternalPDL.g:1888:1: ( ( rule__Guidance__Group_4__0 )? )
            {
            // InternalPDL.g:1888:1: ( ( rule__Guidance__Group_4__0 )? )
            // InternalPDL.g:1889:2: ( rule__Guidance__Group_4__0 )?
            {
             before(grammarAccess.getGuidanceAccess().getGroup_4()); 
            // InternalPDL.g:1890:2: ( rule__Guidance__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPDL.g:1890:3: rule__Guidance__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guidance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuidanceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4__Impl"


    // $ANTLR start "rule__Guidance__Group__5"
    // InternalPDL.g:1898:1: rule__Guidance__Group__5 : rule__Guidance__Group__5__Impl ;
    public final void rule__Guidance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1902:1: ( rule__Guidance__Group__5__Impl )
            // InternalPDL.g:1903:2: rule__Guidance__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__5"


    // $ANTLR start "rule__Guidance__Group__5__Impl"
    // InternalPDL.g:1909:1: rule__Guidance__Group__5__Impl : ( '}' ) ;
    public final void rule__Guidance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1913:1: ( ( '}' ) )
            // InternalPDL.g:1914:1: ( '}' )
            {
            // InternalPDL.g:1914:1: ( '}' )
            // InternalPDL.g:1915:2: '}'
            {
             before(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__5__Impl"


    // $ANTLR start "rule__Guidance__Group_4__0"
    // InternalPDL.g:1925:1: rule__Guidance__Group_4__0 : rule__Guidance__Group_4__0__Impl rule__Guidance__Group_4__1 ;
    public final void rule__Guidance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1929:1: ( rule__Guidance__Group_4__0__Impl rule__Guidance__Group_4__1 )
            // InternalPDL.g:1930:2: rule__Guidance__Group_4__0__Impl rule__Guidance__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Guidance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__0"


    // $ANTLR start "rule__Guidance__Group_4__0__Impl"
    // InternalPDL.g:1937:1: rule__Guidance__Group_4__0__Impl : ( 'elements' ) ;
    public final void rule__Guidance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1941:1: ( ( 'elements' ) )
            // InternalPDL.g:1942:1: ( 'elements' )
            {
            // InternalPDL.g:1942:1: ( 'elements' )
            // InternalPDL.g:1943:2: 'elements'
            {
             before(grammarAccess.getGuidanceAccess().getElementsKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__0__Impl"


    // $ANTLR start "rule__Guidance__Group_4__1"
    // InternalPDL.g:1952:1: rule__Guidance__Group_4__1 : rule__Guidance__Group_4__1__Impl rule__Guidance__Group_4__2 ;
    public final void rule__Guidance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1956:1: ( rule__Guidance__Group_4__1__Impl rule__Guidance__Group_4__2 )
            // InternalPDL.g:1957:2: rule__Guidance__Group_4__1__Impl rule__Guidance__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__1"


    // $ANTLR start "rule__Guidance__Group_4__1__Impl"
    // InternalPDL.g:1964:1: rule__Guidance__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Guidance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1968:1: ( ( '(' ) )
            // InternalPDL.g:1969:1: ( '(' )
            {
            // InternalPDL.g:1969:1: ( '(' )
            // InternalPDL.g:1970:2: '('
            {
             before(grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__1__Impl"


    // $ANTLR start "rule__Guidance__Group_4__2"
    // InternalPDL.g:1979:1: rule__Guidance__Group_4__2 : rule__Guidance__Group_4__2__Impl rule__Guidance__Group_4__3 ;
    public final void rule__Guidance__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1983:1: ( rule__Guidance__Group_4__2__Impl rule__Guidance__Group_4__3 )
            // InternalPDL.g:1984:2: rule__Guidance__Group_4__2__Impl rule__Guidance__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__Guidance__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__2"


    // $ANTLR start "rule__Guidance__Group_4__2__Impl"
    // InternalPDL.g:1991:1: rule__Guidance__Group_4__2__Impl : ( ( rule__Guidance__ElementsAssignment_4_2 ) ) ;
    public final void rule__Guidance__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1995:1: ( ( ( rule__Guidance__ElementsAssignment_4_2 ) ) )
            // InternalPDL.g:1996:1: ( ( rule__Guidance__ElementsAssignment_4_2 ) )
            {
            // InternalPDL.g:1996:1: ( ( rule__Guidance__ElementsAssignment_4_2 ) )
            // InternalPDL.g:1997:2: ( rule__Guidance__ElementsAssignment_4_2 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_4_2()); 
            // InternalPDL.g:1998:2: ( rule__Guidance__ElementsAssignment_4_2 )
            // InternalPDL.g:1998:3: rule__Guidance__ElementsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__2__Impl"


    // $ANTLR start "rule__Guidance__Group_4__3"
    // InternalPDL.g:2006:1: rule__Guidance__Group_4__3 : rule__Guidance__Group_4__3__Impl rule__Guidance__Group_4__4 ;
    public final void rule__Guidance__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2010:1: ( rule__Guidance__Group_4__3__Impl rule__Guidance__Group_4__4 )
            // InternalPDL.g:2011:2: rule__Guidance__Group_4__3__Impl rule__Guidance__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__Guidance__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__3"


    // $ANTLR start "rule__Guidance__Group_4__3__Impl"
    // InternalPDL.g:2018:1: rule__Guidance__Group_4__3__Impl : ( ( rule__Guidance__Group_4_3__0 )* ) ;
    public final void rule__Guidance__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2022:1: ( ( ( rule__Guidance__Group_4_3__0 )* ) )
            // InternalPDL.g:2023:1: ( ( rule__Guidance__Group_4_3__0 )* )
            {
            // InternalPDL.g:2023:1: ( ( rule__Guidance__Group_4_3__0 )* )
            // InternalPDL.g:2024:2: ( rule__Guidance__Group_4_3__0 )*
            {
             before(grammarAccess.getGuidanceAccess().getGroup_4_3()); 
            // InternalPDL.g:2025:2: ( rule__Guidance__Group_4_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPDL.g:2025:3: rule__Guidance__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Guidance__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getGuidanceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__3__Impl"


    // $ANTLR start "rule__Guidance__Group_4__4"
    // InternalPDL.g:2033:1: rule__Guidance__Group_4__4 : rule__Guidance__Group_4__4__Impl ;
    public final void rule__Guidance__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2037:1: ( rule__Guidance__Group_4__4__Impl )
            // InternalPDL.g:2038:2: rule__Guidance__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__4"


    // $ANTLR start "rule__Guidance__Group_4__4__Impl"
    // InternalPDL.g:2044:1: rule__Guidance__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Guidance__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2048:1: ( ( ')' ) )
            // InternalPDL.g:2049:1: ( ')' )
            {
            // InternalPDL.g:2049:1: ( ')' )
            // InternalPDL.g:2050:2: ')'
            {
             before(grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_4_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__4__Impl"


    // $ANTLR start "rule__Guidance__Group_4_3__0"
    // InternalPDL.g:2060:1: rule__Guidance__Group_4_3__0 : rule__Guidance__Group_4_3__0__Impl rule__Guidance__Group_4_3__1 ;
    public final void rule__Guidance__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2064:1: ( rule__Guidance__Group_4_3__0__Impl rule__Guidance__Group_4_3__1 )
            // InternalPDL.g:2065:2: rule__Guidance__Group_4_3__0__Impl rule__Guidance__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4_3__0"


    // $ANTLR start "rule__Guidance__Group_4_3__0__Impl"
    // InternalPDL.g:2072:1: rule__Guidance__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Guidance__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2076:1: ( ( ',' ) )
            // InternalPDL.g:2077:1: ( ',' )
            {
            // InternalPDL.g:2077:1: ( ',' )
            // InternalPDL.g:2078:2: ','
            {
             before(grammarAccess.getGuidanceAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4_3__0__Impl"


    // $ANTLR start "rule__Guidance__Group_4_3__1"
    // InternalPDL.g:2087:1: rule__Guidance__Group_4_3__1 : rule__Guidance__Group_4_3__1__Impl ;
    public final void rule__Guidance__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2091:1: ( rule__Guidance__Group_4_3__1__Impl )
            // InternalPDL.g:2092:2: rule__Guidance__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4_3__1"


    // $ANTLR start "rule__Guidance__Group_4_3__1__Impl"
    // InternalPDL.g:2098:1: rule__Guidance__Group_4_3__1__Impl : ( ( rule__Guidance__ElementsAssignment_4_3_1 ) ) ;
    public final void rule__Guidance__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2102:1: ( ( ( rule__Guidance__ElementsAssignment_4_3_1 ) ) )
            // InternalPDL.g:2103:1: ( ( rule__Guidance__ElementsAssignment_4_3_1 ) )
            {
            // InternalPDL.g:2103:1: ( ( rule__Guidance__ElementsAssignment_4_3_1 ) )
            // InternalPDL.g:2104:2: ( rule__Guidance__ElementsAssignment_4_3_1 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_4_3_1()); 
            // InternalPDL.g:2105:2: ( rule__Guidance__ElementsAssignment_4_3_1 )
            // InternalPDL.g:2105:3: rule__Guidance__ElementsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4_3__1__Impl"


    // $ANTLR start "rule__Resources__Group__0"
    // InternalPDL.g:2114:1: rule__Resources__Group__0 : rule__Resources__Group__0__Impl rule__Resources__Group__1 ;
    public final void rule__Resources__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2118:1: ( rule__Resources__Group__0__Impl rule__Resources__Group__1 )
            // InternalPDL.g:2119:2: rule__Resources__Group__0__Impl rule__Resources__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Resources__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__0"


    // $ANTLR start "rule__Resources__Group__0__Impl"
    // InternalPDL.g:2126:1: rule__Resources__Group__0__Impl : ( 'Resources' ) ;
    public final void rule__Resources__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2130:1: ( ( 'Resources' ) )
            // InternalPDL.g:2131:1: ( 'Resources' )
            {
            // InternalPDL.g:2131:1: ( 'Resources' )
            // InternalPDL.g:2132:2: 'Resources'
            {
             before(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__0__Impl"


    // $ANTLR start "rule__Resources__Group__1"
    // InternalPDL.g:2141:1: rule__Resources__Group__1 : rule__Resources__Group__1__Impl rule__Resources__Group__2 ;
    public final void rule__Resources__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2145:1: ( rule__Resources__Group__1__Impl rule__Resources__Group__2 )
            // InternalPDL.g:2146:2: rule__Resources__Group__1__Impl rule__Resources__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Resources__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__1"


    // $ANTLR start "rule__Resources__Group__1__Impl"
    // InternalPDL.g:2153:1: rule__Resources__Group__1__Impl : ( ( rule__Resources__NameAssignment_1 ) ) ;
    public final void rule__Resources__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2157:1: ( ( ( rule__Resources__NameAssignment_1 ) ) )
            // InternalPDL.g:2158:1: ( ( rule__Resources__NameAssignment_1 ) )
            {
            // InternalPDL.g:2158:1: ( ( rule__Resources__NameAssignment_1 ) )
            // InternalPDL.g:2159:2: ( rule__Resources__NameAssignment_1 )
            {
             before(grammarAccess.getResourcesAccess().getNameAssignment_1()); 
            // InternalPDL.g:2160:2: ( rule__Resources__NameAssignment_1 )
            // InternalPDL.g:2160:3: rule__Resources__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Resources__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__1__Impl"


    // $ANTLR start "rule__Resources__Group__2"
    // InternalPDL.g:2168:1: rule__Resources__Group__2 : rule__Resources__Group__2__Impl rule__Resources__Group__3 ;
    public final void rule__Resources__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2172:1: ( rule__Resources__Group__2__Impl rule__Resources__Group__3 )
            // InternalPDL.g:2173:2: rule__Resources__Group__2__Impl rule__Resources__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Resources__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__2"


    // $ANTLR start "rule__Resources__Group__2__Impl"
    // InternalPDL.g:2180:1: rule__Resources__Group__2__Impl : ( '{' ) ;
    public final void rule__Resources__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2184:1: ( ( '{' ) )
            // InternalPDL.g:2185:1: ( '{' )
            {
            // InternalPDL.g:2185:1: ( '{' )
            // InternalPDL.g:2186:2: '{'
            {
             before(grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__2__Impl"


    // $ANTLR start "rule__Resources__Group__3"
    // InternalPDL.g:2195:1: rule__Resources__Group__3 : rule__Resources__Group__3__Impl rule__Resources__Group__4 ;
    public final void rule__Resources__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2199:1: ( rule__Resources__Group__3__Impl rule__Resources__Group__4 )
            // InternalPDL.g:2200:2: rule__Resources__Group__3__Impl rule__Resources__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Resources__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__3"


    // $ANTLR start "rule__Resources__Group__3__Impl"
    // InternalPDL.g:2207:1: rule__Resources__Group__3__Impl : ( 'quantite' ) ;
    public final void rule__Resources__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2211:1: ( ( 'quantite' ) )
            // InternalPDL.g:2212:1: ( 'quantite' )
            {
            // InternalPDL.g:2212:1: ( 'quantite' )
            // InternalPDL.g:2213:2: 'quantite'
            {
             before(grammarAccess.getResourcesAccess().getQuantiteKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getQuantiteKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__3__Impl"


    // $ANTLR start "rule__Resources__Group__4"
    // InternalPDL.g:2222:1: rule__Resources__Group__4 : rule__Resources__Group__4__Impl rule__Resources__Group__5 ;
    public final void rule__Resources__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2226:1: ( rule__Resources__Group__4__Impl rule__Resources__Group__5 )
            // InternalPDL.g:2227:2: rule__Resources__Group__4__Impl rule__Resources__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Resources__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__4"


    // $ANTLR start "rule__Resources__Group__4__Impl"
    // InternalPDL.g:2234:1: rule__Resources__Group__4__Impl : ( ( rule__Resources__QuantiteAssignment_4 ) ) ;
    public final void rule__Resources__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2238:1: ( ( ( rule__Resources__QuantiteAssignment_4 ) ) )
            // InternalPDL.g:2239:1: ( ( rule__Resources__QuantiteAssignment_4 ) )
            {
            // InternalPDL.g:2239:1: ( ( rule__Resources__QuantiteAssignment_4 ) )
            // InternalPDL.g:2240:2: ( rule__Resources__QuantiteAssignment_4 )
            {
             before(grammarAccess.getResourcesAccess().getQuantiteAssignment_4()); 
            // InternalPDL.g:2241:2: ( rule__Resources__QuantiteAssignment_4 )
            // InternalPDL.g:2241:3: rule__Resources__QuantiteAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Resources__QuantiteAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getQuantiteAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__4__Impl"


    // $ANTLR start "rule__Resources__Group__5"
    // InternalPDL.g:2249:1: rule__Resources__Group__5 : rule__Resources__Group__5__Impl rule__Resources__Group__6 ;
    public final void rule__Resources__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2253:1: ( rule__Resources__Group__5__Impl rule__Resources__Group__6 )
            // InternalPDL.g:2254:2: rule__Resources__Group__5__Impl rule__Resources__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Resources__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__5"


    // $ANTLR start "rule__Resources__Group__5__Impl"
    // InternalPDL.g:2261:1: rule__Resources__Group__5__Impl : ( ( rule__Resources__Group_5__0 )? ) ;
    public final void rule__Resources__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2265:1: ( ( ( rule__Resources__Group_5__0 )? ) )
            // InternalPDL.g:2266:1: ( ( rule__Resources__Group_5__0 )? )
            {
            // InternalPDL.g:2266:1: ( ( rule__Resources__Group_5__0 )? )
            // InternalPDL.g:2267:2: ( rule__Resources__Group_5__0 )?
            {
             before(grammarAccess.getResourcesAccess().getGroup_5()); 
            // InternalPDL.g:2268:2: ( rule__Resources__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPDL.g:2268:3: rule__Resources__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resources__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourcesAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__5__Impl"


    // $ANTLR start "rule__Resources__Group__6"
    // InternalPDL.g:2276:1: rule__Resources__Group__6 : rule__Resources__Group__6__Impl ;
    public final void rule__Resources__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2280:1: ( rule__Resources__Group__6__Impl )
            // InternalPDL.g:2281:2: rule__Resources__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__6"


    // $ANTLR start "rule__Resources__Group__6__Impl"
    // InternalPDL.g:2287:1: rule__Resources__Group__6__Impl : ( '}' ) ;
    public final void rule__Resources__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2291:1: ( ( '}' ) )
            // InternalPDL.g:2292:1: ( '}' )
            {
            // InternalPDL.g:2292:1: ( '}' )
            // InternalPDL.g:2293:2: '}'
            {
             before(grammarAccess.getResourcesAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__6__Impl"


    // $ANTLR start "rule__Resources__Group_5__0"
    // InternalPDL.g:2303:1: rule__Resources__Group_5__0 : rule__Resources__Group_5__0__Impl rule__Resources__Group_5__1 ;
    public final void rule__Resources__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2307:1: ( rule__Resources__Group_5__0__Impl rule__Resources__Group_5__1 )
            // InternalPDL.g:2308:2: rule__Resources__Group_5__0__Impl rule__Resources__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Resources__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5__0"


    // $ANTLR start "rule__Resources__Group_5__0__Impl"
    // InternalPDL.g:2315:1: rule__Resources__Group_5__0__Impl : ( 'linktoresource' ) ;
    public final void rule__Resources__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2319:1: ( ( 'linktoresource' ) )
            // InternalPDL.g:2320:1: ( 'linktoresource' )
            {
            // InternalPDL.g:2320:1: ( 'linktoresource' )
            // InternalPDL.g:2321:2: 'linktoresource'
            {
             before(grammarAccess.getResourcesAccess().getLinktoresourceKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getLinktoresourceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5__0__Impl"


    // $ANTLR start "rule__Resources__Group_5__1"
    // InternalPDL.g:2330:1: rule__Resources__Group_5__1 : rule__Resources__Group_5__1__Impl rule__Resources__Group_5__2 ;
    public final void rule__Resources__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2334:1: ( rule__Resources__Group_5__1__Impl rule__Resources__Group_5__2 )
            // InternalPDL.g:2335:2: rule__Resources__Group_5__1__Impl rule__Resources__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Resources__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5__1"


    // $ANTLR start "rule__Resources__Group_5__1__Impl"
    // InternalPDL.g:2342:1: rule__Resources__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Resources__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2346:1: ( ( '(' ) )
            // InternalPDL.g:2347:1: ( '(' )
            {
            // InternalPDL.g:2347:1: ( '(' )
            // InternalPDL.g:2348:2: '('
            {
             before(grammarAccess.getResourcesAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5__1__Impl"


    // $ANTLR start "rule__Resources__Group_5__2"
    // InternalPDL.g:2357:1: rule__Resources__Group_5__2 : rule__Resources__Group_5__2__Impl rule__Resources__Group_5__3 ;
    public final void rule__Resources__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2361:1: ( rule__Resources__Group_5__2__Impl rule__Resources__Group_5__3 )
            // InternalPDL.g:2362:2: rule__Resources__Group_5__2__Impl rule__Resources__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__Resources__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5__2"


    // $ANTLR start "rule__Resources__Group_5__2__Impl"
    // InternalPDL.g:2369:1: rule__Resources__Group_5__2__Impl : ( ( rule__Resources__LinktoresourceAssignment_5_2 ) ) ;
    public final void rule__Resources__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2373:1: ( ( ( rule__Resources__LinktoresourceAssignment_5_2 ) ) )
            // InternalPDL.g:2374:1: ( ( rule__Resources__LinktoresourceAssignment_5_2 ) )
            {
            // InternalPDL.g:2374:1: ( ( rule__Resources__LinktoresourceAssignment_5_2 ) )
            // InternalPDL.g:2375:2: ( rule__Resources__LinktoresourceAssignment_5_2 )
            {
             before(grammarAccess.getResourcesAccess().getLinktoresourceAssignment_5_2()); 
            // InternalPDL.g:2376:2: ( rule__Resources__LinktoresourceAssignment_5_2 )
            // InternalPDL.g:2376:3: rule__Resources__LinktoresourceAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Resources__LinktoresourceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getLinktoresourceAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5__2__Impl"


    // $ANTLR start "rule__Resources__Group_5__3"
    // InternalPDL.g:2384:1: rule__Resources__Group_5__3 : rule__Resources__Group_5__3__Impl rule__Resources__Group_5__4 ;
    public final void rule__Resources__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2388:1: ( rule__Resources__Group_5__3__Impl rule__Resources__Group_5__4 )
            // InternalPDL.g:2389:2: rule__Resources__Group_5__3__Impl rule__Resources__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__Resources__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5__3"


    // $ANTLR start "rule__Resources__Group_5__3__Impl"
    // InternalPDL.g:2396:1: rule__Resources__Group_5__3__Impl : ( ( rule__Resources__Group_5_3__0 )* ) ;
    public final void rule__Resources__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2400:1: ( ( ( rule__Resources__Group_5_3__0 )* ) )
            // InternalPDL.g:2401:1: ( ( rule__Resources__Group_5_3__0 )* )
            {
            // InternalPDL.g:2401:1: ( ( rule__Resources__Group_5_3__0 )* )
            // InternalPDL.g:2402:2: ( rule__Resources__Group_5_3__0 )*
            {
             before(grammarAccess.getResourcesAccess().getGroup_5_3()); 
            // InternalPDL.g:2403:2: ( rule__Resources__Group_5_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPDL.g:2403:3: rule__Resources__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Resources__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getResourcesAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5__3__Impl"


    // $ANTLR start "rule__Resources__Group_5__4"
    // InternalPDL.g:2411:1: rule__Resources__Group_5__4 : rule__Resources__Group_5__4__Impl ;
    public final void rule__Resources__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2415:1: ( rule__Resources__Group_5__4__Impl )
            // InternalPDL.g:2416:2: rule__Resources__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5__4"


    // $ANTLR start "rule__Resources__Group_5__4__Impl"
    // InternalPDL.g:2422:1: rule__Resources__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Resources__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2426:1: ( ( ')' ) )
            // InternalPDL.g:2427:1: ( ')' )
            {
            // InternalPDL.g:2427:1: ( ')' )
            // InternalPDL.g:2428:2: ')'
            {
             before(grammarAccess.getResourcesAccess().getRightParenthesisKeyword_5_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5__4__Impl"


    // $ANTLR start "rule__Resources__Group_5_3__0"
    // InternalPDL.g:2438:1: rule__Resources__Group_5_3__0 : rule__Resources__Group_5_3__0__Impl rule__Resources__Group_5_3__1 ;
    public final void rule__Resources__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2442:1: ( rule__Resources__Group_5_3__0__Impl rule__Resources__Group_5_3__1 )
            // InternalPDL.g:2443:2: rule__Resources__Group_5_3__0__Impl rule__Resources__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Resources__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5_3__0"


    // $ANTLR start "rule__Resources__Group_5_3__0__Impl"
    // InternalPDL.g:2450:1: rule__Resources__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Resources__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2454:1: ( ( ',' ) )
            // InternalPDL.g:2455:1: ( ',' )
            {
            // InternalPDL.g:2455:1: ( ',' )
            // InternalPDL.g:2456:2: ','
            {
             before(grammarAccess.getResourcesAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5_3__0__Impl"


    // $ANTLR start "rule__Resources__Group_5_3__1"
    // InternalPDL.g:2465:1: rule__Resources__Group_5_3__1 : rule__Resources__Group_5_3__1__Impl ;
    public final void rule__Resources__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2469:1: ( rule__Resources__Group_5_3__1__Impl )
            // InternalPDL.g:2470:2: rule__Resources__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5_3__1"


    // $ANTLR start "rule__Resources__Group_5_3__1__Impl"
    // InternalPDL.g:2476:1: rule__Resources__Group_5_3__1__Impl : ( ( rule__Resources__LinktoresourceAssignment_5_3_1 ) ) ;
    public final void rule__Resources__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2480:1: ( ( ( rule__Resources__LinktoresourceAssignment_5_3_1 ) ) )
            // InternalPDL.g:2481:1: ( ( rule__Resources__LinktoresourceAssignment_5_3_1 ) )
            {
            // InternalPDL.g:2481:1: ( ( rule__Resources__LinktoresourceAssignment_5_3_1 ) )
            // InternalPDL.g:2482:2: ( rule__Resources__LinktoresourceAssignment_5_3_1 )
            {
             before(grammarAccess.getResourcesAccess().getLinktoresourceAssignment_5_3_1()); 
            // InternalPDL.g:2483:2: ( rule__Resources__LinktoresourceAssignment_5_3_1 )
            // InternalPDL.g:2483:3: rule__Resources__LinktoresourceAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Resources__LinktoresourceAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getLinktoresourceAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group_5_3__1__Impl"


    // $ANTLR start "rule__RequeteDeRessource__Group__0"
    // InternalPDL.g:2492:1: rule__RequeteDeRessource__Group__0 : rule__RequeteDeRessource__Group__0__Impl rule__RequeteDeRessource__Group__1 ;
    public final void rule__RequeteDeRessource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2496:1: ( rule__RequeteDeRessource__Group__0__Impl rule__RequeteDeRessource__Group__1 )
            // InternalPDL.g:2497:2: rule__RequeteDeRessource__Group__0__Impl rule__RequeteDeRessource__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RequeteDeRessource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__0"


    // $ANTLR start "rule__RequeteDeRessource__Group__0__Impl"
    // InternalPDL.g:2504:1: rule__RequeteDeRessource__Group__0__Impl : ( 'RequeteDeRessource' ) ;
    public final void rule__RequeteDeRessource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2508:1: ( ( 'RequeteDeRessource' ) )
            // InternalPDL.g:2509:1: ( 'RequeteDeRessource' )
            {
            // InternalPDL.g:2509:1: ( 'RequeteDeRessource' )
            // InternalPDL.g:2510:2: 'RequeteDeRessource'
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getRequeteDeRessourceKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRequeteDeRessourceAccess().getRequeteDeRessourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__0__Impl"


    // $ANTLR start "rule__RequeteDeRessource__Group__1"
    // InternalPDL.g:2519:1: rule__RequeteDeRessource__Group__1 : rule__RequeteDeRessource__Group__1__Impl rule__RequeteDeRessource__Group__2 ;
    public final void rule__RequeteDeRessource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2523:1: ( rule__RequeteDeRessource__Group__1__Impl rule__RequeteDeRessource__Group__2 )
            // InternalPDL.g:2524:2: rule__RequeteDeRessource__Group__1__Impl rule__RequeteDeRessource__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__RequeteDeRessource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__1"


    // $ANTLR start "rule__RequeteDeRessource__Group__1__Impl"
    // InternalPDL.g:2531:1: rule__RequeteDeRessource__Group__1__Impl : ( '{' ) ;
    public final void rule__RequeteDeRessource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2535:1: ( ( '{' ) )
            // InternalPDL.g:2536:1: ( '{' )
            {
            // InternalPDL.g:2536:1: ( '{' )
            // InternalPDL.g:2537:2: '{'
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRequeteDeRessourceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__1__Impl"


    // $ANTLR start "rule__RequeteDeRessource__Group__2"
    // InternalPDL.g:2546:1: rule__RequeteDeRessource__Group__2 : rule__RequeteDeRessource__Group__2__Impl rule__RequeteDeRessource__Group__3 ;
    public final void rule__RequeteDeRessource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2550:1: ( rule__RequeteDeRessource__Group__2__Impl rule__RequeteDeRessource__Group__3 )
            // InternalPDL.g:2551:2: rule__RequeteDeRessource__Group__2__Impl rule__RequeteDeRessource__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__RequeteDeRessource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__2"


    // $ANTLR start "rule__RequeteDeRessource__Group__2__Impl"
    // InternalPDL.g:2558:1: rule__RequeteDeRessource__Group__2__Impl : ( 'quantite' ) ;
    public final void rule__RequeteDeRessource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2562:1: ( ( 'quantite' ) )
            // InternalPDL.g:2563:1: ( 'quantite' )
            {
            // InternalPDL.g:2563:1: ( 'quantite' )
            // InternalPDL.g:2564:2: 'quantite'
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getQuantiteKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRequeteDeRessourceAccess().getQuantiteKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__2__Impl"


    // $ANTLR start "rule__RequeteDeRessource__Group__3"
    // InternalPDL.g:2573:1: rule__RequeteDeRessource__Group__3 : rule__RequeteDeRessource__Group__3__Impl rule__RequeteDeRessource__Group__4 ;
    public final void rule__RequeteDeRessource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2577:1: ( rule__RequeteDeRessource__Group__3__Impl rule__RequeteDeRessource__Group__4 )
            // InternalPDL.g:2578:2: rule__RequeteDeRessource__Group__3__Impl rule__RequeteDeRessource__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__RequeteDeRessource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__3"


    // $ANTLR start "rule__RequeteDeRessource__Group__3__Impl"
    // InternalPDL.g:2585:1: rule__RequeteDeRessource__Group__3__Impl : ( ( rule__RequeteDeRessource__QuantiteAssignment_3 ) ) ;
    public final void rule__RequeteDeRessource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2589:1: ( ( ( rule__RequeteDeRessource__QuantiteAssignment_3 ) ) )
            // InternalPDL.g:2590:1: ( ( rule__RequeteDeRessource__QuantiteAssignment_3 ) )
            {
            // InternalPDL.g:2590:1: ( ( rule__RequeteDeRessource__QuantiteAssignment_3 ) )
            // InternalPDL.g:2591:2: ( rule__RequeteDeRessource__QuantiteAssignment_3 )
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getQuantiteAssignment_3()); 
            // InternalPDL.g:2592:2: ( rule__RequeteDeRessource__QuantiteAssignment_3 )
            // InternalPDL.g:2592:3: rule__RequeteDeRessource__QuantiteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__QuantiteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRequeteDeRessourceAccess().getQuantiteAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__3__Impl"


    // $ANTLR start "rule__RequeteDeRessource__Group__4"
    // InternalPDL.g:2600:1: rule__RequeteDeRessource__Group__4 : rule__RequeteDeRessource__Group__4__Impl rule__RequeteDeRessource__Group__5 ;
    public final void rule__RequeteDeRessource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2604:1: ( rule__RequeteDeRessource__Group__4__Impl rule__RequeteDeRessource__Group__5 )
            // InternalPDL.g:2605:2: rule__RequeteDeRessource__Group__4__Impl rule__RequeteDeRessource__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__RequeteDeRessource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__4"


    // $ANTLR start "rule__RequeteDeRessource__Group__4__Impl"
    // InternalPDL.g:2612:1: rule__RequeteDeRessource__Group__4__Impl : ( 'resources' ) ;
    public final void rule__RequeteDeRessource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2616:1: ( ( 'resources' ) )
            // InternalPDL.g:2617:1: ( 'resources' )
            {
            // InternalPDL.g:2617:1: ( 'resources' )
            // InternalPDL.g:2618:2: 'resources'
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getResourcesKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRequeteDeRessourceAccess().getResourcesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__4__Impl"


    // $ANTLR start "rule__RequeteDeRessource__Group__5"
    // InternalPDL.g:2627:1: rule__RequeteDeRessource__Group__5 : rule__RequeteDeRessource__Group__5__Impl rule__RequeteDeRessource__Group__6 ;
    public final void rule__RequeteDeRessource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2631:1: ( rule__RequeteDeRessource__Group__5__Impl rule__RequeteDeRessource__Group__6 )
            // InternalPDL.g:2632:2: rule__RequeteDeRessource__Group__5__Impl rule__RequeteDeRessource__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__RequeteDeRessource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__5"


    // $ANTLR start "rule__RequeteDeRessource__Group__5__Impl"
    // InternalPDL.g:2639:1: rule__RequeteDeRessource__Group__5__Impl : ( ( rule__RequeteDeRessource__ResourcesAssignment_5 ) ) ;
    public final void rule__RequeteDeRessource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2643:1: ( ( ( rule__RequeteDeRessource__ResourcesAssignment_5 ) ) )
            // InternalPDL.g:2644:1: ( ( rule__RequeteDeRessource__ResourcesAssignment_5 ) )
            {
            // InternalPDL.g:2644:1: ( ( rule__RequeteDeRessource__ResourcesAssignment_5 ) )
            // InternalPDL.g:2645:2: ( rule__RequeteDeRessource__ResourcesAssignment_5 )
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getResourcesAssignment_5()); 
            // InternalPDL.g:2646:2: ( rule__RequeteDeRessource__ResourcesAssignment_5 )
            // InternalPDL.g:2646:3: rule__RequeteDeRessource__ResourcesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__ResourcesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRequeteDeRessourceAccess().getResourcesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__5__Impl"


    // $ANTLR start "rule__RequeteDeRessource__Group__6"
    // InternalPDL.g:2654:1: rule__RequeteDeRessource__Group__6 : rule__RequeteDeRessource__Group__6__Impl rule__RequeteDeRessource__Group__7 ;
    public final void rule__RequeteDeRessource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2658:1: ( rule__RequeteDeRessource__Group__6__Impl rule__RequeteDeRessource__Group__7 )
            // InternalPDL.g:2659:2: rule__RequeteDeRessource__Group__6__Impl rule__RequeteDeRessource__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__RequeteDeRessource__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__6"


    // $ANTLR start "rule__RequeteDeRessource__Group__6__Impl"
    // InternalPDL.g:2666:1: rule__RequeteDeRessource__Group__6__Impl : ( 'workdefinition' ) ;
    public final void rule__RequeteDeRessource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2670:1: ( ( 'workdefinition' ) )
            // InternalPDL.g:2671:1: ( 'workdefinition' )
            {
            // InternalPDL.g:2671:1: ( 'workdefinition' )
            // InternalPDL.g:2672:2: 'workdefinition'
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__6__Impl"


    // $ANTLR start "rule__RequeteDeRessource__Group__7"
    // InternalPDL.g:2681:1: rule__RequeteDeRessource__Group__7 : rule__RequeteDeRessource__Group__7__Impl rule__RequeteDeRessource__Group__8 ;
    public final void rule__RequeteDeRessource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2685:1: ( rule__RequeteDeRessource__Group__7__Impl rule__RequeteDeRessource__Group__8 )
            // InternalPDL.g:2686:2: rule__RequeteDeRessource__Group__7__Impl rule__RequeteDeRessource__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__RequeteDeRessource__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__7"


    // $ANTLR start "rule__RequeteDeRessource__Group__7__Impl"
    // InternalPDL.g:2693:1: rule__RequeteDeRessource__Group__7__Impl : ( ( rule__RequeteDeRessource__WorkdefinitionAssignment_7 ) ) ;
    public final void rule__RequeteDeRessource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2697:1: ( ( ( rule__RequeteDeRessource__WorkdefinitionAssignment_7 ) ) )
            // InternalPDL.g:2698:1: ( ( rule__RequeteDeRessource__WorkdefinitionAssignment_7 ) )
            {
            // InternalPDL.g:2698:1: ( ( rule__RequeteDeRessource__WorkdefinitionAssignment_7 ) )
            // InternalPDL.g:2699:2: ( rule__RequeteDeRessource__WorkdefinitionAssignment_7 )
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionAssignment_7()); 
            // InternalPDL.g:2700:2: ( rule__RequeteDeRessource__WorkdefinitionAssignment_7 )
            // InternalPDL.g:2700:3: rule__RequeteDeRessource__WorkdefinitionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__WorkdefinitionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__7__Impl"


    // $ANTLR start "rule__RequeteDeRessource__Group__8"
    // InternalPDL.g:2708:1: rule__RequeteDeRessource__Group__8 : rule__RequeteDeRessource__Group__8__Impl ;
    public final void rule__RequeteDeRessource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2712:1: ( rule__RequeteDeRessource__Group__8__Impl )
            // InternalPDL.g:2713:2: rule__RequeteDeRessource__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__8"


    // $ANTLR start "rule__RequeteDeRessource__Group__8__Impl"
    // InternalPDL.g:2719:1: rule__RequeteDeRessource__Group__8__Impl : ( '}' ) ;
    public final void rule__RequeteDeRessource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2723:1: ( ( '}' ) )
            // InternalPDL.g:2724:1: ( '}' )
            {
            // InternalPDL.g:2724:1: ( '}' )
            // InternalPDL.g:2725:2: '}'
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRequeteDeRessourceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__Group__8__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalPDL.g:2735:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2739:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalPDL.g:2740:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalPDL.g:2747:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2751:1: ( ( ( '-' )? ) )
            // InternalPDL.g:2752:1: ( ( '-' )? )
            {
            // InternalPDL.g:2752:1: ( ( '-' )? )
            // InternalPDL.g:2753:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalPDL.g:2754:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPDL.g:2754:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalPDL.g:2762:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2766:1: ( rule__EInt__Group__1__Impl )
            // InternalPDL.g:2767:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalPDL.g:2773:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2777:1: ( ( RULE_INT ) )
            // InternalPDL.g:2778:1: ( RULE_INT )
            {
            // InternalPDL.g:2778:1: ( RULE_INT )
            // InternalPDL.g:2779:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Process__NameAssignment_2"
    // InternalPDL.g:2789:1: rule__Process__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2793:1: ( ( ruleEString ) )
            // InternalPDL.g:2794:2: ( ruleEString )
            {
            // InternalPDL.g:2794:2: ( ruleEString )
            // InternalPDL.g:2795:3: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_2"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_4_2"
    // InternalPDL.g:2804:1: rule__Process__ProcessElementsAssignment_4_2 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2808:1: ( ( ruleProcessElement ) )
            // InternalPDL.g:2809:2: ( ruleProcessElement )
            {
            // InternalPDL.g:2809:2: ( ruleProcessElement )
            // InternalPDL.g:2810:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_4_2"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_4_3_1"
    // InternalPDL.g:2819:1: rule__Process__ProcessElementsAssignment_4_3_1 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2823:1: ( ( ruleProcessElement ) )
            // InternalPDL.g:2824:2: ( ruleProcessElement )
            {
            // InternalPDL.g:2824:2: ( ruleProcessElement )
            // InternalPDL.g:2825:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_4_3_1"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_2"
    // InternalPDL.g:2834:1: rule__WorkDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WorkDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2838:1: ( ( ruleEString ) )
            // InternalPDL.g:2839:2: ( ruleEString )
            {
            // InternalPDL.g:2839:2: ( ruleEString )
            // InternalPDL.g:2840:3: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__NameAssignment_2"


    // $ANTLR start "rule__WorkDefinition__LinksToPredecessorsAssignment_4_2"
    // InternalPDL.g:2849:1: rule__WorkDefinition__LinksToPredecessorsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToPredecessorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2853:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2854:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2854:2: ( ( ruleEString ) )
            // InternalPDL.g:2855:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_2_0()); 
            // InternalPDL.g:2856:3: ( ruleEString )
            // InternalPDL.g:2857:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__LinksToPredecessorsAssignment_4_2"


    // $ANTLR start "rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1"
    // InternalPDL.g:2868:1: rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2872:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2873:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2873:2: ( ( ruleEString ) )
            // InternalPDL.g:2874:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_3_1_0()); 
            // InternalPDL.g:2875:3: ( ruleEString )
            // InternalPDL.g:2876:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__LinksToPredecessorsAssignment_4_3_1"


    // $ANTLR start "rule__WorkDefinition__LinksToSuccessorsAssignment_5_2"
    // InternalPDL.g:2887:1: rule__WorkDefinition__LinksToSuccessorsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToSuccessorsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2891:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2892:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2892:2: ( ( ruleEString ) )
            // InternalPDL.g:2893:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_2_0()); 
            // InternalPDL.g:2894:3: ( ruleEString )
            // InternalPDL.g:2895:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__LinksToSuccessorsAssignment_5_2"


    // $ANTLR start "rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1"
    // InternalPDL.g:2906:1: rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2910:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2911:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2911:2: ( ( ruleEString ) )
            // InternalPDL.g:2912:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_3_1_0()); 
            // InternalPDL.g:2913:3: ( ruleEString )
            // InternalPDL.g:2914:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__LinksToSuccessorsAssignment_5_3_1"


    // $ANTLR start "rule__WorkDefinition__LinktoresourceAssignment_6_2"
    // InternalPDL.g:2925:1: rule__WorkDefinition__LinktoresourceAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinktoresourceAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2929:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2930:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2930:2: ( ( ruleEString ) )
            // InternalPDL.g:2931:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinktoresourceRequeteDeRessourceCrossReference_6_2_0()); 
            // InternalPDL.g:2932:3: ( ruleEString )
            // InternalPDL.g:2933:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinktoresourceRequeteDeRessourceEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinktoresourceRequeteDeRessourceEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinktoresourceRequeteDeRessourceCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__LinktoresourceAssignment_6_2"


    // $ANTLR start "rule__WorkDefinition__LinktoresourceAssignment_6_3_1"
    // InternalPDL.g:2944:1: rule__WorkDefinition__LinktoresourceAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__WorkDefinition__LinktoresourceAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2948:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2949:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2949:2: ( ( ruleEString ) )
            // InternalPDL.g:2950:3: ( ruleEString )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinktoresourceRequeteDeRessourceCrossReference_6_3_1_0()); 
            // InternalPDL.g:2951:3: ( ruleEString )
            // InternalPDL.g:2952:4: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinktoresourceRequeteDeRessourceEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinktoresourceRequeteDeRessourceEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getWorkDefinitionAccess().getLinktoresourceRequeteDeRessourceCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__LinktoresourceAssignment_6_3_1"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_3"
    // InternalPDL.g:2963:1: rule__WorkSequence__LinkTypeAssignment_3 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2967:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL.g:2968:2: ( ruleWorkSequenceType )
            {
            // InternalPDL.g:2968:2: ( ruleWorkSequenceType )
            // InternalPDL.g:2969:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_3"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_5"
    // InternalPDL.g:2978:1: rule__WorkSequence__PredecessorAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:2982:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:2983:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:2983:2: ( ( ruleEString ) )
            // InternalPDL.g:2984:3: ( ruleEString )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0()); 
            // InternalPDL.g:2985:3: ( ruleEString )
            // InternalPDL.g:2986:4: ruleEString
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_5"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_7"
    // InternalPDL.g:2997:1: rule__WorkSequence__SuccessorAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3001:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3002:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3002:2: ( ( ruleEString ) )
            // InternalPDL.g:3003:3: ( ruleEString )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0()); 
            // InternalPDL.g:3004:3: ( ruleEString )
            // InternalPDL.g:3005:4: ruleEString
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_7"


    // $ANTLR start "rule__Guidance__TextAssignment_3"
    // InternalPDL.g:3016:1: rule__Guidance__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__Guidance__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3020:1: ( ( ruleEString ) )
            // InternalPDL.g:3021:2: ( ruleEString )
            {
            // InternalPDL.g:3021:2: ( ruleEString )
            // InternalPDL.g:3022:3: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__TextAssignment_3"


    // $ANTLR start "rule__Guidance__ElementsAssignment_4_2"
    // InternalPDL.g:3031:1: rule__Guidance__ElementsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Guidance__ElementsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3035:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3036:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3036:2: ( ( ruleEString ) )
            // InternalPDL.g:3037:3: ( ruleEString )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_2_0()); 
            // InternalPDL.g:3038:3: ( ruleEString )
            // InternalPDL.g:3039:4: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__ElementsAssignment_4_2"


    // $ANTLR start "rule__Guidance__ElementsAssignment_4_3_1"
    // InternalPDL.g:3050:1: rule__Guidance__ElementsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Guidance__ElementsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3054:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3055:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3055:2: ( ( ruleEString ) )
            // InternalPDL.g:3056:3: ( ruleEString )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_3_1_0()); 
            // InternalPDL.g:3057:3: ( ruleEString )
            // InternalPDL.g:3058:4: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__ElementsAssignment_4_3_1"


    // $ANTLR start "rule__Resources__NameAssignment_1"
    // InternalPDL.g:3069:1: rule__Resources__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Resources__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3073:1: ( ( ruleEString ) )
            // InternalPDL.g:3074:2: ( ruleEString )
            {
            // InternalPDL.g:3074:2: ( ruleEString )
            // InternalPDL.g:3075:3: ruleEString
            {
             before(grammarAccess.getResourcesAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourcesAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__NameAssignment_1"


    // $ANTLR start "rule__Resources__QuantiteAssignment_4"
    // InternalPDL.g:3084:1: rule__Resources__QuantiteAssignment_4 : ( ruleEInt ) ;
    public final void rule__Resources__QuantiteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3088:1: ( ( ruleEInt ) )
            // InternalPDL.g:3089:2: ( ruleEInt )
            {
            // InternalPDL.g:3089:2: ( ruleEInt )
            // InternalPDL.g:3090:3: ruleEInt
            {
             before(grammarAccess.getResourcesAccess().getQuantiteEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getResourcesAccess().getQuantiteEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__QuantiteAssignment_4"


    // $ANTLR start "rule__Resources__LinktoresourceAssignment_5_2"
    // InternalPDL.g:3099:1: rule__Resources__LinktoresourceAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Resources__LinktoresourceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3103:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3104:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3104:2: ( ( ruleEString ) )
            // InternalPDL.g:3105:3: ( ruleEString )
            {
             before(grammarAccess.getResourcesAccess().getLinktoresourceRequeteDeRessourceCrossReference_5_2_0()); 
            // InternalPDL.g:3106:3: ( ruleEString )
            // InternalPDL.g:3107:4: ruleEString
            {
             before(grammarAccess.getResourcesAccess().getLinktoresourceRequeteDeRessourceEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourcesAccess().getLinktoresourceRequeteDeRessourceEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getResourcesAccess().getLinktoresourceRequeteDeRessourceCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__LinktoresourceAssignment_5_2"


    // $ANTLR start "rule__Resources__LinktoresourceAssignment_5_3_1"
    // InternalPDL.g:3118:1: rule__Resources__LinktoresourceAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Resources__LinktoresourceAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3122:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3123:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3123:2: ( ( ruleEString ) )
            // InternalPDL.g:3124:3: ( ruleEString )
            {
             before(grammarAccess.getResourcesAccess().getLinktoresourceRequeteDeRessourceCrossReference_5_3_1_0()); 
            // InternalPDL.g:3125:3: ( ruleEString )
            // InternalPDL.g:3126:4: ruleEString
            {
             before(grammarAccess.getResourcesAccess().getLinktoresourceRequeteDeRessourceEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourcesAccess().getLinktoresourceRequeteDeRessourceEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getResourcesAccess().getLinktoresourceRequeteDeRessourceCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__LinktoresourceAssignment_5_3_1"


    // $ANTLR start "rule__RequeteDeRessource__QuantiteAssignment_3"
    // InternalPDL.g:3137:1: rule__RequeteDeRessource__QuantiteAssignment_3 : ( ruleEInt ) ;
    public final void rule__RequeteDeRessource__QuantiteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3141:1: ( ( ruleEInt ) )
            // InternalPDL.g:3142:2: ( ruleEInt )
            {
            // InternalPDL.g:3142:2: ( ruleEInt )
            // InternalPDL.g:3143:3: ruleEInt
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getQuantiteEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRequeteDeRessourceAccess().getQuantiteEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__QuantiteAssignment_3"


    // $ANTLR start "rule__RequeteDeRessource__ResourcesAssignment_5"
    // InternalPDL.g:3152:1: rule__RequeteDeRessource__ResourcesAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__RequeteDeRessource__ResourcesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3156:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3157:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3157:2: ( ( ruleEString ) )
            // InternalPDL.g:3158:3: ( ruleEString )
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getResourcesResourcesCrossReference_5_0()); 
            // InternalPDL.g:3159:3: ( ruleEString )
            // InternalPDL.g:3160:4: ruleEString
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getResourcesResourcesEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequeteDeRessourceAccess().getResourcesResourcesEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRequeteDeRessourceAccess().getResourcesResourcesCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__ResourcesAssignment_5"


    // $ANTLR start "rule__RequeteDeRessource__WorkdefinitionAssignment_7"
    // InternalPDL.g:3171:1: rule__RequeteDeRessource__WorkdefinitionAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__RequeteDeRessource__WorkdefinitionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:3175:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:3176:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:3176:2: ( ( ruleEString ) )
            // InternalPDL.g:3177:3: ( ruleEString )
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionWorkDefinitionCrossReference_7_0()); 
            // InternalPDL.g:3178:3: ( ruleEString )
            // InternalPDL.g:3179:4: ruleEString
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionWorkDefinitionEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionWorkDefinitionEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionWorkDefinitionCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequeteDeRessource__WorkdefinitionAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000A44100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003220000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});

}