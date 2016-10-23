package org.xtext.branselic.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.branselic.services.ConfiguratorLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfiguratorLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Features'", "'Rules'", "':'", "'='", "'<'", "'>'", "'bool'", "'int'", "'['", "','", "']'", "'->'", "'('", "')'", "'not'", "'and'", "'true'", "'false'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalConfiguratorLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfiguratorLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfiguratorLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalConfiguratorLang.g"; }



     	private ConfiguratorLangGrammarAccess grammarAccess;

        public InternalConfiguratorLangParser(TokenStream input, ConfiguratorLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ConfiguratorModel";
       	}

       	@Override
       	protected ConfiguratorLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConfiguratorModel"
    // InternalConfiguratorLang.g:64:1: entryRuleConfiguratorModel returns [EObject current=null] : iv_ruleConfiguratorModel= ruleConfiguratorModel EOF ;
    public final EObject entryRuleConfiguratorModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguratorModel = null;


        try {
            // InternalConfiguratorLang.g:64:58: (iv_ruleConfiguratorModel= ruleConfiguratorModel EOF )
            // InternalConfiguratorLang.g:65:2: iv_ruleConfiguratorModel= ruleConfiguratorModel EOF
            {
             newCompositeNode(grammarAccess.getConfiguratorModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguratorModel=ruleConfiguratorModel();

            state._fsp--;

             current =iv_ruleConfiguratorModel; 
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
    // $ANTLR end "entryRuleConfiguratorModel"


    // $ANTLR start "ruleConfiguratorModel"
    // InternalConfiguratorLang.g:71:1: ruleConfiguratorModel returns [EObject current=null] : (otherlv_0= 'Features' ( (lv_feature_1_0= ruleFeature ) ) ( (lv_feature_2_0= ruleFeature ) )* otherlv_3= 'Rules' ( (lv_ruleset_4_0= ruleRuleSet ) ) ) ;
    public final EObject ruleConfiguratorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_feature_1_0 = null;

        EObject lv_feature_2_0 = null;

        EObject lv_ruleset_4_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:77:2: ( (otherlv_0= 'Features' ( (lv_feature_1_0= ruleFeature ) ) ( (lv_feature_2_0= ruleFeature ) )* otherlv_3= 'Rules' ( (lv_ruleset_4_0= ruleRuleSet ) ) ) )
            // InternalConfiguratorLang.g:78:2: (otherlv_0= 'Features' ( (lv_feature_1_0= ruleFeature ) ) ( (lv_feature_2_0= ruleFeature ) )* otherlv_3= 'Rules' ( (lv_ruleset_4_0= ruleRuleSet ) ) )
            {
            // InternalConfiguratorLang.g:78:2: (otherlv_0= 'Features' ( (lv_feature_1_0= ruleFeature ) ) ( (lv_feature_2_0= ruleFeature ) )* otherlv_3= 'Rules' ( (lv_ruleset_4_0= ruleRuleSet ) ) )
            // InternalConfiguratorLang.g:79:3: otherlv_0= 'Features' ( (lv_feature_1_0= ruleFeature ) ) ( (lv_feature_2_0= ruleFeature ) )* otherlv_3= 'Rules' ( (lv_ruleset_4_0= ruleRuleSet ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfiguratorModelAccess().getFeaturesKeyword_0());
            		
            // InternalConfiguratorLang.g:83:3: ( (lv_feature_1_0= ruleFeature ) )
            // InternalConfiguratorLang.g:84:4: (lv_feature_1_0= ruleFeature )
            {
            // InternalConfiguratorLang.g:84:4: (lv_feature_1_0= ruleFeature )
            // InternalConfiguratorLang.g:85:5: lv_feature_1_0= ruleFeature
            {

            					newCompositeNode(grammarAccess.getConfiguratorModelAccess().getFeatureFeatureParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_feature_1_0=ruleFeature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
            					}
            					add(
            						current,
            						"feature",
            						lv_feature_1_0,
            						"org.xtext.branselic.ConfiguratorLang.Feature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalConfiguratorLang.g:102:3: ( (lv_feature_2_0= ruleFeature ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalConfiguratorLang.g:103:4: (lv_feature_2_0= ruleFeature )
            	    {
            	    // InternalConfiguratorLang.g:103:4: (lv_feature_2_0= ruleFeature )
            	    // InternalConfiguratorLang.g:104:5: lv_feature_2_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getConfiguratorModelAccess().getFeatureFeatureParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_feature_2_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_2_0,
            	    						"org.xtext.branselic.ConfiguratorLang.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getConfiguratorModelAccess().getRulesKeyword_3());
            		
            // InternalConfiguratorLang.g:125:3: ( (lv_ruleset_4_0= ruleRuleSet ) )
            // InternalConfiguratorLang.g:126:4: (lv_ruleset_4_0= ruleRuleSet )
            {
            // InternalConfiguratorLang.g:126:4: (lv_ruleset_4_0= ruleRuleSet )
            // InternalConfiguratorLang.g:127:5: lv_ruleset_4_0= ruleRuleSet
            {

            					newCompositeNode(grammarAccess.getConfiguratorModelAccess().getRulesetRuleSetParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_ruleset_4_0=ruleRuleSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
            					}
            					set(
            						current,
            						"ruleset",
            						lv_ruleset_4_0,
            						"org.xtext.branselic.ConfiguratorLang.RuleSet");
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
    // $ANTLR end "ruleConfiguratorModel"


    // $ANTLR start "entryRuleFeature"
    // InternalConfiguratorLang.g:148:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalConfiguratorLang.g:148:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalConfiguratorLang.g:149:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalConfiguratorLang.g:155:1: ruleFeature returns [EObject current=null] : ( ( (lv_Name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_Name_0_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:161:2: ( ( ( (lv_Name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalConfiguratorLang.g:162:2: ( ( (lv_Name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalConfiguratorLang.g:162:2: ( ( (lv_Name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalConfiguratorLang.g:163:3: ( (lv_Name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalConfiguratorLang.g:163:3: ( (lv_Name_0_0= ruleEString ) )
            // InternalConfiguratorLang.g:164:4: (lv_Name_0_0= ruleEString )
            {
            // InternalConfiguratorLang.g:164:4: (lv_Name_0_0= ruleEString )
            // InternalConfiguratorLang.g:165:5: lv_Name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_Name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_0_0,
            						"org.xtext.branselic.ConfiguratorLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
            		
            // InternalConfiguratorLang.g:186:3: ( (otherlv_2= RULE_ID ) )
            // InternalConfiguratorLang.g:187:4: (otherlv_2= RULE_ID )
            {
            // InternalConfiguratorLang.g:187:4: (otherlv_2= RULE_ID )
            // InternalConfiguratorLang.g:188:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getTypeTypeCrossReference_2_0());
            				

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleOpSymbol"
    // InternalConfiguratorLang.g:203:1: entryRuleOpSymbol returns [String current=null] : iv_ruleOpSymbol= ruleOpSymbol EOF ;
    public final String entryRuleOpSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSymbol = null;


        try {
            // InternalConfiguratorLang.g:203:48: (iv_ruleOpSymbol= ruleOpSymbol EOF )
            // InternalConfiguratorLang.g:204:2: iv_ruleOpSymbol= ruleOpSymbol EOF
            {
             newCompositeNode(grammarAccess.getOpSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpSymbol=ruleOpSymbol();

            state._fsp--;

             current =iv_ruleOpSymbol.getText(); 
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
    // $ANTLR end "entryRuleOpSymbol"


    // $ANTLR start "ruleOpSymbol"
    // InternalConfiguratorLang.g:210:1: ruleOpSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleOpSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:216:2: ( (kw= '=' | kw= '<' | kw= '>' ) )
            // InternalConfiguratorLang.g:217:2: (kw= '=' | kw= '<' | kw= '>' )
            {
            // InternalConfiguratorLang.g:217:2: (kw= '=' | kw= '<' | kw= '>' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalConfiguratorLang.g:218:3: kw= '='
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpSymbolAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConfiguratorLang.g:224:3: kw= '<'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpSymbolAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalConfiguratorLang.g:230:3: kw= '>'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpSymbolAccess().getGreaterThanSignKeyword_2());
                    		

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
    // $ANTLR end "ruleOpSymbol"


    // $ANTLR start "entryRuleBoolType"
    // InternalConfiguratorLang.g:239:1: entryRuleBoolType returns [EObject current=null] : iv_ruleBoolType= ruleBoolType EOF ;
    public final EObject entryRuleBoolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolType = null;


        try {
            // InternalConfiguratorLang.g:239:49: (iv_ruleBoolType= ruleBoolType EOF )
            // InternalConfiguratorLang.g:240:2: iv_ruleBoolType= ruleBoolType EOF
            {
             newCompositeNode(grammarAccess.getBoolTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolType=ruleBoolType();

            state._fsp--;

             current =iv_ruleBoolType; 
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
    // $ANTLR end "entryRuleBoolType"


    // $ANTLR start "ruleBoolType"
    // InternalConfiguratorLang.g:246:1: ruleBoolType returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleBoolType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:252:2: ( ( () otherlv_1= 'bool' ) )
            // InternalConfiguratorLang.g:253:2: ( () otherlv_1= 'bool' )
            {
            // InternalConfiguratorLang.g:253:2: ( () otherlv_1= 'bool' )
            // InternalConfiguratorLang.g:254:3: () otherlv_1= 'bool'
            {
            // InternalConfiguratorLang.g:254:3: ()
            // InternalConfiguratorLang.g:255:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolTypeAccess().getBoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolTypeAccess().getBoolKeyword_1());
            		

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
    // $ANTLR end "ruleBoolType"


    // $ANTLR start "entryRuleIntType"
    // InternalConfiguratorLang.g:269:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // InternalConfiguratorLang.g:269:48: (iv_ruleIntType= ruleIntType EOF )
            // InternalConfiguratorLang.g:270:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType; 
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
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // InternalConfiguratorLang.g:276:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:282:2: ( ( () otherlv_1= 'int' ) )
            // InternalConfiguratorLang.g:283:2: ( () otherlv_1= 'int' )
            {
            // InternalConfiguratorLang.g:283:2: ( () otherlv_1= 'int' )
            // InternalConfiguratorLang.g:284:3: () otherlv_1= 'int'
            {
            // InternalConfiguratorLang.g:284:3: ()
            // InternalConfiguratorLang.g:285:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntTypeAccess().getIntAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntTypeAccess().getIntKeyword_1());
            		

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
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleEnumType"
    // InternalConfiguratorLang.g:299:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // InternalConfiguratorLang.g:299:49: (iv_ruleEnumType= ruleEnumType EOF )
            // InternalConfiguratorLang.g:300:2: iv_ruleEnumType= ruleEnumType EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;

             current =iv_ruleEnumType; 
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
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // InternalConfiguratorLang.g:306:1: ruleEnumType returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:312:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']' ) )
            // InternalConfiguratorLang.g:313:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']' )
            {
            // InternalConfiguratorLang.g:313:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']' )
            // InternalConfiguratorLang.g:314:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']'
            {
            // InternalConfiguratorLang.g:314:3: ()
            // InternalConfiguratorLang.g:315:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumTypeAccess().getEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalConfiguratorLang.g:325:3: ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalConfiguratorLang.g:326:4: ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
                    {
                    // InternalConfiguratorLang.g:326:4: ( (lv_values_2_0= ruleEString ) )
                    // InternalConfiguratorLang.g:327:5: (lv_values_2_0= ruleEString )
                    {
                    // InternalConfiguratorLang.g:327:5: (lv_values_2_0= ruleEString )
                    // InternalConfiguratorLang.g:328:6: lv_values_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnumTypeAccess().getValuesEStringParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_values_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumTypeRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"org.xtext.branselic.ConfiguratorLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalConfiguratorLang.g:345:4: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==20) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalConfiguratorLang.g:346:5: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEnumTypeAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalConfiguratorLang.g:350:5: ( (lv_values_4_0= ruleEString ) )
                    	    // InternalConfiguratorLang.g:351:6: (lv_values_4_0= ruleEString )
                    	    {
                    	    // InternalConfiguratorLang.g:351:6: (lv_values_4_0= ruleEString )
                    	    // InternalConfiguratorLang.g:352:7: lv_values_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumTypeAccess().getValuesEStringParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_values_4_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnumTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"org.xtext.branselic.ConfiguratorLang.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleRuleSet"
    // InternalConfiguratorLang.g:379:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalConfiguratorLang.g:379:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalConfiguratorLang.g:380:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
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
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // InternalConfiguratorLang.g:386:1: ruleRuleSet returns [EObject current=null] : ( () ( (lv_rule_1_0= ruleRule ) )* ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject lv_rule_1_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:392:2: ( ( () ( (lv_rule_1_0= ruleRule ) )* ) )
            // InternalConfiguratorLang.g:393:2: ( () ( (lv_rule_1_0= ruleRule ) )* )
            {
            // InternalConfiguratorLang.g:393:2: ( () ( (lv_rule_1_0= ruleRule ) )* )
            // InternalConfiguratorLang.g:394:3: () ( (lv_rule_1_0= ruleRule ) )*
            {
            // InternalConfiguratorLang.g:394:3: ()
            // InternalConfiguratorLang.g:395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleSetAccess().getRuleSetAction_0(),
            					current);
            			

            }

            // InternalConfiguratorLang.g:401:3: ( (lv_rule_1_0= ruleRule ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==23||LA5_0==25||(LA5_0>=27 && LA5_0<=28)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalConfiguratorLang.g:402:4: (lv_rule_1_0= ruleRule )
            	    {
            	    // InternalConfiguratorLang.g:402:4: (lv_rule_1_0= ruleRule )
            	    // InternalConfiguratorLang.g:403:5: lv_rule_1_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getRuleSetAccess().getRuleRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_rule_1_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rule",
            	    						lv_rule_1_0,
            	    						"org.xtext.branselic.ConfiguratorLang.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleRule"
    // InternalConfiguratorLang.g:424:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalConfiguratorLang.g:424:45: (iv_ruleRule= ruleRule EOF )
            // InternalConfiguratorLang.g:425:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalConfiguratorLang.g:431:1: ruleRule returns [EObject current=null] : ( ( (lv_if_0_0= ruleBooleanExpression ) ) otherlv_1= '->' ( (lv_then_2_0= ruleBooleanExpression ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_if_0_0 = null;

        EObject lv_then_2_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:437:2: ( ( ( (lv_if_0_0= ruleBooleanExpression ) ) otherlv_1= '->' ( (lv_then_2_0= ruleBooleanExpression ) ) ) )
            // InternalConfiguratorLang.g:438:2: ( ( (lv_if_0_0= ruleBooleanExpression ) ) otherlv_1= '->' ( (lv_then_2_0= ruleBooleanExpression ) ) )
            {
            // InternalConfiguratorLang.g:438:2: ( ( (lv_if_0_0= ruleBooleanExpression ) ) otherlv_1= '->' ( (lv_then_2_0= ruleBooleanExpression ) ) )
            // InternalConfiguratorLang.g:439:3: ( (lv_if_0_0= ruleBooleanExpression ) ) otherlv_1= '->' ( (lv_then_2_0= ruleBooleanExpression ) )
            {
            // InternalConfiguratorLang.g:439:3: ( (lv_if_0_0= ruleBooleanExpression ) )
            // InternalConfiguratorLang.g:440:4: (lv_if_0_0= ruleBooleanExpression )
            {
            // InternalConfiguratorLang.g:440:4: (lv_if_0_0= ruleBooleanExpression )
            // InternalConfiguratorLang.g:441:5: lv_if_0_0= ruleBooleanExpression
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getIfBooleanExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_if_0_0=ruleBooleanExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"if",
            						lv_if_0_0,
            						"org.xtext.branselic.ConfiguratorLang.BooleanExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalConfiguratorLang.g:462:3: ( (lv_then_2_0= ruleBooleanExpression ) )
            // InternalConfiguratorLang.g:463:4: (lv_then_2_0= ruleBooleanExpression )
            {
            // InternalConfiguratorLang.g:463:4: (lv_then_2_0= ruleBooleanExpression )
            // InternalConfiguratorLang.g:464:5: lv_then_2_0= ruleBooleanExpression
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getThenBooleanExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_then_2_0=ruleBooleanExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"then",
            						lv_then_2_0,
            						"org.xtext.branselic.ConfiguratorLang.BooleanExpression");
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalConfiguratorLang.g:485:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalConfiguratorLang.g:485:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalConfiguratorLang.g:486:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalConfiguratorLang.g:492:1: ruleBooleanExpression returns [EObject current=null] : (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_And_2= ruleAnd | this_Negation_3= ruleNegation ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_Atom_1 = null;

        EObject this_And_2 = null;

        EObject this_Negation_3 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:498:2: ( (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_And_2= ruleAnd | this_Negation_3= ruleNegation ) )
            // InternalConfiguratorLang.g:499:2: (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_And_2= ruleAnd | this_Negation_3= ruleNegation )
            {
            // InternalConfiguratorLang.g:499:2: (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_And_2= ruleAnd | this_Negation_3= ruleNegation )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==26) ) {
                    alt6=3;
                }
                else if ( (LA6_1==EOF||LA6_1==RULE_ID||(LA6_1>=22 && LA6_1<=25)||(LA6_1>=27 && LA6_1<=28)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==26) ) {
                    alt6=3;
                }
                else if ( (LA6_2==EOF||LA6_2==RULE_ID||(LA6_2>=22 && LA6_2<=25)||(LA6_2>=27 && LA6_2<=28)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==EOF||LA6_3==RULE_ID||(LA6_3>=22 && LA6_3<=25)||(LA6_3>=27 && LA6_3<=28)) ) {
                    alt6=2;
                }
                else if ( (LA6_3==26) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 25:
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
                    // InternalConfiguratorLang.g:500:3: this_Const_0= ruleConst
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getConstParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Const_0=ruleConst();

                    state._fsp--;


                    			current = this_Const_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalConfiguratorLang.g:509:3: this_Atom_1= ruleAtom
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getAtomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atom_1=ruleAtom();

                    state._fsp--;


                    			current = this_Atom_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalConfiguratorLang.g:518:3: this_And_2= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getAndParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_2=ruleAnd();

                    state._fsp--;


                    			current = this_And_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalConfiguratorLang.g:527:3: this_Negation_3= ruleNegation
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getNegationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Negation_3=ruleNegation();

                    state._fsp--;


                    			current = this_Negation_3;
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleConst"
    // InternalConfiguratorLang.g:539:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalConfiguratorLang.g:539:46: (iv_ruleConst= ruleConst EOF )
            // InternalConfiguratorLang.g:540:2: iv_ruleConst= ruleConst EOF
            {
             newCompositeNode(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConst=ruleConst();

            state._fsp--;

             current =iv_ruleConst; 
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
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalConfiguratorLang.g:546:1: ruleConst returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:552:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalConfiguratorLang.g:553:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalConfiguratorLang.g:553:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalConfiguratorLang.g:554:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalConfiguratorLang.g:554:3: (lv_value_0_0= ruleEBoolean )
            // InternalConfiguratorLang.g:555:4: lv_value_0_0= ruleEBoolean
            {

            				newCompositeNode(grammarAccess.getConstAccess().getValueEBooleanParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConstRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.branselic.ConfiguratorLang.EBoolean");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleAtom"
    // InternalConfiguratorLang.g:575:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalConfiguratorLang.g:575:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalConfiguratorLang.g:576:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalConfiguratorLang.g:582:1: ruleAtom returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:588:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalConfiguratorLang.g:589:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalConfiguratorLang.g:589:2: ( (otherlv_0= RULE_ID ) )
            // InternalConfiguratorLang.g:590:3: (otherlv_0= RULE_ID )
            {
            // InternalConfiguratorLang.g:590:3: (otherlv_0= RULE_ID )
            // InternalConfiguratorLang.g:591:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAtomRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getAtomAccess().getOperatorOperatorCrossReference_0());
            			

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleSimpleBoolean"
    // InternalConfiguratorLang.g:605:1: entryRuleSimpleBoolean returns [EObject current=null] : iv_ruleSimpleBoolean= ruleSimpleBoolean EOF ;
    public final EObject entryRuleSimpleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBoolean = null;


        try {
            // InternalConfiguratorLang.g:605:54: (iv_ruleSimpleBoolean= ruleSimpleBoolean EOF )
            // InternalConfiguratorLang.g:606:2: iv_ruleSimpleBoolean= ruleSimpleBoolean EOF
            {
             newCompositeNode(grammarAccess.getSimpleBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleBoolean=ruleSimpleBoolean();

            state._fsp--;

             current =iv_ruleSimpleBoolean; 
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
    // $ANTLR end "entryRuleSimpleBoolean"


    // $ANTLR start "ruleSimpleBoolean"
    // InternalConfiguratorLang.g:612:1: ruleSimpleBoolean returns [EObject current=null] : (this_Const_0= ruleConst | this_Atom_1= ruleAtom | (otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')' ) ) ;
    public final EObject ruleSimpleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Const_0 = null;

        EObject this_Atom_1 = null;

        EObject this_BooleanExpression_3 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:618:2: ( (this_Const_0= ruleConst | this_Atom_1= ruleAtom | (otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')' ) ) )
            // InternalConfiguratorLang.g:619:2: (this_Const_0= ruleConst | this_Atom_1= ruleAtom | (otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')' ) )
            {
            // InternalConfiguratorLang.g:619:2: (this_Const_0= ruleConst | this_Atom_1= ruleAtom | (otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalConfiguratorLang.g:620:3: this_Const_0= ruleConst
                    {

                    			newCompositeNode(grammarAccess.getSimpleBooleanAccess().getConstParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Const_0=ruleConst();

                    state._fsp--;


                    			current = this_Const_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalConfiguratorLang.g:629:3: this_Atom_1= ruleAtom
                    {

                    			newCompositeNode(grammarAccess.getSimpleBooleanAccess().getAtomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atom_1=ruleAtom();

                    state._fsp--;


                    			current = this_Atom_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalConfiguratorLang.g:638:3: (otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')' )
                    {
                    // InternalConfiguratorLang.g:638:3: (otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')' )
                    // InternalConfiguratorLang.g:639:4: otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getSimpleBooleanAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getSimpleBooleanAccess().getBooleanExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_BooleanExpression_3=ruleBooleanExpression();

                    state._fsp--;


                    				current = this_BooleanExpression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleBooleanAccess().getRightParenthesisKeyword_2_2());
                    			

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
    // $ANTLR end "ruleSimpleBoolean"


    // $ANTLR start "entryRuleNegation"
    // InternalConfiguratorLang.g:660:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalConfiguratorLang.g:660:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalConfiguratorLang.g:661:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalConfiguratorLang.g:667:1: ruleNegation returns [EObject current=null] : (otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_booleanexpression_1_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:673:2: ( (otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) ) ) )
            // InternalConfiguratorLang.g:674:2: (otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) ) )
            {
            // InternalConfiguratorLang.g:674:2: (otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) ) )
            // InternalConfiguratorLang.g:675:3: otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getNotKeyword_0());
            		
            // InternalConfiguratorLang.g:679:3: ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) )
            // InternalConfiguratorLang.g:680:4: (lv_booleanexpression_1_0= ruleSimpleBoolean )
            {
            // InternalConfiguratorLang.g:680:4: (lv_booleanexpression_1_0= ruleSimpleBoolean )
            // InternalConfiguratorLang.g:681:5: lv_booleanexpression_1_0= ruleSimpleBoolean
            {

            					newCompositeNode(grammarAccess.getNegationAccess().getBooleanexpressionSimpleBooleanParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_booleanexpression_1_0=ruleSimpleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegationRule());
            					}
            					set(
            						current,
            						"booleanexpression",
            						lv_booleanexpression_1_0,
            						"org.xtext.branselic.ConfiguratorLang.SimpleBoolean");
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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleAnd"
    // InternalConfiguratorLang.g:702:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalConfiguratorLang.g:702:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalConfiguratorLang.g:703:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalConfiguratorLang.g:709:1: ruleAnd returns [EObject current=null] : ( ( (lv_booleanexpression_0_0= ruleSimpleBoolean ) ) otherlv_1= 'and' ( (lv_booleanexpression_2_0= ruleSimpleBoolean ) ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_booleanexpression_0_0 = null;

        EObject lv_booleanexpression_2_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:715:2: ( ( ( (lv_booleanexpression_0_0= ruleSimpleBoolean ) ) otherlv_1= 'and' ( (lv_booleanexpression_2_0= ruleSimpleBoolean ) ) ) )
            // InternalConfiguratorLang.g:716:2: ( ( (lv_booleanexpression_0_0= ruleSimpleBoolean ) ) otherlv_1= 'and' ( (lv_booleanexpression_2_0= ruleSimpleBoolean ) ) )
            {
            // InternalConfiguratorLang.g:716:2: ( ( (lv_booleanexpression_0_0= ruleSimpleBoolean ) ) otherlv_1= 'and' ( (lv_booleanexpression_2_0= ruleSimpleBoolean ) ) )
            // InternalConfiguratorLang.g:717:3: ( (lv_booleanexpression_0_0= ruleSimpleBoolean ) ) otherlv_1= 'and' ( (lv_booleanexpression_2_0= ruleSimpleBoolean ) )
            {
            // InternalConfiguratorLang.g:717:3: ( (lv_booleanexpression_0_0= ruleSimpleBoolean ) )
            // InternalConfiguratorLang.g:718:4: (lv_booleanexpression_0_0= ruleSimpleBoolean )
            {
            // InternalConfiguratorLang.g:718:4: (lv_booleanexpression_0_0= ruleSimpleBoolean )
            // InternalConfiguratorLang.g:719:5: lv_booleanexpression_0_0= ruleSimpleBoolean
            {

            					newCompositeNode(grammarAccess.getAndAccess().getBooleanexpressionSimpleBooleanParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_booleanexpression_0_0=ruleSimpleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					add(
            						current,
            						"booleanexpression",
            						lv_booleanexpression_0_0,
            						"org.xtext.branselic.ConfiguratorLang.SimpleBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1());
            		
            // InternalConfiguratorLang.g:740:3: ( (lv_booleanexpression_2_0= ruleSimpleBoolean ) )
            // InternalConfiguratorLang.g:741:4: (lv_booleanexpression_2_0= ruleSimpleBoolean )
            {
            // InternalConfiguratorLang.g:741:4: (lv_booleanexpression_2_0= ruleSimpleBoolean )
            // InternalConfiguratorLang.g:742:5: lv_booleanexpression_2_0= ruleSimpleBoolean
            {

            					newCompositeNode(grammarAccess.getAndAccess().getBooleanexpressionSimpleBooleanParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_booleanexpression_2_0=ruleSimpleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					add(
            						current,
            						"booleanexpression",
            						lv_booleanexpression_2_0,
            						"org.xtext.branselic.ConfiguratorLang.SimpleBoolean");
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEString"
    // InternalConfiguratorLang.g:763:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalConfiguratorLang.g:763:47: (iv_ruleEString= ruleEString EOF )
            // InternalConfiguratorLang.g:764:2: iv_ruleEString= ruleEString EOF
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
    // InternalConfiguratorLang.g:770:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:776:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalConfiguratorLang.g:777:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalConfiguratorLang.g:777:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalConfiguratorLang.g:778:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConfiguratorLang.g:786:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalConfiguratorLang.g:797:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalConfiguratorLang.g:797:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalConfiguratorLang.g:798:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalConfiguratorLang.g:804:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:810:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalConfiguratorLang.g:811:2: (kw= 'true' | kw= 'false' )
            {
            // InternalConfiguratorLang.g:811:2: (kw= 'true' | kw= 'false' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalConfiguratorLang.g:812:3: kw= 'true'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConfiguratorLang.g:818:3: kw= 'false'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000001A800010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000001A800012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000018800010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});

}