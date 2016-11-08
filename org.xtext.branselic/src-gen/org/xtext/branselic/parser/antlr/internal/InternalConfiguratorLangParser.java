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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Name'", "':'", "'Features'", "'Rules'", "'='", "'<'", "'>'", "'bool'", "'int'", "'['", "','", "']'", "'->'", "'('", "')'", "'not'", "'and'", "'true'", "'false'"
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
    // InternalConfiguratorLang.g:71:1: ruleConfiguratorModel returns [EObject current=null] : (otherlv_0= 'Name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Features' ( (lv_feature_4_0= ruleFeature ) ) ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'Rules' ( (lv_ruleset_7_0= ruleRuleSet ) ) ) ;
    public final EObject ruleConfiguratorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_feature_4_0 = null;

        EObject lv_feature_5_0 = null;

        EObject lv_ruleset_7_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:77:2: ( (otherlv_0= 'Name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Features' ( (lv_feature_4_0= ruleFeature ) ) ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'Rules' ( (lv_ruleset_7_0= ruleRuleSet ) ) ) )
            // InternalConfiguratorLang.g:78:2: (otherlv_0= 'Name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Features' ( (lv_feature_4_0= ruleFeature ) ) ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'Rules' ( (lv_ruleset_7_0= ruleRuleSet ) ) )
            {
            // InternalConfiguratorLang.g:78:2: (otherlv_0= 'Name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Features' ( (lv_feature_4_0= ruleFeature ) ) ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'Rules' ( (lv_ruleset_7_0= ruleRuleSet ) ) )
            // InternalConfiguratorLang.g:79:3: otherlv_0= 'Name' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Features' ( (lv_feature_4_0= ruleFeature ) ) ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'Rules' ( (lv_ruleset_7_0= ruleRuleSet ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfiguratorModelAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConfiguratorModelAccess().getColonKeyword_1());
            		
            // InternalConfiguratorLang.g:87:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalConfiguratorLang.g:88:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalConfiguratorLang.g:88:4: (lv_name_2_0= RULE_STRING )
            // InternalConfiguratorLang.g:89:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConfiguratorModelAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfiguratorModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getConfiguratorModelAccess().getFeaturesKeyword_3());
            		
            // InternalConfiguratorLang.g:109:3: ( (lv_feature_4_0= ruleFeature ) )
            // InternalConfiguratorLang.g:110:4: (lv_feature_4_0= ruleFeature )
            {
            // InternalConfiguratorLang.g:110:4: (lv_feature_4_0= ruleFeature )
            // InternalConfiguratorLang.g:111:5: lv_feature_4_0= ruleFeature
            {

            					newCompositeNode(grammarAccess.getConfiguratorModelAccess().getFeatureFeatureParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_feature_4_0=ruleFeature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
            					}
            					add(
            						current,
            						"feature",
            						lv_feature_4_0,
            						"org.xtext.branselic.ConfiguratorLang.Feature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalConfiguratorLang.g:128:3: ( (lv_feature_5_0= ruleFeature ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalConfiguratorLang.g:129:4: (lv_feature_5_0= ruleFeature )
            	    {
            	    // InternalConfiguratorLang.g:129:4: (lv_feature_5_0= ruleFeature )
            	    // InternalConfiguratorLang.g:130:5: lv_feature_5_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getConfiguratorModelAccess().getFeatureFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_feature_5_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_5_0,
            	    						"org.xtext.branselic.ConfiguratorLang.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getConfiguratorModelAccess().getRulesKeyword_6());
            		
            // InternalConfiguratorLang.g:151:3: ( (lv_ruleset_7_0= ruleRuleSet ) )
            // InternalConfiguratorLang.g:152:4: (lv_ruleset_7_0= ruleRuleSet )
            {
            // InternalConfiguratorLang.g:152:4: (lv_ruleset_7_0= ruleRuleSet )
            // InternalConfiguratorLang.g:153:5: lv_ruleset_7_0= ruleRuleSet
            {

            					newCompositeNode(grammarAccess.getConfiguratorModelAccess().getRulesetRuleSetParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_ruleset_7_0=ruleRuleSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfiguratorModelRule());
            					}
            					set(
            						current,
            						"ruleset",
            						lv_ruleset_7_0,
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
    // InternalConfiguratorLang.g:174:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalConfiguratorLang.g:174:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalConfiguratorLang.g:175:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalConfiguratorLang.g:181:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_text_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_text_3_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:187:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_text_3_0= RULE_STRING ) )? ) )
            // InternalConfiguratorLang.g:188:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_text_3_0= RULE_STRING ) )? )
            {
            // InternalConfiguratorLang.g:188:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_text_3_0= RULE_STRING ) )? )
            // InternalConfiguratorLang.g:189:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_text_3_0= RULE_STRING ) )?
            {
            // InternalConfiguratorLang.g:189:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalConfiguratorLang.g:190:4: (lv_name_0_0= RULE_ID )
            {
            // InternalConfiguratorLang.g:190:4: (lv_name_0_0= RULE_ID )
            // InternalConfiguratorLang.g:191:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
            		
            // InternalConfiguratorLang.g:211:3: ( (lv_type_2_0= ruleType ) )
            // InternalConfiguratorLang.g:212:4: (lv_type_2_0= ruleType )
            {
            // InternalConfiguratorLang.g:212:4: (lv_type_2_0= ruleType )
            // InternalConfiguratorLang.g:213:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.branselic.ConfiguratorLang.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalConfiguratorLang.g:230:3: ( (lv_text_3_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalConfiguratorLang.g:231:4: (lv_text_3_0= RULE_STRING )
                    {
                    // InternalConfiguratorLang.g:231:4: (lv_text_3_0= RULE_STRING )
                    // InternalConfiguratorLang.g:232:5: lv_text_3_0= RULE_STRING
                    {
                    lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_text_3_0, grammarAccess.getFeatureAccess().getTextSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"text",
                    						lv_text_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleOperator"
    // InternalConfiguratorLang.g:252:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalConfiguratorLang.g:252:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalConfiguratorLang.g:253:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalConfiguratorLang.g:259:1: ruleOperator returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOpSymbol ) ) ( (lv_value_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:265:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOpSymbol ) ) ( (lv_value_2_0= RULE_ID ) ) ) )
            // InternalConfiguratorLang.g:266:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOpSymbol ) ) ( (lv_value_2_0= RULE_ID ) ) )
            {
            // InternalConfiguratorLang.g:266:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOpSymbol ) ) ( (lv_value_2_0= RULE_ID ) ) )
            // InternalConfiguratorLang.g:267:3: ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOpSymbol ) ) ( (lv_value_2_0= RULE_ID ) )
            {
            // InternalConfiguratorLang.g:267:3: ( (otherlv_0= RULE_ID ) )
            // InternalConfiguratorLang.g:268:4: (otherlv_0= RULE_ID )
            {
            // InternalConfiguratorLang.g:268:4: (otherlv_0= RULE_ID )
            // InternalConfiguratorLang.g:269:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperatorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getOperatorAccess().getFeatureFeatureCrossReference_0_0());
            				

            }


            }

            // InternalConfiguratorLang.g:280:3: ( (lv_op_1_0= ruleOpSymbol ) )
            // InternalConfiguratorLang.g:281:4: (lv_op_1_0= ruleOpSymbol )
            {
            // InternalConfiguratorLang.g:281:4: (lv_op_1_0= ruleOpSymbol )
            // InternalConfiguratorLang.g:282:5: lv_op_1_0= ruleOpSymbol
            {

            					newCompositeNode(grammarAccess.getOperatorAccess().getOpOpSymbolParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_op_1_0=ruleOpSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperatorRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.xtext.branselic.ConfiguratorLang.OpSymbol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalConfiguratorLang.g:299:3: ( (lv_value_2_0= RULE_ID ) )
            // InternalConfiguratorLang.g:300:4: (lv_value_2_0= RULE_ID )
            {
            // InternalConfiguratorLang.g:300:4: (lv_value_2_0= RULE_ID )
            // InternalConfiguratorLang.g:301:5: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getOperatorAccess().getValueIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleOpSymbol"
    // InternalConfiguratorLang.g:321:1: entryRuleOpSymbol returns [String current=null] : iv_ruleOpSymbol= ruleOpSymbol EOF ;
    public final String entryRuleOpSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSymbol = null;


        try {
            // InternalConfiguratorLang.g:321:48: (iv_ruleOpSymbol= ruleOpSymbol EOF )
            // InternalConfiguratorLang.g:322:2: iv_ruleOpSymbol= ruleOpSymbol EOF
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
    // InternalConfiguratorLang.g:328:1: ruleOpSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleOpSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:334:2: ( (kw= '=' | kw= '<' | kw= '>' ) )
            // InternalConfiguratorLang.g:335:2: (kw= '=' | kw= '<' | kw= '>' )
            {
            // InternalConfiguratorLang.g:335:2: (kw= '=' | kw= '<' | kw= '>' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalConfiguratorLang.g:336:3: kw= '='
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpSymbolAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConfiguratorLang.g:342:3: kw= '<'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpSymbolAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalConfiguratorLang.g:348:3: kw= '>'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleType"
    // InternalConfiguratorLang.g:357:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalConfiguratorLang.g:357:45: (iv_ruleType= ruleType EOF )
            // InternalConfiguratorLang.g:358:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalConfiguratorLang.g:364:1: ruleType returns [EObject current=null] : (this_BoolType_0= ruleBoolType | this_IntType_1= ruleIntType | this_EnumType_2= ruleEnumType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_BoolType_0 = null;

        EObject this_IntType_1 = null;

        EObject this_EnumType_2 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:370:2: ( (this_BoolType_0= ruleBoolType | this_IntType_1= ruleIntType | this_EnumType_2= ruleEnumType ) )
            // InternalConfiguratorLang.g:371:2: (this_BoolType_0= ruleBoolType | this_IntType_1= ruleIntType | this_EnumType_2= ruleEnumType )
            {
            // InternalConfiguratorLang.g:371:2: (this_BoolType_0= ruleBoolType | this_IntType_1= ruleIntType | this_EnumType_2= ruleEnumType )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalConfiguratorLang.g:372:3: this_BoolType_0= ruleBoolType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBoolTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolType_0=ruleBoolType();

                    state._fsp--;


                    			current = this_BoolType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalConfiguratorLang.g:381:3: this_IntType_1= ruleIntType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntType_1=ruleIntType();

                    state._fsp--;


                    			current = this_IntType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalConfiguratorLang.g:390:3: this_EnumType_2= ruleEnumType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumType_2=ruleEnumType();

                    state._fsp--;


                    			current = this_EnumType_2;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBoolType"
    // InternalConfiguratorLang.g:402:1: entryRuleBoolType returns [EObject current=null] : iv_ruleBoolType= ruleBoolType EOF ;
    public final EObject entryRuleBoolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolType = null;


        try {
            // InternalConfiguratorLang.g:402:49: (iv_ruleBoolType= ruleBoolType EOF )
            // InternalConfiguratorLang.g:403:2: iv_ruleBoolType= ruleBoolType EOF
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
    // InternalConfiguratorLang.g:409:1: ruleBoolType returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleBoolType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:415:2: ( ( () otherlv_1= 'bool' ) )
            // InternalConfiguratorLang.g:416:2: ( () otherlv_1= 'bool' )
            {
            // InternalConfiguratorLang.g:416:2: ( () otherlv_1= 'bool' )
            // InternalConfiguratorLang.g:417:3: () otherlv_1= 'bool'
            {
            // InternalConfiguratorLang.g:417:3: ()
            // InternalConfiguratorLang.g:418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolTypeAccess().getBoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

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
    // InternalConfiguratorLang.g:432:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // InternalConfiguratorLang.g:432:48: (iv_ruleIntType= ruleIntType EOF )
            // InternalConfiguratorLang.g:433:2: iv_ruleIntType= ruleIntType EOF
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
    // InternalConfiguratorLang.g:439:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:445:2: ( ( () otherlv_1= 'int' ) )
            // InternalConfiguratorLang.g:446:2: ( () otherlv_1= 'int' )
            {
            // InternalConfiguratorLang.g:446:2: ( () otherlv_1= 'int' )
            // InternalConfiguratorLang.g:447:3: () otherlv_1= 'int'
            {
            // InternalConfiguratorLang.g:447:3: ()
            // InternalConfiguratorLang.g:448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntTypeAccess().getIntAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

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
    // InternalConfiguratorLang.g:462:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // InternalConfiguratorLang.g:462:49: (iv_ruleEnumType= ruleEnumType EOF )
            // InternalConfiguratorLang.g:463:2: iv_ruleEnumType= ruleEnumType EOF
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
    // InternalConfiguratorLang.g:469:1: ruleEnumType returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:475:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )* )? otherlv_5= ']' ) )
            // InternalConfiguratorLang.g:476:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )* )? otherlv_5= ']' )
            {
            // InternalConfiguratorLang.g:476:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )* )? otherlv_5= ']' )
            // InternalConfiguratorLang.g:477:3: () otherlv_1= '[' ( ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )* )? otherlv_5= ']'
            {
            // InternalConfiguratorLang.g:477:3: ()
            // InternalConfiguratorLang.g:478:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumTypeAccess().getEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalConfiguratorLang.g:488:3: ( ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalConfiguratorLang.g:489:4: ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )*
                    {
                    // InternalConfiguratorLang.g:489:4: ( (lv_values_2_0= RULE_ID ) )
                    // InternalConfiguratorLang.g:490:5: (lv_values_2_0= RULE_ID )
                    {
                    // InternalConfiguratorLang.g:490:5: (lv_values_2_0= RULE_ID )
                    // InternalConfiguratorLang.g:491:6: lv_values_2_0= RULE_ID
                    {
                    lv_values_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_values_2_0, grammarAccess.getEnumTypeAccess().getValuesIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumTypeRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalConfiguratorLang.g:507:4: (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==21) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalConfiguratorLang.g:508:5: otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEnumTypeAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalConfiguratorLang.g:512:5: ( (lv_values_4_0= RULE_ID ) )
                    	    // InternalConfiguratorLang.g:513:6: (lv_values_4_0= RULE_ID )
                    	    {
                    	    // InternalConfiguratorLang.g:513:6: (lv_values_4_0= RULE_ID )
                    	    // InternalConfiguratorLang.g:514:7: lv_values_4_0= RULE_ID
                    	    {
                    	    lv_values_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    							newLeafNode(lv_values_4_0, grammarAccess.getEnumTypeAccess().getValuesIDTerminalRuleCall_2_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEnumTypeRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

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
    // InternalConfiguratorLang.g:540:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalConfiguratorLang.g:540:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalConfiguratorLang.g:541:2: iv_ruleRuleSet= ruleRuleSet EOF
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
    // InternalConfiguratorLang.g:547:1: ruleRuleSet returns [EObject current=null] : ( () ( (lv_rule_1_0= ruleRule ) )* ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject lv_rule_1_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:553:2: ( ( () ( (lv_rule_1_0= ruleRule ) )* ) )
            // InternalConfiguratorLang.g:554:2: ( () ( (lv_rule_1_0= ruleRule ) )* )
            {
            // InternalConfiguratorLang.g:554:2: ( () ( (lv_rule_1_0= ruleRule ) )* )
            // InternalConfiguratorLang.g:555:3: () ( (lv_rule_1_0= ruleRule ) )*
            {
            // InternalConfiguratorLang.g:555:3: ()
            // InternalConfiguratorLang.g:556:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleSetAccess().getRuleSetAction_0(),
            					current);
            			

            }

            // InternalConfiguratorLang.g:562:3: ( (lv_rule_1_0= ruleRule ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==24||(LA7_0>=28 && LA7_0<=29)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalConfiguratorLang.g:563:4: (lv_rule_1_0= ruleRule )
            	    {
            	    // InternalConfiguratorLang.g:563:4: (lv_rule_1_0= ruleRule )
            	    // InternalConfiguratorLang.g:564:5: lv_rule_1_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getRuleSetAccess().getRuleRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop7;
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
    // InternalConfiguratorLang.g:585:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalConfiguratorLang.g:585:45: (iv_ruleRule= ruleRule EOF )
            // InternalConfiguratorLang.g:586:2: iv_ruleRule= ruleRule EOF
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
    // InternalConfiguratorLang.g:592:1: ruleRule returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_if_2_0= ruleSimpleBoolean ) ) otherlv_3= '->' ( (lv_then_4_0= ruleSimpleBoolean ) ) ( (lv_text_5_0= RULE_STRING ) )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_text_5_0=null;
        EObject lv_if_2_0 = null;

        EObject lv_then_4_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:598:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_if_2_0= ruleSimpleBoolean ) ) otherlv_3= '->' ( (lv_then_4_0= ruleSimpleBoolean ) ) ( (lv_text_5_0= RULE_STRING ) )? ) )
            // InternalConfiguratorLang.g:599:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_if_2_0= ruleSimpleBoolean ) ) otherlv_3= '->' ( (lv_then_4_0= ruleSimpleBoolean ) ) ( (lv_text_5_0= RULE_STRING ) )? )
            {
            // InternalConfiguratorLang.g:599:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_if_2_0= ruleSimpleBoolean ) ) otherlv_3= '->' ( (lv_then_4_0= ruleSimpleBoolean ) ) ( (lv_text_5_0= RULE_STRING ) )? )
            // InternalConfiguratorLang.g:600:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_if_2_0= ruleSimpleBoolean ) ) otherlv_3= '->' ( (lv_then_4_0= ruleSimpleBoolean ) ) ( (lv_text_5_0= RULE_STRING ) )?
            {
            // InternalConfiguratorLang.g:600:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==12) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalConfiguratorLang.g:601:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // InternalConfiguratorLang.g:601:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalConfiguratorLang.g:602:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalConfiguratorLang.g:602:5: (lv_name_0_0= RULE_ID )
                    // InternalConfiguratorLang.g:603:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalConfiguratorLang.g:624:3: ( (lv_if_2_0= ruleSimpleBoolean ) )
            // InternalConfiguratorLang.g:625:4: (lv_if_2_0= ruleSimpleBoolean )
            {
            // InternalConfiguratorLang.g:625:4: (lv_if_2_0= ruleSimpleBoolean )
            // InternalConfiguratorLang.g:626:5: lv_if_2_0= ruleSimpleBoolean
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getIfSimpleBooleanParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_if_2_0=ruleSimpleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"if",
            						lv_if_2_0,
            						"org.xtext.branselic.ConfiguratorLang.SimpleBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalConfiguratorLang.g:647:3: ( (lv_then_4_0= ruleSimpleBoolean ) )
            // InternalConfiguratorLang.g:648:4: (lv_then_4_0= ruleSimpleBoolean )
            {
            // InternalConfiguratorLang.g:648:4: (lv_then_4_0= ruleSimpleBoolean )
            // InternalConfiguratorLang.g:649:5: lv_then_4_0= ruleSimpleBoolean
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getThenSimpleBooleanParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_then_4_0=ruleSimpleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"then",
            						lv_then_4_0,
            						"org.xtext.branselic.ConfiguratorLang.SimpleBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalConfiguratorLang.g:666:3: ( (lv_text_5_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalConfiguratorLang.g:667:4: (lv_text_5_0= RULE_STRING )
                    {
                    // InternalConfiguratorLang.g:667:4: (lv_text_5_0= RULE_STRING )
                    // InternalConfiguratorLang.g:668:5: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_text_5_0, grammarAccess.getRuleAccess().getTextSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"text",
                    						lv_text_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

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
    // InternalConfiguratorLang.g:688:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalConfiguratorLang.g:688:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalConfiguratorLang.g:689:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
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
    // InternalConfiguratorLang.g:695:1: ruleBooleanExpression returns [EObject current=null] : (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_And_2= ruleAnd | this_Negation_3= ruleNegation ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_Atom_1 = null;

        EObject this_And_2 = null;

        EObject this_Negation_3 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:701:2: ( (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_And_2= ruleAnd | this_Negation_3= ruleNegation ) )
            // InternalConfiguratorLang.g:702:2: (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_And_2= ruleAnd | this_Negation_3= ruleNegation )
            {
            // InternalConfiguratorLang.g:702:2: (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_And_2= ruleAnd | this_Negation_3= ruleNegation )
            int alt10=4;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalConfiguratorLang.g:703:3: this_Const_0= ruleConst
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
                    // InternalConfiguratorLang.g:712:3: this_Atom_1= ruleAtom
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
                    // InternalConfiguratorLang.g:721:3: this_And_2= ruleAnd
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
                    // InternalConfiguratorLang.g:730:3: this_Negation_3= ruleNegation
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
    // InternalConfiguratorLang.g:742:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalConfiguratorLang.g:742:46: (iv_ruleConst= ruleConst EOF )
            // InternalConfiguratorLang.g:743:2: iv_ruleConst= ruleConst EOF
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
    // InternalConfiguratorLang.g:749:1: ruleConst returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:755:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalConfiguratorLang.g:756:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalConfiguratorLang.g:756:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalConfiguratorLang.g:757:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalConfiguratorLang.g:757:3: (lv_value_0_0= ruleEBoolean )
            // InternalConfiguratorLang.g:758:4: lv_value_0_0= ruleEBoolean
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
    // InternalConfiguratorLang.g:778:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalConfiguratorLang.g:778:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalConfiguratorLang.g:779:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalConfiguratorLang.g:785:1: ruleAtom returns [EObject current=null] : ( (lv_operator_0_0= ruleOperator ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:791:2: ( ( (lv_operator_0_0= ruleOperator ) ) )
            // InternalConfiguratorLang.g:792:2: ( (lv_operator_0_0= ruleOperator ) )
            {
            // InternalConfiguratorLang.g:792:2: ( (lv_operator_0_0= ruleOperator ) )
            // InternalConfiguratorLang.g:793:3: (lv_operator_0_0= ruleOperator )
            {
            // InternalConfiguratorLang.g:793:3: (lv_operator_0_0= ruleOperator )
            // InternalConfiguratorLang.g:794:4: lv_operator_0_0= ruleOperator
            {

            				newCompositeNode(grammarAccess.getAtomAccess().getOperatorOperatorParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_operator_0_0=ruleOperator();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAtomRule());
            				}
            				set(
            					current,
            					"operator",
            					lv_operator_0_0,
            					"org.xtext.branselic.ConfiguratorLang.Operator");
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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleSimpleBoolean"
    // InternalConfiguratorLang.g:814:1: entryRuleSimpleBoolean returns [EObject current=null] : iv_ruleSimpleBoolean= ruleSimpleBoolean EOF ;
    public final EObject entryRuleSimpleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBoolean = null;


        try {
            // InternalConfiguratorLang.g:814:54: (iv_ruleSimpleBoolean= ruleSimpleBoolean EOF )
            // InternalConfiguratorLang.g:815:2: iv_ruleSimpleBoolean= ruleSimpleBoolean EOF
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
    // InternalConfiguratorLang.g:821:1: ruleSimpleBoolean returns [EObject current=null] : (this_Const_0= ruleConst | this_Atom_1= ruleAtom | (otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')' ) ) ;
    public final EObject ruleSimpleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Const_0 = null;

        EObject this_Atom_1 = null;

        EObject this_BooleanExpression_3 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:827:2: ( (this_Const_0= ruleConst | this_Atom_1= ruleAtom | (otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')' ) ) )
            // InternalConfiguratorLang.g:828:2: (this_Const_0= ruleConst | this_Atom_1= ruleAtom | (otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')' ) )
            {
            // InternalConfiguratorLang.g:828:2: (this_Const_0= ruleConst | this_Atom_1= ruleAtom | (otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalConfiguratorLang.g:829:3: this_Const_0= ruleConst
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
                    // InternalConfiguratorLang.g:838:3: this_Atom_1= ruleAtom
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
                    // InternalConfiguratorLang.g:847:3: (otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')' )
                    {
                    // InternalConfiguratorLang.g:847:3: (otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')' )
                    // InternalConfiguratorLang.g:848:4: otherlv_2= '(' this_BooleanExpression_3= ruleBooleanExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getSimpleBooleanAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getSimpleBooleanAccess().getBooleanExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_BooleanExpression_3=ruleBooleanExpression();

                    state._fsp--;


                    				current = this_BooleanExpression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

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
    // InternalConfiguratorLang.g:869:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalConfiguratorLang.g:869:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalConfiguratorLang.g:870:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalConfiguratorLang.g:876:1: ruleNegation returns [EObject current=null] : (otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_booleanexpression_1_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:882:2: ( (otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) ) ) )
            // InternalConfiguratorLang.g:883:2: (otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) ) )
            {
            // InternalConfiguratorLang.g:883:2: (otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) ) )
            // InternalConfiguratorLang.g:884:3: otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getNotKeyword_0());
            		
            // InternalConfiguratorLang.g:888:3: ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) )
            // InternalConfiguratorLang.g:889:4: (lv_booleanexpression_1_0= ruleSimpleBoolean )
            {
            // InternalConfiguratorLang.g:889:4: (lv_booleanexpression_1_0= ruleSimpleBoolean )
            // InternalConfiguratorLang.g:890:5: lv_booleanexpression_1_0= ruleSimpleBoolean
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
    // InternalConfiguratorLang.g:911:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalConfiguratorLang.g:911:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalConfiguratorLang.g:912:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalConfiguratorLang.g:918:1: ruleAnd returns [EObject current=null] : ( ( (lv_booleanexpression_0_0= ruleSimpleBoolean ) ) otherlv_1= 'and' ( (lv_booleanexpression_2_0= ruleSimpleBoolean ) ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_booleanexpression_0_0 = null;

        EObject lv_booleanexpression_2_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:924:2: ( ( ( (lv_booleanexpression_0_0= ruleSimpleBoolean ) ) otherlv_1= 'and' ( (lv_booleanexpression_2_0= ruleSimpleBoolean ) ) ) )
            // InternalConfiguratorLang.g:925:2: ( ( (lv_booleanexpression_0_0= ruleSimpleBoolean ) ) otherlv_1= 'and' ( (lv_booleanexpression_2_0= ruleSimpleBoolean ) ) )
            {
            // InternalConfiguratorLang.g:925:2: ( ( (lv_booleanexpression_0_0= ruleSimpleBoolean ) ) otherlv_1= 'and' ( (lv_booleanexpression_2_0= ruleSimpleBoolean ) ) )
            // InternalConfiguratorLang.g:926:3: ( (lv_booleanexpression_0_0= ruleSimpleBoolean ) ) otherlv_1= 'and' ( (lv_booleanexpression_2_0= ruleSimpleBoolean ) )
            {
            // InternalConfiguratorLang.g:926:3: ( (lv_booleanexpression_0_0= ruleSimpleBoolean ) )
            // InternalConfiguratorLang.g:927:4: (lv_booleanexpression_0_0= ruleSimpleBoolean )
            {
            // InternalConfiguratorLang.g:927:4: (lv_booleanexpression_0_0= ruleSimpleBoolean )
            // InternalConfiguratorLang.g:928:5: lv_booleanexpression_0_0= ruleSimpleBoolean
            {

            					newCompositeNode(grammarAccess.getAndAccess().getBooleanexpressionSimpleBooleanParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_1=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1());
            		
            // InternalConfiguratorLang.g:949:3: ( (lv_booleanexpression_2_0= ruleSimpleBoolean ) )
            // InternalConfiguratorLang.g:950:4: (lv_booleanexpression_2_0= ruleSimpleBoolean )
            {
            // InternalConfiguratorLang.g:950:4: (lv_booleanexpression_2_0= ruleSimpleBoolean )
            // InternalConfiguratorLang.g:951:5: lv_booleanexpression_2_0= ruleSimpleBoolean
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalConfiguratorLang.g:972:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalConfiguratorLang.g:972:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalConfiguratorLang.g:973:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalConfiguratorLang.g:979:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:985:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalConfiguratorLang.g:986:2: (kw= 'true' | kw= 'false' )
            {
            // InternalConfiguratorLang.g:986:2: (kw= 'true' | kw= 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalConfiguratorLang.g:987:3: kw= 'true'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConfiguratorLang.g:993:3: kw= 'false'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

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


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\2\6\7\uffff\1\13\1\uffff";
    static final String dfa_3s = "\1\5\2\31\1\17\3\uffff\3\5\1\31\1\uffff";
    static final String dfa_4s = "\1\35\2\33\1\21\3\uffff\3\5\1\33\1\uffff";
    static final String dfa_5s = "\4\uffff\1\3\1\4\1\1\4\uffff\1\2";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\22\uffff\1\4\1\uffff\1\5\1\uffff\1\1\1\2",
            "\1\6\1\uffff\1\4",
            "\1\6\1\uffff\1\4",
            "\1\7\1\10\1\11",
            "",
            "",
            "",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\13\1\uffff\1\4",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "702:2: (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_And_2= ruleAnd | this_Negation_3= ruleNegation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000031000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000031000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000035000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});

}