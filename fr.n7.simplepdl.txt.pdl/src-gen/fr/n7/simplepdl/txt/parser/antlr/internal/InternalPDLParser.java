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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Process'", "'{'", "'processElements'", "','", "'}'", "'WorkDefinition'", "'linksToPredecessors'", "'('", "')'", "'linksToSuccessors'", "'linktoresource'", "'WorkSequence'", "'linkType'", "'predecessor'", "'successor'", "'Guidance'", "'text'", "'elements'", "'Resources'", "'quantite'", "'RequeteDeRessource'", "'resources'", "'workdefinition'", "'-'", "'startToStart'", "'finishToStart'", "'startToFinish'", "'finishToFinish'"
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
    // InternalPDL.g:187:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resources_3= ruleResources | this_RequeteDeRessource_4= ruleRequeteDeRessource ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_WorkSequence_1 = null;

        EObject this_Guidance_2 = null;

        EObject this_Resources_3 = null;

        EObject this_RequeteDeRessource_4 = null;



        	enterRule();

        try {
            // InternalPDL.g:193:2: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resources_3= ruleResources | this_RequeteDeRessource_4= ruleRequeteDeRessource ) )
            // InternalPDL.g:194:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resources_3= ruleResources | this_RequeteDeRessource_4= ruleRequeteDeRessource )
            {
            // InternalPDL.g:194:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resources_3= ruleResources | this_RequeteDeRessource_4= ruleRequeteDeRessource )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            case 31:
                {
                alt3=5;
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
    // InternalPDL.g:243:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPDL.g:243:47: (iv_ruleEString= ruleEString EOF )
            // InternalPDL.g:244:2: iv_ruleEString= ruleEString EOF
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
    // InternalPDL.g:250:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPDL.g:256:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPDL.g:257:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPDL.g:257:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalPDL.g:258:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPDL.g:266:3: this_ID_1= RULE_ID
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
    // InternalPDL.g:277:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalPDL.g:277:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalPDL.g:278:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
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
    // InternalPDL.g:284:1: ruleWorkDefinition returns [EObject current=null] : ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'linktoresource' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:290:2: ( ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'linktoresource' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' ) )
            // InternalPDL.g:291:2: ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'linktoresource' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' )
            {
            // InternalPDL.g:291:2: ( () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'linktoresource' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' )
            // InternalPDL.g:292:3: () otherlv_1= 'WorkDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'linktoresource' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}'
            {
            // InternalPDL.g:292:3: ()
            // InternalPDL.g:293:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkDefinitionAccess().getWorkDefinitionKeyword_1());
            		
            // InternalPDL.g:303:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPDL.g:304:4: (lv_name_2_0= ruleEString )
            {
            // InternalPDL.g:304:4: (lv_name_2_0= ruleEString )
            // InternalPDL.g:305:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.n7.simplepdl.txt.PDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPDL.g:326:3: (otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPDL.g:327:4: otherlv_4= 'linksToPredecessors' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalPDL.g:335:4: ( ( ruleEString ) )
                    // InternalPDL.g:336:5: ( ruleEString )
                    {
                    // InternalPDL.g:336:5: ( ruleEString )
                    // InternalPDL.g:337:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:351:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPDL.g:352:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalPDL.g:356:5: ( ( ruleEString ) )
                    	    // InternalPDL.g:357:6: ( ruleEString )
                    	    {
                    	    // InternalPDL.g:357:6: ( ruleEString )
                    	    // InternalPDL.g:358:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsWorkSequenceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalPDL.g:378:3: (otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPDL.g:379:4: otherlv_10= 'linksToSuccessors' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalPDL.g:387:4: ( ( ruleEString ) )
                    // InternalPDL.g:388:5: ( ruleEString )
                    {
                    // InternalPDL.g:388:5: ( ruleEString )
                    // InternalPDL.g:389:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:403:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPDL.g:404:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalPDL.g:408:5: ( ( ruleEString ) )
                    	    // InternalPDL.g:409:6: ( ruleEString )
                    	    {
                    	    // InternalPDL.g:409:6: ( ruleEString )
                    	    // InternalPDL.g:410:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorsWorkSequenceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalPDL.g:430:3: (otherlv_16= 'linktoresource' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPDL.g:431:4: otherlv_16= 'linktoresource' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getWorkDefinitionAccess().getLinktoresourceKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getWorkDefinitionAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalPDL.g:439:4: ( ( ruleEString ) )
                    // InternalPDL.g:440:5: ( ruleEString )
                    {
                    // InternalPDL.g:440:5: ( ruleEString )
                    // InternalPDL.g:441:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinktoresourceRequeteDeRessourceCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:455:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPDL.g:456:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalPDL.g:460:5: ( ( ruleEString ) )
                    	    // InternalPDL.g:461:6: ( ruleEString )
                    	    {
                    	    // InternalPDL.g:461:6: ( ruleEString )
                    	    // InternalPDL.g:462:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinktoresourceRequeteDeRessourceCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getWorkDefinitionAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalPDL.g:490:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalPDL.g:490:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalPDL.g:491:2: iv_ruleWorkSequence= ruleWorkSequence EOF
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
    // InternalPDL.g:497:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'WorkSequence' otherlv_1= '{' otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_linkType_3_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:503:2: ( (otherlv_0= 'WorkSequence' otherlv_1= '{' otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalPDL.g:504:2: (otherlv_0= 'WorkSequence' otherlv_1= '{' otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalPDL.g:504:2: (otherlv_0= 'WorkSequence' otherlv_1= '{' otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalPDL.g:505:3: otherlv_0= 'WorkSequence' otherlv_1= '{' otherlv_2= 'linkType' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'predecessor' ( ( ruleEString ) ) otherlv_6= 'successor' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWorkSequenceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getLinkTypeKeyword_2());
            		
            // InternalPDL.g:517:3: ( (lv_linkType_3_0= ruleWorkSequenceType ) )
            // InternalPDL.g:518:4: (lv_linkType_3_0= ruleWorkSequenceType )
            {
            // InternalPDL.g:518:4: (lv_linkType_3_0= ruleWorkSequenceType )
            // InternalPDL.g:519:5: lv_linkType_3_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_linkType_3_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_3_0,
            						"fr.n7.simplepdl.txt.PDL.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_4());
            		
            // InternalPDL.g:540:3: ( ( ruleEString ) )
            // InternalPDL.g:541:4: ( ruleEString )
            {
            // InternalPDL.g:541:4: ( ruleEString )
            // InternalPDL.g:542:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_6());
            		
            // InternalPDL.g:560:3: ( ( ruleEString ) )
            // InternalPDL.g:561:4: ( ruleEString )
            {
            // InternalPDL.g:561:4: ( ruleEString )
            // InternalPDL.g:562:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalPDL.g:584:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalPDL.g:584:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalPDL.g:585:2: iv_ruleGuidance= ruleGuidance EOF
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
    // InternalPDL.g:591:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'Guidance' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'elements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:597:2: ( (otherlv_0= 'Guidance' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'elements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalPDL.g:598:2: (otherlv_0= 'Guidance' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'elements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalPDL.g:598:2: (otherlv_0= 'Guidance' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'elements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalPDL.g:599:3: otherlv_0= 'Guidance' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'elements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getGuidanceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getTextKeyword_2());
            		
            // InternalPDL.g:611:3: ( (lv_text_3_0= ruleEString ) )
            // InternalPDL.g:612:4: (lv_text_3_0= ruleEString )
            {
            // InternalPDL.g:612:4: (lv_text_3_0= ruleEString )
            // InternalPDL.g:613:5: lv_text_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_text_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuidanceRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_3_0,
            						"fr.n7.simplepdl.txt.PDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDL.g:630:3: (otherlv_4= 'elements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPDL.g:631:4: otherlv_4= 'elements' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getGuidanceAccess().getElementsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalPDL.g:639:4: ( ( ruleEString ) )
                    // InternalPDL.g:640:5: ( ruleEString )
                    {
                    // InternalPDL.g:640:5: ( ruleEString )
                    // InternalPDL.g:641:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGuidanceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:655:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalPDL.g:656:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getGuidanceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalPDL.g:660:5: ( ( ruleEString ) )
                    	    // InternalPDL.g:661:6: ( ruleEString )
                    	    {
                    	    // InternalPDL.g:661:6: ( ruleEString )
                    	    // InternalPDL.g:662:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGuidanceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalPDL.g:690:1: entryRuleResources returns [EObject current=null] : iv_ruleResources= ruleResources EOF ;
    public final EObject entryRuleResources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResources = null;


        try {
            // InternalPDL.g:690:50: (iv_ruleResources= ruleResources EOF )
            // InternalPDL.g:691:2: iv_ruleResources= ruleResources EOF
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
    // InternalPDL.g:697:1: ruleResources returns [EObject current=null] : (otherlv_0= 'Resources' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'quantite' ( (lv_quantite_4_0= ruleEInt ) ) (otherlv_5= 'linktoresource' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
    public final EObject ruleResources() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_quantite_4_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:703:2: ( (otherlv_0= 'Resources' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'quantite' ( (lv_quantite_4_0= ruleEInt ) ) (otherlv_5= 'linktoresource' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // InternalPDL.g:704:2: (otherlv_0= 'Resources' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'quantite' ( (lv_quantite_4_0= ruleEInt ) ) (otherlv_5= 'linktoresource' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // InternalPDL.g:704:2: (otherlv_0= 'Resources' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'quantite' ( (lv_quantite_4_0= ruleEInt ) ) (otherlv_5= 'linktoresource' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // InternalPDL.g:705:3: otherlv_0= 'Resources' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'quantite' ( (lv_quantite_4_0= ruleEInt ) ) (otherlv_5= 'linktoresource' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResourcesAccess().getResourcesKeyword_0());
            		
            // InternalPDL.g:709:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPDL.g:710:4: (lv_name_1_0= ruleEString )
            {
            // InternalPDL.g:710:4: (lv_name_1_0= ruleEString )
            // InternalPDL.g:711:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourcesAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getResourcesAccess().getQuantiteKeyword_3());
            		
            // InternalPDL.g:736:3: ( (lv_quantite_4_0= ruleEInt ) )
            // InternalPDL.g:737:4: (lv_quantite_4_0= ruleEInt )
            {
            // InternalPDL.g:737:4: (lv_quantite_4_0= ruleEInt )
            // InternalPDL.g:738:5: lv_quantite_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getResourcesAccess().getQuantiteEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_quantite_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourcesRule());
            					}
            					set(
            						current,
            						"quantite",
            						lv_quantite_4_0,
            						"fr.n7.simplepdl.txt.PDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDL.g:755:3: (otherlv_5= 'linktoresource' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPDL.g:756:4: otherlv_5= 'linktoresource' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getResourcesAccess().getLinktoresourceKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getResourcesAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalPDL.g:764:4: ( ( ruleEString ) )
                    // InternalPDL.g:765:5: ( ruleEString )
                    {
                    // InternalPDL.g:765:5: ( ruleEString )
                    // InternalPDL.g:766:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourcesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getResourcesAccess().getLinktoresourceRequeteDeRessourceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL.g:780:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPDL.g:781:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getResourcesAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalPDL.g:785:5: ( ( ruleEString ) )
                    	    // InternalPDL.g:786:6: ( ruleEString )
                    	    {
                    	    // InternalPDL.g:786:6: ( ruleEString )
                    	    // InternalPDL.g:787:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getResourcesRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getResourcesAccess().getLinktoresourceRequeteDeRessourceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getResourcesAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getResourcesAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalPDL.g:815:1: entryRuleRequeteDeRessource returns [EObject current=null] : iv_ruleRequeteDeRessource= ruleRequeteDeRessource EOF ;
    public final EObject entryRuleRequeteDeRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequeteDeRessource = null;


        try {
            // InternalPDL.g:815:59: (iv_ruleRequeteDeRessource= ruleRequeteDeRessource EOF )
            // InternalPDL.g:816:2: iv_ruleRequeteDeRessource= ruleRequeteDeRessource EOF
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
    // InternalPDL.g:822:1: ruleRequeteDeRessource returns [EObject current=null] : (otherlv_0= 'RequeteDeRessource' otherlv_1= '{' otherlv_2= 'quantite' ( (lv_quantite_3_0= ruleEInt ) ) otherlv_4= 'resources' ( ( ruleEString ) ) otherlv_6= 'workdefinition' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRequeteDeRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_quantite_3_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:828:2: ( (otherlv_0= 'RequeteDeRessource' otherlv_1= '{' otherlv_2= 'quantite' ( (lv_quantite_3_0= ruleEInt ) ) otherlv_4= 'resources' ( ( ruleEString ) ) otherlv_6= 'workdefinition' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalPDL.g:829:2: (otherlv_0= 'RequeteDeRessource' otherlv_1= '{' otherlv_2= 'quantite' ( (lv_quantite_3_0= ruleEInt ) ) otherlv_4= 'resources' ( ( ruleEString ) ) otherlv_6= 'workdefinition' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalPDL.g:829:2: (otherlv_0= 'RequeteDeRessource' otherlv_1= '{' otherlv_2= 'quantite' ( (lv_quantite_3_0= ruleEInt ) ) otherlv_4= 'resources' ( ( ruleEString ) ) otherlv_6= 'workdefinition' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalPDL.g:830:3: otherlv_0= 'RequeteDeRessource' otherlv_1= '{' otherlv_2= 'quantite' ( (lv_quantite_3_0= ruleEInt ) ) otherlv_4= 'resources' ( ( ruleEString ) ) otherlv_6= 'workdefinition' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRequeteDeRessourceAccess().getRequeteDeRessourceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRequeteDeRessourceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getRequeteDeRessourceAccess().getQuantiteKeyword_2());
            		
            // InternalPDL.g:842:3: ( (lv_quantite_3_0= ruleEInt ) )
            // InternalPDL.g:843:4: (lv_quantite_3_0= ruleEInt )
            {
            // InternalPDL.g:843:4: (lv_quantite_3_0= ruleEInt )
            // InternalPDL.g:844:5: lv_quantite_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRequeteDeRessourceAccess().getQuantiteEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_quantite_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequeteDeRessourceRule());
            					}
            					set(
            						current,
            						"quantite",
            						lv_quantite_3_0,
            						"fr.n7.simplepdl.txt.PDL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRequeteDeRessourceAccess().getResourcesKeyword_4());
            		
            // InternalPDL.g:865:3: ( ( ruleEString ) )
            // InternalPDL.g:866:4: ( ruleEString )
            {
            // InternalPDL.g:866:4: ( ruleEString )
            // InternalPDL.g:867:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequeteDeRessourceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequeteDeRessourceAccess().getResourcesResourcesCrossReference_5_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionKeyword_6());
            		
            // InternalPDL.g:885:3: ( ( ruleEString ) )
            // InternalPDL.g:886:4: ( ruleEString )
            {
            // InternalPDL.g:886:4: ( ruleEString )
            // InternalPDL.g:887:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequeteDeRessourceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequeteDeRessourceAccess().getWorkdefinitionWorkDefinitionCrossReference_7_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRequeteDeRessourceAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleEInt"
    // InternalPDL.g:909:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPDL.g:909:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPDL.g:910:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalPDL.g:916:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPDL.g:922:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPDL.g:923:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPDL.g:923:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPDL.g:924:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPDL.g:924:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPDL.g:925:4: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_24); 

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
    // InternalPDL.g:942:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL.g:948:2: ( ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) ) )
            // InternalPDL.g:949:2: ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) )
            {
            // InternalPDL.g:949:2: ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case 36:
                {
                alt16=2;
                }
                break;
            case 37:
                {
                alt16=3;
                }
                break;
            case 38:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPDL.g:950:3: (enumLiteral_0= 'startToStart' )
                    {
                    // InternalPDL.g:950:3: (enumLiteral_0= 'startToStart' )
                    // InternalPDL.g:951:4: enumLiteral_0= 'startToStart'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:958:3: (enumLiteral_1= 'finishToStart' )
                    {
                    // InternalPDL.g:958:3: (enumLiteral_1= 'finishToStart' )
                    // InternalPDL.g:959:4: enumLiteral_1= 'finishToStart'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:966:3: (enumLiteral_2= 'startToFinish' )
                    {
                    // InternalPDL.g:966:3: (enumLiteral_2= 'startToFinish' )
                    // InternalPDL.g:967:4: enumLiteral_2= 'startToFinish'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:974:3: (enumLiteral_3= 'finishToFinish' )
                    {
                    // InternalPDL.g:974:3: (enumLiteral_3= 'finishToFinish' )
                    // InternalPDL.g:975:4: enumLiteral_3= 'finishToFinish'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000A4410000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000328000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});

}