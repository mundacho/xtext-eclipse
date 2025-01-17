package org.eclipse.xtext.ui.tests.editor.outline.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.ui.tests.editor.outline.services.OutlineTestLanguageGrammarAccess;



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
public class InternalOutlineTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalOutlineTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOutlineTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOutlineTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOutlineTestLanguage.g"; }



     	private OutlineTestLanguageGrammarAccess grammarAccess;

        public InternalOutlineTestLanguageParser(TokenStream input, OutlineTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected OutlineTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalOutlineTestLanguage.g:69:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOutlineTestLanguage.g:69:46: (iv_ruleModel= ruleModel EOF )
            // InternalOutlineTestLanguage.g:70:2: iv_ruleModel= ruleModel EOF
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
    // InternalOutlineTestLanguage.g:76:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalOutlineTestLanguage.g:82:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalOutlineTestLanguage.g:83:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalOutlineTestLanguage.g:83:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOutlineTestLanguage.g:84:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalOutlineTestLanguage.g:84:3: (lv_elements_0_0= ruleElement )
            	    // InternalOutlineTestLanguage.g:85:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.eclipse.xtext.ui.tests.editor.outline.OutlineTestLanguage.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleElement"
    // InternalOutlineTestLanguage.g:105:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalOutlineTestLanguage.g:105:48: (iv_ruleElement= ruleElement EOF )
            // InternalOutlineTestLanguage.g:106:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalOutlineTestLanguage.g:112:1: ruleElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' )? otherlv_4= '{' ( (lv_children_5_0= ruleElement ) )* otherlv_6= '}' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalOutlineTestLanguage.g:118:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' )? otherlv_4= '{' ( (lv_children_5_0= ruleElement ) )* otherlv_6= '}' ) )
            // InternalOutlineTestLanguage.g:119:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' )? otherlv_4= '{' ( (lv_children_5_0= ruleElement ) )* otherlv_6= '}' )
            {
            // InternalOutlineTestLanguage.g:119:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' )? otherlv_4= '{' ( (lv_children_5_0= ruleElement ) )* otherlv_6= '}' )
            // InternalOutlineTestLanguage.g:120:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' )? otherlv_4= '{' ( (lv_children_5_0= ruleElement ) )* otherlv_6= '}'
            {
            // InternalOutlineTestLanguage.g:120:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOutlineTestLanguage.g:121:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOutlineTestLanguage.g:121:4: (lv_name_0_0= RULE_ID )
            // InternalOutlineTestLanguage.g:122:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOutlineTestLanguage.g:138:3: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOutlineTestLanguage.g:139:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getElementAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalOutlineTestLanguage.g:143:4: ( (otherlv_2= RULE_ID ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalOutlineTestLanguage.g:144:5: (otherlv_2= RULE_ID )
                    	    {
                    	    // InternalOutlineTestLanguage.g:144:5: (otherlv_2= RULE_ID )
                    	    // InternalOutlineTestLanguage.g:145:6: otherlv_2= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getElementRule());
                    	    						}
                    	    					
                    	    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getElementAccess().getXrefsElementCrossReference_1_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOutlineTestLanguage.g:165:3: ( (lv_children_5_0= ruleElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOutlineTestLanguage.g:166:4: (lv_children_5_0= ruleElement )
            	    {
            	    // InternalOutlineTestLanguage.g:166:4: (lv_children_5_0= ruleElement )
            	    // InternalOutlineTestLanguage.g:167:5: lv_children_5_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getElementAccess().getChildrenElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_children_5_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_5_0,
            	    						"org.eclipse.xtext.ui.tests.editor.outline.OutlineTestLanguage.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleElement"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002800L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    }


}