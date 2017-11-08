package fr.n7.simplepdl.txt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Process'", "'{'", "'processElements'", "','", "'}'", "'wd'", "'ws'", "'from'", "'to'", "'note'", "'rsc'", "'quantity'", "'rsc_request'", "'for'", "'ref'", "'documents'", "'-'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
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

        public InternalPDLParser(TokenStream input, PDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL.g:72:1: ruleProcess returns [EObject current=null] : ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_processElements_6_0 = null;

        EObject lv_processElements_8_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:78:2: ( ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalPDL.g:79:2: ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalPDL.g:79:2: ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalPDL.g:80:3: () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalPDL.g:80:3: ()
            // InternalPDL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcessAccess().getProcessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getProcessKeyword_1());
            		
            // InternalPDL.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPDL.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalPDL.g:92:4: (lv_name_2_0= ruleEString )
            // InternalPDL.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.n7.simplepdl.txt.PDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPDL.g:114:3: (otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPDL.g:115:4: otherlv_4= 'processElements' otherlv_5= '{' ( (lv_processElements_6_0= ruleProcessElement ) ) (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getProcessElementsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalPDL.g:123:4: ( (lv_processElements_6_0= ruleProcessElement ) )
                    // InternalPDL.g:124:5: (lv_processElements_6_0= ruleProcessElement )
                    {
                    // InternalPDL.g:124:5: (lv_processElements_6_0= ruleProcessElement )
                    // InternalPDL.g:125:6: lv_processElements_6_0= ruleProcessElement
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_processElements_6_0=ruleProcessElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"processElements",
                    							lv_processElements_6_0,
                    							"fr.n7.simplepdl.txt.PDL.ProcessElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:142:4: (otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalPDL.g:143:5: otherlv_7= ',' ( (lv_processElements_8_0= ruleProcessElement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalPDL.g:147:5: ( (lv_processElements_8_0= ruleProcessElement ) )
                    	    // InternalPDL.g:148:6: (lv_processElements_8_0= ruleProcessElement )
                    	    {
                    	    // InternalPDL.g:148:6: (lv_processElements_8_0= ruleProcessElement )
                    	    // InternalPDL.g:149:7: lv_processElements_8_0= ruleProcessElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_processElements_8_0=ruleProcessElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"processElements",
                    	    								lv_processElements_8_0,
                    	    								"fr.n7.simplepdl.txt.PDL.ProcessElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL.g:180:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalPDL.g:180:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalPDL.g:181:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL.g:187:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resources_3= ruleResources | this_RequeteDeRessource_4= ruleRequeteDeRessource | this_GuidanceLink_5= ruleGuidanceLink ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_WorkSequence_1 = null;

        EObject this_Guidance_2 = null;

        EObject this_Resources_3 = null;

        EObject this_RequeteDeRessource_4 = null;

        EObject this_GuidanceLink_5 = null;



        	enterRule();

        try {
            // InternalPDL.g:193:2: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resources_3= ruleResources | this_RequeteDeRessource_4= ruleRequeteDeRessource | this_GuidanceLink_5= ruleGuidanceLink ) )
            // InternalPDL.g:194:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resources_3= ruleResources | this_RequeteDeRessource_4= ruleRequeteDeRessource | this_GuidanceLink_5= ruleGuidanceLink )
            {
            // InternalPDL.g:194:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resources_3= ruleResources | this_RequeteDeRessource_4= ruleRequeteDeRessource | this_GuidanceLink_5= ruleGuidanceLink )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            case 25:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPDL.g:195:3: this_WorkDefinition_0= ruleWorkDefinition
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkDefinition_0=ruleWorkDefinition();

                    state._fsp--;


                    			current = this_WorkDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPDL.g:204:3: this_WorkSequence_1= ruleWorkSequence
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkSequence_1=ruleWorkSequence();

                    state._fsp--;


                    			current = this_WorkSequence_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPDL.g:213:3: this_Guidance_2= ruleGuidance
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Guidance_2=ruleGuidance();

                    state._fsp--;


                    			current = this_Guidance_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPDL.g:222:3: this_Resources_3= ruleResources
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getResourcesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Resources_3=ruleResources();

                    state._fsp--;


                    			current = this_Resources_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPDL.g:231:3: this_RequeteDeRessource_4= ruleRequeteDeRessource
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getRequeteDeRessourceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequeteDeRessource_4=ruleRequeteDeRessource();

                    state._fsp--;


                    			current = this_RequeteDeRessource_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPDL.g:240:3: this_GuidanceLink_5= ruleGuidanceLink
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceLinkParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GuidanceLink_5=ruleGuidanceLink();

                    state._fsp--;


                    			current = this_GuidanceLink_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleEString"
    // InternalPDL.g:252:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPDL.g:252:47: (iv_ruleEString= ruleEString EOF )
            // InternalPDL.g:253:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPDL.g:259:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPDL.g:265:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPDL.g:266:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPDL.g:266:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL.g:267:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPDL.g:275:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL.g:286:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalPDL.g:286:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalPDL.g:287:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL.g:293:1: ruleWorkDefinition returns [EObject current=null] : ( () otherlv_1= 'wd' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalPDL.g:299:2: ( ( () otherlv_1= 'wd' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalPDL.g:300:2: ( () otherlv_1= 'wd' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalPDL.g:300:2: ( () otherlv_1= 'wd' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalPDL.g:301:3: () otherlv_1= 'wd' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalPDL.g:301:3: ()
            // InternalPDL.g:302:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkDefinitionAccess().getWdKeyword_1());
            		
            // InternalPDL.g:312:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPDL.g:313:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPDL.g:313:4: (lv_name_2_0= RULE_ID )
            // InternalPDL.g:314:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL.g:334:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalPDL.g:334:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalPDL.g:335:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL.g:341:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_linkType_1_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:347:2: ( (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalPDL.g:348:2: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalPDL.g:348:2: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // InternalPDL.g:349:3: otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
            		
            // InternalPDL.g:353:3: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // InternalPDL.g:354:4: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // InternalPDL.g:354:4: (lv_linkType_1_0= ruleWorkSequenceType )
            // InternalPDL.g:355:5: lv_linkType_1_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_1_0,
            						"fr.n7.simplepdl.txt.PDL.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getFromKeyword_2());
            		
            // InternalPDL.g:376:3: ( (otherlv_3= RULE_ID ) )
            // InternalPDL.g:377:4: (otherlv_3= RULE_ID )
            {
            // InternalPDL.g:377:4: (otherlv_3= RULE_ID )
            // InternalPDL.g:378:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
            		
            // InternalPDL.g:393:3: ( (otherlv_5= RULE_ID ) )
            // InternalPDL.g:394:4: (otherlv_5= RULE_ID )
            {
            // InternalPDL.g:394:4: (otherlv_5= RULE_ID )
            // InternalPDL.g:395:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL.g:410:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalPDL.g:410:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalPDL.g:411:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL.g:417:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'note' ( (lv_text_1_0= ruleEString ) ) ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:423:2: ( (otherlv_0= 'note' ( (lv_text_1_0= ruleEString ) ) ) )
            // InternalPDL.g:424:2: (otherlv_0= 'note' ( (lv_text_1_0= ruleEString ) ) )
            {
            // InternalPDL.g:424:2: (otherlv_0= 'note' ( (lv_text_1_0= ruleEString ) ) )
            // InternalPDL.g:425:3: otherlv_0= 'note' ( (lv_text_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getNoteKeyword_0());
            		
            // InternalPDL.g:429:3: ( (lv_text_1_0= ruleEString ) )
            // InternalPDL.g:430:4: (lv_text_1_0= ruleEString )
            {
            // InternalPDL.g:430:4: (lv_text_1_0= ruleEString )
            // InternalPDL.g:431:5: lv_text_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuidanceRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_1_0,
            						"fr.n7.simplepdl.txt.PDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleResources"
    // InternalPDL.g:452:1: entryRuleResources returns [EObject current=null] : iv_ruleResources= ruleResources EOF ;
    public final EObject entryRuleResources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResources = null;


        try {
            // InternalPDL.g:452:50: (iv_ruleResources= ruleResources EOF )
            // InternalPDL.g:453:2: iv_ruleResources= ruleResources EOF
            {
             newCompositeNode(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResources=ruleResources();

            state._fsp--;

             current =iv_ruleResources; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // InternalPDL.g:459:1: ruleResources returns [EObject current=null] : (otherlv_0= 'rsc' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'quantity' ( (lv_quantite_3_0= ruleEInt ) ) ) ;
    public final EObject ruleResources() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_quantite_3_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:465:2: ( (otherlv_0= 'rsc' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'quantity' ( (lv_quantite_3_0= ruleEInt ) ) ) )
            // InternalPDL.g:466:2: (otherlv_0= 'rsc' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'quantity' ( (lv_quantite_3_0= ruleEInt ) ) )
            {
            // InternalPDL.g:466:2: (otherlv_0= 'rsc' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'quantity' ( (lv_quantite_3_0= ruleEInt ) ) )
            // InternalPDL.g:467:3: otherlv_0= 'rsc' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'quantity' ( (lv_quantite_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResourcesAccess().getRscKeyword_0());
            		
            // InternalPDL.g:471:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPDL.g:472:4: (lv_name_1_0= ruleEString )
            {
            // InternalPDL.g:472:4: (lv_name_1_0= ruleEString )
            // InternalPDL.g:473:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourcesAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourcesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.n7.simplepdl.txt.PDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getResourcesAccess().getQuantityKeyword_2());
            		
            // InternalPDL.g:494:3: ( (lv_quantite_3_0= ruleEInt ) )
            // InternalPDL.g:495:4: (lv_quantite_3_0= ruleEInt )
            {
            // InternalPDL.g:495:4: (lv_quantite_3_0= ruleEInt )
            // InternalPDL.g:496:5: lv_quantite_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getResourcesAccess().getQuantiteEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_quantite_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourcesRule());
            					}
            					set(
            						current,
            						"quantite",
            						lv_quantite_3_0,
            						"fr.n7.simplepdl.txt.PDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleRequeteDeRessource"
    // InternalPDL.g:517:1: entryRuleRequeteDeRessource returns [EObject current=null] : iv_ruleRequeteDeRessource= ruleRequeteDeRessource EOF ;
    public final EObject entryRuleRequeteDeRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequeteDeRessource = null;


        try {
            // InternalPDL.g:517:59: (iv_ruleRequeteDeRessource= ruleRequeteDeRessource EOF )
            // InternalPDL.g:518:2: iv_ruleRequeteDeRessource= ruleRequeteDeRessource EOF
            {
             newCompositeNode(grammarAccess.getRequeteDeRessourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequeteDeRessource=ruleRequeteDeRessource();

            state._fsp--;

             current =iv_ruleRequeteDeRessource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequeteDeRessource"


    // $ANTLR start "ruleRequeteDeRessource"
    // InternalPDL.g:524:1: ruleRequeteDeRessource returns [EObject current=null] : (otherlv_0= 'rsc_request' otherlv_1= 'quantity' ( (lv_quantite_2_0= ruleEInt ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleRequeteDeRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_quantite_2_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:530:2: ( (otherlv_0= 'rsc_request' otherlv_1= 'quantity' ( (lv_quantite_2_0= ruleEInt ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (otherlv_6= RULE_ID ) ) ) )
            // InternalPDL.g:531:2: (otherlv_0= 'rsc_request' otherlv_1= 'quantity' ( (lv_quantite_2_0= ruleEInt ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalPDL.g:531:2: (otherlv_0= 'rsc_request' otherlv_1= 'quantity' ( (lv_quantite_2_0= ruleEInt ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (otherlv_6= RULE_ID ) ) )
            // InternalPDL.g:532:3: otherlv_0= 'rsc_request' otherlv_1= 'quantity' ( (lv_quantite_2_0= ruleEInt ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRequeteDeRessourceAccess().getRsc_requestKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getRequeteDeRessourceAccess().getQuantityKeyword_1());
            		
            // InternalPDL.g:540:3: ( (lv_quantite_2_0= ruleEInt ) )
            // InternalPDL.g:541:4: (lv_quantite_2_0= ruleEInt )
            {
            // InternalPDL.g:541:4: (lv_quantite_2_0= ruleEInt )
            // InternalPDL.g:542:5: lv_quantite_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRequeteDeRessourceAccess().getQuantiteEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_quantite_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequeteDeRessourceRule());
            					}
            					set(
            						current,
            						"quantite",
            						lv_quantite_2_0,
            						"fr.n7.simplepdl.txt.PDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRequeteDeRessourceAccess().getFromKeyword_3());
            		
            // InternalPDL.g:563:3: ( (otherlv_4= RULE_ID ) )
            // InternalPDL.g:564:4: (otherlv_4= RULE_ID )
            {
            // InternalPDL.g:564:4: (otherlv_4= RULE_ID )
            // InternalPDL.g:565:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequeteDeRessourceRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_4, grammarAccess.getRequeteDeRessourceAccess().getResourcesResourcesCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getRequeteDeRessourceAccess().getForKeyword_5());
            		
            // InternalPDL.g:580:3: ( (otherlv_6= RULE_ID ) )
            // InternalPDL.g:581:4: (otherlv_6= RULE_ID )
            {
            // InternalPDL.g:581:4: (otherlv_6= RULE_ID )
            // InternalPDL.g:582:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequeteDeRessourceRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionWorkDefinitionCrossReference_6_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequeteDeRessource"


    // $ANTLR start "entryRuleGuidanceLink"
    // InternalPDL.g:597:1: entryRuleGuidanceLink returns [EObject current=null] : iv_ruleGuidanceLink= ruleGuidanceLink EOF ;
    public final EObject entryRuleGuidanceLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidanceLink = null;


        try {
            // InternalPDL.g:597:53: (iv_ruleGuidanceLink= ruleGuidanceLink EOF )
            // InternalPDL.g:598:2: iv_ruleGuidanceLink= ruleGuidanceLink EOF
            {
             newCompositeNode(grammarAccess.getGuidanceLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidanceLink=ruleGuidanceLink();

            state._fsp--;

             current =iv_ruleGuidanceLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuidanceLink"


    // $ANTLR start "ruleGuidanceLink"
    // InternalPDL.g:604:1: ruleGuidanceLink returns [EObject current=null] : (otherlv_0= 'ref' otherlv_1= 'note' ( ( ruleEString ) ) otherlv_3= 'documents' ( ( ruleEString ) ) ) ;
    public final EObject ruleGuidanceLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPDL.g:610:2: ( (otherlv_0= 'ref' otherlv_1= 'note' ( ( ruleEString ) ) otherlv_3= 'documents' ( ( ruleEString ) ) ) )
            // InternalPDL.g:611:2: (otherlv_0= 'ref' otherlv_1= 'note' ( ( ruleEString ) ) otherlv_3= 'documents' ( ( ruleEString ) ) )
            {
            // InternalPDL.g:611:2: (otherlv_0= 'ref' otherlv_1= 'note' ( ( ruleEString ) ) otherlv_3= 'documents' ( ( ruleEString ) ) )
            // InternalPDL.g:612:3: otherlv_0= 'ref' otherlv_1= 'note' ( ( ruleEString ) ) otherlv_3= 'documents' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceLinkAccess().getRefKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGuidanceLinkAccess().getNoteKeyword_1());
            		
            // InternalPDL.g:620:3: ( ( ruleEString ) )
            // InternalPDL.g:621:4: ( ruleEString )
            {
            // InternalPDL.g:621:4: ( ruleEString )
            // InternalPDL.g:622:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidanceLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGuidanceLinkAccess().getGuidanceGuidanceCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGuidanceLinkAccess().getDocumentsKeyword_3());
            		
            // InternalPDL.g:640:3: ( ( ruleEString ) )
            // InternalPDL.g:641:4: ( ruleEString )
            {
            // InternalPDL.g:641:4: ( ruleEString )
            // InternalPDL.g:642:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidanceLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGuidanceLinkAccess().getWorkdefinitionWorkDefinitionCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuidanceLink"


    // $ANTLR start "entryRuleEInt"
    // InternalPDL.g:660:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPDL.g:660:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPDL.g:661:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPDL.g:667:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPDL.g:673:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPDL.g:674:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPDL.g:674:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPDL.g:675:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPDL.g:675:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDL.g:676:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL.g:693:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL.g:699:2: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) )
            // InternalPDL.g:700:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            {
            // InternalPDL.g:700:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPDL.g:701:3: (enumLiteral_0= 's2s' )
                    {
                    // InternalPDL.g:701:3: (enumLiteral_0= 's2s' )
                    // InternalPDL.g:702:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:709:3: (enumLiteral_1= 'f2s' )
                    {
                    // InternalPDL.g:709:3: (enumLiteral_1= 'f2s' )
                    // InternalPDL.g:710:4: enumLiteral_1= 'f2s'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:717:3: (enumLiteral_2= 's2f' )
                    {
                    // InternalPDL.g:717:3: (enumLiteral_2= 's2f' )
                    // InternalPDL.g:718:4: enumLiteral_2= 's2f'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:725:3: (enumLiteral_3= 'f2f' )
                    {
                    // InternalPDL.g:725:3: (enumLiteral_3= 'f2f' )
                    // InternalPDL.g:726:4: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002B30000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});

}