package org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr.internal;

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
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug348427TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
@SuppressWarnings("all")
public class InternalBug348427TestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1.1'", "'next'", "'1.2'", "'1.3'", "'1.4'", "':'", "'bool'", "'keyword'", "'child1'", "'end'", "'child2'", "'child3'", "'2.1'", "'2.2'", "'2.3'", "'2.4'", "'2.5'", "'2.6'", "'2.7'", "'2.8'", "'a'", "'b'"
    };
    public static final int RULE_STRING=6;
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
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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


        public InternalBug348427TestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBug348427TestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBug348427TestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBug348427TestLanguage.g"; }



     	private Bug348427TestLanguageGrammarAccess grammarAccess;

        public InternalBug348427TestLanguageParser(TokenStream input, Bug348427TestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Bug348427TestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBug348427TestLanguage.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBug348427TestLanguage.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalBug348427TestLanguage.g:71:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBug348427TestLanguage.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_element1_0_0= ruleScenario1_1 ) ) | ( (lv_element1_1_0= ruleScenario1_2 ) ) | ( (lv_element1_2_0= ruleScenario1_3 ) ) | ( (lv_element1_3_0= ruleScenario1_4 ) ) | ( (lv_element2_4_0= ruleScenario2_1 ) ) | ( (lv_element2_5_0= ruleScenario2_2 ) ) | ( (lv_element2_6_0= ruleScenario2_3 ) ) | ( (lv_element2_7_0= ruleScenario2_4 ) ) | ( (lv_element2_8_0= ruleScenario2_5 ) ) | ( (lv_element2_9_0= ruleScenario2_6 ) ) | ( (lv_element2_10_0= ruleScenario2_7 ) ) | ( (lv_element2_11_0= ruleScenario2_8 ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_element1_0_0 = null;

        EObject lv_element1_1_0 = null;

        EObject lv_element1_2_0 = null;

        EObject lv_element1_3_0 = null;

        EObject lv_element2_4_0 = null;

        EObject lv_element2_5_0 = null;

        EObject lv_element2_6_0 = null;

        EObject lv_element2_7_0 = null;

        EObject lv_element2_8_0 = null;

        EObject lv_element2_9_0 = null;

        EObject lv_element2_10_0 = null;

        EObject lv_element2_11_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:83:2: ( ( ( (lv_element1_0_0= ruleScenario1_1 ) ) | ( (lv_element1_1_0= ruleScenario1_2 ) ) | ( (lv_element1_2_0= ruleScenario1_3 ) ) | ( (lv_element1_3_0= ruleScenario1_4 ) ) | ( (lv_element2_4_0= ruleScenario2_1 ) ) | ( (lv_element2_5_0= ruleScenario2_2 ) ) | ( (lv_element2_6_0= ruleScenario2_3 ) ) | ( (lv_element2_7_0= ruleScenario2_4 ) ) | ( (lv_element2_8_0= ruleScenario2_5 ) ) | ( (lv_element2_9_0= ruleScenario2_6 ) ) | ( (lv_element2_10_0= ruleScenario2_7 ) ) | ( (lv_element2_11_0= ruleScenario2_8 ) ) ) )
            // InternalBug348427TestLanguage.g:84:2: ( ( (lv_element1_0_0= ruleScenario1_1 ) ) | ( (lv_element1_1_0= ruleScenario1_2 ) ) | ( (lv_element1_2_0= ruleScenario1_3 ) ) | ( (lv_element1_3_0= ruleScenario1_4 ) ) | ( (lv_element2_4_0= ruleScenario2_1 ) ) | ( (lv_element2_5_0= ruleScenario2_2 ) ) | ( (lv_element2_6_0= ruleScenario2_3 ) ) | ( (lv_element2_7_0= ruleScenario2_4 ) ) | ( (lv_element2_8_0= ruleScenario2_5 ) ) | ( (lv_element2_9_0= ruleScenario2_6 ) ) | ( (lv_element2_10_0= ruleScenario2_7 ) ) | ( (lv_element2_11_0= ruleScenario2_8 ) ) )
            {
            // InternalBug348427TestLanguage.g:84:2: ( ( (lv_element1_0_0= ruleScenario1_1 ) ) | ( (lv_element1_1_0= ruleScenario1_2 ) ) | ( (lv_element1_2_0= ruleScenario1_3 ) ) | ( (lv_element1_3_0= ruleScenario1_4 ) ) | ( (lv_element2_4_0= ruleScenario2_1 ) ) | ( (lv_element2_5_0= ruleScenario2_2 ) ) | ( (lv_element2_6_0= ruleScenario2_3 ) ) | ( (lv_element2_7_0= ruleScenario2_4 ) ) | ( (lv_element2_8_0= ruleScenario2_5 ) ) | ( (lv_element2_9_0= ruleScenario2_6 ) ) | ( (lv_element2_10_0= ruleScenario2_7 ) ) | ( (lv_element2_11_0= ruleScenario2_8 ) ) )
            int alt1=12;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 23:
                {
                alt1=5;
                }
                break;
            case 24:
                {
                alt1=6;
                }
                break;
            case 25:
                {
                alt1=7;
                }
                break;
            case 26:
                {
                alt1=8;
                }
                break;
            case 27:
                {
                alt1=9;
                }
                break;
            case 28:
                {
                alt1=10;
                }
                break;
            case 29:
                {
                alt1=11;
                }
                break;
            case 30:
                {
                alt1=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBug348427TestLanguage.g:85:3: ( (lv_element1_0_0= ruleScenario1_1 ) )
                    {
                    // InternalBug348427TestLanguage.g:85:3: ( (lv_element1_0_0= ruleScenario1_1 ) )
                    // InternalBug348427TestLanguage.g:86:4: (lv_element1_0_0= ruleScenario1_1 )
                    {
                    // InternalBug348427TestLanguage.g:86:4: (lv_element1_0_0= ruleScenario1_1 )
                    // InternalBug348427TestLanguage.g:87:5: lv_element1_0_0= ruleScenario1_1
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement1Scenario1_1ParserRuleCall_0_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element1_0_0=ruleScenario1_1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element1",
                    						lv_element1_0_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario1_1");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:105:3: ( (lv_element1_1_0= ruleScenario1_2 ) )
                    {
                    // InternalBug348427TestLanguage.g:105:3: ( (lv_element1_1_0= ruleScenario1_2 ) )
                    // InternalBug348427TestLanguage.g:106:4: (lv_element1_1_0= ruleScenario1_2 )
                    {
                    // InternalBug348427TestLanguage.g:106:4: (lv_element1_1_0= ruleScenario1_2 )
                    // InternalBug348427TestLanguage.g:107:5: lv_element1_1_0= ruleScenario1_2
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement1Scenario1_2ParserRuleCall_1_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element1_1_0=ruleScenario1_2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element1",
                    						lv_element1_1_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario1_2");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:125:3: ( (lv_element1_2_0= ruleScenario1_3 ) )
                    {
                    // InternalBug348427TestLanguage.g:125:3: ( (lv_element1_2_0= ruleScenario1_3 ) )
                    // InternalBug348427TestLanguage.g:126:4: (lv_element1_2_0= ruleScenario1_3 )
                    {
                    // InternalBug348427TestLanguage.g:126:4: (lv_element1_2_0= ruleScenario1_3 )
                    // InternalBug348427TestLanguage.g:127:5: lv_element1_2_0= ruleScenario1_3
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement1Scenario1_3ParserRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element1_2_0=ruleScenario1_3();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element1",
                    						lv_element1_2_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario1_3");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBug348427TestLanguage.g:145:3: ( (lv_element1_3_0= ruleScenario1_4 ) )
                    {
                    // InternalBug348427TestLanguage.g:145:3: ( (lv_element1_3_0= ruleScenario1_4 ) )
                    // InternalBug348427TestLanguage.g:146:4: (lv_element1_3_0= ruleScenario1_4 )
                    {
                    // InternalBug348427TestLanguage.g:146:4: (lv_element1_3_0= ruleScenario1_4 )
                    // InternalBug348427TestLanguage.g:147:5: lv_element1_3_0= ruleScenario1_4
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement1Scenario1_4ParserRuleCall_3_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element1_3_0=ruleScenario1_4();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element1",
                    						lv_element1_3_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario1_4");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalBug348427TestLanguage.g:165:3: ( (lv_element2_4_0= ruleScenario2_1 ) )
                    {
                    // InternalBug348427TestLanguage.g:165:3: ( (lv_element2_4_0= ruleScenario2_1 ) )
                    // InternalBug348427TestLanguage.g:166:4: (lv_element2_4_0= ruleScenario2_1 )
                    {
                    // InternalBug348427TestLanguage.g:166:4: (lv_element2_4_0= ruleScenario2_1 )
                    // InternalBug348427TestLanguage.g:167:5: lv_element2_4_0= ruleScenario2_1
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_1ParserRuleCall_4_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_4_0=ruleScenario2_1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_4_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_1");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalBug348427TestLanguage.g:185:3: ( (lv_element2_5_0= ruleScenario2_2 ) )
                    {
                    // InternalBug348427TestLanguage.g:185:3: ( (lv_element2_5_0= ruleScenario2_2 ) )
                    // InternalBug348427TestLanguage.g:186:4: (lv_element2_5_0= ruleScenario2_2 )
                    {
                    // InternalBug348427TestLanguage.g:186:4: (lv_element2_5_0= ruleScenario2_2 )
                    // InternalBug348427TestLanguage.g:187:5: lv_element2_5_0= ruleScenario2_2
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_2ParserRuleCall_5_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_5_0=ruleScenario2_2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_5_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_2");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalBug348427TestLanguage.g:205:3: ( (lv_element2_6_0= ruleScenario2_3 ) )
                    {
                    // InternalBug348427TestLanguage.g:205:3: ( (lv_element2_6_0= ruleScenario2_3 ) )
                    // InternalBug348427TestLanguage.g:206:4: (lv_element2_6_0= ruleScenario2_3 )
                    {
                    // InternalBug348427TestLanguage.g:206:4: (lv_element2_6_0= ruleScenario2_3 )
                    // InternalBug348427TestLanguage.g:207:5: lv_element2_6_0= ruleScenario2_3
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_3ParserRuleCall_6_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_6_0=ruleScenario2_3();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_6_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_3");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalBug348427TestLanguage.g:225:3: ( (lv_element2_7_0= ruleScenario2_4 ) )
                    {
                    // InternalBug348427TestLanguage.g:225:3: ( (lv_element2_7_0= ruleScenario2_4 ) )
                    // InternalBug348427TestLanguage.g:226:4: (lv_element2_7_0= ruleScenario2_4 )
                    {
                    // InternalBug348427TestLanguage.g:226:4: (lv_element2_7_0= ruleScenario2_4 )
                    // InternalBug348427TestLanguage.g:227:5: lv_element2_7_0= ruleScenario2_4
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_4ParserRuleCall_7_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_7_0=ruleScenario2_4();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_7_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_4");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalBug348427TestLanguage.g:245:3: ( (lv_element2_8_0= ruleScenario2_5 ) )
                    {
                    // InternalBug348427TestLanguage.g:245:3: ( (lv_element2_8_0= ruleScenario2_5 ) )
                    // InternalBug348427TestLanguage.g:246:4: (lv_element2_8_0= ruleScenario2_5 )
                    {
                    // InternalBug348427TestLanguage.g:246:4: (lv_element2_8_0= ruleScenario2_5 )
                    // InternalBug348427TestLanguage.g:247:5: lv_element2_8_0= ruleScenario2_5
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_5ParserRuleCall_8_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_8_0=ruleScenario2_5();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_8_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_5");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalBug348427TestLanguage.g:265:3: ( (lv_element2_9_0= ruleScenario2_6 ) )
                    {
                    // InternalBug348427TestLanguage.g:265:3: ( (lv_element2_9_0= ruleScenario2_6 ) )
                    // InternalBug348427TestLanguage.g:266:4: (lv_element2_9_0= ruleScenario2_6 )
                    {
                    // InternalBug348427TestLanguage.g:266:4: (lv_element2_9_0= ruleScenario2_6 )
                    // InternalBug348427TestLanguage.g:267:5: lv_element2_9_0= ruleScenario2_6
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_6ParserRuleCall_9_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_9_0=ruleScenario2_6();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_9_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_6");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalBug348427TestLanguage.g:285:3: ( (lv_element2_10_0= ruleScenario2_7 ) )
                    {
                    // InternalBug348427TestLanguage.g:285:3: ( (lv_element2_10_0= ruleScenario2_7 ) )
                    // InternalBug348427TestLanguage.g:286:4: (lv_element2_10_0= ruleScenario2_7 )
                    {
                    // InternalBug348427TestLanguage.g:286:4: (lv_element2_10_0= ruleScenario2_7 )
                    // InternalBug348427TestLanguage.g:287:5: lv_element2_10_0= ruleScenario2_7
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_7ParserRuleCall_10_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_10_0=ruleScenario2_7();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_10_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_7");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalBug348427TestLanguage.g:305:3: ( (lv_element2_11_0= ruleScenario2_8 ) )
                    {
                    // InternalBug348427TestLanguage.g:305:3: ( (lv_element2_11_0= ruleScenario2_8 ) )
                    // InternalBug348427TestLanguage.g:306:4: (lv_element2_11_0= ruleScenario2_8 )
                    {
                    // InternalBug348427TestLanguage.g:306:4: (lv_element2_11_0= ruleScenario2_8 )
                    // InternalBug348427TestLanguage.g:307:5: lv_element2_11_0= ruleScenario2_8
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_8ParserRuleCall_11_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_11_0=ruleScenario2_8();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_11_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_8");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleScenario1_1"
    // InternalBug348427TestLanguage.g:328:1: entryRuleScenario1_1 returns [EObject current=null] : iv_ruleScenario1_1= ruleScenario1_1 EOF ;
    public final EObject entryRuleScenario1_1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario1_1 = null;


        try {
            // InternalBug348427TestLanguage.g:328:52: (iv_ruleScenario1_1= ruleScenario1_1 EOF )
            // InternalBug348427TestLanguage.g:329:2: iv_ruleScenario1_1= ruleScenario1_1 EOF
            {
             newCompositeNode(grammarAccess.getScenario1_1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario1_1=ruleScenario1_1();

            state._fsp--;

             current =iv_ruleScenario1_1; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario1_1"


    // $ANTLR start "ruleScenario1_1"
    // InternalBug348427TestLanguage.g:335:1: ruleScenario1_1 returns [EObject current=null] : (otherlv_0= '1.1' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) ) otherlv_4= 'next' ) ;
    public final EObject ruleScenario1_1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_child_1_0 = null;

        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:341:2: ( (otherlv_0= '1.1' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) ) otherlv_4= 'next' ) )
            // InternalBug348427TestLanguage.g:342:2: (otherlv_0= '1.1' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) ) otherlv_4= 'next' )
            {
            // InternalBug348427TestLanguage.g:342:2: (otherlv_0= '1.1' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) ) otherlv_4= 'next' )
            // InternalBug348427TestLanguage.g:343:3: otherlv_0= '1.1' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) ) otherlv_4= 'next'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario1_1Access().getDigitOneFullStopDigitOneKeyword_0());
            		
            // InternalBug348427TestLanguage.g:347:3: ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalBug348427TestLanguage.g:348:4: ( (lv_child_1_0= ruleChild1_1 ) )
                    {
                    // InternalBug348427TestLanguage.g:348:4: ( (lv_child_1_0= ruleChild1_1 ) )
                    // InternalBug348427TestLanguage.g:349:5: (lv_child_1_0= ruleChild1_1 )
                    {
                    // InternalBug348427TestLanguage.g:349:5: (lv_child_1_0= ruleChild1_1 )
                    // InternalBug348427TestLanguage.g:350:6: lv_child_1_0= ruleChild1_1
                    {

                    						newCompositeNode(grammarAccess.getScenario1_1Access().getChildChild1_1ParserRuleCall_1_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_1_0=ruleChild1_1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario1_1Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_1_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:368:4: ( (lv_child_2_0= ruleChild1_2 ) )
                    {
                    // InternalBug348427TestLanguage.g:368:4: ( (lv_child_2_0= ruleChild1_2 ) )
                    // InternalBug348427TestLanguage.g:369:5: (lv_child_2_0= ruleChild1_2 )
                    {
                    // InternalBug348427TestLanguage.g:369:5: (lv_child_2_0= ruleChild1_2 )
                    // InternalBug348427TestLanguage.g:370:6: lv_child_2_0= ruleChild1_2
                    {

                    						newCompositeNode(grammarAccess.getScenario1_1Access().getChildChild1_2ParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_2_0=ruleChild1_2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario1_1Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:388:4: ( (lv_child_3_0= ruleChild1_3 ) )
                    {
                    // InternalBug348427TestLanguage.g:388:4: ( (lv_child_3_0= ruleChild1_3 ) )
                    // InternalBug348427TestLanguage.g:389:5: (lv_child_3_0= ruleChild1_3 )
                    {
                    // InternalBug348427TestLanguage.g:389:5: (lv_child_3_0= ruleChild1_3 )
                    // InternalBug348427TestLanguage.g:390:6: lv_child_3_0= ruleChild1_3
                    {

                    						newCompositeNode(grammarAccess.getScenario1_1Access().getChildChild1_3ParserRuleCall_1_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_3_0=ruleChild1_3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario1_1Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenario1_1Access().getNextKeyword_2());
            		

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
    // $ANTLR end "ruleScenario1_1"


    // $ANTLR start "entryRuleScenario1_2"
    // InternalBug348427TestLanguage.g:416:1: entryRuleScenario1_2 returns [EObject current=null] : iv_ruleScenario1_2= ruleScenario1_2 EOF ;
    public final EObject entryRuleScenario1_2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario1_2 = null;


        try {
            // InternalBug348427TestLanguage.g:416:52: (iv_ruleScenario1_2= ruleScenario1_2 EOF )
            // InternalBug348427TestLanguage.g:417:2: iv_ruleScenario1_2= ruleScenario1_2 EOF
            {
             newCompositeNode(grammarAccess.getScenario1_2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario1_2=ruleScenario1_2();

            state._fsp--;

             current =iv_ruleScenario1_2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario1_2"


    // $ANTLR start "ruleScenario1_2"
    // InternalBug348427TestLanguage.g:423:1: ruleScenario1_2 returns [EObject current=null] : (otherlv_0= '1.2' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+ otherlv_4= 'next' ) ;
    public final EObject ruleScenario1_2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_child_1_0 = null;

        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:429:2: ( (otherlv_0= '1.2' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+ otherlv_4= 'next' ) )
            // InternalBug348427TestLanguage.g:430:2: (otherlv_0= '1.2' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+ otherlv_4= 'next' )
            {
            // InternalBug348427TestLanguage.g:430:2: (otherlv_0= '1.2' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+ otherlv_4= 'next' )
            // InternalBug348427TestLanguage.g:431:3: otherlv_0= '1.2' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+ otherlv_4= 'next'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario1_2Access().getDigitOneFullStopDigitTwoKeyword_0());
            		
            // InternalBug348427TestLanguage.g:435:3: ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalBug348427TestLanguage.g:436:4: ( (lv_child_1_0= ruleChild1_1 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:436:4: ( (lv_child_1_0= ruleChild1_1 ) )
            	    // InternalBug348427TestLanguage.g:437:5: (lv_child_1_0= ruleChild1_1 )
            	    {
            	    // InternalBug348427TestLanguage.g:437:5: (lv_child_1_0= ruleChild1_1 )
            	    // InternalBug348427TestLanguage.g:438:6: lv_child_1_0= ruleChild1_1
            	    {

            	    						newCompositeNode(grammarAccess.getScenario1_2Access().getChildChild1_1ParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_1_0=ruleChild1_1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario1_2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_1_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug348427TestLanguage.g:456:4: ( (lv_child_2_0= ruleChild1_2 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:456:4: ( (lv_child_2_0= ruleChild1_2 ) )
            	    // InternalBug348427TestLanguage.g:457:5: (lv_child_2_0= ruleChild1_2 )
            	    {
            	    // InternalBug348427TestLanguage.g:457:5: (lv_child_2_0= ruleChild1_2 )
            	    // InternalBug348427TestLanguage.g:458:6: lv_child_2_0= ruleChild1_2
            	    {

            	    						newCompositeNode(grammarAccess.getScenario1_2Access().getChildChild1_2ParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_2_0=ruleChild1_2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario1_2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_2_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug348427TestLanguage.g:476:4: ( (lv_child_3_0= ruleChild1_3 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:476:4: ( (lv_child_3_0= ruleChild1_3 ) )
            	    // InternalBug348427TestLanguage.g:477:5: (lv_child_3_0= ruleChild1_3 )
            	    {
            	    // InternalBug348427TestLanguage.g:477:5: (lv_child_3_0= ruleChild1_3 )
            	    // InternalBug348427TestLanguage.g:478:6: lv_child_3_0= ruleChild1_3
            	    {

            	    						newCompositeNode(grammarAccess.getScenario1_2Access().getChildChild1_3ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_3_0=ruleChild1_3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario1_2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenario1_2Access().getNextKeyword_2());
            		

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
    // $ANTLR end "ruleScenario1_2"


    // $ANTLR start "entryRuleScenario1_3"
    // InternalBug348427TestLanguage.g:504:1: entryRuleScenario1_3 returns [EObject current=null] : iv_ruleScenario1_3= ruleScenario1_3 EOF ;
    public final EObject entryRuleScenario1_3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario1_3 = null;


        try {
            // InternalBug348427TestLanguage.g:504:52: (iv_ruleScenario1_3= ruleScenario1_3 EOF )
            // InternalBug348427TestLanguage.g:505:2: iv_ruleScenario1_3= ruleScenario1_3 EOF
            {
             newCompositeNode(grammarAccess.getScenario1_3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario1_3=ruleScenario1_3();

            state._fsp--;

             current =iv_ruleScenario1_3; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario1_3"


    // $ANTLR start "ruleScenario1_3"
    // InternalBug348427TestLanguage.g:511:1: ruleScenario1_3 returns [EObject current=null] : ( () otherlv_1= '1.3' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )* otherlv_5= 'next' ) ;
    public final EObject ruleScenario1_3() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;

        EObject lv_child_4_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:517:2: ( ( () otherlv_1= '1.3' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )* otherlv_5= 'next' ) )
            // InternalBug348427TestLanguage.g:518:2: ( () otherlv_1= '1.3' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )* otherlv_5= 'next' )
            {
            // InternalBug348427TestLanguage.g:518:2: ( () otherlv_1= '1.3' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )* otherlv_5= 'next' )
            // InternalBug348427TestLanguage.g:519:3: () otherlv_1= '1.3' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )* otherlv_5= 'next'
            {
            // InternalBug348427TestLanguage.g:519:3: ()
            // InternalBug348427TestLanguage.g:520:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenario1_3Access().getScenario1Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScenario1_3Access().getDigitOneFullStopDigitThreeKeyword_1());
            		
            // InternalBug348427TestLanguage.g:530:3: ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )*
            loop4:
            do {
                int alt4=4;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalBug348427TestLanguage.g:531:4: ( (lv_child_2_0= ruleChild1_1 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:531:4: ( (lv_child_2_0= ruleChild1_1 ) )
            	    // InternalBug348427TestLanguage.g:532:5: (lv_child_2_0= ruleChild1_1 )
            	    {
            	    // InternalBug348427TestLanguage.g:532:5: (lv_child_2_0= ruleChild1_1 )
            	    // InternalBug348427TestLanguage.g:533:6: lv_child_2_0= ruleChild1_1
            	    {

            	    						newCompositeNode(grammarAccess.getScenario1_3Access().getChildChild1_1ParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_2_0=ruleChild1_1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario1_3Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_2_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug348427TestLanguage.g:551:4: ( (lv_child_3_0= ruleChild1_2 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:551:4: ( (lv_child_3_0= ruleChild1_2 ) )
            	    // InternalBug348427TestLanguage.g:552:5: (lv_child_3_0= ruleChild1_2 )
            	    {
            	    // InternalBug348427TestLanguage.g:552:5: (lv_child_3_0= ruleChild1_2 )
            	    // InternalBug348427TestLanguage.g:553:6: lv_child_3_0= ruleChild1_2
            	    {

            	    						newCompositeNode(grammarAccess.getScenario1_3Access().getChildChild1_2ParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_3_0=ruleChild1_2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario1_3Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug348427TestLanguage.g:571:4: ( (lv_child_4_0= ruleChild1_3 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:571:4: ( (lv_child_4_0= ruleChild1_3 ) )
            	    // InternalBug348427TestLanguage.g:572:5: (lv_child_4_0= ruleChild1_3 )
            	    {
            	    // InternalBug348427TestLanguage.g:572:5: (lv_child_4_0= ruleChild1_3 )
            	    // InternalBug348427TestLanguage.g:573:6: lv_child_4_0= ruleChild1_3
            	    {

            	    						newCompositeNode(grammarAccess.getScenario1_3Access().getChildChild1_3ParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_4_0=ruleChild1_3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario1_3Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_4_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenario1_3Access().getNextKeyword_3());
            		

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
    // $ANTLR end "ruleScenario1_3"


    // $ANTLR start "entryRuleScenario1_4"
    // InternalBug348427TestLanguage.g:599:1: entryRuleScenario1_4 returns [EObject current=null] : iv_ruleScenario1_4= ruleScenario1_4 EOF ;
    public final EObject entryRuleScenario1_4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario1_4 = null;


        try {
            // InternalBug348427TestLanguage.g:599:52: (iv_ruleScenario1_4= ruleScenario1_4 EOF )
            // InternalBug348427TestLanguage.g:600:2: iv_ruleScenario1_4= ruleScenario1_4 EOF
            {
             newCompositeNode(grammarAccess.getScenario1_4Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario1_4=ruleScenario1_4();

            state._fsp--;

             current =iv_ruleScenario1_4; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario1_4"


    // $ANTLR start "ruleScenario1_4"
    // InternalBug348427TestLanguage.g:606:1: ruleScenario1_4 returns [EObject current=null] : ( () otherlv_1= '1.4' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )? otherlv_5= 'next' ) ;
    public final EObject ruleScenario1_4() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;

        EObject lv_child_4_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:612:2: ( ( () otherlv_1= '1.4' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )? otherlv_5= 'next' ) )
            // InternalBug348427TestLanguage.g:613:2: ( () otherlv_1= '1.4' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )? otherlv_5= 'next' )
            {
            // InternalBug348427TestLanguage.g:613:2: ( () otherlv_1= '1.4' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )? otherlv_5= 'next' )
            // InternalBug348427TestLanguage.g:614:3: () otherlv_1= '1.4' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )? otherlv_5= 'next'
            {
            // InternalBug348427TestLanguage.g:614:3: ()
            // InternalBug348427TestLanguage.g:615:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenario1_4Access().getScenario1Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScenario1_4Access().getDigitOneFullStopDigitFourKeyword_1());
            		
            // InternalBug348427TestLanguage.g:625:3: ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )?
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalBug348427TestLanguage.g:626:4: ( (lv_child_2_0= ruleChild1_1 ) )
                    {
                    // InternalBug348427TestLanguage.g:626:4: ( (lv_child_2_0= ruleChild1_1 ) )
                    // InternalBug348427TestLanguage.g:627:5: (lv_child_2_0= ruleChild1_1 )
                    {
                    // InternalBug348427TestLanguage.g:627:5: (lv_child_2_0= ruleChild1_1 )
                    // InternalBug348427TestLanguage.g:628:6: lv_child_2_0= ruleChild1_1
                    {

                    						newCompositeNode(grammarAccess.getScenario1_4Access().getChildChild1_1ParserRuleCall_2_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_2_0=ruleChild1_1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario1_4Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:646:4: ( (lv_child_3_0= ruleChild1_2 ) )
                    {
                    // InternalBug348427TestLanguage.g:646:4: ( (lv_child_3_0= ruleChild1_2 ) )
                    // InternalBug348427TestLanguage.g:647:5: (lv_child_3_0= ruleChild1_2 )
                    {
                    // InternalBug348427TestLanguage.g:647:5: (lv_child_3_0= ruleChild1_2 )
                    // InternalBug348427TestLanguage.g:648:6: lv_child_3_0= ruleChild1_2
                    {

                    						newCompositeNode(grammarAccess.getScenario1_4Access().getChildChild1_2ParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_3_0=ruleChild1_2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario1_4Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:666:4: ( (lv_child_4_0= ruleChild1_3 ) )
                    {
                    // InternalBug348427TestLanguage.g:666:4: ( (lv_child_4_0= ruleChild1_3 ) )
                    // InternalBug348427TestLanguage.g:667:5: (lv_child_4_0= ruleChild1_3 )
                    {
                    // InternalBug348427TestLanguage.g:667:5: (lv_child_4_0= ruleChild1_3 )
                    // InternalBug348427TestLanguage.g:668:6: lv_child_4_0= ruleChild1_3
                    {

                    						newCompositeNode(grammarAccess.getScenario1_4Access().getChildChild1_3ParserRuleCall_2_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_4_0=ruleChild1_3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario1_4Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_4_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenario1_4Access().getNextKeyword_3());
            		

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
    // $ANTLR end "ruleScenario1_4"


    // $ANTLR start "entryRuleChild1_1"
    // InternalBug348427TestLanguage.g:694:1: entryRuleChild1_1 returns [EObject current=null] : iv_ruleChild1_1= ruleChild1_1 EOF ;
    public final EObject entryRuleChild1_1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild1_1 = null;


        try {
            // InternalBug348427TestLanguage.g:694:49: (iv_ruleChild1_1= ruleChild1_1 EOF )
            // InternalBug348427TestLanguage.g:695:2: iv_ruleChild1_1= ruleChild1_1 EOF
            {
             newCompositeNode(grammarAccess.getChild1_1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild1_1=ruleChild1_1();

            state._fsp--;

             current =iv_ruleChild1_1; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild1_1"


    // $ANTLR start "ruleChild1_1"
    // InternalBug348427TestLanguage.g:701:1: ruleChild1_1 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child1' otherlv_6= 'end' ) ;
    public final EObject ruleChild1_1() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_enumType_4_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:707:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child1' otherlv_6= 'end' ) )
            // InternalBug348427TestLanguage.g:708:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child1' otherlv_6= 'end' )
            {
            // InternalBug348427TestLanguage.g:708:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child1' otherlv_6= 'end' )
            // InternalBug348427TestLanguage.g:709:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child1' otherlv_6= 'end'
            {
            // InternalBug348427TestLanguage.g:709:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:710:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:710:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:711:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild1_1Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild1_1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild1_1Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:731:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBug348427TestLanguage.g:732:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:732:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:733:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:733:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:734:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild1_1Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild1_1Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild1_1Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:751:3: ( (lv_enumType_4_0= ruleEnumType ) )
            // InternalBug348427TestLanguage.g:752:4: (lv_enumType_4_0= ruleEnumType )
            {
            // InternalBug348427TestLanguage.g:752:4: (lv_enumType_4_0= ruleEnumType )
            // InternalBug348427TestLanguage.g:753:5: lv_enumType_4_0= ruleEnumType
            {

            					newCompositeNode(grammarAccess.getChild1_1Access().getEnumTypeEnumTypeEnumRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_9);
            lv_enumType_4_0=ruleEnumType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChild1_1Rule());
            					}
            					set(
            						current,
            						"enumType",
            						lv_enumType_4_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.EnumType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChild1_1Access().getChild1Keyword_4());
            		
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChild1_1Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild1_1"


    // $ANTLR start "entryRuleChild1_2"
    // InternalBug348427TestLanguage.g:782:1: entryRuleChild1_2 returns [EObject current=null] : iv_ruleChild1_2= ruleChild1_2 EOF ;
    public final EObject entryRuleChild1_2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild1_2 = null;


        try {
            // InternalBug348427TestLanguage.g:782:49: (iv_ruleChild1_2= ruleChild1_2 EOF )
            // InternalBug348427TestLanguage.g:783:2: iv_ruleChild1_2= ruleChild1_2 EOF
            {
             newCompositeNode(grammarAccess.getChild1_2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild1_2=ruleChild1_2();

            state._fsp--;

             current =iv_ruleChild1_2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild1_2"


    // $ANTLR start "ruleChild1_2"
    // InternalBug348427TestLanguage.g:789:1: ruleChild1_2 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child2' otherlv_6= 'end' ) ;
    public final EObject ruleChild1_2() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_enumType_4_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:795:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child2' otherlv_6= 'end' ) )
            // InternalBug348427TestLanguage.g:796:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child2' otherlv_6= 'end' )
            {
            // InternalBug348427TestLanguage.g:796:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child2' otherlv_6= 'end' )
            // InternalBug348427TestLanguage.g:797:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child2' otherlv_6= 'end'
            {
            // InternalBug348427TestLanguage.g:797:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:798:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:798:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:799:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild1_2Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild1_2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild1_2Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:819:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBug348427TestLanguage.g:820:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:820:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:821:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:821:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:822:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild1_2Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild1_2Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild1_2Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:839:3: ( (lv_enumType_4_0= ruleEnumType ) )
            // InternalBug348427TestLanguage.g:840:4: (lv_enumType_4_0= ruleEnumType )
            {
            // InternalBug348427TestLanguage.g:840:4: (lv_enumType_4_0= ruleEnumType )
            // InternalBug348427TestLanguage.g:841:5: lv_enumType_4_0= ruleEnumType
            {

            					newCompositeNode(grammarAccess.getChild1_2Access().getEnumTypeEnumTypeEnumRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_11);
            lv_enumType_4_0=ruleEnumType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChild1_2Rule());
            					}
            					set(
            						current,
            						"enumType",
            						lv_enumType_4_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.EnumType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChild1_2Access().getChild2Keyword_4());
            		
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChild1_2Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild1_2"


    // $ANTLR start "entryRuleChild1_3"
    // InternalBug348427TestLanguage.g:870:1: entryRuleChild1_3 returns [EObject current=null] : iv_ruleChild1_3= ruleChild1_3 EOF ;
    public final EObject entryRuleChild1_3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild1_3 = null;


        try {
            // InternalBug348427TestLanguage.g:870:49: (iv_ruleChild1_3= ruleChild1_3 EOF )
            // InternalBug348427TestLanguage.g:871:2: iv_ruleChild1_3= ruleChild1_3 EOF
            {
             newCompositeNode(grammarAccess.getChild1_3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild1_3=ruleChild1_3();

            state._fsp--;

             current =iv_ruleChild1_3; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild1_3"


    // $ANTLR start "ruleChild1_3"
    // InternalBug348427TestLanguage.g:877:1: ruleChild1_3 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child3' otherlv_6= 'end' ) ;
    public final EObject ruleChild1_3() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_enumType_4_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:883:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child3' otherlv_6= 'end' ) )
            // InternalBug348427TestLanguage.g:884:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child3' otherlv_6= 'end' )
            {
            // InternalBug348427TestLanguage.g:884:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child3' otherlv_6= 'end' )
            // InternalBug348427TestLanguage.g:885:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child3' otherlv_6= 'end'
            {
            // InternalBug348427TestLanguage.g:885:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:886:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:886:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:887:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild1_3Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild1_3Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild1_3Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:907:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBug348427TestLanguage.g:908:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:908:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:909:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:909:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:910:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild1_3Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild1_3Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild1_3Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:927:3: ( (lv_enumType_4_0= ruleEnumType ) )
            // InternalBug348427TestLanguage.g:928:4: (lv_enumType_4_0= ruleEnumType )
            {
            // InternalBug348427TestLanguage.g:928:4: (lv_enumType_4_0= ruleEnumType )
            // InternalBug348427TestLanguage.g:929:5: lv_enumType_4_0= ruleEnumType
            {

            					newCompositeNode(grammarAccess.getChild1_3Access().getEnumTypeEnumTypeEnumRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_12);
            lv_enumType_4_0=ruleEnumType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChild1_3Rule());
            					}
            					set(
            						current,
            						"enumType",
            						lv_enumType_4_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.EnumType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChild1_3Access().getChild3Keyword_4());
            		
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChild1_3Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild1_3"


    // $ANTLR start "entryRuleScenario2_1"
    // InternalBug348427TestLanguage.g:958:1: entryRuleScenario2_1 returns [EObject current=null] : iv_ruleScenario2_1= ruleScenario2_1 EOF ;
    public final EObject entryRuleScenario2_1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_1 = null;


        try {
            // InternalBug348427TestLanguage.g:958:52: (iv_ruleScenario2_1= ruleScenario2_1 EOF )
            // InternalBug348427TestLanguage.g:959:2: iv_ruleScenario2_1= ruleScenario2_1 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_1=ruleScenario2_1();

            state._fsp--;

             current =iv_ruleScenario2_1; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_1"


    // $ANTLR start "ruleScenario2_1"
    // InternalBug348427TestLanguage.g:965:1: ruleScenario2_1 returns [EObject current=null] : (otherlv_0= '2.1' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) ) otherlv_4= 'next' ) ;
    public final EObject ruleScenario2_1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_child_1_0 = null;

        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:971:2: ( (otherlv_0= '2.1' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) ) otherlv_4= 'next' ) )
            // InternalBug348427TestLanguage.g:972:2: (otherlv_0= '2.1' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) ) otherlv_4= 'next' )
            {
            // InternalBug348427TestLanguage.g:972:2: (otherlv_0= '2.1' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) ) otherlv_4= 'next' )
            // InternalBug348427TestLanguage.g:973:3: otherlv_0= '2.1' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) ) otherlv_4= 'next'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario2_1Access().getDigitTwoFullStopDigitOneKeyword_0());
            		
            // InternalBug348427TestLanguage.g:977:3: ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalBug348427TestLanguage.g:978:4: ( (lv_child_1_0= ruleChild2_1 ) )
                    {
                    // InternalBug348427TestLanguage.g:978:4: ( (lv_child_1_0= ruleChild2_1 ) )
                    // InternalBug348427TestLanguage.g:979:5: (lv_child_1_0= ruleChild2_1 )
                    {
                    // InternalBug348427TestLanguage.g:979:5: (lv_child_1_0= ruleChild2_1 )
                    // InternalBug348427TestLanguage.g:980:6: lv_child_1_0= ruleChild2_1
                    {

                    						newCompositeNode(grammarAccess.getScenario2_1Access().getChildChild2_1ParserRuleCall_1_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_1_0=ruleChild2_1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_1Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_1_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:998:4: ( (lv_child_2_0= ruleChild2_2 ) )
                    {
                    // InternalBug348427TestLanguage.g:998:4: ( (lv_child_2_0= ruleChild2_2 ) )
                    // InternalBug348427TestLanguage.g:999:5: (lv_child_2_0= ruleChild2_2 )
                    {
                    // InternalBug348427TestLanguage.g:999:5: (lv_child_2_0= ruleChild2_2 )
                    // InternalBug348427TestLanguage.g:1000:6: lv_child_2_0= ruleChild2_2
                    {

                    						newCompositeNode(grammarAccess.getScenario2_1Access().getChildChild2_2ParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_2_0=ruleChild2_2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_1Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:1018:4: ( (lv_child_3_0= ruleChild2_3 ) )
                    {
                    // InternalBug348427TestLanguage.g:1018:4: ( (lv_child_3_0= ruleChild2_3 ) )
                    // InternalBug348427TestLanguage.g:1019:5: (lv_child_3_0= ruleChild2_3 )
                    {
                    // InternalBug348427TestLanguage.g:1019:5: (lv_child_3_0= ruleChild2_3 )
                    // InternalBug348427TestLanguage.g:1020:6: lv_child_3_0= ruleChild2_3
                    {

                    						newCompositeNode(grammarAccess.getScenario2_1Access().getChildChild2_3ParserRuleCall_1_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_3_0=ruleChild2_3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_1Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenario2_1Access().getNextKeyword_2());
            		

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
    // $ANTLR end "ruleScenario2_1"


    // $ANTLR start "entryRuleScenario2_2"
    // InternalBug348427TestLanguage.g:1046:1: entryRuleScenario2_2 returns [EObject current=null] : iv_ruleScenario2_2= ruleScenario2_2 EOF ;
    public final EObject entryRuleScenario2_2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_2 = null;


        try {
            // InternalBug348427TestLanguage.g:1046:52: (iv_ruleScenario2_2= ruleScenario2_2 EOF )
            // InternalBug348427TestLanguage.g:1047:2: iv_ruleScenario2_2= ruleScenario2_2 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_2=ruleScenario2_2();

            state._fsp--;

             current =iv_ruleScenario2_2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_2"


    // $ANTLR start "ruleScenario2_2"
    // InternalBug348427TestLanguage.g:1053:1: ruleScenario2_2 returns [EObject current=null] : (otherlv_0= '2.2' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+ otherlv_4= 'next' ) ;
    public final EObject ruleScenario2_2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_child_1_0 = null;

        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:1059:2: ( (otherlv_0= '2.2' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+ otherlv_4= 'next' ) )
            // InternalBug348427TestLanguage.g:1060:2: (otherlv_0= '2.2' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+ otherlv_4= 'next' )
            {
            // InternalBug348427TestLanguage.g:1060:2: (otherlv_0= '2.2' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+ otherlv_4= 'next' )
            // InternalBug348427TestLanguage.g:1061:3: otherlv_0= '2.2' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+ otherlv_4= 'next'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario2_2Access().getDigitTwoFullStopDigitTwoKeyword_0());
            		
            // InternalBug348427TestLanguage.g:1065:3: ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=4;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalBug348427TestLanguage.g:1066:4: ( (lv_child_1_0= ruleChild2_1 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1066:4: ( (lv_child_1_0= ruleChild2_1 ) )
            	    // InternalBug348427TestLanguage.g:1067:5: (lv_child_1_0= ruleChild2_1 )
            	    {
            	    // InternalBug348427TestLanguage.g:1067:5: (lv_child_1_0= ruleChild2_1 )
            	    // InternalBug348427TestLanguage.g:1068:6: lv_child_1_0= ruleChild2_1
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_2Access().getChildChild2_1ParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_1_0=ruleChild2_1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_1_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug348427TestLanguage.g:1086:4: ( (lv_child_2_0= ruleChild2_2 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1086:4: ( (lv_child_2_0= ruleChild2_2 ) )
            	    // InternalBug348427TestLanguage.g:1087:5: (lv_child_2_0= ruleChild2_2 )
            	    {
            	    // InternalBug348427TestLanguage.g:1087:5: (lv_child_2_0= ruleChild2_2 )
            	    // InternalBug348427TestLanguage.g:1088:6: lv_child_2_0= ruleChild2_2
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_2Access().getChildChild2_2ParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_2_0=ruleChild2_2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_2_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug348427TestLanguage.g:1106:4: ( (lv_child_3_0= ruleChild2_3 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1106:4: ( (lv_child_3_0= ruleChild2_3 ) )
            	    // InternalBug348427TestLanguage.g:1107:5: (lv_child_3_0= ruleChild2_3 )
            	    {
            	    // InternalBug348427TestLanguage.g:1107:5: (lv_child_3_0= ruleChild2_3 )
            	    // InternalBug348427TestLanguage.g:1108:6: lv_child_3_0= ruleChild2_3
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_2Access().getChildChild2_3ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_3_0=ruleChild2_3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenario2_2Access().getNextKeyword_2());
            		

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
    // $ANTLR end "ruleScenario2_2"


    // $ANTLR start "entryRuleScenario2_3"
    // InternalBug348427TestLanguage.g:1134:1: entryRuleScenario2_3 returns [EObject current=null] : iv_ruleScenario2_3= ruleScenario2_3 EOF ;
    public final EObject entryRuleScenario2_3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_3 = null;


        try {
            // InternalBug348427TestLanguage.g:1134:52: (iv_ruleScenario2_3= ruleScenario2_3 EOF )
            // InternalBug348427TestLanguage.g:1135:2: iv_ruleScenario2_3= ruleScenario2_3 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_3=ruleScenario2_3();

            state._fsp--;

             current =iv_ruleScenario2_3; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_3"


    // $ANTLR start "ruleScenario2_3"
    // InternalBug348427TestLanguage.g:1141:1: ruleScenario2_3 returns [EObject current=null] : (otherlv_0= '2.3' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) ) otherlv_4= 'next' ) ;
    public final EObject ruleScenario2_3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_child_1_0 = null;

        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:1147:2: ( (otherlv_0= '2.3' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) ) otherlv_4= 'next' ) )
            // InternalBug348427TestLanguage.g:1148:2: (otherlv_0= '2.3' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) ) otherlv_4= 'next' )
            {
            // InternalBug348427TestLanguage.g:1148:2: (otherlv_0= '2.3' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) ) otherlv_4= 'next' )
            // InternalBug348427TestLanguage.g:1149:3: otherlv_0= '2.3' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) ) otherlv_4= 'next'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario2_3Access().getDigitTwoFullStopDigitThreeKeyword_0());
            		
            // InternalBug348427TestLanguage.g:1153:3: ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1154:4: ( (lv_child_1_0= ruleChild2_4 ) )
                    {
                    // InternalBug348427TestLanguage.g:1154:4: ( (lv_child_1_0= ruleChild2_4 ) )
                    // InternalBug348427TestLanguage.g:1155:5: (lv_child_1_0= ruleChild2_4 )
                    {
                    // InternalBug348427TestLanguage.g:1155:5: (lv_child_1_0= ruleChild2_4 )
                    // InternalBug348427TestLanguage.g:1156:6: lv_child_1_0= ruleChild2_4
                    {

                    						newCompositeNode(grammarAccess.getScenario2_3Access().getChildChild2_4ParserRuleCall_1_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_1_0=ruleChild2_4();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_3Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_1_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_4");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1174:4: ( (lv_child_2_0= ruleChild2_5 ) )
                    {
                    // InternalBug348427TestLanguage.g:1174:4: ( (lv_child_2_0= ruleChild2_5 ) )
                    // InternalBug348427TestLanguage.g:1175:5: (lv_child_2_0= ruleChild2_5 )
                    {
                    // InternalBug348427TestLanguage.g:1175:5: (lv_child_2_0= ruleChild2_5 )
                    // InternalBug348427TestLanguage.g:1176:6: lv_child_2_0= ruleChild2_5
                    {

                    						newCompositeNode(grammarAccess.getScenario2_3Access().getChildChild2_5ParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_2_0=ruleChild2_5();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_3Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_5");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:1194:4: ( (lv_child_3_0= ruleChild2_6 ) )
                    {
                    // InternalBug348427TestLanguage.g:1194:4: ( (lv_child_3_0= ruleChild2_6 ) )
                    // InternalBug348427TestLanguage.g:1195:5: (lv_child_3_0= ruleChild2_6 )
                    {
                    // InternalBug348427TestLanguage.g:1195:5: (lv_child_3_0= ruleChild2_6 )
                    // InternalBug348427TestLanguage.g:1196:6: lv_child_3_0= ruleChild2_6
                    {

                    						newCompositeNode(grammarAccess.getScenario2_3Access().getChildChild2_6ParserRuleCall_1_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_3_0=ruleChild2_6();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_3Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_6");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenario2_3Access().getNextKeyword_2());
            		

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
    // $ANTLR end "ruleScenario2_3"


    // $ANTLR start "entryRuleScenario2_4"
    // InternalBug348427TestLanguage.g:1222:1: entryRuleScenario2_4 returns [EObject current=null] : iv_ruleScenario2_4= ruleScenario2_4 EOF ;
    public final EObject entryRuleScenario2_4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_4 = null;


        try {
            // InternalBug348427TestLanguage.g:1222:52: (iv_ruleScenario2_4= ruleScenario2_4 EOF )
            // InternalBug348427TestLanguage.g:1223:2: iv_ruleScenario2_4= ruleScenario2_4 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_4Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_4=ruleScenario2_4();

            state._fsp--;

             current =iv_ruleScenario2_4; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_4"


    // $ANTLR start "ruleScenario2_4"
    // InternalBug348427TestLanguage.g:1229:1: ruleScenario2_4 returns [EObject current=null] : (otherlv_0= '2.4' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+ otherlv_4= 'next' ) ;
    public final EObject ruleScenario2_4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_child_1_0 = null;

        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:1235:2: ( (otherlv_0= '2.4' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+ otherlv_4= 'next' ) )
            // InternalBug348427TestLanguage.g:1236:2: (otherlv_0= '2.4' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+ otherlv_4= 'next' )
            {
            // InternalBug348427TestLanguage.g:1236:2: (otherlv_0= '2.4' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+ otherlv_4= 'next' )
            // InternalBug348427TestLanguage.g:1237:3: otherlv_0= '2.4' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+ otherlv_4= 'next'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario2_4Access().getDigitTwoFullStopDigitFourKeyword_0());
            		
            // InternalBug348427TestLanguage.g:1241:3: ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=4;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // InternalBug348427TestLanguage.g:1242:4: ( (lv_child_1_0= ruleChild2_4 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1242:4: ( (lv_child_1_0= ruleChild2_4 ) )
            	    // InternalBug348427TestLanguage.g:1243:5: (lv_child_1_0= ruleChild2_4 )
            	    {
            	    // InternalBug348427TestLanguage.g:1243:5: (lv_child_1_0= ruleChild2_4 )
            	    // InternalBug348427TestLanguage.g:1244:6: lv_child_1_0= ruleChild2_4
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_4Access().getChildChild2_4ParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_1_0=ruleChild2_4();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_4Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_1_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_4");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug348427TestLanguage.g:1262:4: ( (lv_child_2_0= ruleChild2_5 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1262:4: ( (lv_child_2_0= ruleChild2_5 ) )
            	    // InternalBug348427TestLanguage.g:1263:5: (lv_child_2_0= ruleChild2_5 )
            	    {
            	    // InternalBug348427TestLanguage.g:1263:5: (lv_child_2_0= ruleChild2_5 )
            	    // InternalBug348427TestLanguage.g:1264:6: lv_child_2_0= ruleChild2_5
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_4Access().getChildChild2_5ParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_2_0=ruleChild2_5();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_4Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_2_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_5");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug348427TestLanguage.g:1282:4: ( (lv_child_3_0= ruleChild2_6 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1282:4: ( (lv_child_3_0= ruleChild2_6 ) )
            	    // InternalBug348427TestLanguage.g:1283:5: (lv_child_3_0= ruleChild2_6 )
            	    {
            	    // InternalBug348427TestLanguage.g:1283:5: (lv_child_3_0= ruleChild2_6 )
            	    // InternalBug348427TestLanguage.g:1284:6: lv_child_3_0= ruleChild2_6
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_4Access().getChildChild2_6ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_3_0=ruleChild2_6();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_4Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_6");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenario2_4Access().getNextKeyword_2());
            		

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
    // $ANTLR end "ruleScenario2_4"


    // $ANTLR start "entryRuleScenario2_5"
    // InternalBug348427TestLanguage.g:1310:1: entryRuleScenario2_5 returns [EObject current=null] : iv_ruleScenario2_5= ruleScenario2_5 EOF ;
    public final EObject entryRuleScenario2_5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_5 = null;


        try {
            // InternalBug348427TestLanguage.g:1310:52: (iv_ruleScenario2_5= ruleScenario2_5 EOF )
            // InternalBug348427TestLanguage.g:1311:2: iv_ruleScenario2_5= ruleScenario2_5 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_5Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_5=ruleScenario2_5();

            state._fsp--;

             current =iv_ruleScenario2_5; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_5"


    // $ANTLR start "ruleScenario2_5"
    // InternalBug348427TestLanguage.g:1317:1: ruleScenario2_5 returns [EObject current=null] : ( () otherlv_1= '2.5' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )? otherlv_5= 'next' ) ;
    public final EObject ruleScenario2_5() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;

        EObject lv_child_4_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:1323:2: ( ( () otherlv_1= '2.5' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )? otherlv_5= 'next' ) )
            // InternalBug348427TestLanguage.g:1324:2: ( () otherlv_1= '2.5' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )? otherlv_5= 'next' )
            {
            // InternalBug348427TestLanguage.g:1324:2: ( () otherlv_1= '2.5' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )? otherlv_5= 'next' )
            // InternalBug348427TestLanguage.g:1325:3: () otherlv_1= '2.5' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )? otherlv_5= 'next'
            {
            // InternalBug348427TestLanguage.g:1325:3: ()
            // InternalBug348427TestLanguage.g:1326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenario2_5Access().getScenario2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScenario2_5Access().getDigitTwoFullStopDigitFiveKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1336:3: ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )?
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1337:4: ( (lv_child_2_0= ruleChild2_1 ) )
                    {
                    // InternalBug348427TestLanguage.g:1337:4: ( (lv_child_2_0= ruleChild2_1 ) )
                    // InternalBug348427TestLanguage.g:1338:5: (lv_child_2_0= ruleChild2_1 )
                    {
                    // InternalBug348427TestLanguage.g:1338:5: (lv_child_2_0= ruleChild2_1 )
                    // InternalBug348427TestLanguage.g:1339:6: lv_child_2_0= ruleChild2_1
                    {

                    						newCompositeNode(grammarAccess.getScenario2_5Access().getChildChild2_1ParserRuleCall_2_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_2_0=ruleChild2_1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_5Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1357:4: ( (lv_child_3_0= ruleChild2_2 ) )
                    {
                    // InternalBug348427TestLanguage.g:1357:4: ( (lv_child_3_0= ruleChild2_2 ) )
                    // InternalBug348427TestLanguage.g:1358:5: (lv_child_3_0= ruleChild2_2 )
                    {
                    // InternalBug348427TestLanguage.g:1358:5: (lv_child_3_0= ruleChild2_2 )
                    // InternalBug348427TestLanguage.g:1359:6: lv_child_3_0= ruleChild2_2
                    {

                    						newCompositeNode(grammarAccess.getScenario2_5Access().getChildChild2_2ParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_3_0=ruleChild2_2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_5Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:1377:4: ( (lv_child_4_0= ruleChild2_3 ) )
                    {
                    // InternalBug348427TestLanguage.g:1377:4: ( (lv_child_4_0= ruleChild2_3 ) )
                    // InternalBug348427TestLanguage.g:1378:5: (lv_child_4_0= ruleChild2_3 )
                    {
                    // InternalBug348427TestLanguage.g:1378:5: (lv_child_4_0= ruleChild2_3 )
                    // InternalBug348427TestLanguage.g:1379:6: lv_child_4_0= ruleChild2_3
                    {

                    						newCompositeNode(grammarAccess.getScenario2_5Access().getChildChild2_3ParserRuleCall_2_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_4_0=ruleChild2_3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_5Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_4_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenario2_5Access().getNextKeyword_3());
            		

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
    // $ANTLR end "ruleScenario2_5"


    // $ANTLR start "entryRuleScenario2_6"
    // InternalBug348427TestLanguage.g:1405:1: entryRuleScenario2_6 returns [EObject current=null] : iv_ruleScenario2_6= ruleScenario2_6 EOF ;
    public final EObject entryRuleScenario2_6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_6 = null;


        try {
            // InternalBug348427TestLanguage.g:1405:52: (iv_ruleScenario2_6= ruleScenario2_6 EOF )
            // InternalBug348427TestLanguage.g:1406:2: iv_ruleScenario2_6= ruleScenario2_6 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_6Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_6=ruleScenario2_6();

            state._fsp--;

             current =iv_ruleScenario2_6; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_6"


    // $ANTLR start "ruleScenario2_6"
    // InternalBug348427TestLanguage.g:1412:1: ruleScenario2_6 returns [EObject current=null] : ( () otherlv_1= '2.6' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )* otherlv_5= 'next' ) ;
    public final EObject ruleScenario2_6() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;

        EObject lv_child_4_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:1418:2: ( ( () otherlv_1= '2.6' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )* otherlv_5= 'next' ) )
            // InternalBug348427TestLanguage.g:1419:2: ( () otherlv_1= '2.6' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )* otherlv_5= 'next' )
            {
            // InternalBug348427TestLanguage.g:1419:2: ( () otherlv_1= '2.6' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )* otherlv_5= 'next' )
            // InternalBug348427TestLanguage.g:1420:3: () otherlv_1= '2.6' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )* otherlv_5= 'next'
            {
            // InternalBug348427TestLanguage.g:1420:3: ()
            // InternalBug348427TestLanguage.g:1421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenario2_6Access().getScenario2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScenario2_6Access().getDigitTwoFullStopDigitSixKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1431:3: ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )*
            loop14:
            do {
                int alt14=4;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalBug348427TestLanguage.g:1432:4: ( (lv_child_2_0= ruleChild2_1 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1432:4: ( (lv_child_2_0= ruleChild2_1 ) )
            	    // InternalBug348427TestLanguage.g:1433:5: (lv_child_2_0= ruleChild2_1 )
            	    {
            	    // InternalBug348427TestLanguage.g:1433:5: (lv_child_2_0= ruleChild2_1 )
            	    // InternalBug348427TestLanguage.g:1434:6: lv_child_2_0= ruleChild2_1
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_6Access().getChildChild2_1ParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_2_0=ruleChild2_1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_6Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_2_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug348427TestLanguage.g:1452:4: ( (lv_child_3_0= ruleChild2_2 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1452:4: ( (lv_child_3_0= ruleChild2_2 ) )
            	    // InternalBug348427TestLanguage.g:1453:5: (lv_child_3_0= ruleChild2_2 )
            	    {
            	    // InternalBug348427TestLanguage.g:1453:5: (lv_child_3_0= ruleChild2_2 )
            	    // InternalBug348427TestLanguage.g:1454:6: lv_child_3_0= ruleChild2_2
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_6Access().getChildChild2_2ParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_3_0=ruleChild2_2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_6Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug348427TestLanguage.g:1472:4: ( (lv_child_4_0= ruleChild2_3 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1472:4: ( (lv_child_4_0= ruleChild2_3 ) )
            	    // InternalBug348427TestLanguage.g:1473:5: (lv_child_4_0= ruleChild2_3 )
            	    {
            	    // InternalBug348427TestLanguage.g:1473:5: (lv_child_4_0= ruleChild2_3 )
            	    // InternalBug348427TestLanguage.g:1474:6: lv_child_4_0= ruleChild2_3
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_6Access().getChildChild2_3ParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_4_0=ruleChild2_3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_6Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_4_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenario2_6Access().getNextKeyword_3());
            		

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
    // $ANTLR end "ruleScenario2_6"


    // $ANTLR start "entryRuleScenario2_7"
    // InternalBug348427TestLanguage.g:1500:1: entryRuleScenario2_7 returns [EObject current=null] : iv_ruleScenario2_7= ruleScenario2_7 EOF ;
    public final EObject entryRuleScenario2_7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_7 = null;


        try {
            // InternalBug348427TestLanguage.g:1500:52: (iv_ruleScenario2_7= ruleScenario2_7 EOF )
            // InternalBug348427TestLanguage.g:1501:2: iv_ruleScenario2_7= ruleScenario2_7 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_7Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_7=ruleScenario2_7();

            state._fsp--;

             current =iv_ruleScenario2_7; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_7"


    // $ANTLR start "ruleScenario2_7"
    // InternalBug348427TestLanguage.g:1507:1: ruleScenario2_7 returns [EObject current=null] : ( () otherlv_1= '2.7' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )? otherlv_5= 'next' ) ;
    public final EObject ruleScenario2_7() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;

        EObject lv_child_4_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:1513:2: ( ( () otherlv_1= '2.7' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )? otherlv_5= 'next' ) )
            // InternalBug348427TestLanguage.g:1514:2: ( () otherlv_1= '2.7' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )? otherlv_5= 'next' )
            {
            // InternalBug348427TestLanguage.g:1514:2: ( () otherlv_1= '2.7' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )? otherlv_5= 'next' )
            // InternalBug348427TestLanguage.g:1515:3: () otherlv_1= '2.7' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )? otherlv_5= 'next'
            {
            // InternalBug348427TestLanguage.g:1515:3: ()
            // InternalBug348427TestLanguage.g:1516:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenario2_7Access().getScenario2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScenario2_7Access().getDigitTwoFullStopDigitSevenKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1526:3: ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )?
            int alt15=4;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1527:4: ( (lv_child_2_0= ruleChild2_4 ) )
                    {
                    // InternalBug348427TestLanguage.g:1527:4: ( (lv_child_2_0= ruleChild2_4 ) )
                    // InternalBug348427TestLanguage.g:1528:5: (lv_child_2_0= ruleChild2_4 )
                    {
                    // InternalBug348427TestLanguage.g:1528:5: (lv_child_2_0= ruleChild2_4 )
                    // InternalBug348427TestLanguage.g:1529:6: lv_child_2_0= ruleChild2_4
                    {

                    						newCompositeNode(grammarAccess.getScenario2_7Access().getChildChild2_4ParserRuleCall_2_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_2_0=ruleChild2_4();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_7Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_4");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1547:4: ( (lv_child_3_0= ruleChild2_5 ) )
                    {
                    // InternalBug348427TestLanguage.g:1547:4: ( (lv_child_3_0= ruleChild2_5 ) )
                    // InternalBug348427TestLanguage.g:1548:5: (lv_child_3_0= ruleChild2_5 )
                    {
                    // InternalBug348427TestLanguage.g:1548:5: (lv_child_3_0= ruleChild2_5 )
                    // InternalBug348427TestLanguage.g:1549:6: lv_child_3_0= ruleChild2_5
                    {

                    						newCompositeNode(grammarAccess.getScenario2_7Access().getChildChild2_5ParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_3_0=ruleChild2_5();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_7Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_5");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:1567:4: ( (lv_child_4_0= ruleChild2_6 ) )
                    {
                    // InternalBug348427TestLanguage.g:1567:4: ( (lv_child_4_0= ruleChild2_6 ) )
                    // InternalBug348427TestLanguage.g:1568:5: (lv_child_4_0= ruleChild2_6 )
                    {
                    // InternalBug348427TestLanguage.g:1568:5: (lv_child_4_0= ruleChild2_6 )
                    // InternalBug348427TestLanguage.g:1569:6: lv_child_4_0= ruleChild2_6
                    {

                    						newCompositeNode(grammarAccess.getScenario2_7Access().getChildChild2_6ParserRuleCall_2_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_4_0=ruleChild2_6();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_7Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_4_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_6");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenario2_7Access().getNextKeyword_3());
            		

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
    // $ANTLR end "ruleScenario2_7"


    // $ANTLR start "entryRuleScenario2_8"
    // InternalBug348427TestLanguage.g:1595:1: entryRuleScenario2_8 returns [EObject current=null] : iv_ruleScenario2_8= ruleScenario2_8 EOF ;
    public final EObject entryRuleScenario2_8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_8 = null;


        try {
            // InternalBug348427TestLanguage.g:1595:52: (iv_ruleScenario2_8= ruleScenario2_8 EOF )
            // InternalBug348427TestLanguage.g:1596:2: iv_ruleScenario2_8= ruleScenario2_8 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_8Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_8=ruleScenario2_8();

            state._fsp--;

             current =iv_ruleScenario2_8; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_8"


    // $ANTLR start "ruleScenario2_8"
    // InternalBug348427TestLanguage.g:1602:1: ruleScenario2_8 returns [EObject current=null] : ( () otherlv_1= '2.8' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )* otherlv_5= 'next' ) ;
    public final EObject ruleScenario2_8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;

        EObject lv_child_4_0 = null;



        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:1608:2: ( ( () otherlv_1= '2.8' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )* otherlv_5= 'next' ) )
            // InternalBug348427TestLanguage.g:1609:2: ( () otherlv_1= '2.8' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )* otherlv_5= 'next' )
            {
            // InternalBug348427TestLanguage.g:1609:2: ( () otherlv_1= '2.8' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )* otherlv_5= 'next' )
            // InternalBug348427TestLanguage.g:1610:3: () otherlv_1= '2.8' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )* otherlv_5= 'next'
            {
            // InternalBug348427TestLanguage.g:1610:3: ()
            // InternalBug348427TestLanguage.g:1611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenario2_8Access().getScenario2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScenario2_8Access().getDigitTwoFullStopDigitEightKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1621:3: ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )*
            loop16:
            do {
                int alt16=4;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalBug348427TestLanguage.g:1622:4: ( (lv_child_2_0= ruleChild2_4 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1622:4: ( (lv_child_2_0= ruleChild2_4 ) )
            	    // InternalBug348427TestLanguage.g:1623:5: (lv_child_2_0= ruleChild2_4 )
            	    {
            	    // InternalBug348427TestLanguage.g:1623:5: (lv_child_2_0= ruleChild2_4 )
            	    // InternalBug348427TestLanguage.g:1624:6: lv_child_2_0= ruleChild2_4
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_8Access().getChildChild2_4ParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_2_0=ruleChild2_4();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_8Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_2_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_4");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug348427TestLanguage.g:1642:4: ( (lv_child_3_0= ruleChild2_5 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1642:4: ( (lv_child_3_0= ruleChild2_5 ) )
            	    // InternalBug348427TestLanguage.g:1643:5: (lv_child_3_0= ruleChild2_5 )
            	    {
            	    // InternalBug348427TestLanguage.g:1643:5: (lv_child_3_0= ruleChild2_5 )
            	    // InternalBug348427TestLanguage.g:1644:6: lv_child_3_0= ruleChild2_5
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_8Access().getChildChild2_5ParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_3_0=ruleChild2_5();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_8Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_5");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug348427TestLanguage.g:1662:4: ( (lv_child_4_0= ruleChild2_6 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1662:4: ( (lv_child_4_0= ruleChild2_6 ) )
            	    // InternalBug348427TestLanguage.g:1663:5: (lv_child_4_0= ruleChild2_6 )
            	    {
            	    // InternalBug348427TestLanguage.g:1663:5: (lv_child_4_0= ruleChild2_6 )
            	    // InternalBug348427TestLanguage.g:1664:6: lv_child_4_0= ruleChild2_6
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_8Access().getChildChild2_6ParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_4_0=ruleChild2_6();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_8Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_4_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_6");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenario2_8Access().getNextKeyword_3());
            		

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
    // $ANTLR end "ruleScenario2_8"


    // $ANTLR start "entryRuleChild2_1"
    // InternalBug348427TestLanguage.g:1690:1: entryRuleChild2_1 returns [EObject current=null] : iv_ruleChild2_1= ruleChild2_1 EOF ;
    public final EObject entryRuleChild2_1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2_1 = null;


        try {
            // InternalBug348427TestLanguage.g:1690:49: (iv_ruleChild2_1= ruleChild2_1 EOF )
            // InternalBug348427TestLanguage.g:1691:2: iv_ruleChild2_1= ruleChild2_1 EOF
            {
             newCompositeNode(grammarAccess.getChild2_1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2_1=ruleChild2_1();

            state._fsp--;

             current =iv_ruleChild2_1; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild2_1"


    // $ANTLR start "ruleChild2_1"
    // InternalBug348427TestLanguage.g:1697:1: ruleChild2_1 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child1' otherlv_6= 'end' ) ;
    public final EObject ruleChild2_1() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token lv_string_4_1=null;
        Token lv_string_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:1703:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child1' otherlv_6= 'end' ) )
            // InternalBug348427TestLanguage.g:1704:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child1' otherlv_6= 'end' )
            {
            // InternalBug348427TestLanguage.g:1704:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child1' otherlv_6= 'end' )
            // InternalBug348427TestLanguage.g:1705:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child1' otherlv_6= 'end'
            {
            // InternalBug348427TestLanguage.g:1705:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:1706:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:1706:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:1707:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild2_1Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild2_1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild2_1Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1727:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1728:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:1728:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:1729:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:1729:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:1730:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild2_1Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_1Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild2_1Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:1747:3: ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) )
            // InternalBug348427TestLanguage.g:1748:4: ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) )
            {
            // InternalBug348427TestLanguage.g:1748:4: ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) )
            // InternalBug348427TestLanguage.g:1749:5: (lv_string_4_1= 'a' | lv_string_4_2= 'b' )
            {
            // InternalBug348427TestLanguage.g:1749:5: (lv_string_4_1= 'a' | lv_string_4_2= 'b' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1750:6: lv_string_4_1= 'a'
                    {
                    lv_string_4_1=(Token)match(input,31,FollowSets000.FOLLOW_9); 

                    						newLeafNode(lv_string_4_1, grammarAccess.getChild2_1Access().getStringAKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_1Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1761:6: lv_string_4_2= 'b'
                    {
                    lv_string_4_2=(Token)match(input,32,FollowSets000.FOLLOW_9); 

                    						newLeafNode(lv_string_4_2, grammarAccess.getChild2_1Access().getStringBKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_1Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChild2_1Access().getChild1Keyword_4());
            		
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChild2_1Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild2_1"


    // $ANTLR start "entryRuleChild2_2"
    // InternalBug348427TestLanguage.g:1786:1: entryRuleChild2_2 returns [EObject current=null] : iv_ruleChild2_2= ruleChild2_2 EOF ;
    public final EObject entryRuleChild2_2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2_2 = null;


        try {
            // InternalBug348427TestLanguage.g:1786:49: (iv_ruleChild2_2= ruleChild2_2 EOF )
            // InternalBug348427TestLanguage.g:1787:2: iv_ruleChild2_2= ruleChild2_2 EOF
            {
             newCompositeNode(grammarAccess.getChild2_2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2_2=ruleChild2_2();

            state._fsp--;

             current =iv_ruleChild2_2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild2_2"


    // $ANTLR start "ruleChild2_2"
    // InternalBug348427TestLanguage.g:1793:1: ruleChild2_2 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child2' otherlv_6= 'end' ) ;
    public final EObject ruleChild2_2() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token lv_string_4_1=null;
        Token lv_string_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:1799:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child2' otherlv_6= 'end' ) )
            // InternalBug348427TestLanguage.g:1800:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child2' otherlv_6= 'end' )
            {
            // InternalBug348427TestLanguage.g:1800:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child2' otherlv_6= 'end' )
            // InternalBug348427TestLanguage.g:1801:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child2' otherlv_6= 'end'
            {
            // InternalBug348427TestLanguage.g:1801:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:1802:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:1802:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:1803:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild2_2Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild2_2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild2_2Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1823:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1824:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:1824:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:1825:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:1825:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:1826:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild2_2Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_2Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild2_2Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:1843:3: ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) )
            // InternalBug348427TestLanguage.g:1844:4: ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) )
            {
            // InternalBug348427TestLanguage.g:1844:4: ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) )
            // InternalBug348427TestLanguage.g:1845:5: (lv_string_4_1= 'a' | lv_string_4_2= 'b' )
            {
            // InternalBug348427TestLanguage.g:1845:5: (lv_string_4_1= 'a' | lv_string_4_2= 'b' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            else if ( (LA20_0==32) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1846:6: lv_string_4_1= 'a'
                    {
                    lv_string_4_1=(Token)match(input,31,FollowSets000.FOLLOW_11); 

                    						newLeafNode(lv_string_4_1, grammarAccess.getChild2_2Access().getStringAKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_2Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1857:6: lv_string_4_2= 'b'
                    {
                    lv_string_4_2=(Token)match(input,32,FollowSets000.FOLLOW_11); 

                    						newLeafNode(lv_string_4_2, grammarAccess.getChild2_2Access().getStringBKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_2Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChild2_2Access().getChild2Keyword_4());
            		
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChild2_2Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild2_2"


    // $ANTLR start "entryRuleChild2_3"
    // InternalBug348427TestLanguage.g:1882:1: entryRuleChild2_3 returns [EObject current=null] : iv_ruleChild2_3= ruleChild2_3 EOF ;
    public final EObject entryRuleChild2_3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2_3 = null;


        try {
            // InternalBug348427TestLanguage.g:1882:49: (iv_ruleChild2_3= ruleChild2_3 EOF )
            // InternalBug348427TestLanguage.g:1883:2: iv_ruleChild2_3= ruleChild2_3 EOF
            {
             newCompositeNode(grammarAccess.getChild2_3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2_3=ruleChild2_3();

            state._fsp--;

             current =iv_ruleChild2_3; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild2_3"


    // $ANTLR start "ruleChild2_3"
    // InternalBug348427TestLanguage.g:1889:1: ruleChild2_3 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child3' otherlv_6= 'end' ) ;
    public final EObject ruleChild2_3() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token lv_string_4_1=null;
        Token lv_string_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:1895:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child3' otherlv_6= 'end' ) )
            // InternalBug348427TestLanguage.g:1896:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child3' otherlv_6= 'end' )
            {
            // InternalBug348427TestLanguage.g:1896:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child3' otherlv_6= 'end' )
            // InternalBug348427TestLanguage.g:1897:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child3' otherlv_6= 'end'
            {
            // InternalBug348427TestLanguage.g:1897:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:1898:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:1898:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:1899:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild2_3Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild2_3Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild2_3Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1919:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1920:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:1920:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:1921:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:1921:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:1922:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild2_3Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_3Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild2_3Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:1939:3: ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) )
            // InternalBug348427TestLanguage.g:1940:4: ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) )
            {
            // InternalBug348427TestLanguage.g:1940:4: ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) )
            // InternalBug348427TestLanguage.g:1941:5: (lv_string_4_1= 'a' | lv_string_4_2= 'b' )
            {
            // InternalBug348427TestLanguage.g:1941:5: (lv_string_4_1= 'a' | lv_string_4_2= 'b' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            else if ( (LA22_0==32) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1942:6: lv_string_4_1= 'a'
                    {
                    lv_string_4_1=(Token)match(input,31,FollowSets000.FOLLOW_12); 

                    						newLeafNode(lv_string_4_1, grammarAccess.getChild2_3Access().getStringAKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_3Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1953:6: lv_string_4_2= 'b'
                    {
                    lv_string_4_2=(Token)match(input,32,FollowSets000.FOLLOW_12); 

                    						newLeafNode(lv_string_4_2, grammarAccess.getChild2_3Access().getStringBKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_3Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChild2_3Access().getChild3Keyword_4());
            		
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChild2_3Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild2_3"


    // $ANTLR start "entryRuleChild2_4"
    // InternalBug348427TestLanguage.g:1978:1: entryRuleChild2_4 returns [EObject current=null] : iv_ruleChild2_4= ruleChild2_4 EOF ;
    public final EObject entryRuleChild2_4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2_4 = null;


        try {
            // InternalBug348427TestLanguage.g:1978:49: (iv_ruleChild2_4= ruleChild2_4 EOF )
            // InternalBug348427TestLanguage.g:1979:2: iv_ruleChild2_4= ruleChild2_4 EOF
            {
             newCompositeNode(grammarAccess.getChild2_4Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2_4=ruleChild2_4();

            state._fsp--;

             current =iv_ruleChild2_4; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild2_4"


    // $ANTLR start "ruleChild2_4"
    // InternalBug348427TestLanguage.g:1985:1: ruleChild2_4 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child1' otherlv_7= 'end' ) ;
    public final EObject ruleChild2_4() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token lv_string_4_0=null;
        Token lv_string_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:1991:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child1' otherlv_7= 'end' ) )
            // InternalBug348427TestLanguage.g:1992:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child1' otherlv_7= 'end' )
            {
            // InternalBug348427TestLanguage.g:1992:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child1' otherlv_7= 'end' )
            // InternalBug348427TestLanguage.g:1993:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child1' otherlv_7= 'end'
            {
            // InternalBug348427TestLanguage.g:1993:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:1994:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:1994:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:1995:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild2_4Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild2_4Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild2_4Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:2015:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBug348427TestLanguage.g:2016:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:2016:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:2017:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:2017:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:2018:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild2_4Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_4Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild2_4Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:2035:3: ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            else if ( (LA24_0==32) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalBug348427TestLanguage.g:2036:4: ( (lv_string_4_0= 'a' ) )
                    {
                    // InternalBug348427TestLanguage.g:2036:4: ( (lv_string_4_0= 'a' ) )
                    // InternalBug348427TestLanguage.g:2037:5: (lv_string_4_0= 'a' )
                    {
                    // InternalBug348427TestLanguage.g:2037:5: (lv_string_4_0= 'a' )
                    // InternalBug348427TestLanguage.g:2038:6: lv_string_4_0= 'a'
                    {
                    lv_string_4_0=(Token)match(input,31,FollowSets000.FOLLOW_9); 

                    						newLeafNode(lv_string_4_0, grammarAccess.getChild2_4Access().getStringAKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_4Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_0, "a");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:2051:4: ( (lv_string_5_0= 'b' ) )
                    {
                    // InternalBug348427TestLanguage.g:2051:4: ( (lv_string_5_0= 'b' ) )
                    // InternalBug348427TestLanguage.g:2052:5: (lv_string_5_0= 'b' )
                    {
                    // InternalBug348427TestLanguage.g:2052:5: (lv_string_5_0= 'b' )
                    // InternalBug348427TestLanguage.g:2053:6: lv_string_5_0= 'b'
                    {
                    lv_string_5_0=(Token)match(input,32,FollowSets000.FOLLOW_9); 

                    						newLeafNode(lv_string_5_0, grammarAccess.getChild2_4Access().getStringBKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_4Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_5_0, "b");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getChild2_4Access().getChild1Keyword_4());
            		
            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getChild2_4Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild2_4"


    // $ANTLR start "entryRuleChild2_5"
    // InternalBug348427TestLanguage.g:2078:1: entryRuleChild2_5 returns [EObject current=null] : iv_ruleChild2_5= ruleChild2_5 EOF ;
    public final EObject entryRuleChild2_5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2_5 = null;


        try {
            // InternalBug348427TestLanguage.g:2078:49: (iv_ruleChild2_5= ruleChild2_5 EOF )
            // InternalBug348427TestLanguage.g:2079:2: iv_ruleChild2_5= ruleChild2_5 EOF
            {
             newCompositeNode(grammarAccess.getChild2_5Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2_5=ruleChild2_5();

            state._fsp--;

             current =iv_ruleChild2_5; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild2_5"


    // $ANTLR start "ruleChild2_5"
    // InternalBug348427TestLanguage.g:2085:1: ruleChild2_5 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child2' otherlv_7= 'end' ) ;
    public final EObject ruleChild2_5() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token lv_string_4_0=null;
        Token lv_string_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:2091:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child2' otherlv_7= 'end' ) )
            // InternalBug348427TestLanguage.g:2092:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child2' otherlv_7= 'end' )
            {
            // InternalBug348427TestLanguage.g:2092:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child2' otherlv_7= 'end' )
            // InternalBug348427TestLanguage.g:2093:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child2' otherlv_7= 'end'
            {
            // InternalBug348427TestLanguage.g:2093:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:2094:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:2094:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:2095:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild2_5Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild2_5Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild2_5Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:2115:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBug348427TestLanguage.g:2116:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:2116:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:2117:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:2117:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:2118:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild2_5Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_5Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild2_5Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:2135:3: ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            else if ( (LA26_0==32) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalBug348427TestLanguage.g:2136:4: ( (lv_string_4_0= 'a' ) )
                    {
                    // InternalBug348427TestLanguage.g:2136:4: ( (lv_string_4_0= 'a' ) )
                    // InternalBug348427TestLanguage.g:2137:5: (lv_string_4_0= 'a' )
                    {
                    // InternalBug348427TestLanguage.g:2137:5: (lv_string_4_0= 'a' )
                    // InternalBug348427TestLanguage.g:2138:6: lv_string_4_0= 'a'
                    {
                    lv_string_4_0=(Token)match(input,31,FollowSets000.FOLLOW_11); 

                    						newLeafNode(lv_string_4_0, grammarAccess.getChild2_5Access().getStringAKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_5Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_0, "a");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:2151:4: ( (lv_string_5_0= 'b' ) )
                    {
                    // InternalBug348427TestLanguage.g:2151:4: ( (lv_string_5_0= 'b' ) )
                    // InternalBug348427TestLanguage.g:2152:5: (lv_string_5_0= 'b' )
                    {
                    // InternalBug348427TestLanguage.g:2152:5: (lv_string_5_0= 'b' )
                    // InternalBug348427TestLanguage.g:2153:6: lv_string_5_0= 'b'
                    {
                    lv_string_5_0=(Token)match(input,32,FollowSets000.FOLLOW_11); 

                    						newLeafNode(lv_string_5_0, grammarAccess.getChild2_5Access().getStringBKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_5Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_5_0, "b");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getChild2_5Access().getChild2Keyword_4());
            		
            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getChild2_5Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild2_5"


    // $ANTLR start "entryRuleChild2_6"
    // InternalBug348427TestLanguage.g:2178:1: entryRuleChild2_6 returns [EObject current=null] : iv_ruleChild2_6= ruleChild2_6 EOF ;
    public final EObject entryRuleChild2_6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2_6 = null;


        try {
            // InternalBug348427TestLanguage.g:2178:49: (iv_ruleChild2_6= ruleChild2_6 EOF )
            // InternalBug348427TestLanguage.g:2179:2: iv_ruleChild2_6= ruleChild2_6 EOF
            {
             newCompositeNode(grammarAccess.getChild2_6Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2_6=ruleChild2_6();

            state._fsp--;

             current =iv_ruleChild2_6; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild2_6"


    // $ANTLR start "ruleChild2_6"
    // InternalBug348427TestLanguage.g:2185:1: ruleChild2_6 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child3' otherlv_7= 'end' ) ;
    public final EObject ruleChild2_6() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token lv_string_4_0=null;
        Token lv_string_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:2191:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child3' otherlv_7= 'end' ) )
            // InternalBug348427TestLanguage.g:2192:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child3' otherlv_7= 'end' )
            {
            // InternalBug348427TestLanguage.g:2192:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child3' otherlv_7= 'end' )
            // InternalBug348427TestLanguage.g:2193:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child3' otherlv_7= 'end'
            {
            // InternalBug348427TestLanguage.g:2193:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:2194:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:2194:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:2195:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild2_6Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild2_6Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild2_6Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:2215:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBug348427TestLanguage.g:2216:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:2216:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:2217:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:2217:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:2218:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild2_6Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_6Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild2_6Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:2235:3: ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            else if ( (LA28_0==32) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalBug348427TestLanguage.g:2236:4: ( (lv_string_4_0= 'a' ) )
                    {
                    // InternalBug348427TestLanguage.g:2236:4: ( (lv_string_4_0= 'a' ) )
                    // InternalBug348427TestLanguage.g:2237:5: (lv_string_4_0= 'a' )
                    {
                    // InternalBug348427TestLanguage.g:2237:5: (lv_string_4_0= 'a' )
                    // InternalBug348427TestLanguage.g:2238:6: lv_string_4_0= 'a'
                    {
                    lv_string_4_0=(Token)match(input,31,FollowSets000.FOLLOW_12); 

                    						newLeafNode(lv_string_4_0, grammarAccess.getChild2_6Access().getStringAKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_6Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_0, "a");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:2251:4: ( (lv_string_5_0= 'b' ) )
                    {
                    // InternalBug348427TestLanguage.g:2251:4: ( (lv_string_5_0= 'b' ) )
                    // InternalBug348427TestLanguage.g:2252:5: (lv_string_5_0= 'b' )
                    {
                    // InternalBug348427TestLanguage.g:2252:5: (lv_string_5_0= 'b' )
                    // InternalBug348427TestLanguage.g:2253:6: lv_string_5_0= 'b'
                    {
                    lv_string_5_0=(Token)match(input,32,FollowSets000.FOLLOW_12); 

                    						newLeafNode(lv_string_5_0, grammarAccess.getChild2_6Access().getStringBKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_6Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_5_0, "b");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getChild2_6Access().getChild3Keyword_4());
            		
            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getChild2_6Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild2_6"


    // $ANTLR start "ruleEnumType"
    // InternalBug348427TestLanguage.g:2278:1: ruleEnumType returns [Enumerator current=null] : ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) ) ;
    public final Enumerator ruleEnumType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBug348427TestLanguage.g:2284:2: ( ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) ) )
            // InternalBug348427TestLanguage.g:2285:2: ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) )
            {
            // InternalBug348427TestLanguage.g:2285:2: ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            else if ( (LA29_0==32) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalBug348427TestLanguage.g:2286:3: (enumLiteral_0= 'a' )
                    {
                    // InternalBug348427TestLanguage.g:2286:3: (enumLiteral_0= 'a' )
                    // InternalBug348427TestLanguage.g:2287:4: enumLiteral_0= 'a'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumTypeAccess().getAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:2294:3: (enumLiteral_1= 'b' )
                    {
                    // InternalBug348427TestLanguage.g:2294:3: (enumLiteral_1= 'b' )
                    // InternalBug348427TestLanguage.g:2295:4: enumLiteral_1= 'b'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumTypeAccess().getBEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEnumType"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\20\1\21\1\22\2\23\1\37\3\uffff";
    static final String dfa_3s = "\1\4\1\20\1\40\1\22\2\26\1\40\3\uffff";
    static final String dfa_4s = "\7\uffff\1\1\1\2\1\3";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3\15\uffff\1\4\1\5",
            "\1\6",
            "\1\7\1\uffff\1\10\1\11",
            "\1\7\1\uffff\1\10\1\11",
            "\1\4\1\5",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "347:3: ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\20\1\21\1\22\2\23\1\37\3\uffff";
    static final String dfa_9s = "\1\14\1\uffff\1\20\1\40\1\22\2\26\1\40\3\uffff";
    static final String dfa_10s = "\1\uffff\1\4\6\uffff\1\1\1\2\1\3";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\7\uffff\1\1",
            "",
            "\1\3",
            "\1\4\15\uffff\1\5\1\6",
            "\1\7",
            "\1\10\1\uffff\1\11\1\12",
            "\1\10\1\uffff\1\11\1\12",
            "\1\5\1\6",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 435:3: ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+";
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 530:3: ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )*";
        }
    }
    static final String dfa_13s = "\1\4\1\20\1\uffff\1\21\1\22\2\23\1\37\3\uffff";
    static final String dfa_14s = "\1\14\1\20\1\uffff\1\40\1\22\2\26\1\40\3\uffff";
    static final String dfa_15s = "\2\uffff\1\4\5\uffff\1\1\1\2\1\3";
    static final String[] dfa_16s = {
            "\1\1\7\uffff\1\2",
            "\1\3",
            "",
            "\1\4\15\uffff\1\5\1\6",
            "\1\7",
            "\1\10\1\uffff\1\11\1\12",
            "\1\10\1\uffff\1\11\1\12",
            "\1\5\1\6",
            "",
            "",
            ""
    };
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "625:3: ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )?";
        }
    }
    static final String dfa_17s = "\7\uffff\1\2\1\1\1\3";
    static final String[] dfa_18s = {
            "\1\1",
            "\1\2",
            "\1\3\15\uffff\1\4\1\5",
            "\1\6",
            "\1\10\1\uffff\1\7\1\11",
            "\1\10\1\uffff\1\7\1\11",
            "\1\4\1\5",
            "",
            "",
            ""
    };
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_17;
            this.special = dfa_5;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "977:3: ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )";
        }
    }
    static final String dfa_19s = "\1\uffff\1\4\6\uffff\1\2\1\1\1\3";
    static final String[] dfa_20s = {
            "\1\2\7\uffff\1\1",
            "",
            "\1\3",
            "\1\4\15\uffff\1\5\1\6",
            "\1\7",
            "\1\11\1\uffff\1\10\1\12",
            "\1\11\1\uffff\1\10\1\12",
            "\1\5\1\6",
            "",
            "",
            ""
    };
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_19;
            this.special = dfa_11;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()+ loopback of 1065:3: ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+";
        }
    }
    static final String dfa_21s = "\7\uffff\1\3\1\2\1\1";
    static final String[] dfa_22s = {
            "\1\1",
            "\1\2",
            "\1\3\15\uffff\1\4\1\5",
            "\1\6",
            "\1\11\1\uffff\1\10\1\7",
            "\1\11\1\uffff\1\10\1\7",
            "\1\4\1\5",
            "",
            "",
            ""
    };
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_21;
            this.special = dfa_5;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "1153:3: ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )";
        }
    }
    static final String dfa_23s = "\1\uffff\1\4\6\uffff\1\3\1\2\1\1";
    static final String[] dfa_24s = {
            "\1\2\7\uffff\1\1",
            "",
            "\1\3",
            "\1\4\15\uffff\1\5\1\6",
            "\1\7",
            "\1\12\1\uffff\1\11\1\10",
            "\1\12\1\uffff\1\11\1\10",
            "\1\5\1\6",
            "",
            "",
            ""
    };
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_23;
            this.special = dfa_11;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()+ loopback of 1241:3: ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+";
        }
    }
    static final String dfa_25s = "\2\uffff\1\4\5\uffff\1\2\1\1\1\3";
    static final String[] dfa_26s = {
            "\1\1\7\uffff\1\2",
            "\1\3",
            "",
            "\1\4\15\uffff\1\5\1\6",
            "\1\7",
            "\1\11\1\uffff\1\10\1\12",
            "\1\11\1\uffff\1\10\1\12",
            "\1\5\1\6",
            "",
            "",
            ""
    };
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_25;
            this.special = dfa_11;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "1336:3: ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )?";
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_23;
            this.special = dfa_11;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()* loopback of 1431:3: ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )*";
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_25;
            this.special = dfa_11;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "1526:3: ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )?";
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_23;
            this.special = dfa_11;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()* loopback of 1621:3: ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000180020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000180000000L});
    }


}