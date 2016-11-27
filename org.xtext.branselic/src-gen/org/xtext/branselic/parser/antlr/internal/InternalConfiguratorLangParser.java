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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Name'", "':'", "'Features'", "'Rules'", "'='", "'<'", "'>'", "'bool'", "'int'", "'['", "','", "']'", "'->'", "'or'", "'and'", "'('", "')'", "'not'", "'true'", "'false'"
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

            otherlv_6=(Token)match(input,14,FOLLOW_6); 

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

            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
            		
            // InternalConfiguratorLang.g:211:3: ( (lv_type_2_0= ruleType ) )
            // InternalConfiguratorLang.g:212:4: (lv_type_2_0= ruleType )
            {
            // InternalConfiguratorLang.g:212:4: (lv_type_2_0= ruleType )
            // InternalConfiguratorLang.g:213:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalConfiguratorLang.g:259:1: ruleOperator returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOpSymbol ) ) ( ( (lv_value_2_1= ruleBoolString | lv_value_2_2= ruleIntString | lv_value_2_3= RULE_ID ) ) ) ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_3=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_1 = null;

        AntlrDatatypeRuleToken lv_value_2_2 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:265:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOpSymbol ) ) ( ( (lv_value_2_1= ruleBoolString | lv_value_2_2= ruleIntString | lv_value_2_3= RULE_ID ) ) ) ) )
            // InternalConfiguratorLang.g:266:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOpSymbol ) ) ( ( (lv_value_2_1= ruleBoolString | lv_value_2_2= ruleIntString | lv_value_2_3= RULE_ID ) ) ) )
            {
            // InternalConfiguratorLang.g:266:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOpSymbol ) ) ( ( (lv_value_2_1= ruleBoolString | lv_value_2_2= ruleIntString | lv_value_2_3= RULE_ID ) ) ) )
            // InternalConfiguratorLang.g:267:3: ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleOpSymbol ) ) ( ( (lv_value_2_1= ruleBoolString | lv_value_2_2= ruleIntString | lv_value_2_3= RULE_ID ) ) )
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
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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
            				
            pushFollow(FOLLOW_11);
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

            // InternalConfiguratorLang.g:299:3: ( ( (lv_value_2_1= ruleBoolString | lv_value_2_2= ruleIntString | lv_value_2_3= RULE_ID ) ) )
            // InternalConfiguratorLang.g:300:4: ( (lv_value_2_1= ruleBoolString | lv_value_2_2= ruleIntString | lv_value_2_3= RULE_ID ) )
            {
            // InternalConfiguratorLang.g:300:4: ( (lv_value_2_1= ruleBoolString | lv_value_2_2= ruleIntString | lv_value_2_3= RULE_ID ) )
            // InternalConfiguratorLang.g:301:5: (lv_value_2_1= ruleBoolString | lv_value_2_2= ruleIntString | lv_value_2_3= RULE_ID )
            {
            // InternalConfiguratorLang.g:301:5: (lv_value_2_1= ruleBoolString | lv_value_2_2= ruleIntString | lv_value_2_3= RULE_ID )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
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
                    // InternalConfiguratorLang.g:302:6: lv_value_2_1= ruleBoolString
                    {

                    						newCompositeNode(grammarAccess.getOperatorAccess().getValueBoolStringParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_1=ruleBoolString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperatorRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_1,
                    							"org.xtext.branselic.ConfiguratorLang.BoolString");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalConfiguratorLang.g:318:6: lv_value_2_2= ruleIntString
                    {

                    						newCompositeNode(grammarAccess.getOperatorAccess().getValueIntStringParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_2=ruleIntString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperatorRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_2,
                    							"org.xtext.branselic.ConfiguratorLang.IntString");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalConfiguratorLang.g:334:6: lv_value_2_3= RULE_ID
                    {
                    lv_value_2_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_2_3, grammarAccess.getOperatorAccess().getValueIDTerminalRuleCall_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperatorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_3,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;

            }


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
    // InternalConfiguratorLang.g:355:1: entryRuleOpSymbol returns [String current=null] : iv_ruleOpSymbol= ruleOpSymbol EOF ;
    public final String entryRuleOpSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSymbol = null;


        try {
            // InternalConfiguratorLang.g:355:48: (iv_ruleOpSymbol= ruleOpSymbol EOF )
            // InternalConfiguratorLang.g:356:2: iv_ruleOpSymbol= ruleOpSymbol EOF
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
    // InternalConfiguratorLang.g:362:1: ruleOpSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleOpSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:368:2: ( (kw= '=' | kw= '<' | kw= '>' ) )
            // InternalConfiguratorLang.g:369:2: (kw= '=' | kw= '<' | kw= '>' )
            {
            // InternalConfiguratorLang.g:369:2: (kw= '=' | kw= '<' | kw= '>' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
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
                    // InternalConfiguratorLang.g:370:3: kw= '='
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpSymbolAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConfiguratorLang.g:376:3: kw= '<'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpSymbolAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalConfiguratorLang.g:382:3: kw= '>'
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
    // InternalConfiguratorLang.g:391:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalConfiguratorLang.g:391:45: (iv_ruleType= ruleType EOF )
            // InternalConfiguratorLang.g:392:2: iv_ruleType= ruleType EOF
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
    // InternalConfiguratorLang.g:398:1: ruleType returns [EObject current=null] : (this_BoolType_0= ruleBoolType | this_IntType_1= ruleIntType | this_EnumType_2= ruleEnumType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_BoolType_0 = null;

        EObject this_IntType_1 = null;

        EObject this_EnumType_2 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:404:2: ( (this_BoolType_0= ruleBoolType | this_IntType_1= ruleIntType | this_EnumType_2= ruleEnumType ) )
            // InternalConfiguratorLang.g:405:2: (this_BoolType_0= ruleBoolType | this_IntType_1= ruleIntType | this_EnumType_2= ruleEnumType )
            {
            // InternalConfiguratorLang.g:405:2: (this_BoolType_0= ruleBoolType | this_IntType_1= ruleIntType | this_EnumType_2= ruleEnumType )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalConfiguratorLang.g:406:3: this_BoolType_0= ruleBoolType
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
                    // InternalConfiguratorLang.g:415:3: this_IntType_1= ruleIntType
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
                    // InternalConfiguratorLang.g:424:3: this_EnumType_2= ruleEnumType
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
    // InternalConfiguratorLang.g:436:1: entryRuleBoolType returns [EObject current=null] : iv_ruleBoolType= ruleBoolType EOF ;
    public final EObject entryRuleBoolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolType = null;


        try {
            // InternalConfiguratorLang.g:436:49: (iv_ruleBoolType= ruleBoolType EOF )
            // InternalConfiguratorLang.g:437:2: iv_ruleBoolType= ruleBoolType EOF
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
    // InternalConfiguratorLang.g:443:1: ruleBoolType returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleBoolType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:449:2: ( ( () otherlv_1= 'bool' ) )
            // InternalConfiguratorLang.g:450:2: ( () otherlv_1= 'bool' )
            {
            // InternalConfiguratorLang.g:450:2: ( () otherlv_1= 'bool' )
            // InternalConfiguratorLang.g:451:3: () otherlv_1= 'bool'
            {
            // InternalConfiguratorLang.g:451:3: ()
            // InternalConfiguratorLang.g:452:4: 
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
    // InternalConfiguratorLang.g:466:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // InternalConfiguratorLang.g:466:48: (iv_ruleIntType= ruleIntType EOF )
            // InternalConfiguratorLang.g:467:2: iv_ruleIntType= ruleIntType EOF
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
    // InternalConfiguratorLang.g:473:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:479:2: ( ( () otherlv_1= 'int' ) )
            // InternalConfiguratorLang.g:480:2: ( () otherlv_1= 'int' )
            {
            // InternalConfiguratorLang.g:480:2: ( () otherlv_1= 'int' )
            // InternalConfiguratorLang.g:481:3: () otherlv_1= 'int'
            {
            // InternalConfiguratorLang.g:481:3: ()
            // InternalConfiguratorLang.g:482:4: 
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
    // InternalConfiguratorLang.g:496:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // InternalConfiguratorLang.g:496:49: (iv_ruleEnumType= ruleEnumType EOF )
            // InternalConfiguratorLang.g:497:2: iv_ruleEnumType= ruleEnumType EOF
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
    // InternalConfiguratorLang.g:503:1: ruleEnumType returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:509:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )* )? otherlv_5= ']' ) )
            // InternalConfiguratorLang.g:510:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )* )? otherlv_5= ']' )
            {
            // InternalConfiguratorLang.g:510:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )* )? otherlv_5= ']' )
            // InternalConfiguratorLang.g:511:3: () otherlv_1= '[' ( ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )* )? otherlv_5= ']'
            {
            // InternalConfiguratorLang.g:511:3: ()
            // InternalConfiguratorLang.g:512:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumTypeAccess().getEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalConfiguratorLang.g:522:3: ( ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalConfiguratorLang.g:523:4: ( (lv_values_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )*
                    {
                    // InternalConfiguratorLang.g:523:4: ( (lv_values_2_0= RULE_ID ) )
                    // InternalConfiguratorLang.g:524:5: (lv_values_2_0= RULE_ID )
                    {
                    // InternalConfiguratorLang.g:524:5: (lv_values_2_0= RULE_ID )
                    // InternalConfiguratorLang.g:525:6: lv_values_2_0= RULE_ID
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

                    // InternalConfiguratorLang.g:541:4: (otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==21) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalConfiguratorLang.g:542:5: otherlv_3= ',' ( (lv_values_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEnumTypeAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalConfiguratorLang.g:546:5: ( (lv_values_4_0= RULE_ID ) )
                    	    // InternalConfiguratorLang.g:547:6: (lv_values_4_0= RULE_ID )
                    	    {
                    	    // InternalConfiguratorLang.g:547:6: (lv_values_4_0= RULE_ID )
                    	    // InternalConfiguratorLang.g:548:7: lv_values_4_0= RULE_ID
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
                    	    break loop6;
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
    // InternalConfiguratorLang.g:574:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalConfiguratorLang.g:574:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalConfiguratorLang.g:575:2: iv_ruleRuleSet= ruleRuleSet EOF
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
    // InternalConfiguratorLang.g:581:1: ruleRuleSet returns [EObject current=null] : ( () ( (lv_rule_1_0= ruleRule ) )* ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject lv_rule_1_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:587:2: ( ( () ( (lv_rule_1_0= ruleRule ) )* ) )
            // InternalConfiguratorLang.g:588:2: ( () ( (lv_rule_1_0= ruleRule ) )* )
            {
            // InternalConfiguratorLang.g:588:2: ( () ( (lv_rule_1_0= ruleRule ) )* )
            // InternalConfiguratorLang.g:589:3: () ( (lv_rule_1_0= ruleRule ) )*
            {
            // InternalConfiguratorLang.g:589:3: ()
            // InternalConfiguratorLang.g:590:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleSetAccess().getRuleSetAction_0(),
            					current);
            			

            }

            // InternalConfiguratorLang.g:596:3: ( (lv_rule_1_0= ruleRule ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalConfiguratorLang.g:597:4: (lv_rule_1_0= ruleRule )
            	    {
            	    // InternalConfiguratorLang.g:597:4: (lv_rule_1_0= ruleRule )
            	    // InternalConfiguratorLang.g:598:5: lv_rule_1_0= ruleRule
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
            	    break loop8;
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
    // InternalConfiguratorLang.g:619:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalConfiguratorLang.g:619:45: (iv_ruleRule= ruleRule EOF )
            // InternalConfiguratorLang.g:620:2: iv_ruleRule= ruleRule EOF
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
    // InternalConfiguratorLang.g:626:1: ruleRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_if_2_0= ruleSimpleBoolean ) ) otherlv_3= '->' ( (lv_then_4_0= ruleSimpleBoolean ) ) ( (lv_text_5_0= RULE_STRING ) )? ) ;
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
            // InternalConfiguratorLang.g:632:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_if_2_0= ruleSimpleBoolean ) ) otherlv_3= '->' ( (lv_then_4_0= ruleSimpleBoolean ) ) ( (lv_text_5_0= RULE_STRING ) )? ) )
            // InternalConfiguratorLang.g:633:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_if_2_0= ruleSimpleBoolean ) ) otherlv_3= '->' ( (lv_then_4_0= ruleSimpleBoolean ) ) ( (lv_text_5_0= RULE_STRING ) )? )
            {
            // InternalConfiguratorLang.g:633:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_if_2_0= ruleSimpleBoolean ) ) otherlv_3= '->' ( (lv_then_4_0= ruleSimpleBoolean ) ) ( (lv_text_5_0= RULE_STRING ) )? )
            // InternalConfiguratorLang.g:634:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_if_2_0= ruleSimpleBoolean ) ) otherlv_3= '->' ( (lv_then_4_0= ruleSimpleBoolean ) ) ( (lv_text_5_0= RULE_STRING ) )?
            {
            // InternalConfiguratorLang.g:634:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalConfiguratorLang.g:635:4: (lv_name_0_0= RULE_ID )
            {
            // InternalConfiguratorLang.g:635:4: (lv_name_0_0= RULE_ID )
            // InternalConfiguratorLang.g:636:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getColonKeyword_1());
            		
            // InternalConfiguratorLang.g:656:3: ( (lv_if_2_0= ruleSimpleBoolean ) )
            // InternalConfiguratorLang.g:657:4: (lv_if_2_0= ruleSimpleBoolean )
            {
            // InternalConfiguratorLang.g:657:4: (lv_if_2_0= ruleSimpleBoolean )
            // InternalConfiguratorLang.g:658:5: lv_if_2_0= ruleSimpleBoolean
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getIfSimpleBooleanParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_3=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalConfiguratorLang.g:679:3: ( (lv_then_4_0= ruleSimpleBoolean ) )
            // InternalConfiguratorLang.g:680:4: (lv_then_4_0= ruleSimpleBoolean )
            {
            // InternalConfiguratorLang.g:680:4: (lv_then_4_0= ruleSimpleBoolean )
            // InternalConfiguratorLang.g:681:5: lv_then_4_0= ruleSimpleBoolean
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getThenSimpleBooleanParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalConfiguratorLang.g:698:3: ( (lv_text_5_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalConfiguratorLang.g:699:4: (lv_text_5_0= RULE_STRING )
                    {
                    // InternalConfiguratorLang.g:699:4: (lv_text_5_0= RULE_STRING )
                    // InternalConfiguratorLang.g:700:5: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_text_5_0, grammarAccess.getRuleAccess().getTextSTRINGTerminalRuleCall_5_0());
                    				

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
    // InternalConfiguratorLang.g:720:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalConfiguratorLang.g:720:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalConfiguratorLang.g:721:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
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
    // InternalConfiguratorLang.g:727:1: ruleBooleanExpression returns [EObject current=null] : (this_AndBool_0= ruleAndBool ( () otherlv_2= 'or' ( (lv_booleanexpression_3_0= ruleAndBool ) ) )* ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndBool_0 = null;

        EObject lv_booleanexpression_3_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:733:2: ( (this_AndBool_0= ruleAndBool ( () otherlv_2= 'or' ( (lv_booleanexpression_3_0= ruleAndBool ) ) )* ) )
            // InternalConfiguratorLang.g:734:2: (this_AndBool_0= ruleAndBool ( () otherlv_2= 'or' ( (lv_booleanexpression_3_0= ruleAndBool ) ) )* )
            {
            // InternalConfiguratorLang.g:734:2: (this_AndBool_0= ruleAndBool ( () otherlv_2= 'or' ( (lv_booleanexpression_3_0= ruleAndBool ) ) )* )
            // InternalConfiguratorLang.g:735:3: this_AndBool_0= ruleAndBool ( () otherlv_2= 'or' ( (lv_booleanexpression_3_0= ruleAndBool ) ) )*
            {

            			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getAndBoolParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_AndBool_0=ruleAndBool();

            state._fsp--;


            			current = this_AndBool_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalConfiguratorLang.g:743:3: ( () otherlv_2= 'or' ( (lv_booleanexpression_3_0= ruleAndBool ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalConfiguratorLang.g:744:4: () otherlv_2= 'or' ( (lv_booleanexpression_3_0= ruleAndBool ) )
            	    {
            	    // InternalConfiguratorLang.g:744:4: ()
            	    // InternalConfiguratorLang.g:745:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getBooleanExpressionAccess().getOrBooleanexpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBooleanExpressionAccess().getOrKeyword_1_1());
            	    			
            	    // InternalConfiguratorLang.g:755:4: ( (lv_booleanexpression_3_0= ruleAndBool ) )
            	    // InternalConfiguratorLang.g:756:5: (lv_booleanexpression_3_0= ruleAndBool )
            	    {
            	    // InternalConfiguratorLang.g:756:5: (lv_booleanexpression_3_0= ruleAndBool )
            	    // InternalConfiguratorLang.g:757:6: lv_booleanexpression_3_0= ruleAndBool
            	    {

            	    						newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanexpressionAndBoolParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_booleanexpression_3_0=ruleAndBool();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"booleanexpression",
            	    							lv_booleanexpression_3_0,
            	    							"org.xtext.branselic.ConfiguratorLang.AndBool");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleAndBool"
    // InternalConfiguratorLang.g:779:1: entryRuleAndBool returns [EObject current=null] : iv_ruleAndBool= ruleAndBool EOF ;
    public final EObject entryRuleAndBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndBool = null;


        try {
            // InternalConfiguratorLang.g:779:48: (iv_ruleAndBool= ruleAndBool EOF )
            // InternalConfiguratorLang.g:780:2: iv_ruleAndBool= ruleAndBool EOF
            {
             newCompositeNode(grammarAccess.getAndBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndBool=ruleAndBool();

            state._fsp--;

             current =iv_ruleAndBool; 
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
    // $ANTLR end "entryRuleAndBool"


    // $ANTLR start "ruleAndBool"
    // InternalConfiguratorLang.g:786:1: ruleAndBool returns [EObject current=null] : (this_SimpleBoolean_0= ruleSimpleBoolean ( () otherlv_2= 'and' ( (lv_booleanexpression_3_0= ruleSimpleBoolean ) ) )* ) ;
    public final EObject ruleAndBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SimpleBoolean_0 = null;

        EObject lv_booleanexpression_3_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:792:2: ( (this_SimpleBoolean_0= ruleSimpleBoolean ( () otherlv_2= 'and' ( (lv_booleanexpression_3_0= ruleSimpleBoolean ) ) )* ) )
            // InternalConfiguratorLang.g:793:2: (this_SimpleBoolean_0= ruleSimpleBoolean ( () otherlv_2= 'and' ( (lv_booleanexpression_3_0= ruleSimpleBoolean ) ) )* )
            {
            // InternalConfiguratorLang.g:793:2: (this_SimpleBoolean_0= ruleSimpleBoolean ( () otherlv_2= 'and' ( (lv_booleanexpression_3_0= ruleSimpleBoolean ) ) )* )
            // InternalConfiguratorLang.g:794:3: this_SimpleBoolean_0= ruleSimpleBoolean ( () otherlv_2= 'and' ( (lv_booleanexpression_3_0= ruleSimpleBoolean ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndBoolAccess().getSimpleBooleanParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_SimpleBoolean_0=ruleSimpleBoolean();

            state._fsp--;


            			current = this_SimpleBoolean_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalConfiguratorLang.g:802:3: ( () otherlv_2= 'and' ( (lv_booleanexpression_3_0= ruleSimpleBoolean ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalConfiguratorLang.g:803:4: () otherlv_2= 'and' ( (lv_booleanexpression_3_0= ruleSimpleBoolean ) )
            	    {
            	    // InternalConfiguratorLang.g:803:4: ()
            	    // InternalConfiguratorLang.g:804:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndBoolAccess().getAndBooleanexpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndBoolAccess().getAndKeyword_1_1());
            	    			
            	    // InternalConfiguratorLang.g:814:4: ( (lv_booleanexpression_3_0= ruleSimpleBoolean ) )
            	    // InternalConfiguratorLang.g:815:5: (lv_booleanexpression_3_0= ruleSimpleBoolean )
            	    {
            	    // InternalConfiguratorLang.g:815:5: (lv_booleanexpression_3_0= ruleSimpleBoolean )
            	    // InternalConfiguratorLang.g:816:6: lv_booleanexpression_3_0= ruleSimpleBoolean
            	    {

            	    						newCompositeNode(grammarAccess.getAndBoolAccess().getBooleanexpressionSimpleBooleanParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_booleanexpression_3_0=ruleSimpleBoolean();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndBoolRule());
            	    						}
            	    						add(
            	    							current,
            	    							"booleanexpression",
            	    							lv_booleanexpression_3_0,
            	    							"org.xtext.branselic.ConfiguratorLang.SimpleBoolean");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleAndBool"


    // $ANTLR start "entryRuleConst"
    // InternalConfiguratorLang.g:838:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalConfiguratorLang.g:838:46: (iv_ruleConst= ruleConst EOF )
            // InternalConfiguratorLang.g:839:2: iv_ruleConst= ruleConst EOF
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
    // InternalConfiguratorLang.g:845:1: ruleConst returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:851:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalConfiguratorLang.g:852:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalConfiguratorLang.g:852:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalConfiguratorLang.g:853:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalConfiguratorLang.g:853:3: (lv_value_0_0= ruleEBoolean )
            // InternalConfiguratorLang.g:854:4: lv_value_0_0= ruleEBoolean
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
    // InternalConfiguratorLang.g:874:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalConfiguratorLang.g:874:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalConfiguratorLang.g:875:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalConfiguratorLang.g:881:1: ruleAtom returns [EObject current=null] : ( (lv_operator_0_0= ruleOperator ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:887:2: ( ( (lv_operator_0_0= ruleOperator ) ) )
            // InternalConfiguratorLang.g:888:2: ( (lv_operator_0_0= ruleOperator ) )
            {
            // InternalConfiguratorLang.g:888:2: ( (lv_operator_0_0= ruleOperator ) )
            // InternalConfiguratorLang.g:889:3: (lv_operator_0_0= ruleOperator )
            {
            // InternalConfiguratorLang.g:889:3: (lv_operator_0_0= ruleOperator )
            // InternalConfiguratorLang.g:890:4: lv_operator_0_0= ruleOperator
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
    // InternalConfiguratorLang.g:910:1: entryRuleSimpleBoolean returns [EObject current=null] : iv_ruleSimpleBoolean= ruleSimpleBoolean EOF ;
    public final EObject entryRuleSimpleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleBoolean = null;


        try {
            // InternalConfiguratorLang.g:910:54: (iv_ruleSimpleBoolean= ruleSimpleBoolean EOF )
            // InternalConfiguratorLang.g:911:2: iv_ruleSimpleBoolean= ruleSimpleBoolean EOF
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
    // InternalConfiguratorLang.g:917:1: ruleSimpleBoolean returns [EObject current=null] : (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_Negation_2= ruleNegation | (otherlv_3= '(' this_BooleanExpression_4= ruleBooleanExpression otherlv_5= ')' ) ) ;
    public final EObject ruleSimpleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Const_0 = null;

        EObject this_Atom_1 = null;

        EObject this_Negation_2 = null;

        EObject this_BooleanExpression_4 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:923:2: ( (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_Negation_2= ruleNegation | (otherlv_3= '(' this_BooleanExpression_4= ruleBooleanExpression otherlv_5= ')' ) ) )
            // InternalConfiguratorLang.g:924:2: (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_Negation_2= ruleNegation | (otherlv_3= '(' this_BooleanExpression_4= ruleBooleanExpression otherlv_5= ')' ) )
            {
            // InternalConfiguratorLang.g:924:2: (this_Const_0= ruleConst | this_Atom_1= ruleAtom | this_Negation_2= ruleNegation | (otherlv_3= '(' this_BooleanExpression_4= ruleBooleanExpression otherlv_5= ')' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalConfiguratorLang.g:925:3: this_Const_0= ruleConst
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
                    // InternalConfiguratorLang.g:934:3: this_Atom_1= ruleAtom
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
                    // InternalConfiguratorLang.g:943:3: this_Negation_2= ruleNegation
                    {

                    			newCompositeNode(grammarAccess.getSimpleBooleanAccess().getNegationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Negation_2=ruleNegation();

                    state._fsp--;


                    			current = this_Negation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalConfiguratorLang.g:952:3: (otherlv_3= '(' this_BooleanExpression_4= ruleBooleanExpression otherlv_5= ')' )
                    {
                    // InternalConfiguratorLang.g:952:3: (otherlv_3= '(' this_BooleanExpression_4= ruleBooleanExpression otherlv_5= ')' )
                    // InternalConfiguratorLang.g:953:4: otherlv_3= '(' this_BooleanExpression_4= ruleBooleanExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getSimpleBooleanAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getSimpleBooleanAccess().getBooleanExpressionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_BooleanExpression_4=ruleBooleanExpression();

                    state._fsp--;


                    				current = this_BooleanExpression_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSimpleBooleanAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // InternalConfiguratorLang.g:974:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalConfiguratorLang.g:974:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalConfiguratorLang.g:975:2: iv_ruleNegation= ruleNegation EOF
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
    // InternalConfiguratorLang.g:981:1: ruleNegation returns [EObject current=null] : (otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_booleanexpression_1_0 = null;



        	enterRule();

        try {
            // InternalConfiguratorLang.g:987:2: ( (otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) ) ) )
            // InternalConfiguratorLang.g:988:2: (otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) ) )
            {
            // InternalConfiguratorLang.g:988:2: (otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) ) )
            // InternalConfiguratorLang.g:989:3: otherlv_0= 'not' ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getNotKeyword_0());
            		
            // InternalConfiguratorLang.g:993:3: ( (lv_booleanexpression_1_0= ruleSimpleBoolean ) )
            // InternalConfiguratorLang.g:994:4: (lv_booleanexpression_1_0= ruleSimpleBoolean )
            {
            // InternalConfiguratorLang.g:994:4: (lv_booleanexpression_1_0= ruleSimpleBoolean )
            // InternalConfiguratorLang.g:995:5: lv_booleanexpression_1_0= ruleSimpleBoolean
            {

            					newCompositeNode(grammarAccess.getNegationAccess().getBooleanexpressionSimpleBooleanParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_booleanexpression_1_0=ruleSimpleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegationRule());
            					}
            					add(
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalConfiguratorLang.g:1016:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalConfiguratorLang.g:1016:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalConfiguratorLang.g:1017:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalConfiguratorLang.g:1023:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:1029:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalConfiguratorLang.g:1030:2: (kw= 'true' | kw= 'false' )
            {
            // InternalConfiguratorLang.g:1030:2: (kw= 'true' | kw= 'false' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalConfiguratorLang.g:1031:3: kw= 'true'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConfiguratorLang.g:1037:3: kw= 'false'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBoolString"
    // InternalConfiguratorLang.g:1046:1: entryRuleBoolString returns [String current=null] : iv_ruleBoolString= ruleBoolString EOF ;
    public final String entryRuleBoolString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolString = null;


        try {
            // InternalConfiguratorLang.g:1046:50: (iv_ruleBoolString= ruleBoolString EOF )
            // InternalConfiguratorLang.g:1047:2: iv_ruleBoolString= ruleBoolString EOF
            {
             newCompositeNode(grammarAccess.getBoolStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolString=ruleBoolString();

            state._fsp--;

             current =iv_ruleBoolString.getText(); 
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
    // $ANTLR end "entryRuleBoolString"


    // $ANTLR start "ruleBoolString"
    // InternalConfiguratorLang.g:1053:1: ruleBoolString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:1059:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalConfiguratorLang.g:1060:2: (kw= 'true' | kw= 'false' )
            {
            // InternalConfiguratorLang.g:1060:2: (kw= 'true' | kw= 'false' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalConfiguratorLang.g:1061:3: kw= 'true'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolStringAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConfiguratorLang.g:1067:3: kw= 'false'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolStringAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBoolString"


    // $ANTLR start "entryRuleIntString"
    // InternalConfiguratorLang.g:1076:1: entryRuleIntString returns [String current=null] : iv_ruleIntString= ruleIntString EOF ;
    public final String entryRuleIntString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntString = null;


        try {
            // InternalConfiguratorLang.g:1076:49: (iv_ruleIntString= ruleIntString EOF )
            // InternalConfiguratorLang.g:1077:2: iv_ruleIntString= ruleIntString EOF
            {
             newCompositeNode(grammarAccess.getIntStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntString=ruleIntString();

            state._fsp--;

             current =iv_ruleIntString.getText(); 
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
    // $ANTLR end "entryRuleIntString"


    // $ANTLR start "ruleIntString"
    // InternalConfiguratorLang.g:1083:1: ruleIntString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalConfiguratorLang.g:1089:2: (this_INT_0= RULE_INT )
            // InternalConfiguratorLang.g:1090:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getIntStringAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleIntString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000060000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000074000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});

}