package org.eclipse.xtext.ui.tests.ide.contentassist.antlr.internal;

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
import org.eclipse.xtext.ui.tests.services.FoldingTestLanguageGrammarAccess;



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
public class InternalFoldingTestLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'element'", "'end'"
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
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFoldingTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFoldingTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFoldingTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFoldingTestLanguage.g"; }


    	private FoldingTestLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(FoldingTestLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleFoldingModel"
    // InternalFoldingTestLanguage.g:58:1: entryRuleFoldingModel : ruleFoldingModel EOF ;
    public final void entryRuleFoldingModel() throws RecognitionException {
        try {
            // InternalFoldingTestLanguage.g:59:1: ( ruleFoldingModel EOF )
            // InternalFoldingTestLanguage.g:60:1: ruleFoldingModel EOF
            {
             before(grammarAccess.getFoldingModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFoldingModel();

            state._fsp--;

             after(grammarAccess.getFoldingModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleFoldingModel"


    // $ANTLR start "ruleFoldingModel"
    // InternalFoldingTestLanguage.g:67:1: ruleFoldingModel : ( ( rule__FoldingModel__ElementsAssignment )* ) ;
    public final void ruleFoldingModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:71:2: ( ( ( rule__FoldingModel__ElementsAssignment )* ) )
            // InternalFoldingTestLanguage.g:72:2: ( ( rule__FoldingModel__ElementsAssignment )* )
            {
            // InternalFoldingTestLanguage.g:72:2: ( ( rule__FoldingModel__ElementsAssignment )* )
            // InternalFoldingTestLanguage.g:73:3: ( rule__FoldingModel__ElementsAssignment )*
            {
             before(grammarAccess.getFoldingModelAccess().getElementsAssignment()); 
            // InternalFoldingTestLanguage.g:74:3: ( rule__FoldingModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFoldingTestLanguage.g:74:4: rule__FoldingModel__ElementsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__FoldingModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getFoldingModelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleFoldingModel"


    // $ANTLR start "entryRuleElement"
    // InternalFoldingTestLanguage.g:83:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalFoldingTestLanguage.g:84:1: ( ruleElement EOF )
            // InternalFoldingTestLanguage.g:85:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalFoldingTestLanguage.g:92:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:96:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalFoldingTestLanguage.g:97:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalFoldingTestLanguage.g:97:2: ( ( rule__Element__Group__0 ) )
            // InternalFoldingTestLanguage.g:98:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalFoldingTestLanguage.g:99:3: ( rule__Element__Group__0 )
            // InternalFoldingTestLanguage.g:99:4: rule__Element__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "rule__Element__Group__0"
    // InternalFoldingTestLanguage.g:107:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:111:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalFoldingTestLanguage.g:112:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Group__1();

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
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // InternalFoldingTestLanguage.g:119:1: rule__Element__Group__0__Impl : ( 'element' ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:123:1: ( ( 'element' ) )
            // InternalFoldingTestLanguage.g:124:1: ( 'element' )
            {
            // InternalFoldingTestLanguage.g:124:1: ( 'element' )
            // InternalFoldingTestLanguage.g:125:2: 'element'
            {
             before(grammarAccess.getElementAccess().getElementKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getElementAccess().getElementKeyword_0()); 

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
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // InternalFoldingTestLanguage.g:134:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:138:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // InternalFoldingTestLanguage.g:139:2: rule__Element__Group__1__Impl rule__Element__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Element__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Group__2();

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
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // InternalFoldingTestLanguage.g:146:1: rule__Element__Group__1__Impl : ( ( rule__Element__NameAssignment_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:150:1: ( ( ( rule__Element__NameAssignment_1 ) ) )
            // InternalFoldingTestLanguage.g:151:1: ( ( rule__Element__NameAssignment_1 ) )
            {
            // InternalFoldingTestLanguage.g:151:1: ( ( rule__Element__NameAssignment_1 ) )
            // InternalFoldingTestLanguage.g:152:2: ( rule__Element__NameAssignment_1 )
            {
             before(grammarAccess.getElementAccess().getNameAssignment_1()); 
            // InternalFoldingTestLanguage.g:153:2: ( rule__Element__NameAssignment_1 )
            // InternalFoldingTestLanguage.g:153:3: rule__Element__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Element__Group__2"
    // InternalFoldingTestLanguage.g:161:1: rule__Element__Group__2 : rule__Element__Group__2__Impl rule__Element__Group__3 ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:165:1: ( rule__Element__Group__2__Impl rule__Element__Group__3 )
            // InternalFoldingTestLanguage.g:166:2: rule__Element__Group__2__Impl rule__Element__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Element__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Group__3();

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
    // $ANTLR end "rule__Element__Group__2"


    // $ANTLR start "rule__Element__Group__2__Impl"
    // InternalFoldingTestLanguage.g:173:1: rule__Element__Group__2__Impl : ( ( rule__Element__SubelementsAssignment_2 )* ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:177:1: ( ( ( rule__Element__SubelementsAssignment_2 )* ) )
            // InternalFoldingTestLanguage.g:178:1: ( ( rule__Element__SubelementsAssignment_2 )* )
            {
            // InternalFoldingTestLanguage.g:178:1: ( ( rule__Element__SubelementsAssignment_2 )* )
            // InternalFoldingTestLanguage.g:179:2: ( rule__Element__SubelementsAssignment_2 )*
            {
             before(grammarAccess.getElementAccess().getSubelementsAssignment_2()); 
            // InternalFoldingTestLanguage.g:180:2: ( rule__Element__SubelementsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFoldingTestLanguage.g:180:3: rule__Element__SubelementsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__Element__SubelementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getElementAccess().getSubelementsAssignment_2()); 

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
    // $ANTLR end "rule__Element__Group__2__Impl"


    // $ANTLR start "rule__Element__Group__3"
    // InternalFoldingTestLanguage.g:188:1: rule__Element__Group__3 : rule__Element__Group__3__Impl ;
    public final void rule__Element__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:192:1: ( rule__Element__Group__3__Impl )
            // InternalFoldingTestLanguage.g:193:2: rule__Element__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Group__3__Impl();

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
    // $ANTLR end "rule__Element__Group__3"


    // $ANTLR start "rule__Element__Group__3__Impl"
    // InternalFoldingTestLanguage.g:199:1: rule__Element__Group__3__Impl : ( 'end' ) ;
    public final void rule__Element__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:203:1: ( ( 'end' ) )
            // InternalFoldingTestLanguage.g:204:1: ( 'end' )
            {
            // InternalFoldingTestLanguage.g:204:1: ( 'end' )
            // InternalFoldingTestLanguage.g:205:2: 'end'
            {
             before(grammarAccess.getElementAccess().getEndKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getElementAccess().getEndKeyword_3()); 

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
    // $ANTLR end "rule__Element__Group__3__Impl"


    // $ANTLR start "rule__FoldingModel__ElementsAssignment"
    // InternalFoldingTestLanguage.g:215:1: rule__FoldingModel__ElementsAssignment : ( ruleElement ) ;
    public final void rule__FoldingModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:219:1: ( ( ruleElement ) )
            // InternalFoldingTestLanguage.g:220:2: ( ruleElement )
            {
            // InternalFoldingTestLanguage.g:220:2: ( ruleElement )
            // InternalFoldingTestLanguage.g:221:3: ruleElement
            {
             before(grammarAccess.getFoldingModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getFoldingModelAccess().getElementsElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__FoldingModel__ElementsAssignment"


    // $ANTLR start "rule__Element__NameAssignment_1"
    // InternalFoldingTestLanguage.g:230:1: rule__Element__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Element__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:234:1: ( ( RULE_ID ) )
            // InternalFoldingTestLanguage.g:235:2: ( RULE_ID )
            {
            // InternalFoldingTestLanguage.g:235:2: ( RULE_ID )
            // InternalFoldingTestLanguage.g:236:3: RULE_ID
            {
             before(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Element__NameAssignment_1"


    // $ANTLR start "rule__Element__SubelementsAssignment_2"
    // InternalFoldingTestLanguage.g:245:1: rule__Element__SubelementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Element__SubelementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFoldingTestLanguage.g:249:1: ( ( ruleElement ) )
            // InternalFoldingTestLanguage.g:250:2: ( ruleElement )
            {
            // InternalFoldingTestLanguage.g:250:2: ( ruleElement )
            // InternalFoldingTestLanguage.g:251:3: ruleElement
            {
             before(grammarAccess.getElementAccess().getSubelementsElementParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementAccess().getSubelementsElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Element__SubelementsAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    }


}