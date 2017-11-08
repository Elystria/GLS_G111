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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'Process'", "'{'", "'}'", "'processElements'", "','", "'wd'", "'ws'", "'from'", "'to'", "'note'", "'rsc'", "'quantity'", "'rsc_request'", "'for'", "'ref'", "'documents'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
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


    // $ANTLR start "entryRuleGuidanceLink"
    // InternalPDL.g:253:1: entryRuleGuidanceLink : ruleGuidanceLink EOF ;
    public final void entryRuleGuidanceLink() throws RecognitionException {
        try {
            // InternalPDL.g:254:1: ( ruleGuidanceLink EOF )
            // InternalPDL.g:255:1: ruleGuidanceLink EOF
            {
             before(grammarAccess.getGuidanceLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidanceLink();

            state._fsp--;

             after(grammarAccess.getGuidanceLinkRule()); 
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
    // $ANTLR end "entryRuleGuidanceLink"


    // $ANTLR start "ruleGuidanceLink"
    // InternalPDL.g:262:1: ruleGuidanceLink : ( ( rule__GuidanceLink__Group__0 ) ) ;
    public final void ruleGuidanceLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:266:2: ( ( ( rule__GuidanceLink__Group__0 ) ) )
            // InternalPDL.g:267:2: ( ( rule__GuidanceLink__Group__0 ) )
            {
            // InternalPDL.g:267:2: ( ( rule__GuidanceLink__Group__0 ) )
            // InternalPDL.g:268:3: ( rule__GuidanceLink__Group__0 )
            {
             before(grammarAccess.getGuidanceLinkAccess().getGroup()); 
            // InternalPDL.g:269:3: ( rule__GuidanceLink__Group__0 )
            // InternalPDL.g:269:4: rule__GuidanceLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GuidanceLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceLinkAccess().getGroup()); 

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
    // $ANTLR end "ruleGuidanceLink"


    // $ANTLR start "entryRuleEInt"
    // InternalPDL.g:278:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalPDL.g:279:1: ( ruleEInt EOF )
            // InternalPDL.g:280:1: ruleEInt EOF
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
    // InternalPDL.g:287:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:291:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalPDL.g:292:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalPDL.g:292:2: ( ( rule__EInt__Group__0 ) )
            // InternalPDL.g:293:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalPDL.g:294:3: ( rule__EInt__Group__0 )
            // InternalPDL.g:294:4: rule__EInt__Group__0
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
    // InternalPDL.g:303:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:307:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL.g:308:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL.g:308:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL.g:309:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL.g:310:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL.g:310:4: rule__WorkSequenceType__Alternatives
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
    // InternalPDL.g:318:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleResources ) | ( ruleRequeteDeRessource ) | ( ruleGuidanceLink ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:322:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleResources ) | ( ruleRequeteDeRessource ) | ( ruleGuidanceLink ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            case 29:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPDL.g:323:2: ( ruleWorkDefinition )
                    {
                    // InternalPDL.g:323:2: ( ruleWorkDefinition )
                    // InternalPDL.g:324:3: ruleWorkDefinition
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
                    // InternalPDL.g:329:2: ( ruleWorkSequence )
                    {
                    // InternalPDL.g:329:2: ( ruleWorkSequence )
                    // InternalPDL.g:330:3: ruleWorkSequence
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
                    // InternalPDL.g:335:2: ( ruleGuidance )
                    {
                    // InternalPDL.g:335:2: ( ruleGuidance )
                    // InternalPDL.g:336:3: ruleGuidance
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
                    // InternalPDL.g:341:2: ( ruleResources )
                    {
                    // InternalPDL.g:341:2: ( ruleResources )
                    // InternalPDL.g:342:3: ruleResources
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
                    // InternalPDL.g:347:2: ( ruleRequeteDeRessource )
                    {
                    // InternalPDL.g:347:2: ( ruleRequeteDeRessource )
                    // InternalPDL.g:348:3: ruleRequeteDeRessource
                    {
                     before(grammarAccess.getProcessElementAccess().getRequeteDeRessourceParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRequeteDeRessource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRequeteDeRessourceParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPDL.g:353:2: ( ruleGuidanceLink )
                    {
                    // InternalPDL.g:353:2: ( ruleGuidanceLink )
                    // InternalPDL.g:354:3: ruleGuidanceLink
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceLinkParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidanceLink();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceLinkParserRuleCall_5()); 

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
    // InternalPDL.g:363:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:367:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalPDL.g:368:2: ( RULE_STRING )
                    {
                    // InternalPDL.g:368:2: ( RULE_STRING )
                    // InternalPDL.g:369:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:374:2: ( RULE_ID )
                    {
                    // InternalPDL.g:374:2: ( RULE_ID )
                    // InternalPDL.g:375:3: RULE_ID
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
    // InternalPDL.g:384:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:388:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
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
                    // InternalPDL.g:389:2: ( ( 's2s' ) )
                    {
                    // InternalPDL.g:389:2: ( ( 's2s' ) )
                    // InternalPDL.g:390:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 
                    // InternalPDL.g:391:3: ( 's2s' )
                    // InternalPDL.g:391:4: 's2s'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:395:2: ( ( 'f2s' ) )
                    {
                    // InternalPDL.g:395:2: ( ( 'f2s' ) )
                    // InternalPDL.g:396:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 
                    // InternalPDL.g:397:3: ( 'f2s' )
                    // InternalPDL.g:397:4: 'f2s'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:401:2: ( ( 's2f' ) )
                    {
                    // InternalPDL.g:401:2: ( ( 's2f' ) )
                    // InternalPDL.g:402:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 
                    // InternalPDL.g:403:3: ( 's2f' )
                    // InternalPDL.g:403:4: 's2f'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:407:2: ( ( 'f2f' ) )
                    {
                    // InternalPDL.g:407:2: ( ( 'f2f' ) )
                    // InternalPDL.g:408:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 
                    // InternalPDL.g:409:3: ( 'f2f' )
                    // InternalPDL.g:409:4: 'f2f'
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
    // InternalPDL.g:417:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:421:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL.g:422:2: rule__Process__Group__0__Impl rule__Process__Group__1
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
    // InternalPDL.g:429:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:433:1: ( ( () ) )
            // InternalPDL.g:434:1: ( () )
            {
            // InternalPDL.g:434:1: ( () )
            // InternalPDL.g:435:2: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0()); 
            // InternalPDL.g:436:2: ()
            // InternalPDL.g:436:3: 
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
    // InternalPDL.g:444:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:448:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL.g:449:2: rule__Process__Group__1__Impl rule__Process__Group__2
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
    // InternalPDL.g:456:1: rule__Process__Group__1__Impl : ( 'Process' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:460:1: ( ( 'Process' ) )
            // InternalPDL.g:461:1: ( 'Process' )
            {
            // InternalPDL.g:461:1: ( 'Process' )
            // InternalPDL.g:462:2: 'Process'
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
    // InternalPDL.g:471:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:475:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL.g:476:2: rule__Process__Group__2__Impl rule__Process__Group__3
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
    // InternalPDL.g:483:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:487:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // InternalPDL.g:488:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // InternalPDL.g:488:1: ( ( rule__Process__NameAssignment_2 ) )
            // InternalPDL.g:489:2: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // InternalPDL.g:490:2: ( rule__Process__NameAssignment_2 )
            // InternalPDL.g:490:3: rule__Process__NameAssignment_2
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
    // InternalPDL.g:498:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:502:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL.g:503:2: rule__Process__Group__3__Impl rule__Process__Group__4
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
    // InternalPDL.g:510:1: rule__Process__Group__3__Impl : ( '{' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:514:1: ( ( '{' ) )
            // InternalPDL.g:515:1: ( '{' )
            {
            // InternalPDL.g:515:1: ( '{' )
            // InternalPDL.g:516:2: '{'
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
    // InternalPDL.g:525:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:529:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalPDL.g:530:2: rule__Process__Group__4__Impl rule__Process__Group__5
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
    // InternalPDL.g:537:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )? ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:541:1: ( ( ( rule__Process__Group_4__0 )? ) )
            // InternalPDL.g:542:1: ( ( rule__Process__Group_4__0 )? )
            {
            // InternalPDL.g:542:1: ( ( rule__Process__Group_4__0 )? )
            // InternalPDL.g:543:2: ( rule__Process__Group_4__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_4()); 
            // InternalPDL.g:544:2: ( rule__Process__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL.g:544:3: rule__Process__Group_4__0
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
    // InternalPDL.g:552:1: rule__Process__Group__5 : rule__Process__Group__5__Impl ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:556:1: ( rule__Process__Group__5__Impl )
            // InternalPDL.g:557:2: rule__Process__Group__5__Impl
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
    // InternalPDL.g:563:1: rule__Process__Group__5__Impl : ( '}' ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:567:1: ( ( '}' ) )
            // InternalPDL.g:568:1: ( '}' )
            {
            // InternalPDL.g:568:1: ( '}' )
            // InternalPDL.g:569:2: '}'
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
    // InternalPDL.g:579:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:583:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // InternalPDL.g:584:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
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
    // InternalPDL.g:591:1: rule__Process__Group_4__0__Impl : ( 'processElements' ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:595:1: ( ( 'processElements' ) )
            // InternalPDL.g:596:1: ( 'processElements' )
            {
            // InternalPDL.g:596:1: ( 'processElements' )
            // InternalPDL.g:597:2: 'processElements'
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
    // InternalPDL.g:606:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl rule__Process__Group_4__2 ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:610:1: ( rule__Process__Group_4__1__Impl rule__Process__Group_4__2 )
            // InternalPDL.g:611:2: rule__Process__Group_4__1__Impl rule__Process__Group_4__2
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
    // InternalPDL.g:618:1: rule__Process__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:622:1: ( ( '{' ) )
            // InternalPDL.g:623:1: ( '{' )
            {
            // InternalPDL.g:623:1: ( '{' )
            // InternalPDL.g:624:2: '{'
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
    // InternalPDL.g:633:1: rule__Process__Group_4__2 : rule__Process__Group_4__2__Impl rule__Process__Group_4__3 ;
    public final void rule__Process__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:637:1: ( rule__Process__Group_4__2__Impl rule__Process__Group_4__3 )
            // InternalPDL.g:638:2: rule__Process__Group_4__2__Impl rule__Process__Group_4__3
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
    // InternalPDL.g:645:1: rule__Process__Group_4__2__Impl : ( ( rule__Process__ProcessElementsAssignment_4_2 ) ) ;
    public final void rule__Process__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:649:1: ( ( ( rule__Process__ProcessElementsAssignment_4_2 ) ) )
            // InternalPDL.g:650:1: ( ( rule__Process__ProcessElementsAssignment_4_2 ) )
            {
            // InternalPDL.g:650:1: ( ( rule__Process__ProcessElementsAssignment_4_2 ) )
            // InternalPDL.g:651:2: ( rule__Process__ProcessElementsAssignment_4_2 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_2()); 
            // InternalPDL.g:652:2: ( rule__Process__ProcessElementsAssignment_4_2 )
            // InternalPDL.g:652:3: rule__Process__ProcessElementsAssignment_4_2
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
    // InternalPDL.g:660:1: rule__Process__Group_4__3 : rule__Process__Group_4__3__Impl rule__Process__Group_4__4 ;
    public final void rule__Process__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:664:1: ( rule__Process__Group_4__3__Impl rule__Process__Group_4__4 )
            // InternalPDL.g:665:2: rule__Process__Group_4__3__Impl rule__Process__Group_4__4
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
    // InternalPDL.g:672:1: rule__Process__Group_4__3__Impl : ( ( rule__Process__Group_4_3__0 )* ) ;
    public final void rule__Process__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:676:1: ( ( ( rule__Process__Group_4_3__0 )* ) )
            // InternalPDL.g:677:1: ( ( rule__Process__Group_4_3__0 )* )
            {
            // InternalPDL.g:677:1: ( ( rule__Process__Group_4_3__0 )* )
            // InternalPDL.g:678:2: ( rule__Process__Group_4_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_4_3()); 
            // InternalPDL.g:679:2: ( rule__Process__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPDL.g:679:3: rule__Process__Group_4_3__0
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
    // InternalPDL.g:687:1: rule__Process__Group_4__4 : rule__Process__Group_4__4__Impl ;
    public final void rule__Process__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:691:1: ( rule__Process__Group_4__4__Impl )
            // InternalPDL.g:692:2: rule__Process__Group_4__4__Impl
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
    // InternalPDL.g:698:1: rule__Process__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:702:1: ( ( '}' ) )
            // InternalPDL.g:703:1: ( '}' )
            {
            // InternalPDL.g:703:1: ( '}' )
            // InternalPDL.g:704:2: '}'
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
    // InternalPDL.g:714:1: rule__Process__Group_4_3__0 : rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 ;
    public final void rule__Process__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:718:1: ( rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 )
            // InternalPDL.g:719:2: rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1
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
    // InternalPDL.g:726:1: rule__Process__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:730:1: ( ( ',' ) )
            // InternalPDL.g:731:1: ( ',' )
            {
            // InternalPDL.g:731:1: ( ',' )
            // InternalPDL.g:732:2: ','
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
    // InternalPDL.g:741:1: rule__Process__Group_4_3__1 : rule__Process__Group_4_3__1__Impl ;
    public final void rule__Process__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:745:1: ( rule__Process__Group_4_3__1__Impl )
            // InternalPDL.g:746:2: rule__Process__Group_4_3__1__Impl
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
    // InternalPDL.g:752:1: rule__Process__Group_4_3__1__Impl : ( ( rule__Process__ProcessElementsAssignment_4_3_1 ) ) ;
    public final void rule__Process__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:756:1: ( ( ( rule__Process__ProcessElementsAssignment_4_3_1 ) ) )
            // InternalPDL.g:757:1: ( ( rule__Process__ProcessElementsAssignment_4_3_1 ) )
            {
            // InternalPDL.g:757:1: ( ( rule__Process__ProcessElementsAssignment_4_3_1 ) )
            // InternalPDL.g:758:2: ( rule__Process__ProcessElementsAssignment_4_3_1 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_3_1()); 
            // InternalPDL.g:759:2: ( rule__Process__ProcessElementsAssignment_4_3_1 )
            // InternalPDL.g:759:3: rule__Process__ProcessElementsAssignment_4_3_1
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
    // InternalPDL.g:768:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:772:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalPDL.g:773:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
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
    // InternalPDL.g:780:1: rule__WorkDefinition__Group__0__Impl : ( () ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:784:1: ( ( () ) )
            // InternalPDL.g:785:1: ( () )
            {
            // InternalPDL.g:785:1: ( () )
            // InternalPDL.g:786:2: ()
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 
            // InternalPDL.g:787:2: ()
            // InternalPDL.g:787:3: 
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
    // InternalPDL.g:795:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:799:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalPDL.g:800:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalPDL.g:807:1: rule__WorkDefinition__Group__1__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:811:1: ( ( 'wd' ) )
            // InternalPDL.g:812:1: ( 'wd' )
            {
            // InternalPDL.g:812:1: ( 'wd' )
            // InternalPDL.g:813:2: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_1()); 

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
    // InternalPDL.g:822:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:826:1: ( rule__WorkDefinition__Group__2__Impl )
            // InternalPDL.g:827:2: rule__WorkDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2__Impl();

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
    // InternalPDL.g:833:1: rule__WorkDefinition__Group__2__Impl : ( ( rule__WorkDefinition__NameAssignment_2 ) ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:837:1: ( ( ( rule__WorkDefinition__NameAssignment_2 ) ) )
            // InternalPDL.g:838:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            {
            // InternalPDL.g:838:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            // InternalPDL.g:839:2: ( rule__WorkDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 
            // InternalPDL.g:840:2: ( rule__WorkDefinition__NameAssignment_2 )
            // InternalPDL.g:840:3: rule__WorkDefinition__NameAssignment_2
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


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL.g:849:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:853:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL.g:854:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPDL.g:861:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:865:1: ( ( 'ws' ) )
            // InternalPDL.g:866:1: ( 'ws' )
            {
            // InternalPDL.g:866:1: ( 'ws' )
            // InternalPDL.g:867:2: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

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
    // InternalPDL.g:876:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:880:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL.g:881:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalPDL.g:888:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:892:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDL.g:893:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDL.g:893:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDL.g:894:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDL.g:895:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDL.g:895:3: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

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
    // InternalPDL.g:903:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:907:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalPDL.g:908:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalPDL.g:915:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:919:1: ( ( 'from' ) )
            // InternalPDL.g:920:1: ( 'from' )
            {
            // InternalPDL.g:920:1: ( 'from' )
            // InternalPDL.g:921:2: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 

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
    // InternalPDL.g:930:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:934:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalPDL.g:935:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalPDL.g:942:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:946:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // InternalPDL.g:947:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // InternalPDL.g:947:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // InternalPDL.g:948:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // InternalPDL.g:949:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            // InternalPDL.g:949:3: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

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
    // InternalPDL.g:957:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:961:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalPDL.g:962:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalPDL.g:969:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:973:1: ( ( 'to' ) )
            // InternalPDL.g:974:1: ( 'to' )
            {
            // InternalPDL.g:974:1: ( 'to' )
            // InternalPDL.g:975:2: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

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
    // InternalPDL.g:984:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:988:1: ( rule__WorkSequence__Group__5__Impl )
            // InternalPDL.g:989:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5__Impl();

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
    // InternalPDL.g:995:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:999:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // InternalPDL.g:1000:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // InternalPDL.g:1000:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // InternalPDL.g:1001:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // InternalPDL.g:1002:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            // InternalPDL.g:1002:3: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 

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


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDL.g:1011:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1015:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDL.g:1016:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalPDL.g:1023:1: rule__Guidance__Group__0__Impl : ( 'note' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1027:1: ( ( 'note' ) )
            // InternalPDL.g:1028:1: ( 'note' )
            {
            // InternalPDL.g:1028:1: ( 'note' )
            // InternalPDL.g:1029:2: 'note'
            {
             before(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 

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
    // InternalPDL.g:1038:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1042:1: ( rule__Guidance__Group__1__Impl )
            // InternalPDL.g:1043:2: rule__Guidance__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1__Impl();

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
    // InternalPDL.g:1049:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__TextAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1053:1: ( ( ( rule__Guidance__TextAssignment_1 ) ) )
            // InternalPDL.g:1054:1: ( ( rule__Guidance__TextAssignment_1 ) )
            {
            // InternalPDL.g:1054:1: ( ( rule__Guidance__TextAssignment_1 ) )
            // InternalPDL.g:1055:2: ( rule__Guidance__TextAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment_1()); 
            // InternalPDL.g:1056:2: ( rule__Guidance__TextAssignment_1 )
            // InternalPDL.g:1056:3: rule__Guidance__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment_1()); 

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


    // $ANTLR start "rule__Resources__Group__0"
    // InternalPDL.g:1065:1: rule__Resources__Group__0 : rule__Resources__Group__0__Impl rule__Resources__Group__1 ;
    public final void rule__Resources__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1069:1: ( rule__Resources__Group__0__Impl rule__Resources__Group__1 )
            // InternalPDL.g:1070:2: rule__Resources__Group__0__Impl rule__Resources__Group__1
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
    // InternalPDL.g:1077:1: rule__Resources__Group__0__Impl : ( 'rsc' ) ;
    public final void rule__Resources__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1081:1: ( ( 'rsc' ) )
            // InternalPDL.g:1082:1: ( 'rsc' )
            {
            // InternalPDL.g:1082:1: ( 'rsc' )
            // InternalPDL.g:1083:2: 'rsc'
            {
             before(grammarAccess.getResourcesAccess().getRscKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getRscKeyword_0()); 

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
    // InternalPDL.g:1092:1: rule__Resources__Group__1 : rule__Resources__Group__1__Impl rule__Resources__Group__2 ;
    public final void rule__Resources__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1096:1: ( rule__Resources__Group__1__Impl rule__Resources__Group__2 )
            // InternalPDL.g:1097:2: rule__Resources__Group__1__Impl rule__Resources__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalPDL.g:1104:1: rule__Resources__Group__1__Impl : ( ( rule__Resources__NameAssignment_1 ) ) ;
    public final void rule__Resources__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1108:1: ( ( ( rule__Resources__NameAssignment_1 ) ) )
            // InternalPDL.g:1109:1: ( ( rule__Resources__NameAssignment_1 ) )
            {
            // InternalPDL.g:1109:1: ( ( rule__Resources__NameAssignment_1 ) )
            // InternalPDL.g:1110:2: ( rule__Resources__NameAssignment_1 )
            {
             before(grammarAccess.getResourcesAccess().getNameAssignment_1()); 
            // InternalPDL.g:1111:2: ( rule__Resources__NameAssignment_1 )
            // InternalPDL.g:1111:3: rule__Resources__NameAssignment_1
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
    // InternalPDL.g:1119:1: rule__Resources__Group__2 : rule__Resources__Group__2__Impl rule__Resources__Group__3 ;
    public final void rule__Resources__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1123:1: ( rule__Resources__Group__2__Impl rule__Resources__Group__3 )
            // InternalPDL.g:1124:2: rule__Resources__Group__2__Impl rule__Resources__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalPDL.g:1131:1: rule__Resources__Group__2__Impl : ( 'quantity' ) ;
    public final void rule__Resources__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1135:1: ( ( 'quantity' ) )
            // InternalPDL.g:1136:1: ( 'quantity' )
            {
            // InternalPDL.g:1136:1: ( 'quantity' )
            // InternalPDL.g:1137:2: 'quantity'
            {
             before(grammarAccess.getResourcesAccess().getQuantityKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getQuantityKeyword_2()); 

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
    // InternalPDL.g:1146:1: rule__Resources__Group__3 : rule__Resources__Group__3__Impl ;
    public final void rule__Resources__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1150:1: ( rule__Resources__Group__3__Impl )
            // InternalPDL.g:1151:2: rule__Resources__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group__3__Impl();

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
    // InternalPDL.g:1157:1: rule__Resources__Group__3__Impl : ( ( rule__Resources__QuantiteAssignment_3 ) ) ;
    public final void rule__Resources__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1161:1: ( ( ( rule__Resources__QuantiteAssignment_3 ) ) )
            // InternalPDL.g:1162:1: ( ( rule__Resources__QuantiteAssignment_3 ) )
            {
            // InternalPDL.g:1162:1: ( ( rule__Resources__QuantiteAssignment_3 ) )
            // InternalPDL.g:1163:2: ( rule__Resources__QuantiteAssignment_3 )
            {
             before(grammarAccess.getResourcesAccess().getQuantiteAssignment_3()); 
            // InternalPDL.g:1164:2: ( rule__Resources__QuantiteAssignment_3 )
            // InternalPDL.g:1164:3: rule__Resources__QuantiteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Resources__QuantiteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getQuantiteAssignment_3()); 

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


    // $ANTLR start "rule__RequeteDeRessource__Group__0"
    // InternalPDL.g:1173:1: rule__RequeteDeRessource__Group__0 : rule__RequeteDeRessource__Group__0__Impl rule__RequeteDeRessource__Group__1 ;
    public final void rule__RequeteDeRessource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1177:1: ( rule__RequeteDeRessource__Group__0__Impl rule__RequeteDeRessource__Group__1 )
            // InternalPDL.g:1178:2: rule__RequeteDeRessource__Group__0__Impl rule__RequeteDeRessource__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalPDL.g:1185:1: rule__RequeteDeRessource__Group__0__Impl : ( 'rsc_request' ) ;
    public final void rule__RequeteDeRessource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1189:1: ( ( 'rsc_request' ) )
            // InternalPDL.g:1190:1: ( 'rsc_request' )
            {
            // InternalPDL.g:1190:1: ( 'rsc_request' )
            // InternalPDL.g:1191:2: 'rsc_request'
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getRsc_requestKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRequeteDeRessourceAccess().getRsc_requestKeyword_0()); 

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
    // InternalPDL.g:1200:1: rule__RequeteDeRessource__Group__1 : rule__RequeteDeRessource__Group__1__Impl rule__RequeteDeRessource__Group__2 ;
    public final void rule__RequeteDeRessource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1204:1: ( rule__RequeteDeRessource__Group__1__Impl rule__RequeteDeRessource__Group__2 )
            // InternalPDL.g:1205:2: rule__RequeteDeRessource__Group__1__Impl rule__RequeteDeRessource__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalPDL.g:1212:1: rule__RequeteDeRessource__Group__1__Impl : ( 'quantity' ) ;
    public final void rule__RequeteDeRessource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1216:1: ( ( 'quantity' ) )
            // InternalPDL.g:1217:1: ( 'quantity' )
            {
            // InternalPDL.g:1217:1: ( 'quantity' )
            // InternalPDL.g:1218:2: 'quantity'
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getQuantityKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRequeteDeRessourceAccess().getQuantityKeyword_1()); 

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
    // InternalPDL.g:1227:1: rule__RequeteDeRessource__Group__2 : rule__RequeteDeRessource__Group__2__Impl rule__RequeteDeRessource__Group__3 ;
    public final void rule__RequeteDeRessource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1231:1: ( rule__RequeteDeRessource__Group__2__Impl rule__RequeteDeRessource__Group__3 )
            // InternalPDL.g:1232:2: rule__RequeteDeRessource__Group__2__Impl rule__RequeteDeRessource__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalPDL.g:1239:1: rule__RequeteDeRessource__Group__2__Impl : ( ( rule__RequeteDeRessource__QuantiteAssignment_2 ) ) ;
    public final void rule__RequeteDeRessource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1243:1: ( ( ( rule__RequeteDeRessource__QuantiteAssignment_2 ) ) )
            // InternalPDL.g:1244:1: ( ( rule__RequeteDeRessource__QuantiteAssignment_2 ) )
            {
            // InternalPDL.g:1244:1: ( ( rule__RequeteDeRessource__QuantiteAssignment_2 ) )
            // InternalPDL.g:1245:2: ( rule__RequeteDeRessource__QuantiteAssignment_2 )
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getQuantiteAssignment_2()); 
            // InternalPDL.g:1246:2: ( rule__RequeteDeRessource__QuantiteAssignment_2 )
            // InternalPDL.g:1246:3: rule__RequeteDeRessource__QuantiteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__QuantiteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequeteDeRessourceAccess().getQuantiteAssignment_2()); 

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
    // InternalPDL.g:1254:1: rule__RequeteDeRessource__Group__3 : rule__RequeteDeRessource__Group__3__Impl rule__RequeteDeRessource__Group__4 ;
    public final void rule__RequeteDeRessource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1258:1: ( rule__RequeteDeRessource__Group__3__Impl rule__RequeteDeRessource__Group__4 )
            // InternalPDL.g:1259:2: rule__RequeteDeRessource__Group__3__Impl rule__RequeteDeRessource__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalPDL.g:1266:1: rule__RequeteDeRessource__Group__3__Impl : ( 'from' ) ;
    public final void rule__RequeteDeRessource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1270:1: ( ( 'from' ) )
            // InternalPDL.g:1271:1: ( 'from' )
            {
            // InternalPDL.g:1271:1: ( 'from' )
            // InternalPDL.g:1272:2: 'from'
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getFromKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRequeteDeRessourceAccess().getFromKeyword_3()); 

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
    // InternalPDL.g:1281:1: rule__RequeteDeRessource__Group__4 : rule__RequeteDeRessource__Group__4__Impl rule__RequeteDeRessource__Group__5 ;
    public final void rule__RequeteDeRessource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1285:1: ( rule__RequeteDeRessource__Group__4__Impl rule__RequeteDeRessource__Group__5 )
            // InternalPDL.g:1286:2: rule__RequeteDeRessource__Group__4__Impl rule__RequeteDeRessource__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalPDL.g:1293:1: rule__RequeteDeRessource__Group__4__Impl : ( ( rule__RequeteDeRessource__ResourcesAssignment_4 ) ) ;
    public final void rule__RequeteDeRessource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1297:1: ( ( ( rule__RequeteDeRessource__ResourcesAssignment_4 ) ) )
            // InternalPDL.g:1298:1: ( ( rule__RequeteDeRessource__ResourcesAssignment_4 ) )
            {
            // InternalPDL.g:1298:1: ( ( rule__RequeteDeRessource__ResourcesAssignment_4 ) )
            // InternalPDL.g:1299:2: ( rule__RequeteDeRessource__ResourcesAssignment_4 )
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getResourcesAssignment_4()); 
            // InternalPDL.g:1300:2: ( rule__RequeteDeRessource__ResourcesAssignment_4 )
            // InternalPDL.g:1300:3: rule__RequeteDeRessource__ResourcesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__ResourcesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRequeteDeRessourceAccess().getResourcesAssignment_4()); 

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
    // InternalPDL.g:1308:1: rule__RequeteDeRessource__Group__5 : rule__RequeteDeRessource__Group__5__Impl rule__RequeteDeRessource__Group__6 ;
    public final void rule__RequeteDeRessource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1312:1: ( rule__RequeteDeRessource__Group__5__Impl rule__RequeteDeRessource__Group__6 )
            // InternalPDL.g:1313:2: rule__RequeteDeRessource__Group__5__Impl rule__RequeteDeRessource__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalPDL.g:1320:1: rule__RequeteDeRessource__Group__5__Impl : ( 'for' ) ;
    public final void rule__RequeteDeRessource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1324:1: ( ( 'for' ) )
            // InternalPDL.g:1325:1: ( 'for' )
            {
            // InternalPDL.g:1325:1: ( 'for' )
            // InternalPDL.g:1326:2: 'for'
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getForKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRequeteDeRessourceAccess().getForKeyword_5()); 

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
    // InternalPDL.g:1335:1: rule__RequeteDeRessource__Group__6 : rule__RequeteDeRessource__Group__6__Impl ;
    public final void rule__RequeteDeRessource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1339:1: ( rule__RequeteDeRessource__Group__6__Impl )
            // InternalPDL.g:1340:2: rule__RequeteDeRessource__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__Group__6__Impl();

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
    // InternalPDL.g:1346:1: rule__RequeteDeRessource__Group__6__Impl : ( ( rule__RequeteDeRessource__WorkdefinitionAssignment_6 ) ) ;
    public final void rule__RequeteDeRessource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1350:1: ( ( ( rule__RequeteDeRessource__WorkdefinitionAssignment_6 ) ) )
            // InternalPDL.g:1351:1: ( ( rule__RequeteDeRessource__WorkdefinitionAssignment_6 ) )
            {
            // InternalPDL.g:1351:1: ( ( rule__RequeteDeRessource__WorkdefinitionAssignment_6 ) )
            // InternalPDL.g:1352:2: ( rule__RequeteDeRessource__WorkdefinitionAssignment_6 )
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionAssignment_6()); 
            // InternalPDL.g:1353:2: ( rule__RequeteDeRessource__WorkdefinitionAssignment_6 )
            // InternalPDL.g:1353:3: rule__RequeteDeRessource__WorkdefinitionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RequeteDeRessource__WorkdefinitionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionAssignment_6()); 

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


    // $ANTLR start "rule__GuidanceLink__Group__0"
    // InternalPDL.g:1362:1: rule__GuidanceLink__Group__0 : rule__GuidanceLink__Group__0__Impl rule__GuidanceLink__Group__1 ;
    public final void rule__GuidanceLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1366:1: ( rule__GuidanceLink__Group__0__Impl rule__GuidanceLink__Group__1 )
            // InternalPDL.g:1367:2: rule__GuidanceLink__Group__0__Impl rule__GuidanceLink__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__GuidanceLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GuidanceLink__Group__1();

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
    // $ANTLR end "rule__GuidanceLink__Group__0"


    // $ANTLR start "rule__GuidanceLink__Group__0__Impl"
    // InternalPDL.g:1374:1: rule__GuidanceLink__Group__0__Impl : ( 'ref' ) ;
    public final void rule__GuidanceLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1378:1: ( ( 'ref' ) )
            // InternalPDL.g:1379:1: ( 'ref' )
            {
            // InternalPDL.g:1379:1: ( 'ref' )
            // InternalPDL.g:1380:2: 'ref'
            {
             before(grammarAccess.getGuidanceLinkAccess().getRefKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGuidanceLinkAccess().getRefKeyword_0()); 

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
    // $ANTLR end "rule__GuidanceLink__Group__0__Impl"


    // $ANTLR start "rule__GuidanceLink__Group__1"
    // InternalPDL.g:1389:1: rule__GuidanceLink__Group__1 : rule__GuidanceLink__Group__1__Impl rule__GuidanceLink__Group__2 ;
    public final void rule__GuidanceLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1393:1: ( rule__GuidanceLink__Group__1__Impl rule__GuidanceLink__Group__2 )
            // InternalPDL.g:1394:2: rule__GuidanceLink__Group__1__Impl rule__GuidanceLink__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GuidanceLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GuidanceLink__Group__2();

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
    // $ANTLR end "rule__GuidanceLink__Group__1"


    // $ANTLR start "rule__GuidanceLink__Group__1__Impl"
    // InternalPDL.g:1401:1: rule__GuidanceLink__Group__1__Impl : ( 'note' ) ;
    public final void rule__GuidanceLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1405:1: ( ( 'note' ) )
            // InternalPDL.g:1406:1: ( 'note' )
            {
            // InternalPDL.g:1406:1: ( 'note' )
            // InternalPDL.g:1407:2: 'note'
            {
             before(grammarAccess.getGuidanceLinkAccess().getNoteKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGuidanceLinkAccess().getNoteKeyword_1()); 

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
    // $ANTLR end "rule__GuidanceLink__Group__1__Impl"


    // $ANTLR start "rule__GuidanceLink__Group__2"
    // InternalPDL.g:1416:1: rule__GuidanceLink__Group__2 : rule__GuidanceLink__Group__2__Impl rule__GuidanceLink__Group__3 ;
    public final void rule__GuidanceLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1420:1: ( rule__GuidanceLink__Group__2__Impl rule__GuidanceLink__Group__3 )
            // InternalPDL.g:1421:2: rule__GuidanceLink__Group__2__Impl rule__GuidanceLink__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__GuidanceLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GuidanceLink__Group__3();

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
    // $ANTLR end "rule__GuidanceLink__Group__2"


    // $ANTLR start "rule__GuidanceLink__Group__2__Impl"
    // InternalPDL.g:1428:1: rule__GuidanceLink__Group__2__Impl : ( ( rule__GuidanceLink__GuidanceAssignment_2 ) ) ;
    public final void rule__GuidanceLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1432:1: ( ( ( rule__GuidanceLink__GuidanceAssignment_2 ) ) )
            // InternalPDL.g:1433:1: ( ( rule__GuidanceLink__GuidanceAssignment_2 ) )
            {
            // InternalPDL.g:1433:1: ( ( rule__GuidanceLink__GuidanceAssignment_2 ) )
            // InternalPDL.g:1434:2: ( rule__GuidanceLink__GuidanceAssignment_2 )
            {
             before(grammarAccess.getGuidanceLinkAccess().getGuidanceAssignment_2()); 
            // InternalPDL.g:1435:2: ( rule__GuidanceLink__GuidanceAssignment_2 )
            // InternalPDL.g:1435:3: rule__GuidanceLink__GuidanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GuidanceLink__GuidanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceLinkAccess().getGuidanceAssignment_2()); 

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
    // $ANTLR end "rule__GuidanceLink__Group__2__Impl"


    // $ANTLR start "rule__GuidanceLink__Group__3"
    // InternalPDL.g:1443:1: rule__GuidanceLink__Group__3 : rule__GuidanceLink__Group__3__Impl rule__GuidanceLink__Group__4 ;
    public final void rule__GuidanceLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1447:1: ( rule__GuidanceLink__Group__3__Impl rule__GuidanceLink__Group__4 )
            // InternalPDL.g:1448:2: rule__GuidanceLink__Group__3__Impl rule__GuidanceLink__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__GuidanceLink__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GuidanceLink__Group__4();

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
    // $ANTLR end "rule__GuidanceLink__Group__3"


    // $ANTLR start "rule__GuidanceLink__Group__3__Impl"
    // InternalPDL.g:1455:1: rule__GuidanceLink__Group__3__Impl : ( 'documents' ) ;
    public final void rule__GuidanceLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1459:1: ( ( 'documents' ) )
            // InternalPDL.g:1460:1: ( 'documents' )
            {
            // InternalPDL.g:1460:1: ( 'documents' )
            // InternalPDL.g:1461:2: 'documents'
            {
             before(grammarAccess.getGuidanceLinkAccess().getDocumentsKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGuidanceLinkAccess().getDocumentsKeyword_3()); 

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
    // $ANTLR end "rule__GuidanceLink__Group__3__Impl"


    // $ANTLR start "rule__GuidanceLink__Group__4"
    // InternalPDL.g:1470:1: rule__GuidanceLink__Group__4 : rule__GuidanceLink__Group__4__Impl ;
    public final void rule__GuidanceLink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1474:1: ( rule__GuidanceLink__Group__4__Impl )
            // InternalPDL.g:1475:2: rule__GuidanceLink__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GuidanceLink__Group__4__Impl();

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
    // $ANTLR end "rule__GuidanceLink__Group__4"


    // $ANTLR start "rule__GuidanceLink__Group__4__Impl"
    // InternalPDL.g:1481:1: rule__GuidanceLink__Group__4__Impl : ( ( rule__GuidanceLink__WorkdefinitionAssignment_4 ) ) ;
    public final void rule__GuidanceLink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1485:1: ( ( ( rule__GuidanceLink__WorkdefinitionAssignment_4 ) ) )
            // InternalPDL.g:1486:1: ( ( rule__GuidanceLink__WorkdefinitionAssignment_4 ) )
            {
            // InternalPDL.g:1486:1: ( ( rule__GuidanceLink__WorkdefinitionAssignment_4 ) )
            // InternalPDL.g:1487:2: ( rule__GuidanceLink__WorkdefinitionAssignment_4 )
            {
             before(grammarAccess.getGuidanceLinkAccess().getWorkdefinitionAssignment_4()); 
            // InternalPDL.g:1488:2: ( rule__GuidanceLink__WorkdefinitionAssignment_4 )
            // InternalPDL.g:1488:3: rule__GuidanceLink__WorkdefinitionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GuidanceLink__WorkdefinitionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceLinkAccess().getWorkdefinitionAssignment_4()); 

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
    // $ANTLR end "rule__GuidanceLink__Group__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalPDL.g:1497:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1501:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalPDL.g:1502:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPDL.g:1509:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1513:1: ( ( ( '-' )? ) )
            // InternalPDL.g:1514:1: ( ( '-' )? )
            {
            // InternalPDL.g:1514:1: ( ( '-' )? )
            // InternalPDL.g:1515:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalPDL.g:1516:2: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPDL.g:1516:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

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
    // InternalPDL.g:1524:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1528:1: ( rule__EInt__Group__1__Impl )
            // InternalPDL.g:1529:2: rule__EInt__Group__1__Impl
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
    // InternalPDL.g:1535:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1539:1: ( ( RULE_INT ) )
            // InternalPDL.g:1540:1: ( RULE_INT )
            {
            // InternalPDL.g:1540:1: ( RULE_INT )
            // InternalPDL.g:1541:2: RULE_INT
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
    // InternalPDL.g:1551:1: rule__Process__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1555:1: ( ( ruleEString ) )
            // InternalPDL.g:1556:2: ( ruleEString )
            {
            // InternalPDL.g:1556:2: ( ruleEString )
            // InternalPDL.g:1557:3: ruleEString
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
    // InternalPDL.g:1566:1: rule__Process__ProcessElementsAssignment_4_2 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1570:1: ( ( ruleProcessElement ) )
            // InternalPDL.g:1571:2: ( ruleProcessElement )
            {
            // InternalPDL.g:1571:2: ( ruleProcessElement )
            // InternalPDL.g:1572:3: ruleProcessElement
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
    // InternalPDL.g:1581:1: rule__Process__ProcessElementsAssignment_4_3_1 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1585:1: ( ( ruleProcessElement ) )
            // InternalPDL.g:1586:2: ( ruleProcessElement )
            {
            // InternalPDL.g:1586:2: ( ruleProcessElement )
            // InternalPDL.g:1587:3: ruleProcessElement
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
    // InternalPDL.g:1596:1: rule__WorkDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1600:1: ( ( RULE_ID ) )
            // InternalPDL.g:1601:2: ( RULE_ID )
            {
            // InternalPDL.g:1601:2: ( RULE_ID )
            // InternalPDL.g:1602:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

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


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDL.g:1611:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1615:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL.g:1616:2: ( ruleWorkSequenceType )
            {
            // InternalPDL.g:1616:2: ( ruleWorkSequenceType )
            // InternalPDL.g:1617:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // InternalPDL.g:1626:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1630:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1631:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1631:2: ( ( RULE_ID ) )
            // InternalPDL.g:1632:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // InternalPDL.g:1633:3: ( RULE_ID )
            // InternalPDL.g:1634:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

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
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_5"
    // InternalPDL.g:1645:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1649:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1650:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1650:2: ( ( RULE_ID ) )
            // InternalPDL.g:1651:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // InternalPDL.g:1652:3: ( RULE_ID )
            // InternalPDL.g:1653:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 

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
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_5"


    // $ANTLR start "rule__Guidance__TextAssignment_1"
    // InternalPDL.g:1664:1: rule__Guidance__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Guidance__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1668:1: ( ( ruleEString ) )
            // InternalPDL.g:1669:2: ( ruleEString )
            {
            // InternalPDL.g:1669:2: ( ruleEString )
            // InternalPDL.g:1670:3: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Guidance__TextAssignment_1"


    // $ANTLR start "rule__Resources__NameAssignment_1"
    // InternalPDL.g:1679:1: rule__Resources__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Resources__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1683:1: ( ( ruleEString ) )
            // InternalPDL.g:1684:2: ( ruleEString )
            {
            // InternalPDL.g:1684:2: ( ruleEString )
            // InternalPDL.g:1685:3: ruleEString
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


    // $ANTLR start "rule__Resources__QuantiteAssignment_3"
    // InternalPDL.g:1694:1: rule__Resources__QuantiteAssignment_3 : ( ruleEInt ) ;
    public final void rule__Resources__QuantiteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1698:1: ( ( ruleEInt ) )
            // InternalPDL.g:1699:2: ( ruleEInt )
            {
            // InternalPDL.g:1699:2: ( ruleEInt )
            // InternalPDL.g:1700:3: ruleEInt
            {
             before(grammarAccess.getResourcesAccess().getQuantiteEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getResourcesAccess().getQuantiteEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Resources__QuantiteAssignment_3"


    // $ANTLR start "rule__RequeteDeRessource__QuantiteAssignment_2"
    // InternalPDL.g:1709:1: rule__RequeteDeRessource__QuantiteAssignment_2 : ( ruleEInt ) ;
    public final void rule__RequeteDeRessource__QuantiteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1713:1: ( ( ruleEInt ) )
            // InternalPDL.g:1714:2: ( ruleEInt )
            {
            // InternalPDL.g:1714:2: ( ruleEInt )
            // InternalPDL.g:1715:3: ruleEInt
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getQuantiteEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRequeteDeRessourceAccess().getQuantiteEIntParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RequeteDeRessource__QuantiteAssignment_2"


    // $ANTLR start "rule__RequeteDeRessource__ResourcesAssignment_4"
    // InternalPDL.g:1724:1: rule__RequeteDeRessource__ResourcesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__RequeteDeRessource__ResourcesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1728:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1729:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1729:2: ( ( RULE_ID ) )
            // InternalPDL.g:1730:3: ( RULE_ID )
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getResourcesResourcesCrossReference_4_0()); 
            // InternalPDL.g:1731:3: ( RULE_ID )
            // InternalPDL.g:1732:4: RULE_ID
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getResourcesResourcesIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequeteDeRessourceAccess().getResourcesResourcesIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRequeteDeRessourceAccess().getResourcesResourcesCrossReference_4_0()); 

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
    // $ANTLR end "rule__RequeteDeRessource__ResourcesAssignment_4"


    // $ANTLR start "rule__RequeteDeRessource__WorkdefinitionAssignment_6"
    // InternalPDL.g:1743:1: rule__RequeteDeRessource__WorkdefinitionAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__RequeteDeRessource__WorkdefinitionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1747:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1748:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1748:2: ( ( RULE_ID ) )
            // InternalPDL.g:1749:3: ( RULE_ID )
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionWorkDefinitionCrossReference_6_0()); 
            // InternalPDL.g:1750:3: ( RULE_ID )
            // InternalPDL.g:1751:4: RULE_ID
            {
             before(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionWorkDefinitionIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionWorkDefinitionIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionWorkDefinitionCrossReference_6_0()); 

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
    // $ANTLR end "rule__RequeteDeRessource__WorkdefinitionAssignment_6"


    // $ANTLR start "rule__GuidanceLink__GuidanceAssignment_2"
    // InternalPDL.g:1762:1: rule__GuidanceLink__GuidanceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__GuidanceLink__GuidanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1766:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:1767:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:1767:2: ( ( ruleEString ) )
            // InternalPDL.g:1768:3: ( ruleEString )
            {
             before(grammarAccess.getGuidanceLinkAccess().getGuidanceGuidanceCrossReference_2_0()); 
            // InternalPDL.g:1769:3: ( ruleEString )
            // InternalPDL.g:1770:4: ruleEString
            {
             before(grammarAccess.getGuidanceLinkAccess().getGuidanceGuidanceEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceLinkAccess().getGuidanceGuidanceEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGuidanceLinkAccess().getGuidanceGuidanceCrossReference_2_0()); 

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
    // $ANTLR end "rule__GuidanceLink__GuidanceAssignment_2"


    // $ANTLR start "rule__GuidanceLink__WorkdefinitionAssignment_4"
    // InternalPDL.g:1781:1: rule__GuidanceLink__WorkdefinitionAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__GuidanceLink__WorkdefinitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1785:1: ( ( ( ruleEString ) ) )
            // InternalPDL.g:1786:2: ( ( ruleEString ) )
            {
            // InternalPDL.g:1786:2: ( ( ruleEString ) )
            // InternalPDL.g:1787:3: ( ruleEString )
            {
             before(grammarAccess.getGuidanceLinkAccess().getWorkdefinitionWorkDefinitionCrossReference_4_0()); 
            // InternalPDL.g:1788:3: ( ruleEString )
            // InternalPDL.g:1789:4: ruleEString
            {
             before(grammarAccess.getGuidanceLinkAccess().getWorkdefinitionWorkDefinitionEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceLinkAccess().getWorkdefinitionWorkDefinitionEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getGuidanceLinkAccess().getWorkdefinitionWorkDefinitionCrossReference_4_0()); 

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
    // $ANTLR end "rule__GuidanceLink__WorkdefinitionAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000002B300000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});

}