package org.eclipse.xtext.ui.codetemplates.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

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
import org.eclipse.xtext.ui.codetemplates.services.CodetemplatesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2015, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
@SuppressWarnings("all")
public class InternalCodetemplatesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Templates", "ReverseSolidusLessThanSignLessThanSign", "For", "DollarSignDollarSign", "DollarSignLeftCurlyBracket", "LessThanSignLessThanSign", "GreaterThanSignGreaterThanSign", "DollarSign", "LeftParenthesis", "RightParenthesis", "Comma", "FullStop", "Colon", "RightCurlyBracket", "RULE_ID", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int DollarSignDollarSign=7;
    public static final int DollarSignLeftCurlyBracket=8;
    public static final int Templates=4;
    public static final int RULE_STRING=19;
    public static final int Comma=14;
    public static final int LeftParenthesis=12;
    public static final int Colon=16;
    public static final int RightCurlyBracket=17;
    public static final int EOF=-1;
    public static final int FullStop=15;
    public static final int ReverseSolidusLessThanSignLessThanSign=5;
    public static final int RULE_ID=18;
    public static final int RULE_WS=20;
    public static final int For=6;
    public static final int RightParenthesis=13;
    public static final int RULE_ANY_OTHER=21;
    public static final int GreaterThanSignGreaterThanSign=10;
    public static final int DollarSign=11;
    public static final int LessThanSignLessThanSign=9;

    // delegates
    // delegators


        public InternalCodetemplatesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCodetemplatesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCodetemplatesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCodetemplatesParser.g"; }


    	private CodetemplatesGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("DollarSign", "'\\u0024'");
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("DollarSignDollarSign", "'\\u0024\\u0024'");
    		tokenNameToValue.put("DollarSignLeftCurlyBracket", "'\\u0024{'");
    		tokenNameToValue.put("LessThanSignLessThanSign", "'<<'");
    		tokenNameToValue.put("GreaterThanSignGreaterThanSign", "'>>'");
    		tokenNameToValue.put("ReverseSolidusLessThanSignLessThanSign", "'\\<<'");
    		tokenNameToValue.put("For", "'for'");
    		tokenNameToValue.put("Templates", "'templates'");
    	}

    	public void setGrammarAccess(CodetemplatesGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleCodetemplates"
    // InternalCodetemplatesParser.g:74:1: entryRuleCodetemplates : ruleCodetemplates EOF ;
    public final void entryRuleCodetemplates() throws RecognitionException {
        try {
            // InternalCodetemplatesParser.g:75:1: ( ruleCodetemplates EOF )
            // InternalCodetemplatesParser.g:76:1: ruleCodetemplates EOF
            {
             before(grammarAccess.getCodetemplatesRule()); 
            pushFollow(FOLLOW_1);
            ruleCodetemplates();

            state._fsp--;

             after(grammarAccess.getCodetemplatesRule()); 
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
    // $ANTLR end "entryRuleCodetemplates"


    // $ANTLR start "ruleCodetemplates"
    // InternalCodetemplatesParser.g:83:1: ruleCodetemplates : ( ( rule__Codetemplates__Group__0 ) ) ;
    public final void ruleCodetemplates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:87:2: ( ( ( rule__Codetemplates__Group__0 ) ) )
            // InternalCodetemplatesParser.g:88:2: ( ( rule__Codetemplates__Group__0 ) )
            {
            // InternalCodetemplatesParser.g:88:2: ( ( rule__Codetemplates__Group__0 ) )
            // InternalCodetemplatesParser.g:89:3: ( rule__Codetemplates__Group__0 )
            {
             before(grammarAccess.getCodetemplatesAccess().getGroup()); 
            // InternalCodetemplatesParser.g:90:3: ( rule__Codetemplates__Group__0 )
            // InternalCodetemplatesParser.g:90:4: rule__Codetemplates__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Codetemplates__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodetemplatesAccess().getGroup()); 

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
    // $ANTLR end "ruleCodetemplates"


    // $ANTLR start "entryRuleCodetemplate"
    // InternalCodetemplatesParser.g:99:1: entryRuleCodetemplate : ruleCodetemplate EOF ;
    public final void entryRuleCodetemplate() throws RecognitionException {
        try {
            // InternalCodetemplatesParser.g:100:1: ( ruleCodetemplate EOF )
            // InternalCodetemplatesParser.g:101:1: ruleCodetemplate EOF
            {
             before(grammarAccess.getCodetemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleCodetemplate();

            state._fsp--;

             after(grammarAccess.getCodetemplateRule()); 
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
    // $ANTLR end "entryRuleCodetemplate"


    // $ANTLR start "ruleCodetemplate"
    // InternalCodetemplatesParser.g:108:1: ruleCodetemplate : ( ( rule__Codetemplate__Group__0 ) ) ;
    public final void ruleCodetemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:112:2: ( ( ( rule__Codetemplate__Group__0 ) ) )
            // InternalCodetemplatesParser.g:113:2: ( ( rule__Codetemplate__Group__0 ) )
            {
            // InternalCodetemplatesParser.g:113:2: ( ( rule__Codetemplate__Group__0 ) )
            // InternalCodetemplatesParser.g:114:3: ( rule__Codetemplate__Group__0 )
            {
             before(grammarAccess.getCodetemplateAccess().getGroup()); 
            // InternalCodetemplatesParser.g:115:3: ( rule__Codetemplate__Group__0 )
            // InternalCodetemplatesParser.g:115:4: rule__Codetemplate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Codetemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodetemplateAccess().getGroup()); 

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
    // $ANTLR end "ruleCodetemplate"


    // $ANTLR start "entryRuleTemplateBodyWithQuotes"
    // InternalCodetemplatesParser.g:124:1: entryRuleTemplateBodyWithQuotes : ruleTemplateBodyWithQuotes EOF ;
    public final void entryRuleTemplateBodyWithQuotes() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCodetemplatesParser.g:128:1: ( ruleTemplateBodyWithQuotes EOF )
            // InternalCodetemplatesParser.g:129:1: ruleTemplateBodyWithQuotes EOF
            {
             before(grammarAccess.getTemplateBodyWithQuotesRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateBodyWithQuotes();

            state._fsp--;

             after(grammarAccess.getTemplateBodyWithQuotesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleTemplateBodyWithQuotes"


    // $ANTLR start "ruleTemplateBodyWithQuotes"
    // InternalCodetemplatesParser.g:139:1: ruleTemplateBodyWithQuotes : ( ( rule__TemplateBodyWithQuotes__Group__0 ) ) ;
    public final void ruleTemplateBodyWithQuotes() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:144:2: ( ( ( rule__TemplateBodyWithQuotes__Group__0 ) ) )
            // InternalCodetemplatesParser.g:145:2: ( ( rule__TemplateBodyWithQuotes__Group__0 ) )
            {
            // InternalCodetemplatesParser.g:145:2: ( ( rule__TemplateBodyWithQuotes__Group__0 ) )
            // InternalCodetemplatesParser.g:146:3: ( rule__TemplateBodyWithQuotes__Group__0 )
            {
             before(grammarAccess.getTemplateBodyWithQuotesAccess().getGroup()); 
            // InternalCodetemplatesParser.g:147:3: ( rule__TemplateBodyWithQuotes__Group__0 )
            // InternalCodetemplatesParser.g:147:4: rule__TemplateBodyWithQuotes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateBodyWithQuotes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateBodyWithQuotesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleTemplateBodyWithQuotes"


    // $ANTLR start "entryRuleTemplateBody"
    // InternalCodetemplatesParser.g:157:1: entryRuleTemplateBody : ruleTemplateBody EOF ;
    public final void entryRuleTemplateBody() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCodetemplatesParser.g:161:1: ( ruleTemplateBody EOF )
            // InternalCodetemplatesParser.g:162:1: ruleTemplateBody EOF
            {
             before(grammarAccess.getTemplateBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateBody();

            state._fsp--;

             after(grammarAccess.getTemplateBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleTemplateBody"


    // $ANTLR start "ruleTemplateBody"
    // InternalCodetemplatesParser.g:172:1: ruleTemplateBody : ( ( rule__TemplateBody__Group__0 ) ) ;
    public final void ruleTemplateBody() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:177:2: ( ( ( rule__TemplateBody__Group__0 ) ) )
            // InternalCodetemplatesParser.g:178:2: ( ( rule__TemplateBody__Group__0 ) )
            {
            // InternalCodetemplatesParser.g:178:2: ( ( rule__TemplateBody__Group__0 ) )
            // InternalCodetemplatesParser.g:179:3: ( rule__TemplateBody__Group__0 )
            {
             before(grammarAccess.getTemplateBodyAccess().getGroup()); 
            // InternalCodetemplatesParser.g:180:3: ( rule__TemplateBody__Group__0 )
            // InternalCodetemplatesParser.g:180:4: rule__TemplateBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleTemplateBody"


    // $ANTLR start "entryRuleVariableOrDollar"
    // InternalCodetemplatesParser.g:190:1: entryRuleVariableOrDollar : ruleVariableOrDollar EOF ;
    public final void entryRuleVariableOrDollar() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCodetemplatesParser.g:194:1: ( ruleVariableOrDollar EOF )
            // InternalCodetemplatesParser.g:195:1: ruleVariableOrDollar EOF
            {
             before(grammarAccess.getVariableOrDollarRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableOrDollar();

            state._fsp--;

             after(grammarAccess.getVariableOrDollarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleVariableOrDollar"


    // $ANTLR start "ruleVariableOrDollar"
    // InternalCodetemplatesParser.g:205:1: ruleVariableOrDollar : ( ( rule__VariableOrDollar__Alternatives ) ) ;
    public final void ruleVariableOrDollar() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:210:2: ( ( ( rule__VariableOrDollar__Alternatives ) ) )
            // InternalCodetemplatesParser.g:211:2: ( ( rule__VariableOrDollar__Alternatives ) )
            {
            // InternalCodetemplatesParser.g:211:2: ( ( rule__VariableOrDollar__Alternatives ) )
            // InternalCodetemplatesParser.g:212:3: ( rule__VariableOrDollar__Alternatives )
            {
             before(grammarAccess.getVariableOrDollarAccess().getAlternatives()); 
            // InternalCodetemplatesParser.g:213:3: ( rule__VariableOrDollar__Alternatives )
            // InternalCodetemplatesParser.g:213:4: rule__VariableOrDollar__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableOrDollar__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableOrDollarAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleVariableOrDollar"


    // $ANTLR start "entryRuleVariable"
    // InternalCodetemplatesParser.g:223:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCodetemplatesParser.g:227:1: ( ruleVariable EOF )
            // InternalCodetemplatesParser.g:228:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalCodetemplatesParser.g:238:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:243:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalCodetemplatesParser.g:244:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalCodetemplatesParser.g:244:2: ( ( rule__Variable__Group__0 ) )
            // InternalCodetemplatesParser.g:245:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalCodetemplatesParser.g:246:3: ( rule__Variable__Group__0 )
            // InternalCodetemplatesParser.g:246:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleValidID"
    // InternalCodetemplatesParser.g:256:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCodetemplatesParser.g:260:1: ( ruleValidID EOF )
            // InternalCodetemplatesParser.g:261:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalCodetemplatesParser.g:271:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:276:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // InternalCodetemplatesParser.g:277:2: ( ( rule__ValidID__Alternatives ) )
            {
            // InternalCodetemplatesParser.g:277:2: ( ( rule__ValidID__Alternatives ) )
            // InternalCodetemplatesParser.g:278:3: ( rule__ValidID__Alternatives )
            {
             before(grammarAccess.getValidIDAccess().getAlternatives()); 
            // InternalCodetemplatesParser.g:279:3: ( rule__ValidID__Alternatives )
            // InternalCodetemplatesParser.g:279:4: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValidID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleFQN"
    // InternalCodetemplatesParser.g:289:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCodetemplatesParser.g:293:1: ( ruleFQN EOF )
            // InternalCodetemplatesParser.g:294:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalCodetemplatesParser.g:304:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:309:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalCodetemplatesParser.g:310:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalCodetemplatesParser.g:310:2: ( ( rule__FQN__Group__0 ) )
            // InternalCodetemplatesParser.g:311:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalCodetemplatesParser.g:312:3: ( rule__FQN__Group__0 )
            // InternalCodetemplatesParser.g:312:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleLiteral"
    // InternalCodetemplatesParser.g:322:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCodetemplatesParser.g:326:1: ( ruleLiteral EOF )
            // InternalCodetemplatesParser.g:327:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalCodetemplatesParser.g:337:1: ruleLiteral : ( ( rule__Literal__ValueAssignment ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:342:2: ( ( ( rule__Literal__ValueAssignment ) ) )
            // InternalCodetemplatesParser.g:343:2: ( ( rule__Literal__ValueAssignment ) )
            {
            // InternalCodetemplatesParser.g:343:2: ( ( rule__Literal__ValueAssignment ) )
            // InternalCodetemplatesParser.g:344:3: ( rule__Literal__ValueAssignment )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment()); 
            // InternalCodetemplatesParser.g:345:3: ( rule__Literal__ValueAssignment )
            // InternalCodetemplatesParser.g:345:4: rule__Literal__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Literal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleLiteralValue"
    // InternalCodetemplatesParser.g:355:1: entryRuleLiteralValue : ruleLiteralValue EOF ;
    public final void entryRuleLiteralValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCodetemplatesParser.g:359:1: ( ruleLiteralValue EOF )
            // InternalCodetemplatesParser.g:360:1: ruleLiteralValue EOF
            {
             before(grammarAccess.getLiteralValueRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralValue();

            state._fsp--;

             after(grammarAccess.getLiteralValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // InternalCodetemplatesParser.g:370:1: ruleLiteralValue : ( ( ( rule__LiteralValue__Alternatives ) ) ( ( rule__LiteralValue__Alternatives )* ) ) ;
    public final void ruleLiteralValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:375:2: ( ( ( ( rule__LiteralValue__Alternatives ) ) ( ( rule__LiteralValue__Alternatives )* ) ) )
            // InternalCodetemplatesParser.g:376:2: ( ( ( rule__LiteralValue__Alternatives ) ) ( ( rule__LiteralValue__Alternatives )* ) )
            {
            // InternalCodetemplatesParser.g:376:2: ( ( ( rule__LiteralValue__Alternatives ) ) ( ( rule__LiteralValue__Alternatives )* ) )
            // InternalCodetemplatesParser.g:377:3: ( ( rule__LiteralValue__Alternatives ) ) ( ( rule__LiteralValue__Alternatives )* )
            {
            // InternalCodetemplatesParser.g:377:3: ( ( rule__LiteralValue__Alternatives ) )
            // InternalCodetemplatesParser.g:378:4: ( rule__LiteralValue__Alternatives )
            {
             before(grammarAccess.getLiteralValueAccess().getAlternatives()); 
            // InternalCodetemplatesParser.g:379:4: ( rule__LiteralValue__Alternatives )
            // InternalCodetemplatesParser.g:379:5: rule__LiteralValue__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__LiteralValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralValueAccess().getAlternatives()); 

            }

            // InternalCodetemplatesParser.g:382:3: ( ( rule__LiteralValue__Alternatives )* )
            // InternalCodetemplatesParser.g:383:4: ( rule__LiteralValue__Alternatives )*
            {
             before(grammarAccess.getLiteralValueAccess().getAlternatives()); 
            // InternalCodetemplatesParser.g:384:4: ( rule__LiteralValue__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ReverseSolidusLessThanSignLessThanSign||LA1_0==RULE_ID||(LA1_0>=RULE_WS && LA1_0<=RULE_ANY_OTHER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:384:5: rule__LiteralValue__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LiteralValue__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLiteralValueAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleDollar"
    // InternalCodetemplatesParser.g:395:1: entryRuleDollar : ruleDollar EOF ;
    public final void entryRuleDollar() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCodetemplatesParser.g:399:1: ( ruleDollar EOF )
            // InternalCodetemplatesParser.g:400:1: ruleDollar EOF
            {
             before(grammarAccess.getDollarRule()); 
            pushFollow(FOLLOW_1);
            ruleDollar();

            state._fsp--;

             after(grammarAccess.getDollarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleDollar"


    // $ANTLR start "ruleDollar"
    // InternalCodetemplatesParser.g:410:1: ruleDollar : ( ( rule__Dollar__Group__0 ) ) ;
    public final void ruleDollar() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:415:2: ( ( ( rule__Dollar__Group__0 ) ) )
            // InternalCodetemplatesParser.g:416:2: ( ( rule__Dollar__Group__0 ) )
            {
            // InternalCodetemplatesParser.g:416:2: ( ( rule__Dollar__Group__0 ) )
            // InternalCodetemplatesParser.g:417:3: ( rule__Dollar__Group__0 )
            {
             before(grammarAccess.getDollarAccess().getGroup()); 
            // InternalCodetemplatesParser.g:418:3: ( rule__Dollar__Group__0 )
            // InternalCodetemplatesParser.g:418:4: rule__Dollar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dollar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDollarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleDollar"


    // $ANTLR start "rule__Codetemplate__Alternatives_7"
    // InternalCodetemplatesParser.g:427:1: rule__Codetemplate__Alternatives_7 : ( ( ( rule__Codetemplate__ContextAssignment_7_0 ) ) | ( ( rule__Codetemplate__KeywordContextAssignment_7_1 ) ) );
    public final void rule__Codetemplate__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:431:1: ( ( ( rule__Codetemplate__ContextAssignment_7_0 ) ) | ( ( rule__Codetemplate__KeywordContextAssignment_7_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Templates||LA2_0==For||LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCodetemplatesParser.g:432:2: ( ( rule__Codetemplate__ContextAssignment_7_0 ) )
                    {
                    // InternalCodetemplatesParser.g:432:2: ( ( rule__Codetemplate__ContextAssignment_7_0 ) )
                    // InternalCodetemplatesParser.g:433:3: ( rule__Codetemplate__ContextAssignment_7_0 )
                    {
                     before(grammarAccess.getCodetemplateAccess().getContextAssignment_7_0()); 
                    // InternalCodetemplatesParser.g:434:3: ( rule__Codetemplate__ContextAssignment_7_0 )
                    // InternalCodetemplatesParser.g:434:4: rule__Codetemplate__ContextAssignment_7_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Codetemplate__ContextAssignment_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCodetemplateAccess().getContextAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCodetemplatesParser.g:438:2: ( ( rule__Codetemplate__KeywordContextAssignment_7_1 ) )
                    {
                    // InternalCodetemplatesParser.g:438:2: ( ( rule__Codetemplate__KeywordContextAssignment_7_1 ) )
                    // InternalCodetemplatesParser.g:439:3: ( rule__Codetemplate__KeywordContextAssignment_7_1 )
                    {
                     before(grammarAccess.getCodetemplateAccess().getKeywordContextAssignment_7_1()); 
                    // InternalCodetemplatesParser.g:440:3: ( rule__Codetemplate__KeywordContextAssignment_7_1 )
                    // InternalCodetemplatesParser.g:440:4: rule__Codetemplate__KeywordContextAssignment_7_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Codetemplate__KeywordContextAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCodetemplateAccess().getKeywordContextAssignment_7_1()); 

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
    // $ANTLR end "rule__Codetemplate__Alternatives_7"


    // $ANTLR start "rule__VariableOrDollar__Alternatives"
    // InternalCodetemplatesParser.g:448:1: rule__VariableOrDollar__Alternatives : ( ( ruleVariable ) | ( ruleDollar ) );
    public final void rule__VariableOrDollar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:452:1: ( ( ruleVariable ) | ( ruleDollar ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DollarSignLeftCurlyBracket) ) {
                alt3=1;
            }
            else if ( (LA3_0==DollarSignDollarSign||LA3_0==DollarSign) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCodetemplatesParser.g:453:2: ( ruleVariable )
                    {
                    // InternalCodetemplatesParser.g:453:2: ( ruleVariable )
                    // InternalCodetemplatesParser.g:454:3: ruleVariable
                    {
                     before(grammarAccess.getVariableOrDollarAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getVariableOrDollarAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCodetemplatesParser.g:459:2: ( ruleDollar )
                    {
                    // InternalCodetemplatesParser.g:459:2: ( ruleDollar )
                    // InternalCodetemplatesParser.g:460:3: ruleDollar
                    {
                     before(grammarAccess.getVariableOrDollarAccess().getDollarParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDollar();

                    state._fsp--;

                     after(grammarAccess.getVariableOrDollarAccess().getDollarParserRuleCall_1()); 

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
    // $ANTLR end "rule__VariableOrDollar__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives_2"
    // InternalCodetemplatesParser.g:469:1: rule__Variable__Alternatives_2 : ( ( ( rule__Variable__NameAssignment_2_0 ) ) | ( ( rule__Variable__Group_2_1__0 ) ) );
    public final void rule__Variable__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:473:1: ( ( ( rule__Variable__NameAssignment_2_0 ) ) | ( ( rule__Variable__Group_2_1__0 ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCodetemplatesParser.g:474:2: ( ( rule__Variable__NameAssignment_2_0 ) )
                    {
                    // InternalCodetemplatesParser.g:474:2: ( ( rule__Variable__NameAssignment_2_0 ) )
                    // InternalCodetemplatesParser.g:475:3: ( rule__Variable__NameAssignment_2_0 )
                    {
                     before(grammarAccess.getVariableAccess().getNameAssignment_2_0()); 
                    // InternalCodetemplatesParser.g:476:3: ( rule__Variable__NameAssignment_2_0 )
                    // InternalCodetemplatesParser.g:476:4: rule__Variable__NameAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__NameAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getNameAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCodetemplatesParser.g:480:2: ( ( rule__Variable__Group_2_1__0 ) )
                    {
                    // InternalCodetemplatesParser.g:480:2: ( ( rule__Variable__Group_2_1__0 ) )
                    // InternalCodetemplatesParser.g:481:3: ( rule__Variable__Group_2_1__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_2_1()); 
                    // InternalCodetemplatesParser.g:482:3: ( rule__Variable__Group_2_1__0 )
                    // InternalCodetemplatesParser.g:482:4: rule__Variable__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Variable__Alternatives_2"


    // $ANTLR start "rule__Variable__ParametersAlternatives_2_1_4_3_0_0"
    // InternalCodetemplatesParser.g:490:1: rule__Variable__ParametersAlternatives_2_1_4_3_0_0 : ( ( RULE_STRING ) | ( ruleFQN ) );
    public final void rule__Variable__ParametersAlternatives_2_1_4_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:494:1: ( ( RULE_STRING ) | ( ruleFQN ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==Templates||LA5_0==For||LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCodetemplatesParser.g:495:2: ( RULE_STRING )
                    {
                    // InternalCodetemplatesParser.g:495:2: ( RULE_STRING )
                    // InternalCodetemplatesParser.g:496:3: RULE_STRING
                    {
                     before(grammarAccess.getVariableAccess().getParametersSTRINGTerminalRuleCall_2_1_4_3_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getParametersSTRINGTerminalRuleCall_2_1_4_3_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCodetemplatesParser.g:501:2: ( ruleFQN )
                    {
                    // InternalCodetemplatesParser.g:501:2: ( ruleFQN )
                    // InternalCodetemplatesParser.g:502:3: ruleFQN
                    {
                     before(grammarAccess.getVariableAccess().getParametersFQNParserRuleCall_2_1_4_3_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getParametersFQNParserRuleCall_2_1_4_3_0_0_1()); 

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
    // $ANTLR end "rule__Variable__ParametersAlternatives_2_1_4_3_0_0"


    // $ANTLR start "rule__Variable__ParametersAlternatives_2_1_4_3_1_3_0"
    // InternalCodetemplatesParser.g:511:1: rule__Variable__ParametersAlternatives_2_1_4_3_1_3_0 : ( ( RULE_STRING ) | ( ruleFQN ) );
    public final void rule__Variable__ParametersAlternatives_2_1_4_3_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:515:1: ( ( RULE_STRING ) | ( ruleFQN ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==Templates||LA6_0==For||LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCodetemplatesParser.g:516:2: ( RULE_STRING )
                    {
                    // InternalCodetemplatesParser.g:516:2: ( RULE_STRING )
                    // InternalCodetemplatesParser.g:517:3: RULE_STRING
                    {
                     before(grammarAccess.getVariableAccess().getParametersSTRINGTerminalRuleCall_2_1_4_3_1_3_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getParametersSTRINGTerminalRuleCall_2_1_4_3_1_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCodetemplatesParser.g:522:2: ( ruleFQN )
                    {
                    // InternalCodetemplatesParser.g:522:2: ( ruleFQN )
                    // InternalCodetemplatesParser.g:523:3: ruleFQN
                    {
                     before(grammarAccess.getVariableAccess().getParametersFQNParserRuleCall_2_1_4_3_1_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getParametersFQNParserRuleCall_2_1_4_3_1_3_0_1()); 

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
    // $ANTLR end "rule__Variable__ParametersAlternatives_2_1_4_3_1_3_0"


    // $ANTLR start "rule__ValidID__Alternatives"
    // InternalCodetemplatesParser.g:532:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( For ) | ( Templates ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:536:1: ( ( RULE_ID ) | ( For ) | ( Templates ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case For:
                {
                alt7=2;
                }
                break;
            case Templates:
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
                    // InternalCodetemplatesParser.g:537:2: ( RULE_ID )
                    {
                    // InternalCodetemplatesParser.g:537:2: ( RULE_ID )
                    // InternalCodetemplatesParser.g:538:3: RULE_ID
                    {
                     before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCodetemplatesParser.g:543:2: ( For )
                    {
                    // InternalCodetemplatesParser.g:543:2: ( For )
                    // InternalCodetemplatesParser.g:544:3: For
                    {
                     before(grammarAccess.getValidIDAccess().getForKeyword_1()); 
                    match(input,For,FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getForKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCodetemplatesParser.g:549:2: ( Templates )
                    {
                    // InternalCodetemplatesParser.g:549:2: ( Templates )
                    // InternalCodetemplatesParser.g:550:3: Templates
                    {
                     before(grammarAccess.getValidIDAccess().getTemplatesKeyword_2()); 
                    match(input,Templates,FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getTemplatesKeyword_2()); 

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
    // $ANTLR end "rule__ValidID__Alternatives"


    // $ANTLR start "rule__LiteralValue__Alternatives"
    // InternalCodetemplatesParser.g:559:1: rule__LiteralValue__Alternatives : ( ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( ReverseSolidusLessThanSignLessThanSign ) );
    public final void rule__LiteralValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:563:1: ( ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( ReverseSolidusLessThanSignLessThanSign ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt8=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            case ReverseSolidusLessThanSignLessThanSign:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCodetemplatesParser.g:564:2: ( RULE_WS )
                    {
                    // InternalCodetemplatesParser.g:564:2: ( RULE_WS )
                    // InternalCodetemplatesParser.g:565:3: RULE_WS
                    {
                     before(grammarAccess.getLiteralValueAccess().getWSTerminalRuleCall_0()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getLiteralValueAccess().getWSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCodetemplatesParser.g:570:2: ( RULE_ANY_OTHER )
                    {
                    // InternalCodetemplatesParser.g:570:2: ( RULE_ANY_OTHER )
                    // InternalCodetemplatesParser.g:571:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getLiteralValueAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getLiteralValueAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCodetemplatesParser.g:576:2: ( RULE_ID )
                    {
                    // InternalCodetemplatesParser.g:576:2: ( RULE_ID )
                    // InternalCodetemplatesParser.g:577:3: RULE_ID
                    {
                     before(grammarAccess.getLiteralValueAccess().getIDTerminalRuleCall_2()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getLiteralValueAccess().getIDTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCodetemplatesParser.g:582:2: ( ReverseSolidusLessThanSignLessThanSign )
                    {
                    // InternalCodetemplatesParser.g:582:2: ( ReverseSolidusLessThanSignLessThanSign )
                    // InternalCodetemplatesParser.g:583:3: ReverseSolidusLessThanSignLessThanSign
                    {
                     before(grammarAccess.getLiteralValueAccess().getReverseSolidusLessThanSignLessThanSignKeyword_3()); 
                    match(input,ReverseSolidusLessThanSignLessThanSign,FOLLOW_2); 
                     after(grammarAccess.getLiteralValueAccess().getReverseSolidusLessThanSignLessThanSignKeyword_3()); 

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
    // $ANTLR end "rule__LiteralValue__Alternatives"


    // $ANTLR start "rule__Dollar__Alternatives_1"
    // InternalCodetemplatesParser.g:592:1: rule__Dollar__Alternatives_1 : ( ( ( rule__Dollar__EscapedAssignment_1_0 ) ) | ( DollarSign ) );
    public final void rule__Dollar__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:596:1: ( ( ( rule__Dollar__EscapedAssignment_1_0 ) ) | ( DollarSign ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DollarSignDollarSign) ) {
                alt9=1;
            }
            else if ( (LA9_0==DollarSign) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCodetemplatesParser.g:597:2: ( ( rule__Dollar__EscapedAssignment_1_0 ) )
                    {
                    // InternalCodetemplatesParser.g:597:2: ( ( rule__Dollar__EscapedAssignment_1_0 ) )
                    // InternalCodetemplatesParser.g:598:3: ( rule__Dollar__EscapedAssignment_1_0 )
                    {
                     before(grammarAccess.getDollarAccess().getEscapedAssignment_1_0()); 
                    // InternalCodetemplatesParser.g:599:3: ( rule__Dollar__EscapedAssignment_1_0 )
                    // InternalCodetemplatesParser.g:599:4: rule__Dollar__EscapedAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dollar__EscapedAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDollarAccess().getEscapedAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCodetemplatesParser.g:603:2: ( DollarSign )
                    {
                    // InternalCodetemplatesParser.g:603:2: ( DollarSign )
                    // InternalCodetemplatesParser.g:604:3: DollarSign
                    {
                     before(grammarAccess.getDollarAccess().getDollarSignKeyword_1_1()); 
                    match(input,DollarSign,FOLLOW_2); 
                     after(grammarAccess.getDollarAccess().getDollarSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Dollar__Alternatives_1"


    // $ANTLR start "rule__Codetemplates__Group__0"
    // InternalCodetemplatesParser.g:613:1: rule__Codetemplates__Group__0 : rule__Codetemplates__Group__0__Impl rule__Codetemplates__Group__1 ;
    public final void rule__Codetemplates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:617:1: ( rule__Codetemplates__Group__0__Impl rule__Codetemplates__Group__1 )
            // InternalCodetemplatesParser.g:618:2: rule__Codetemplates__Group__0__Impl rule__Codetemplates__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Codetemplates__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codetemplates__Group__1();

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
    // $ANTLR end "rule__Codetemplates__Group__0"


    // $ANTLR start "rule__Codetemplates__Group__0__Impl"
    // InternalCodetemplatesParser.g:625:1: rule__Codetemplates__Group__0__Impl : ( Templates ) ;
    public final void rule__Codetemplates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:629:1: ( ( Templates ) )
            // InternalCodetemplatesParser.g:630:1: ( Templates )
            {
            // InternalCodetemplatesParser.g:630:1: ( Templates )
            // InternalCodetemplatesParser.g:631:2: Templates
            {
             before(grammarAccess.getCodetemplatesAccess().getTemplatesKeyword_0()); 
            match(input,Templates,FOLLOW_2); 
             after(grammarAccess.getCodetemplatesAccess().getTemplatesKeyword_0()); 

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
    // $ANTLR end "rule__Codetemplates__Group__0__Impl"


    // $ANTLR start "rule__Codetemplates__Group__1"
    // InternalCodetemplatesParser.g:640:1: rule__Codetemplates__Group__1 : rule__Codetemplates__Group__1__Impl rule__Codetemplates__Group__2 ;
    public final void rule__Codetemplates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:644:1: ( rule__Codetemplates__Group__1__Impl rule__Codetemplates__Group__2 )
            // InternalCodetemplatesParser.g:645:2: rule__Codetemplates__Group__1__Impl rule__Codetemplates__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Codetemplates__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codetemplates__Group__2();

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
    // $ANTLR end "rule__Codetemplates__Group__1"


    // $ANTLR start "rule__Codetemplates__Group__1__Impl"
    // InternalCodetemplatesParser.g:652:1: rule__Codetemplates__Group__1__Impl : ( For ) ;
    public final void rule__Codetemplates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:656:1: ( ( For ) )
            // InternalCodetemplatesParser.g:657:1: ( For )
            {
            // InternalCodetemplatesParser.g:657:1: ( For )
            // InternalCodetemplatesParser.g:658:2: For
            {
             before(grammarAccess.getCodetemplatesAccess().getForKeyword_1()); 
            match(input,For,FOLLOW_2); 
             after(grammarAccess.getCodetemplatesAccess().getForKeyword_1()); 

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
    // $ANTLR end "rule__Codetemplates__Group__1__Impl"


    // $ANTLR start "rule__Codetemplates__Group__2"
    // InternalCodetemplatesParser.g:667:1: rule__Codetemplates__Group__2 : rule__Codetemplates__Group__2__Impl rule__Codetemplates__Group__3 ;
    public final void rule__Codetemplates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:671:1: ( rule__Codetemplates__Group__2__Impl rule__Codetemplates__Group__3 )
            // InternalCodetemplatesParser.g:672:2: rule__Codetemplates__Group__2__Impl rule__Codetemplates__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Codetemplates__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codetemplates__Group__3();

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
    // $ANTLR end "rule__Codetemplates__Group__2"


    // $ANTLR start "rule__Codetemplates__Group__2__Impl"
    // InternalCodetemplatesParser.g:679:1: rule__Codetemplates__Group__2__Impl : ( ( rule__Codetemplates__LanguageAssignment_2 ) ) ;
    public final void rule__Codetemplates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:683:1: ( ( ( rule__Codetemplates__LanguageAssignment_2 ) ) )
            // InternalCodetemplatesParser.g:684:1: ( ( rule__Codetemplates__LanguageAssignment_2 ) )
            {
            // InternalCodetemplatesParser.g:684:1: ( ( rule__Codetemplates__LanguageAssignment_2 ) )
            // InternalCodetemplatesParser.g:685:2: ( rule__Codetemplates__LanguageAssignment_2 )
            {
             before(grammarAccess.getCodetemplatesAccess().getLanguageAssignment_2()); 
            // InternalCodetemplatesParser.g:686:2: ( rule__Codetemplates__LanguageAssignment_2 )
            // InternalCodetemplatesParser.g:686:3: rule__Codetemplates__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Codetemplates__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCodetemplatesAccess().getLanguageAssignment_2()); 

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
    // $ANTLR end "rule__Codetemplates__Group__2__Impl"


    // $ANTLR start "rule__Codetemplates__Group__3"
    // InternalCodetemplatesParser.g:694:1: rule__Codetemplates__Group__3 : rule__Codetemplates__Group__3__Impl rule__Codetemplates__Group__4 ;
    public final void rule__Codetemplates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:698:1: ( rule__Codetemplates__Group__3__Impl rule__Codetemplates__Group__4 )
            // InternalCodetemplatesParser.g:699:2: rule__Codetemplates__Group__3__Impl rule__Codetemplates__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Codetemplates__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codetemplates__Group__4();

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
    // $ANTLR end "rule__Codetemplates__Group__3"


    // $ANTLR start "rule__Codetemplates__Group__3__Impl"
    // InternalCodetemplatesParser.g:706:1: rule__Codetemplates__Group__3__Impl : ( Colon ) ;
    public final void rule__Codetemplates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:710:1: ( ( Colon ) )
            // InternalCodetemplatesParser.g:711:1: ( Colon )
            {
            // InternalCodetemplatesParser.g:711:1: ( Colon )
            // InternalCodetemplatesParser.g:712:2: Colon
            {
             before(grammarAccess.getCodetemplatesAccess().getColonKeyword_3()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCodetemplatesAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Codetemplates__Group__3__Impl"


    // $ANTLR start "rule__Codetemplates__Group__4"
    // InternalCodetemplatesParser.g:721:1: rule__Codetemplates__Group__4 : rule__Codetemplates__Group__4__Impl ;
    public final void rule__Codetemplates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:725:1: ( rule__Codetemplates__Group__4__Impl )
            // InternalCodetemplatesParser.g:726:2: rule__Codetemplates__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Codetemplates__Group__4__Impl();

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
    // $ANTLR end "rule__Codetemplates__Group__4"


    // $ANTLR start "rule__Codetemplates__Group__4__Impl"
    // InternalCodetemplatesParser.g:732:1: rule__Codetemplates__Group__4__Impl : ( ( rule__Codetemplates__TemplatesAssignment_4 )* ) ;
    public final void rule__Codetemplates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:736:1: ( ( ( rule__Codetemplates__TemplatesAssignment_4 )* ) )
            // InternalCodetemplatesParser.g:737:1: ( ( rule__Codetemplates__TemplatesAssignment_4 )* )
            {
            // InternalCodetemplatesParser.g:737:1: ( ( rule__Codetemplates__TemplatesAssignment_4 )* )
            // InternalCodetemplatesParser.g:738:2: ( rule__Codetemplates__TemplatesAssignment_4 )*
            {
             before(grammarAccess.getCodetemplatesAccess().getTemplatesAssignment_4()); 
            // InternalCodetemplatesParser.g:739:2: ( rule__Codetemplates__TemplatesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Templates||LA10_0==For||LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:739:3: rule__Codetemplates__TemplatesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Codetemplates__TemplatesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCodetemplatesAccess().getTemplatesAssignment_4()); 

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
    // $ANTLR end "rule__Codetemplates__Group__4__Impl"


    // $ANTLR start "rule__Codetemplate__Group__0"
    // InternalCodetemplatesParser.g:748:1: rule__Codetemplate__Group__0 : rule__Codetemplate__Group__0__Impl rule__Codetemplate__Group__1 ;
    public final void rule__Codetemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:752:1: ( rule__Codetemplate__Group__0__Impl rule__Codetemplate__Group__1 )
            // InternalCodetemplatesParser.g:753:2: rule__Codetemplate__Group__0__Impl rule__Codetemplate__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Codetemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codetemplate__Group__1();

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
    // $ANTLR end "rule__Codetemplate__Group__0"


    // $ANTLR start "rule__Codetemplate__Group__0__Impl"
    // InternalCodetemplatesParser.g:760:1: rule__Codetemplate__Group__0__Impl : ( ( rule__Codetemplate__NameAssignment_0 ) ) ;
    public final void rule__Codetemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:764:1: ( ( ( rule__Codetemplate__NameAssignment_0 ) ) )
            // InternalCodetemplatesParser.g:765:1: ( ( rule__Codetemplate__NameAssignment_0 ) )
            {
            // InternalCodetemplatesParser.g:765:1: ( ( rule__Codetemplate__NameAssignment_0 ) )
            // InternalCodetemplatesParser.g:766:2: ( rule__Codetemplate__NameAssignment_0 )
            {
             before(grammarAccess.getCodetemplateAccess().getNameAssignment_0()); 
            // InternalCodetemplatesParser.g:767:2: ( rule__Codetemplate__NameAssignment_0 )
            // InternalCodetemplatesParser.g:767:3: rule__Codetemplate__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Codetemplate__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCodetemplateAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Codetemplate__Group__0__Impl"


    // $ANTLR start "rule__Codetemplate__Group__1"
    // InternalCodetemplatesParser.g:775:1: rule__Codetemplate__Group__1 : rule__Codetemplate__Group__1__Impl rule__Codetemplate__Group__2 ;
    public final void rule__Codetemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:779:1: ( rule__Codetemplate__Group__1__Impl rule__Codetemplate__Group__2 )
            // InternalCodetemplatesParser.g:780:2: rule__Codetemplate__Group__1__Impl rule__Codetemplate__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Codetemplate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codetemplate__Group__2();

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
    // $ANTLR end "rule__Codetemplate__Group__1"


    // $ANTLR start "rule__Codetemplate__Group__1__Impl"
    // InternalCodetemplatesParser.g:787:1: rule__Codetemplate__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__Codetemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:791:1: ( ( LeftParenthesis ) )
            // InternalCodetemplatesParser.g:792:1: ( LeftParenthesis )
            {
            // InternalCodetemplatesParser.g:792:1: ( LeftParenthesis )
            // InternalCodetemplatesParser.g:793:2: LeftParenthesis
            {
             before(grammarAccess.getCodetemplateAccess().getLeftParenthesisKeyword_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getCodetemplateAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Codetemplate__Group__1__Impl"


    // $ANTLR start "rule__Codetemplate__Group__2"
    // InternalCodetemplatesParser.g:802:1: rule__Codetemplate__Group__2 : rule__Codetemplate__Group__2__Impl rule__Codetemplate__Group__3 ;
    public final void rule__Codetemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:806:1: ( rule__Codetemplate__Group__2__Impl rule__Codetemplate__Group__3 )
            // InternalCodetemplatesParser.g:807:2: rule__Codetemplate__Group__2__Impl rule__Codetemplate__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Codetemplate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codetemplate__Group__3();

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
    // $ANTLR end "rule__Codetemplate__Group__2"


    // $ANTLR start "rule__Codetemplate__Group__2__Impl"
    // InternalCodetemplatesParser.g:814:1: rule__Codetemplate__Group__2__Impl : ( ( rule__Codetemplate__IdAssignment_2 ) ) ;
    public final void rule__Codetemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:818:1: ( ( ( rule__Codetemplate__IdAssignment_2 ) ) )
            // InternalCodetemplatesParser.g:819:1: ( ( rule__Codetemplate__IdAssignment_2 ) )
            {
            // InternalCodetemplatesParser.g:819:1: ( ( rule__Codetemplate__IdAssignment_2 ) )
            // InternalCodetemplatesParser.g:820:2: ( rule__Codetemplate__IdAssignment_2 )
            {
             before(grammarAccess.getCodetemplateAccess().getIdAssignment_2()); 
            // InternalCodetemplatesParser.g:821:2: ( rule__Codetemplate__IdAssignment_2 )
            // InternalCodetemplatesParser.g:821:3: rule__Codetemplate__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Codetemplate__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCodetemplateAccess().getIdAssignment_2()); 

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
    // $ANTLR end "rule__Codetemplate__Group__2__Impl"


    // $ANTLR start "rule__Codetemplate__Group__3"
    // InternalCodetemplatesParser.g:829:1: rule__Codetemplate__Group__3 : rule__Codetemplate__Group__3__Impl rule__Codetemplate__Group__4 ;
    public final void rule__Codetemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:833:1: ( rule__Codetemplate__Group__3__Impl rule__Codetemplate__Group__4 )
            // InternalCodetemplatesParser.g:834:2: rule__Codetemplate__Group__3__Impl rule__Codetemplate__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Codetemplate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codetemplate__Group__4();

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
    // $ANTLR end "rule__Codetemplate__Group__3"


    // $ANTLR start "rule__Codetemplate__Group__3__Impl"
    // InternalCodetemplatesParser.g:841:1: rule__Codetemplate__Group__3__Impl : ( Comma ) ;
    public final void rule__Codetemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:845:1: ( ( Comma ) )
            // InternalCodetemplatesParser.g:846:1: ( Comma )
            {
            // InternalCodetemplatesParser.g:846:1: ( Comma )
            // InternalCodetemplatesParser.g:847:2: Comma
            {
             before(grammarAccess.getCodetemplateAccess().getCommaKeyword_3()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getCodetemplateAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Codetemplate__Group__3__Impl"


    // $ANTLR start "rule__Codetemplate__Group__4"
    // InternalCodetemplatesParser.g:856:1: rule__Codetemplate__Group__4 : rule__Codetemplate__Group__4__Impl rule__Codetemplate__Group__5 ;
    public final void rule__Codetemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:860:1: ( rule__Codetemplate__Group__4__Impl rule__Codetemplate__Group__5 )
            // InternalCodetemplatesParser.g:861:2: rule__Codetemplate__Group__4__Impl rule__Codetemplate__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Codetemplate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codetemplate__Group__5();

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
    // $ANTLR end "rule__Codetemplate__Group__4"


    // $ANTLR start "rule__Codetemplate__Group__4__Impl"
    // InternalCodetemplatesParser.g:868:1: rule__Codetemplate__Group__4__Impl : ( ( rule__Codetemplate__DescriptionAssignment_4 ) ) ;
    public final void rule__Codetemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:872:1: ( ( ( rule__Codetemplate__DescriptionAssignment_4 ) ) )
            // InternalCodetemplatesParser.g:873:1: ( ( rule__Codetemplate__DescriptionAssignment_4 ) )
            {
            // InternalCodetemplatesParser.g:873:1: ( ( rule__Codetemplate__DescriptionAssignment_4 ) )
            // InternalCodetemplatesParser.g:874:2: ( rule__Codetemplate__DescriptionAssignment_4 )
            {
             before(grammarAccess.getCodetemplateAccess().getDescriptionAssignment_4()); 
            // InternalCodetemplatesParser.g:875:2: ( rule__Codetemplate__DescriptionAssignment_4 )
            // InternalCodetemplatesParser.g:875:3: rule__Codetemplate__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Codetemplate__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCodetemplateAccess().getDescriptionAssignment_4()); 

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
    // $ANTLR end "rule__Codetemplate__Group__4__Impl"


    // $ANTLR start "rule__Codetemplate__Group__5"
    // InternalCodetemplatesParser.g:883:1: rule__Codetemplate__Group__5 : rule__Codetemplate__Group__5__Impl rule__Codetemplate__Group__6 ;
    public final void rule__Codetemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:887:1: ( rule__Codetemplate__Group__5__Impl rule__Codetemplate__Group__6 )
            // InternalCodetemplatesParser.g:888:2: rule__Codetemplate__Group__5__Impl rule__Codetemplate__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Codetemplate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codetemplate__Group__6();

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
    // $ANTLR end "rule__Codetemplate__Group__5"


    // $ANTLR start "rule__Codetemplate__Group__5__Impl"
    // InternalCodetemplatesParser.g:895:1: rule__Codetemplate__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__Codetemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:899:1: ( ( RightParenthesis ) )
            // InternalCodetemplatesParser.g:900:1: ( RightParenthesis )
            {
            // InternalCodetemplatesParser.g:900:1: ( RightParenthesis )
            // InternalCodetemplatesParser.g:901:2: RightParenthesis
            {
             before(grammarAccess.getCodetemplateAccess().getRightParenthesisKeyword_5()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getCodetemplateAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Codetemplate__Group__5__Impl"


    // $ANTLR start "rule__Codetemplate__Group__6"
    // InternalCodetemplatesParser.g:910:1: rule__Codetemplate__Group__6 : rule__Codetemplate__Group__6__Impl rule__Codetemplate__Group__7 ;
    public final void rule__Codetemplate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:914:1: ( rule__Codetemplate__Group__6__Impl rule__Codetemplate__Group__7 )
            // InternalCodetemplatesParser.g:915:2: rule__Codetemplate__Group__6__Impl rule__Codetemplate__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Codetemplate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codetemplate__Group__7();

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
    // $ANTLR end "rule__Codetemplate__Group__6"


    // $ANTLR start "rule__Codetemplate__Group__6__Impl"
    // InternalCodetemplatesParser.g:922:1: rule__Codetemplate__Group__6__Impl : ( For ) ;
    public final void rule__Codetemplate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:926:1: ( ( For ) )
            // InternalCodetemplatesParser.g:927:1: ( For )
            {
            // InternalCodetemplatesParser.g:927:1: ( For )
            // InternalCodetemplatesParser.g:928:2: For
            {
             before(grammarAccess.getCodetemplateAccess().getForKeyword_6()); 
            match(input,For,FOLLOW_2); 
             after(grammarAccess.getCodetemplateAccess().getForKeyword_6()); 

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
    // $ANTLR end "rule__Codetemplate__Group__6__Impl"


    // $ANTLR start "rule__Codetemplate__Group__7"
    // InternalCodetemplatesParser.g:937:1: rule__Codetemplate__Group__7 : rule__Codetemplate__Group__7__Impl rule__Codetemplate__Group__8 ;
    public final void rule__Codetemplate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:941:1: ( rule__Codetemplate__Group__7__Impl rule__Codetemplate__Group__8 )
            // InternalCodetemplatesParser.g:942:2: rule__Codetemplate__Group__7__Impl rule__Codetemplate__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Codetemplate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codetemplate__Group__8();

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
    // $ANTLR end "rule__Codetemplate__Group__7"


    // $ANTLR start "rule__Codetemplate__Group__7__Impl"
    // InternalCodetemplatesParser.g:949:1: rule__Codetemplate__Group__7__Impl : ( ( rule__Codetemplate__Alternatives_7 ) ) ;
    public final void rule__Codetemplate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:953:1: ( ( ( rule__Codetemplate__Alternatives_7 ) ) )
            // InternalCodetemplatesParser.g:954:1: ( ( rule__Codetemplate__Alternatives_7 ) )
            {
            // InternalCodetemplatesParser.g:954:1: ( ( rule__Codetemplate__Alternatives_7 ) )
            // InternalCodetemplatesParser.g:955:2: ( rule__Codetemplate__Alternatives_7 )
            {
             before(grammarAccess.getCodetemplateAccess().getAlternatives_7()); 
            // InternalCodetemplatesParser.g:956:2: ( rule__Codetemplate__Alternatives_7 )
            // InternalCodetemplatesParser.g:956:3: rule__Codetemplate__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__Codetemplate__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getCodetemplateAccess().getAlternatives_7()); 

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
    // $ANTLR end "rule__Codetemplate__Group__7__Impl"


    // $ANTLR start "rule__Codetemplate__Group__8"
    // InternalCodetemplatesParser.g:964:1: rule__Codetemplate__Group__8 : rule__Codetemplate__Group__8__Impl ;
    public final void rule__Codetemplate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:968:1: ( rule__Codetemplate__Group__8__Impl )
            // InternalCodetemplatesParser.g:969:2: rule__Codetemplate__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Codetemplate__Group__8__Impl();

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
    // $ANTLR end "rule__Codetemplate__Group__8"


    // $ANTLR start "rule__Codetemplate__Group__8__Impl"
    // InternalCodetemplatesParser.g:975:1: rule__Codetemplate__Group__8__Impl : ( ( rule__Codetemplate__BodyAssignment_8 ) ) ;
    public final void rule__Codetemplate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:979:1: ( ( ( rule__Codetemplate__BodyAssignment_8 ) ) )
            // InternalCodetemplatesParser.g:980:1: ( ( rule__Codetemplate__BodyAssignment_8 ) )
            {
            // InternalCodetemplatesParser.g:980:1: ( ( rule__Codetemplate__BodyAssignment_8 ) )
            // InternalCodetemplatesParser.g:981:2: ( rule__Codetemplate__BodyAssignment_8 )
            {
             before(grammarAccess.getCodetemplateAccess().getBodyAssignment_8()); 
            // InternalCodetemplatesParser.g:982:2: ( rule__Codetemplate__BodyAssignment_8 )
            // InternalCodetemplatesParser.g:982:3: rule__Codetemplate__BodyAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Codetemplate__BodyAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCodetemplateAccess().getBodyAssignment_8()); 

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
    // $ANTLR end "rule__Codetemplate__Group__8__Impl"


    // $ANTLR start "rule__TemplateBodyWithQuotes__Group__0"
    // InternalCodetemplatesParser.g:991:1: rule__TemplateBodyWithQuotes__Group__0 : rule__TemplateBodyWithQuotes__Group__0__Impl rule__TemplateBodyWithQuotes__Group__1 ;
    public final void rule__TemplateBodyWithQuotes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:995:1: ( rule__TemplateBodyWithQuotes__Group__0__Impl rule__TemplateBodyWithQuotes__Group__1 )
            // InternalCodetemplatesParser.g:996:2: rule__TemplateBodyWithQuotes__Group__0__Impl rule__TemplateBodyWithQuotes__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TemplateBodyWithQuotes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateBodyWithQuotes__Group__1();

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
    // $ANTLR end "rule__TemplateBodyWithQuotes__Group__0"


    // $ANTLR start "rule__TemplateBodyWithQuotes__Group__0__Impl"
    // InternalCodetemplatesParser.g:1003:1: rule__TemplateBodyWithQuotes__Group__0__Impl : ( ( RULE_WS )? ) ;
    public final void rule__TemplateBodyWithQuotes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1007:1: ( ( ( RULE_WS )? ) )
            // InternalCodetemplatesParser.g:1008:1: ( ( RULE_WS )? )
            {
            // InternalCodetemplatesParser.g:1008:1: ( ( RULE_WS )? )
            // InternalCodetemplatesParser.g:1009:2: ( RULE_WS )?
            {
             before(grammarAccess.getTemplateBodyWithQuotesAccess().getWSTerminalRuleCall_0()); 
            // InternalCodetemplatesParser.g:1010:2: ( RULE_WS )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_WS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCodetemplatesParser.g:1010:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTemplateBodyWithQuotesAccess().getWSTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__TemplateBodyWithQuotes__Group__0__Impl"


    // $ANTLR start "rule__TemplateBodyWithQuotes__Group__1"
    // InternalCodetemplatesParser.g:1018:1: rule__TemplateBodyWithQuotes__Group__1 : rule__TemplateBodyWithQuotes__Group__1__Impl rule__TemplateBodyWithQuotes__Group__2 ;
    public final void rule__TemplateBodyWithQuotes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1022:1: ( rule__TemplateBodyWithQuotes__Group__1__Impl rule__TemplateBodyWithQuotes__Group__2 )
            // InternalCodetemplatesParser.g:1023:2: rule__TemplateBodyWithQuotes__Group__1__Impl rule__TemplateBodyWithQuotes__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TemplateBodyWithQuotes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateBodyWithQuotes__Group__2();

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
    // $ANTLR end "rule__TemplateBodyWithQuotes__Group__1"


    // $ANTLR start "rule__TemplateBodyWithQuotes__Group__1__Impl"
    // InternalCodetemplatesParser.g:1030:1: rule__TemplateBodyWithQuotes__Group__1__Impl : ( GreaterThanSignGreaterThanSign ) ;
    public final void rule__TemplateBodyWithQuotes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1034:1: ( ( GreaterThanSignGreaterThanSign ) )
            // InternalCodetemplatesParser.g:1035:1: ( GreaterThanSignGreaterThanSign )
            {
            // InternalCodetemplatesParser.g:1035:1: ( GreaterThanSignGreaterThanSign )
            // InternalCodetemplatesParser.g:1036:2: GreaterThanSignGreaterThanSign
            {
             before(grammarAccess.getTemplateBodyWithQuotesAccess().getGreaterThanSignGreaterThanSignKeyword_1()); 
            match(input,GreaterThanSignGreaterThanSign,FOLLOW_2); 
             after(grammarAccess.getTemplateBodyWithQuotesAccess().getGreaterThanSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__TemplateBodyWithQuotes__Group__1__Impl"


    // $ANTLR start "rule__TemplateBodyWithQuotes__Group__2"
    // InternalCodetemplatesParser.g:1045:1: rule__TemplateBodyWithQuotes__Group__2 : rule__TemplateBodyWithQuotes__Group__2__Impl rule__TemplateBodyWithQuotes__Group__3 ;
    public final void rule__TemplateBodyWithQuotes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1049:1: ( rule__TemplateBodyWithQuotes__Group__2__Impl rule__TemplateBodyWithQuotes__Group__3 )
            // InternalCodetemplatesParser.g:1050:2: rule__TemplateBodyWithQuotes__Group__2__Impl rule__TemplateBodyWithQuotes__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__TemplateBodyWithQuotes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateBodyWithQuotes__Group__3();

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
    // $ANTLR end "rule__TemplateBodyWithQuotes__Group__2"


    // $ANTLR start "rule__TemplateBodyWithQuotes__Group__2__Impl"
    // InternalCodetemplatesParser.g:1057:1: rule__TemplateBodyWithQuotes__Group__2__Impl : ( ruleTemplateBody ) ;
    public final void rule__TemplateBodyWithQuotes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1061:1: ( ( ruleTemplateBody ) )
            // InternalCodetemplatesParser.g:1062:1: ( ruleTemplateBody )
            {
            // InternalCodetemplatesParser.g:1062:1: ( ruleTemplateBody )
            // InternalCodetemplatesParser.g:1063:2: ruleTemplateBody
            {
             before(grammarAccess.getTemplateBodyWithQuotesAccess().getTemplateBodyParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleTemplateBody();

            state._fsp--;

             after(grammarAccess.getTemplateBodyWithQuotesAccess().getTemplateBodyParserRuleCall_2()); 

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
    // $ANTLR end "rule__TemplateBodyWithQuotes__Group__2__Impl"


    // $ANTLR start "rule__TemplateBodyWithQuotes__Group__3"
    // InternalCodetemplatesParser.g:1072:1: rule__TemplateBodyWithQuotes__Group__3 : rule__TemplateBodyWithQuotes__Group__3__Impl ;
    public final void rule__TemplateBodyWithQuotes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1076:1: ( rule__TemplateBodyWithQuotes__Group__3__Impl )
            // InternalCodetemplatesParser.g:1077:2: rule__TemplateBodyWithQuotes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateBodyWithQuotes__Group__3__Impl();

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
    // $ANTLR end "rule__TemplateBodyWithQuotes__Group__3"


    // $ANTLR start "rule__TemplateBodyWithQuotes__Group__3__Impl"
    // InternalCodetemplatesParser.g:1083:1: rule__TemplateBodyWithQuotes__Group__3__Impl : ( LessThanSignLessThanSign ) ;
    public final void rule__TemplateBodyWithQuotes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1087:1: ( ( LessThanSignLessThanSign ) )
            // InternalCodetemplatesParser.g:1088:1: ( LessThanSignLessThanSign )
            {
            // InternalCodetemplatesParser.g:1088:1: ( LessThanSignLessThanSign )
            // InternalCodetemplatesParser.g:1089:2: LessThanSignLessThanSign
            {
             before(grammarAccess.getTemplateBodyWithQuotesAccess().getLessThanSignLessThanSignKeyword_3()); 
            match(input,LessThanSignLessThanSign,FOLLOW_2); 
             after(grammarAccess.getTemplateBodyWithQuotesAccess().getLessThanSignLessThanSignKeyword_3()); 

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
    // $ANTLR end "rule__TemplateBodyWithQuotes__Group__3__Impl"


    // $ANTLR start "rule__TemplateBody__Group__0"
    // InternalCodetemplatesParser.g:1099:1: rule__TemplateBody__Group__0 : rule__TemplateBody__Group__0__Impl rule__TemplateBody__Group__1 ;
    public final void rule__TemplateBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1103:1: ( rule__TemplateBody__Group__0__Impl rule__TemplateBody__Group__1 )
            // InternalCodetemplatesParser.g:1104:2: rule__TemplateBody__Group__0__Impl rule__TemplateBody__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__TemplateBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateBody__Group__1();

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
    // $ANTLR end "rule__TemplateBody__Group__0"


    // $ANTLR start "rule__TemplateBody__Group__0__Impl"
    // InternalCodetemplatesParser.g:1111:1: rule__TemplateBody__Group__0__Impl : ( () ) ;
    public final void rule__TemplateBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1115:1: ( ( () ) )
            // InternalCodetemplatesParser.g:1116:1: ( () )
            {
            // InternalCodetemplatesParser.g:1116:1: ( () )
            // InternalCodetemplatesParser.g:1117:2: ()
            {
             before(grammarAccess.getTemplateBodyAccess().getTemplateBodyAction_0()); 
            // InternalCodetemplatesParser.g:1118:2: ()
            // InternalCodetemplatesParser.g:1118:3: 
            {
            }

             after(grammarAccess.getTemplateBodyAccess().getTemplateBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateBody__Group__0__Impl"


    // $ANTLR start "rule__TemplateBody__Group__1"
    // InternalCodetemplatesParser.g:1126:1: rule__TemplateBody__Group__1 : rule__TemplateBody__Group__1__Impl rule__TemplateBody__Group__2 ;
    public final void rule__TemplateBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1130:1: ( rule__TemplateBody__Group__1__Impl rule__TemplateBody__Group__2 )
            // InternalCodetemplatesParser.g:1131:2: rule__TemplateBody__Group__1__Impl rule__TemplateBody__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TemplateBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateBody__Group__2();

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
    // $ANTLR end "rule__TemplateBody__Group__1"


    // $ANTLR start "rule__TemplateBody__Group__1__Impl"
    // InternalCodetemplatesParser.g:1138:1: rule__TemplateBody__Group__1__Impl : ( ( rule__TemplateBody__PartsAssignment_1 )? ) ;
    public final void rule__TemplateBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1142:1: ( ( ( rule__TemplateBody__PartsAssignment_1 )? ) )
            // InternalCodetemplatesParser.g:1143:1: ( ( rule__TemplateBody__PartsAssignment_1 )? )
            {
            // InternalCodetemplatesParser.g:1143:1: ( ( rule__TemplateBody__PartsAssignment_1 )? )
            // InternalCodetemplatesParser.g:1144:2: ( rule__TemplateBody__PartsAssignment_1 )?
            {
             before(grammarAccess.getTemplateBodyAccess().getPartsAssignment_1()); 
            // InternalCodetemplatesParser.g:1145:2: ( rule__TemplateBody__PartsAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ReverseSolidusLessThanSignLessThanSign||LA12_0==RULE_ID||(LA12_0>=RULE_WS && LA12_0<=RULE_ANY_OTHER)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCodetemplatesParser.g:1145:3: rule__TemplateBody__PartsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateBody__PartsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateBodyAccess().getPartsAssignment_1()); 

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
    // $ANTLR end "rule__TemplateBody__Group__1__Impl"


    // $ANTLR start "rule__TemplateBody__Group__2"
    // InternalCodetemplatesParser.g:1153:1: rule__TemplateBody__Group__2 : rule__TemplateBody__Group__2__Impl ;
    public final void rule__TemplateBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1157:1: ( rule__TemplateBody__Group__2__Impl )
            // InternalCodetemplatesParser.g:1158:2: rule__TemplateBody__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateBody__Group__2__Impl();

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
    // $ANTLR end "rule__TemplateBody__Group__2"


    // $ANTLR start "rule__TemplateBody__Group__2__Impl"
    // InternalCodetemplatesParser.g:1164:1: rule__TemplateBody__Group__2__Impl : ( ( rule__TemplateBody__Group_2__0 )* ) ;
    public final void rule__TemplateBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1168:1: ( ( ( rule__TemplateBody__Group_2__0 )* ) )
            // InternalCodetemplatesParser.g:1169:1: ( ( rule__TemplateBody__Group_2__0 )* )
            {
            // InternalCodetemplatesParser.g:1169:1: ( ( rule__TemplateBody__Group_2__0 )* )
            // InternalCodetemplatesParser.g:1170:2: ( rule__TemplateBody__Group_2__0 )*
            {
             before(grammarAccess.getTemplateBodyAccess().getGroup_2()); 
            // InternalCodetemplatesParser.g:1171:2: ( rule__TemplateBody__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=DollarSignDollarSign && LA13_0<=DollarSignLeftCurlyBracket)||LA13_0==DollarSign) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:1171:3: rule__TemplateBody__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__TemplateBody__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTemplateBodyAccess().getGroup_2()); 

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
    // $ANTLR end "rule__TemplateBody__Group__2__Impl"


    // $ANTLR start "rule__TemplateBody__Group_2__0"
    // InternalCodetemplatesParser.g:1180:1: rule__TemplateBody__Group_2__0 : rule__TemplateBody__Group_2__0__Impl rule__TemplateBody__Group_2__1 ;
    public final void rule__TemplateBody__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1184:1: ( rule__TemplateBody__Group_2__0__Impl rule__TemplateBody__Group_2__1 )
            // InternalCodetemplatesParser.g:1185:2: rule__TemplateBody__Group_2__0__Impl rule__TemplateBody__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__TemplateBody__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateBody__Group_2__1();

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
    // $ANTLR end "rule__TemplateBody__Group_2__0"


    // $ANTLR start "rule__TemplateBody__Group_2__0__Impl"
    // InternalCodetemplatesParser.g:1192:1: rule__TemplateBody__Group_2__0__Impl : ( ( rule__TemplateBody__PartsAssignment_2_0 ) ) ;
    public final void rule__TemplateBody__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1196:1: ( ( ( rule__TemplateBody__PartsAssignment_2_0 ) ) )
            // InternalCodetemplatesParser.g:1197:1: ( ( rule__TemplateBody__PartsAssignment_2_0 ) )
            {
            // InternalCodetemplatesParser.g:1197:1: ( ( rule__TemplateBody__PartsAssignment_2_0 ) )
            // InternalCodetemplatesParser.g:1198:2: ( rule__TemplateBody__PartsAssignment_2_0 )
            {
             before(grammarAccess.getTemplateBodyAccess().getPartsAssignment_2_0()); 
            // InternalCodetemplatesParser.g:1199:2: ( rule__TemplateBody__PartsAssignment_2_0 )
            // InternalCodetemplatesParser.g:1199:3: rule__TemplateBody__PartsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateBody__PartsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateBodyAccess().getPartsAssignment_2_0()); 

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
    // $ANTLR end "rule__TemplateBody__Group_2__0__Impl"


    // $ANTLR start "rule__TemplateBody__Group_2__1"
    // InternalCodetemplatesParser.g:1207:1: rule__TemplateBody__Group_2__1 : rule__TemplateBody__Group_2__1__Impl ;
    public final void rule__TemplateBody__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1211:1: ( rule__TemplateBody__Group_2__1__Impl )
            // InternalCodetemplatesParser.g:1212:2: rule__TemplateBody__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateBody__Group_2__1__Impl();

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
    // $ANTLR end "rule__TemplateBody__Group_2__1"


    // $ANTLR start "rule__TemplateBody__Group_2__1__Impl"
    // InternalCodetemplatesParser.g:1218:1: rule__TemplateBody__Group_2__1__Impl : ( ( rule__TemplateBody__PartsAssignment_2_1 )? ) ;
    public final void rule__TemplateBody__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1222:1: ( ( ( rule__TemplateBody__PartsAssignment_2_1 )? ) )
            // InternalCodetemplatesParser.g:1223:1: ( ( rule__TemplateBody__PartsAssignment_2_1 )? )
            {
            // InternalCodetemplatesParser.g:1223:1: ( ( rule__TemplateBody__PartsAssignment_2_1 )? )
            // InternalCodetemplatesParser.g:1224:2: ( rule__TemplateBody__PartsAssignment_2_1 )?
            {
             before(grammarAccess.getTemplateBodyAccess().getPartsAssignment_2_1()); 
            // InternalCodetemplatesParser.g:1225:2: ( rule__TemplateBody__PartsAssignment_2_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ReverseSolidusLessThanSignLessThanSign||LA14_0==RULE_ID||(LA14_0>=RULE_WS && LA14_0<=RULE_ANY_OTHER)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCodetemplatesParser.g:1225:3: rule__TemplateBody__PartsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateBody__PartsAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateBodyAccess().getPartsAssignment_2_1()); 

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
    // $ANTLR end "rule__TemplateBody__Group_2__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalCodetemplatesParser.g:1234:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1238:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalCodetemplatesParser.g:1239:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalCodetemplatesParser.g:1246:1: rule__Variable__Group__0__Impl : ( DollarSignLeftCurlyBracket ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1250:1: ( ( DollarSignLeftCurlyBracket ) )
            // InternalCodetemplatesParser.g:1251:1: ( DollarSignLeftCurlyBracket )
            {
            // InternalCodetemplatesParser.g:1251:1: ( DollarSignLeftCurlyBracket )
            // InternalCodetemplatesParser.g:1252:2: DollarSignLeftCurlyBracket
            {
             before(grammarAccess.getVariableAccess().getDollarSignLeftCurlyBracketKeyword_0()); 
            match(input,DollarSignLeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getDollarSignLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalCodetemplatesParser.g:1261:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1265:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalCodetemplatesParser.g:1266:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalCodetemplatesParser.g:1273:1: rule__Variable__Group__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1277:1: ( ( ( RULE_WS )* ) )
            // InternalCodetemplatesParser.g:1278:1: ( ( RULE_WS )* )
            {
            // InternalCodetemplatesParser.g:1278:1: ( ( RULE_WS )* )
            // InternalCodetemplatesParser.g:1279:2: ( RULE_WS )*
            {
             before(grammarAccess.getVariableAccess().getWSTerminalRuleCall_1()); 
            // InternalCodetemplatesParser.g:1280:2: ( RULE_WS )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:1280:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getWSTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalCodetemplatesParser.g:1288:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1292:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalCodetemplatesParser.g:1293:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalCodetemplatesParser.g:1300:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__Alternatives_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1304:1: ( ( ( rule__Variable__Alternatives_2 ) ) )
            // InternalCodetemplatesParser.g:1305:1: ( ( rule__Variable__Alternatives_2 ) )
            {
            // InternalCodetemplatesParser.g:1305:1: ( ( rule__Variable__Alternatives_2 ) )
            // InternalCodetemplatesParser.g:1306:2: ( rule__Variable__Alternatives_2 )
            {
             before(grammarAccess.getVariableAccess().getAlternatives_2()); 
            // InternalCodetemplatesParser.g:1307:2: ( rule__Variable__Alternatives_2 )
            // InternalCodetemplatesParser.g:1307:3: rule__Variable__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalCodetemplatesParser.g:1315:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1319:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalCodetemplatesParser.g:1320:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__4();

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
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalCodetemplatesParser.g:1327:1: rule__Variable__Group__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1331:1: ( ( ( RULE_WS )* ) )
            // InternalCodetemplatesParser.g:1332:1: ( ( RULE_WS )* )
            {
            // InternalCodetemplatesParser.g:1332:1: ( ( RULE_WS )* )
            // InternalCodetemplatesParser.g:1333:2: ( RULE_WS )*
            {
             before(grammarAccess.getVariableAccess().getWSTerminalRuleCall_3()); 
            // InternalCodetemplatesParser.g:1334:2: ( RULE_WS )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:1334:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getWSTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // InternalCodetemplatesParser.g:1342:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1346:1: ( rule__Variable__Group__4__Impl )
            // InternalCodetemplatesParser.g:1347:2: rule__Variable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__4__Impl();

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
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // InternalCodetemplatesParser.g:1353:1: rule__Variable__Group__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1357:1: ( ( RightCurlyBracket ) )
            // InternalCodetemplatesParser.g:1358:1: ( RightCurlyBracket )
            {
            // InternalCodetemplatesParser.g:1358:1: ( RightCurlyBracket )
            // InternalCodetemplatesParser.g:1359:2: RightCurlyBracket
            {
             before(grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group_2_1__0"
    // InternalCodetemplatesParser.g:1369:1: rule__Variable__Group_2_1__0 : rule__Variable__Group_2_1__0__Impl rule__Variable__Group_2_1__1 ;
    public final void rule__Variable__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1373:1: ( rule__Variable__Group_2_1__0__Impl rule__Variable__Group_2_1__1 )
            // InternalCodetemplatesParser.g:1374:2: rule__Variable__Group_2_1__0__Impl rule__Variable__Group_2_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Variable__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1__1();

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
    // $ANTLR end "rule__Variable__Group_2_1__0"


    // $ANTLR start "rule__Variable__Group_2_1__0__Impl"
    // InternalCodetemplatesParser.g:1381:1: rule__Variable__Group_2_1__0__Impl : ( ( rule__Variable__Group_2_1_0__0 )? ) ;
    public final void rule__Variable__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1385:1: ( ( ( rule__Variable__Group_2_1_0__0 )? ) )
            // InternalCodetemplatesParser.g:1386:1: ( ( rule__Variable__Group_2_1_0__0 )? )
            {
            // InternalCodetemplatesParser.g:1386:1: ( ( rule__Variable__Group_2_1_0__0 )? )
            // InternalCodetemplatesParser.g:1387:2: ( rule__Variable__Group_2_1_0__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_2_1_0()); 
            // InternalCodetemplatesParser.g:1388:2: ( rule__Variable__Group_2_1_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Templates||LA17_0==For||LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCodetemplatesParser.g:1388:3: rule__Variable__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_2_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_2_1_0()); 

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
    // $ANTLR end "rule__Variable__Group_2_1__0__Impl"


    // $ANTLR start "rule__Variable__Group_2_1__1"
    // InternalCodetemplatesParser.g:1396:1: rule__Variable__Group_2_1__1 : rule__Variable__Group_2_1__1__Impl rule__Variable__Group_2_1__2 ;
    public final void rule__Variable__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1400:1: ( rule__Variable__Group_2_1__1__Impl rule__Variable__Group_2_1__2 )
            // InternalCodetemplatesParser.g:1401:2: rule__Variable__Group_2_1__1__Impl rule__Variable__Group_2_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Variable__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1__2();

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
    // $ANTLR end "rule__Variable__Group_2_1__1"


    // $ANTLR start "rule__Variable__Group_2_1__1__Impl"
    // InternalCodetemplatesParser.g:1408:1: rule__Variable__Group_2_1__1__Impl : ( Colon ) ;
    public final void rule__Variable__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1412:1: ( ( Colon ) )
            // InternalCodetemplatesParser.g:1413:1: ( Colon )
            {
            // InternalCodetemplatesParser.g:1413:1: ( Colon )
            // InternalCodetemplatesParser.g:1414:2: Colon
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_2_1_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getColonKeyword_2_1_1()); 

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
    // $ANTLR end "rule__Variable__Group_2_1__1__Impl"


    // $ANTLR start "rule__Variable__Group_2_1__2"
    // InternalCodetemplatesParser.g:1423:1: rule__Variable__Group_2_1__2 : rule__Variable__Group_2_1__2__Impl rule__Variable__Group_2_1__3 ;
    public final void rule__Variable__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1427:1: ( rule__Variable__Group_2_1__2__Impl rule__Variable__Group_2_1__3 )
            // InternalCodetemplatesParser.g:1428:2: rule__Variable__Group_2_1__2__Impl rule__Variable__Group_2_1__3
            {
            pushFollow(FOLLOW_22);
            rule__Variable__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1__3();

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
    // $ANTLR end "rule__Variable__Group_2_1__2"


    // $ANTLR start "rule__Variable__Group_2_1__2__Impl"
    // InternalCodetemplatesParser.g:1435:1: rule__Variable__Group_2_1__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Variable__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1439:1: ( ( ( RULE_WS )* ) )
            // InternalCodetemplatesParser.g:1440:1: ( ( RULE_WS )* )
            {
            // InternalCodetemplatesParser.g:1440:1: ( ( RULE_WS )* )
            // InternalCodetemplatesParser.g:1441:2: ( RULE_WS )*
            {
             before(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_2()); 
            // InternalCodetemplatesParser.g:1442:2: ( RULE_WS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:1442:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_2()); 

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
    // $ANTLR end "rule__Variable__Group_2_1__2__Impl"


    // $ANTLR start "rule__Variable__Group_2_1__3"
    // InternalCodetemplatesParser.g:1450:1: rule__Variable__Group_2_1__3 : rule__Variable__Group_2_1__3__Impl rule__Variable__Group_2_1__4 ;
    public final void rule__Variable__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1454:1: ( rule__Variable__Group_2_1__3__Impl rule__Variable__Group_2_1__4 )
            // InternalCodetemplatesParser.g:1455:2: rule__Variable__Group_2_1__3__Impl rule__Variable__Group_2_1__4
            {
            pushFollow(FOLLOW_23);
            rule__Variable__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1__4();

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
    // $ANTLR end "rule__Variable__Group_2_1__3"


    // $ANTLR start "rule__Variable__Group_2_1__3__Impl"
    // InternalCodetemplatesParser.g:1462:1: rule__Variable__Group_2_1__3__Impl : ( ( rule__Variable__TypeAssignment_2_1_3 ) ) ;
    public final void rule__Variable__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1466:1: ( ( ( rule__Variable__TypeAssignment_2_1_3 ) ) )
            // InternalCodetemplatesParser.g:1467:1: ( ( rule__Variable__TypeAssignment_2_1_3 ) )
            {
            // InternalCodetemplatesParser.g:1467:1: ( ( rule__Variable__TypeAssignment_2_1_3 ) )
            // InternalCodetemplatesParser.g:1468:2: ( rule__Variable__TypeAssignment_2_1_3 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_2_1_3()); 
            // InternalCodetemplatesParser.g:1469:2: ( rule__Variable__TypeAssignment_2_1_3 )
            // InternalCodetemplatesParser.g:1469:3: rule__Variable__TypeAssignment_2_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_2_1_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_2_1_3()); 

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
    // $ANTLR end "rule__Variable__Group_2_1__3__Impl"


    // $ANTLR start "rule__Variable__Group_2_1__4"
    // InternalCodetemplatesParser.g:1477:1: rule__Variable__Group_2_1__4 : rule__Variable__Group_2_1__4__Impl ;
    public final void rule__Variable__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1481:1: ( rule__Variable__Group_2_1__4__Impl )
            // InternalCodetemplatesParser.g:1482:2: rule__Variable__Group_2_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1__4__Impl();

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
    // $ANTLR end "rule__Variable__Group_2_1__4"


    // $ANTLR start "rule__Variable__Group_2_1__4__Impl"
    // InternalCodetemplatesParser.g:1488:1: rule__Variable__Group_2_1__4__Impl : ( ( rule__Variable__Group_2_1_4__0 )? ) ;
    public final void rule__Variable__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1492:1: ( ( ( rule__Variable__Group_2_1_4__0 )? ) )
            // InternalCodetemplatesParser.g:1493:1: ( ( rule__Variable__Group_2_1_4__0 )? )
            {
            // InternalCodetemplatesParser.g:1493:1: ( ( rule__Variable__Group_2_1_4__0 )? )
            // InternalCodetemplatesParser.g:1494:2: ( rule__Variable__Group_2_1_4__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_2_1_4()); 
            // InternalCodetemplatesParser.g:1495:2: ( rule__Variable__Group_2_1_4__0 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalCodetemplatesParser.g:1495:3: rule__Variable__Group_2_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_2_1_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_2_1_4()); 

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
    // $ANTLR end "rule__Variable__Group_2_1__4__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_0__0"
    // InternalCodetemplatesParser.g:1504:1: rule__Variable__Group_2_1_0__0 : rule__Variable__Group_2_1_0__0__Impl rule__Variable__Group_2_1_0__1 ;
    public final void rule__Variable__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1508:1: ( rule__Variable__Group_2_1_0__0__Impl rule__Variable__Group_2_1_0__1 )
            // InternalCodetemplatesParser.g:1509:2: rule__Variable__Group_2_1_0__0__Impl rule__Variable__Group_2_1_0__1
            {
            pushFollow(FOLLOW_24);
            rule__Variable__Group_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_0__1();

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
    // $ANTLR end "rule__Variable__Group_2_1_0__0"


    // $ANTLR start "rule__Variable__Group_2_1_0__0__Impl"
    // InternalCodetemplatesParser.g:1516:1: rule__Variable__Group_2_1_0__0__Impl : ( ( rule__Variable__NameAssignment_2_1_0_0 ) ) ;
    public final void rule__Variable__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1520:1: ( ( ( rule__Variable__NameAssignment_2_1_0_0 ) ) )
            // InternalCodetemplatesParser.g:1521:1: ( ( rule__Variable__NameAssignment_2_1_0_0 ) )
            {
            // InternalCodetemplatesParser.g:1521:1: ( ( rule__Variable__NameAssignment_2_1_0_0 ) )
            // InternalCodetemplatesParser.g:1522:2: ( rule__Variable__NameAssignment_2_1_0_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_2_1_0_0()); 
            // InternalCodetemplatesParser.g:1523:2: ( rule__Variable__NameAssignment_2_1_0_0 )
            // InternalCodetemplatesParser.g:1523:3: rule__Variable__NameAssignment_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_2_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_2_1_0_0()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_0__1"
    // InternalCodetemplatesParser.g:1531:1: rule__Variable__Group_2_1_0__1 : rule__Variable__Group_2_1_0__1__Impl ;
    public final void rule__Variable__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1535:1: ( rule__Variable__Group_2_1_0__1__Impl )
            // InternalCodetemplatesParser.g:1536:2: rule__Variable__Group_2_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_0__1__Impl();

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
    // $ANTLR end "rule__Variable__Group_2_1_0__1"


    // $ANTLR start "rule__Variable__Group_2_1_0__1__Impl"
    // InternalCodetemplatesParser.g:1542:1: rule__Variable__Group_2_1_0__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Variable__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1546:1: ( ( ( RULE_WS )* ) )
            // InternalCodetemplatesParser.g:1547:1: ( ( RULE_WS )* )
            {
            // InternalCodetemplatesParser.g:1547:1: ( ( RULE_WS )* )
            // InternalCodetemplatesParser.g:1548:2: ( RULE_WS )*
            {
             before(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_0_1()); 
            // InternalCodetemplatesParser.g:1549:2: ( RULE_WS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:1549:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_0_1()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_4__0"
    // InternalCodetemplatesParser.g:1558:1: rule__Variable__Group_2_1_4__0 : rule__Variable__Group_2_1_4__0__Impl rule__Variable__Group_2_1_4__1 ;
    public final void rule__Variable__Group_2_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1562:1: ( rule__Variable__Group_2_1_4__0__Impl rule__Variable__Group_2_1_4__1 )
            // InternalCodetemplatesParser.g:1563:2: rule__Variable__Group_2_1_4__0__Impl rule__Variable__Group_2_1_4__1
            {
            pushFollow(FOLLOW_23);
            rule__Variable__Group_2_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_4__1();

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
    // $ANTLR end "rule__Variable__Group_2_1_4__0"


    // $ANTLR start "rule__Variable__Group_2_1_4__0__Impl"
    // InternalCodetemplatesParser.g:1570:1: rule__Variable__Group_2_1_4__0__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Variable__Group_2_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1574:1: ( ( ( RULE_WS )* ) )
            // InternalCodetemplatesParser.g:1575:1: ( ( RULE_WS )* )
            {
            // InternalCodetemplatesParser.g:1575:1: ( ( RULE_WS )* )
            // InternalCodetemplatesParser.g:1576:2: ( RULE_WS )*
            {
             before(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_4_0()); 
            // InternalCodetemplatesParser.g:1577:2: ( RULE_WS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:1577:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_4_0()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_4__0__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_4__1"
    // InternalCodetemplatesParser.g:1585:1: rule__Variable__Group_2_1_4__1 : rule__Variable__Group_2_1_4__1__Impl rule__Variable__Group_2_1_4__2 ;
    public final void rule__Variable__Group_2_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1589:1: ( rule__Variable__Group_2_1_4__1__Impl rule__Variable__Group_2_1_4__2 )
            // InternalCodetemplatesParser.g:1590:2: rule__Variable__Group_2_1_4__1__Impl rule__Variable__Group_2_1_4__2
            {
            pushFollow(FOLLOW_25);
            rule__Variable__Group_2_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_4__2();

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
    // $ANTLR end "rule__Variable__Group_2_1_4__1"


    // $ANTLR start "rule__Variable__Group_2_1_4__1__Impl"
    // InternalCodetemplatesParser.g:1597:1: rule__Variable__Group_2_1_4__1__Impl : ( ( rule__Variable__ExpectingParametersAssignment_2_1_4_1 ) ) ;
    public final void rule__Variable__Group_2_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1601:1: ( ( ( rule__Variable__ExpectingParametersAssignment_2_1_4_1 ) ) )
            // InternalCodetemplatesParser.g:1602:1: ( ( rule__Variable__ExpectingParametersAssignment_2_1_4_1 ) )
            {
            // InternalCodetemplatesParser.g:1602:1: ( ( rule__Variable__ExpectingParametersAssignment_2_1_4_1 ) )
            // InternalCodetemplatesParser.g:1603:2: ( rule__Variable__ExpectingParametersAssignment_2_1_4_1 )
            {
             before(grammarAccess.getVariableAccess().getExpectingParametersAssignment_2_1_4_1()); 
            // InternalCodetemplatesParser.g:1604:2: ( rule__Variable__ExpectingParametersAssignment_2_1_4_1 )
            // InternalCodetemplatesParser.g:1604:3: rule__Variable__ExpectingParametersAssignment_2_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ExpectingParametersAssignment_2_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpectingParametersAssignment_2_1_4_1()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_4__1__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_4__2"
    // InternalCodetemplatesParser.g:1612:1: rule__Variable__Group_2_1_4__2 : rule__Variable__Group_2_1_4__2__Impl rule__Variable__Group_2_1_4__3 ;
    public final void rule__Variable__Group_2_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1616:1: ( rule__Variable__Group_2_1_4__2__Impl rule__Variable__Group_2_1_4__3 )
            // InternalCodetemplatesParser.g:1617:2: rule__Variable__Group_2_1_4__2__Impl rule__Variable__Group_2_1_4__3
            {
            pushFollow(FOLLOW_25);
            rule__Variable__Group_2_1_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_4__3();

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
    // $ANTLR end "rule__Variable__Group_2_1_4__2"


    // $ANTLR start "rule__Variable__Group_2_1_4__2__Impl"
    // InternalCodetemplatesParser.g:1624:1: rule__Variable__Group_2_1_4__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Variable__Group_2_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1628:1: ( ( ( RULE_WS )* ) )
            // InternalCodetemplatesParser.g:1629:1: ( ( RULE_WS )* )
            {
            // InternalCodetemplatesParser.g:1629:1: ( ( RULE_WS )* )
            // InternalCodetemplatesParser.g:1630:2: ( RULE_WS )*
            {
             before(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_4_2()); 
            // InternalCodetemplatesParser.g:1631:2: ( RULE_WS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:1631:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_4_2()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_4__2__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_4__3"
    // InternalCodetemplatesParser.g:1639:1: rule__Variable__Group_2_1_4__3 : rule__Variable__Group_2_1_4__3__Impl rule__Variable__Group_2_1_4__4 ;
    public final void rule__Variable__Group_2_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1643:1: ( rule__Variable__Group_2_1_4__3__Impl rule__Variable__Group_2_1_4__4 )
            // InternalCodetemplatesParser.g:1644:2: rule__Variable__Group_2_1_4__3__Impl rule__Variable__Group_2_1_4__4
            {
            pushFollow(FOLLOW_25);
            rule__Variable__Group_2_1_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_4__4();

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
    // $ANTLR end "rule__Variable__Group_2_1_4__3"


    // $ANTLR start "rule__Variable__Group_2_1_4__3__Impl"
    // InternalCodetemplatesParser.g:1651:1: rule__Variable__Group_2_1_4__3__Impl : ( ( rule__Variable__Group_2_1_4_3__0 )? ) ;
    public final void rule__Variable__Group_2_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1655:1: ( ( ( rule__Variable__Group_2_1_4_3__0 )? ) )
            // InternalCodetemplatesParser.g:1656:1: ( ( rule__Variable__Group_2_1_4_3__0 )? )
            {
            // InternalCodetemplatesParser.g:1656:1: ( ( rule__Variable__Group_2_1_4_3__0 )? )
            // InternalCodetemplatesParser.g:1657:2: ( rule__Variable__Group_2_1_4_3__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_2_1_4_3()); 
            // InternalCodetemplatesParser.g:1658:2: ( rule__Variable__Group_2_1_4_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Templates||LA23_0==For||(LA23_0>=RULE_ID && LA23_0<=RULE_STRING)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCodetemplatesParser.g:1658:3: rule__Variable__Group_2_1_4_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_2_1_4_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_2_1_4_3()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_4__3__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_4__4"
    // InternalCodetemplatesParser.g:1666:1: rule__Variable__Group_2_1_4__4 : rule__Variable__Group_2_1_4__4__Impl ;
    public final void rule__Variable__Group_2_1_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1670:1: ( rule__Variable__Group_2_1_4__4__Impl )
            // InternalCodetemplatesParser.g:1671:2: rule__Variable__Group_2_1_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_4__4__Impl();

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
    // $ANTLR end "rule__Variable__Group_2_1_4__4"


    // $ANTLR start "rule__Variable__Group_2_1_4__4__Impl"
    // InternalCodetemplatesParser.g:1677:1: rule__Variable__Group_2_1_4__4__Impl : ( RightParenthesis ) ;
    public final void rule__Variable__Group_2_1_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1681:1: ( ( RightParenthesis ) )
            // InternalCodetemplatesParser.g:1682:1: ( RightParenthesis )
            {
            // InternalCodetemplatesParser.g:1682:1: ( RightParenthesis )
            // InternalCodetemplatesParser.g:1683:2: RightParenthesis
            {
             before(grammarAccess.getVariableAccess().getRightParenthesisKeyword_2_1_4_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getRightParenthesisKeyword_2_1_4_4()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_4__4__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_4_3__0"
    // InternalCodetemplatesParser.g:1693:1: rule__Variable__Group_2_1_4_3__0 : rule__Variable__Group_2_1_4_3__0__Impl rule__Variable__Group_2_1_4_3__1 ;
    public final void rule__Variable__Group_2_1_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1697:1: ( rule__Variable__Group_2_1_4_3__0__Impl rule__Variable__Group_2_1_4_3__1 )
            // InternalCodetemplatesParser.g:1698:2: rule__Variable__Group_2_1_4_3__0__Impl rule__Variable__Group_2_1_4_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Variable__Group_2_1_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_4_3__1();

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3__0"


    // $ANTLR start "rule__Variable__Group_2_1_4_3__0__Impl"
    // InternalCodetemplatesParser.g:1705:1: rule__Variable__Group_2_1_4_3__0__Impl : ( ( rule__Variable__ParametersAssignment_2_1_4_3_0 ) ) ;
    public final void rule__Variable__Group_2_1_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1709:1: ( ( ( rule__Variable__ParametersAssignment_2_1_4_3_0 ) ) )
            // InternalCodetemplatesParser.g:1710:1: ( ( rule__Variable__ParametersAssignment_2_1_4_3_0 ) )
            {
            // InternalCodetemplatesParser.g:1710:1: ( ( rule__Variable__ParametersAssignment_2_1_4_3_0 ) )
            // InternalCodetemplatesParser.g:1711:2: ( rule__Variable__ParametersAssignment_2_1_4_3_0 )
            {
             before(grammarAccess.getVariableAccess().getParametersAssignment_2_1_4_3_0()); 
            // InternalCodetemplatesParser.g:1712:2: ( rule__Variable__ParametersAssignment_2_1_4_3_0 )
            // InternalCodetemplatesParser.g:1712:3: rule__Variable__ParametersAssignment_2_1_4_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ParametersAssignment_2_1_4_3_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getParametersAssignment_2_1_4_3_0()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3__0__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_4_3__1"
    // InternalCodetemplatesParser.g:1720:1: rule__Variable__Group_2_1_4_3__1 : rule__Variable__Group_2_1_4_3__1__Impl rule__Variable__Group_2_1_4_3__2 ;
    public final void rule__Variable__Group_2_1_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1724:1: ( rule__Variable__Group_2_1_4_3__1__Impl rule__Variable__Group_2_1_4_3__2 )
            // InternalCodetemplatesParser.g:1725:2: rule__Variable__Group_2_1_4_3__1__Impl rule__Variable__Group_2_1_4_3__2
            {
            pushFollow(FOLLOW_26);
            rule__Variable__Group_2_1_4_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_4_3__2();

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3__1"


    // $ANTLR start "rule__Variable__Group_2_1_4_3__1__Impl"
    // InternalCodetemplatesParser.g:1732:1: rule__Variable__Group_2_1_4_3__1__Impl : ( ( rule__Variable__Group_2_1_4_3_1__0 )* ) ;
    public final void rule__Variable__Group_2_1_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1736:1: ( ( ( rule__Variable__Group_2_1_4_3_1__0 )* ) )
            // InternalCodetemplatesParser.g:1737:1: ( ( rule__Variable__Group_2_1_4_3_1__0 )* )
            {
            // InternalCodetemplatesParser.g:1737:1: ( ( rule__Variable__Group_2_1_4_3_1__0 )* )
            // InternalCodetemplatesParser.g:1738:2: ( rule__Variable__Group_2_1_4_3_1__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_2_1_4_3_1()); 
            // InternalCodetemplatesParser.g:1739:2: ( rule__Variable__Group_2_1_4_3_1__0 )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:1739:3: rule__Variable__Group_2_1_4_3_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Variable__Group_2_1_4_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getGroup_2_1_4_3_1()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3__1__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_4_3__2"
    // InternalCodetemplatesParser.g:1747:1: rule__Variable__Group_2_1_4_3__2 : rule__Variable__Group_2_1_4_3__2__Impl ;
    public final void rule__Variable__Group_2_1_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1751:1: ( rule__Variable__Group_2_1_4_3__2__Impl )
            // InternalCodetemplatesParser.g:1752:2: rule__Variable__Group_2_1_4_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_4_3__2__Impl();

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3__2"


    // $ANTLR start "rule__Variable__Group_2_1_4_3__2__Impl"
    // InternalCodetemplatesParser.g:1758:1: rule__Variable__Group_2_1_4_3__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Variable__Group_2_1_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1762:1: ( ( ( RULE_WS )* ) )
            // InternalCodetemplatesParser.g:1763:1: ( ( RULE_WS )* )
            {
            // InternalCodetemplatesParser.g:1763:1: ( ( RULE_WS )* )
            // InternalCodetemplatesParser.g:1764:2: ( RULE_WS )*
            {
             before(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_4_3_2()); 
            // InternalCodetemplatesParser.g:1765:2: ( RULE_WS )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:1765:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_4_3_2()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3__2__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_4_3_1__0"
    // InternalCodetemplatesParser.g:1774:1: rule__Variable__Group_2_1_4_3_1__0 : rule__Variable__Group_2_1_4_3_1__0__Impl rule__Variable__Group_2_1_4_3_1__1 ;
    public final void rule__Variable__Group_2_1_4_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1778:1: ( rule__Variable__Group_2_1_4_3_1__0__Impl rule__Variable__Group_2_1_4_3_1__1 )
            // InternalCodetemplatesParser.g:1779:2: rule__Variable__Group_2_1_4_3_1__0__Impl rule__Variable__Group_2_1_4_3_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Variable__Group_2_1_4_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_4_3_1__1();

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3_1__0"


    // $ANTLR start "rule__Variable__Group_2_1_4_3_1__0__Impl"
    // InternalCodetemplatesParser.g:1786:1: rule__Variable__Group_2_1_4_3_1__0__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Variable__Group_2_1_4_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1790:1: ( ( ( RULE_WS )* ) )
            // InternalCodetemplatesParser.g:1791:1: ( ( RULE_WS )* )
            {
            // InternalCodetemplatesParser.g:1791:1: ( ( RULE_WS )* )
            // InternalCodetemplatesParser.g:1792:2: ( RULE_WS )*
            {
             before(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_4_3_1_0()); 
            // InternalCodetemplatesParser.g:1793:2: ( RULE_WS )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_WS) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:1793:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_4_3_1_0()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3_1__0__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_4_3_1__1"
    // InternalCodetemplatesParser.g:1801:1: rule__Variable__Group_2_1_4_3_1__1 : rule__Variable__Group_2_1_4_3_1__1__Impl rule__Variable__Group_2_1_4_3_1__2 ;
    public final void rule__Variable__Group_2_1_4_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1805:1: ( rule__Variable__Group_2_1_4_3_1__1__Impl rule__Variable__Group_2_1_4_3_1__2 )
            // InternalCodetemplatesParser.g:1806:2: rule__Variable__Group_2_1_4_3_1__1__Impl rule__Variable__Group_2_1_4_3_1__2
            {
            pushFollow(FOLLOW_28);
            rule__Variable__Group_2_1_4_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_4_3_1__2();

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3_1__1"


    // $ANTLR start "rule__Variable__Group_2_1_4_3_1__1__Impl"
    // InternalCodetemplatesParser.g:1813:1: rule__Variable__Group_2_1_4_3_1__1__Impl : ( Comma ) ;
    public final void rule__Variable__Group_2_1_4_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1817:1: ( ( Comma ) )
            // InternalCodetemplatesParser.g:1818:1: ( Comma )
            {
            // InternalCodetemplatesParser.g:1818:1: ( Comma )
            // InternalCodetemplatesParser.g:1819:2: Comma
            {
             before(grammarAccess.getVariableAccess().getCommaKeyword_2_1_4_3_1_1()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getCommaKeyword_2_1_4_3_1_1()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3_1__1__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_4_3_1__2"
    // InternalCodetemplatesParser.g:1828:1: rule__Variable__Group_2_1_4_3_1__2 : rule__Variable__Group_2_1_4_3_1__2__Impl rule__Variable__Group_2_1_4_3_1__3 ;
    public final void rule__Variable__Group_2_1_4_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1832:1: ( rule__Variable__Group_2_1_4_3_1__2__Impl rule__Variable__Group_2_1_4_3_1__3 )
            // InternalCodetemplatesParser.g:1833:2: rule__Variable__Group_2_1_4_3_1__2__Impl rule__Variable__Group_2_1_4_3_1__3
            {
            pushFollow(FOLLOW_28);
            rule__Variable__Group_2_1_4_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_4_3_1__3();

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3_1__2"


    // $ANTLR start "rule__Variable__Group_2_1_4_3_1__2__Impl"
    // InternalCodetemplatesParser.g:1840:1: rule__Variable__Group_2_1_4_3_1__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Variable__Group_2_1_4_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1844:1: ( ( ( RULE_WS )* ) )
            // InternalCodetemplatesParser.g:1845:1: ( ( RULE_WS )* )
            {
            // InternalCodetemplatesParser.g:1845:1: ( ( RULE_WS )* )
            // InternalCodetemplatesParser.g:1846:2: ( RULE_WS )*
            {
             before(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_4_3_1_2()); 
            // InternalCodetemplatesParser.g:1847:2: ( RULE_WS )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_WS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:1847:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getWSTerminalRuleCall_2_1_4_3_1_2()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3_1__2__Impl"


    // $ANTLR start "rule__Variable__Group_2_1_4_3_1__3"
    // InternalCodetemplatesParser.g:1855:1: rule__Variable__Group_2_1_4_3_1__3 : rule__Variable__Group_2_1_4_3_1__3__Impl ;
    public final void rule__Variable__Group_2_1_4_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1859:1: ( rule__Variable__Group_2_1_4_3_1__3__Impl )
            // InternalCodetemplatesParser.g:1860:2: rule__Variable__Group_2_1_4_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_1_4_3_1__3__Impl();

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3_1__3"


    // $ANTLR start "rule__Variable__Group_2_1_4_3_1__3__Impl"
    // InternalCodetemplatesParser.g:1866:1: rule__Variable__Group_2_1_4_3_1__3__Impl : ( ( rule__Variable__ParametersAssignment_2_1_4_3_1_3 ) ) ;
    public final void rule__Variable__Group_2_1_4_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1870:1: ( ( ( rule__Variable__ParametersAssignment_2_1_4_3_1_3 ) ) )
            // InternalCodetemplatesParser.g:1871:1: ( ( rule__Variable__ParametersAssignment_2_1_4_3_1_3 ) )
            {
            // InternalCodetemplatesParser.g:1871:1: ( ( rule__Variable__ParametersAssignment_2_1_4_3_1_3 ) )
            // InternalCodetemplatesParser.g:1872:2: ( rule__Variable__ParametersAssignment_2_1_4_3_1_3 )
            {
             before(grammarAccess.getVariableAccess().getParametersAssignment_2_1_4_3_1_3()); 
            // InternalCodetemplatesParser.g:1873:2: ( rule__Variable__ParametersAssignment_2_1_4_3_1_3 )
            // InternalCodetemplatesParser.g:1873:3: rule__Variable__ParametersAssignment_2_1_4_3_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ParametersAssignment_2_1_4_3_1_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getParametersAssignment_2_1_4_3_1_3()); 

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
    // $ANTLR end "rule__Variable__Group_2_1_4_3_1__3__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalCodetemplatesParser.g:1882:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1886:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCodetemplatesParser.g:1887:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalCodetemplatesParser.g:1894:1: rule__FQN__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1898:1: ( ( ruleValidID ) )
            // InternalCodetemplatesParser.g:1899:1: ( ruleValidID )
            {
            // InternalCodetemplatesParser.g:1899:1: ( ruleValidID )
            // InternalCodetemplatesParser.g:1900:2: ruleValidID
            {
             before(grammarAccess.getFQNAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getFQNAccess().getValidIDParserRuleCall_0()); 

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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalCodetemplatesParser.g:1909:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1913:1: ( rule__FQN__Group__1__Impl )
            // InternalCodetemplatesParser.g:1914:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalCodetemplatesParser.g:1920:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1924:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCodetemplatesParser.g:1925:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCodetemplatesParser.g:1925:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCodetemplatesParser.g:1926:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCodetemplatesParser.g:1927:2: ( rule__FQN__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==FullStop) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCodetemplatesParser.g:1927:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalCodetemplatesParser.g:1936:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1940:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCodetemplatesParser.g:1941:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalCodetemplatesParser.g:1948:1: rule__FQN__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1952:1: ( ( FullStop ) )
            // InternalCodetemplatesParser.g:1953:1: ( FullStop )
            {
            // InternalCodetemplatesParser.g:1953:1: ( FullStop )
            // InternalCodetemplatesParser.g:1954:2: FullStop
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalCodetemplatesParser.g:1963:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1967:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCodetemplatesParser.g:1968:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalCodetemplatesParser.g:1974:1: rule__FQN__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1978:1: ( ( ruleValidID ) )
            // InternalCodetemplatesParser.g:1979:1: ( ruleValidID )
            {
            // InternalCodetemplatesParser.g:1979:1: ( ruleValidID )
            // InternalCodetemplatesParser.g:1980:2: ruleValidID
            {
             before(grammarAccess.getFQNAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getFQNAccess().getValidIDParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Dollar__Group__0"
    // InternalCodetemplatesParser.g:1990:1: rule__Dollar__Group__0 : rule__Dollar__Group__0__Impl rule__Dollar__Group__1 ;
    public final void rule__Dollar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:1994:1: ( rule__Dollar__Group__0__Impl rule__Dollar__Group__1 )
            // InternalCodetemplatesParser.g:1995:2: rule__Dollar__Group__0__Impl rule__Dollar__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Dollar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dollar__Group__1();

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
    // $ANTLR end "rule__Dollar__Group__0"


    // $ANTLR start "rule__Dollar__Group__0__Impl"
    // InternalCodetemplatesParser.g:2002:1: rule__Dollar__Group__0__Impl : ( () ) ;
    public final void rule__Dollar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2006:1: ( ( () ) )
            // InternalCodetemplatesParser.g:2007:1: ( () )
            {
            // InternalCodetemplatesParser.g:2007:1: ( () )
            // InternalCodetemplatesParser.g:2008:2: ()
            {
             before(grammarAccess.getDollarAccess().getDollarAction_0()); 
            // InternalCodetemplatesParser.g:2009:2: ()
            // InternalCodetemplatesParser.g:2009:3: 
            {
            }

             after(grammarAccess.getDollarAccess().getDollarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dollar__Group__0__Impl"


    // $ANTLR start "rule__Dollar__Group__1"
    // InternalCodetemplatesParser.g:2017:1: rule__Dollar__Group__1 : rule__Dollar__Group__1__Impl ;
    public final void rule__Dollar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2021:1: ( rule__Dollar__Group__1__Impl )
            // InternalCodetemplatesParser.g:2022:2: rule__Dollar__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dollar__Group__1__Impl();

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
    // $ANTLR end "rule__Dollar__Group__1"


    // $ANTLR start "rule__Dollar__Group__1__Impl"
    // InternalCodetemplatesParser.g:2028:1: rule__Dollar__Group__1__Impl : ( ( rule__Dollar__Alternatives_1 ) ) ;
    public final void rule__Dollar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2032:1: ( ( ( rule__Dollar__Alternatives_1 ) ) )
            // InternalCodetemplatesParser.g:2033:1: ( ( rule__Dollar__Alternatives_1 ) )
            {
            // InternalCodetemplatesParser.g:2033:1: ( ( rule__Dollar__Alternatives_1 ) )
            // InternalCodetemplatesParser.g:2034:2: ( rule__Dollar__Alternatives_1 )
            {
             before(grammarAccess.getDollarAccess().getAlternatives_1()); 
            // InternalCodetemplatesParser.g:2035:2: ( rule__Dollar__Alternatives_1 )
            // InternalCodetemplatesParser.g:2035:3: rule__Dollar__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Dollar__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDollarAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Dollar__Group__1__Impl"


    // $ANTLR start "rule__Codetemplates__LanguageAssignment_2"
    // InternalCodetemplatesParser.g:2044:1: rule__Codetemplates__LanguageAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Codetemplates__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2048:1: ( ( ( ruleFQN ) ) )
            // InternalCodetemplatesParser.g:2049:2: ( ( ruleFQN ) )
            {
            // InternalCodetemplatesParser.g:2049:2: ( ( ruleFQN ) )
            // InternalCodetemplatesParser.g:2050:3: ( ruleFQN )
            {
             before(grammarAccess.getCodetemplatesAccess().getLanguageGrammarCrossReference_2_0()); 
            // InternalCodetemplatesParser.g:2051:3: ( ruleFQN )
            // InternalCodetemplatesParser.g:2052:4: ruleFQN
            {
             before(grammarAccess.getCodetemplatesAccess().getLanguageGrammarFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCodetemplatesAccess().getLanguageGrammarFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCodetemplatesAccess().getLanguageGrammarCrossReference_2_0()); 

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
    // $ANTLR end "rule__Codetemplates__LanguageAssignment_2"


    // $ANTLR start "rule__Codetemplates__TemplatesAssignment_4"
    // InternalCodetemplatesParser.g:2063:1: rule__Codetemplates__TemplatesAssignment_4 : ( ruleCodetemplate ) ;
    public final void rule__Codetemplates__TemplatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2067:1: ( ( ruleCodetemplate ) )
            // InternalCodetemplatesParser.g:2068:2: ( ruleCodetemplate )
            {
            // InternalCodetemplatesParser.g:2068:2: ( ruleCodetemplate )
            // InternalCodetemplatesParser.g:2069:3: ruleCodetemplate
            {
             before(grammarAccess.getCodetemplatesAccess().getTemplatesCodetemplateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCodetemplate();

            state._fsp--;

             after(grammarAccess.getCodetemplatesAccess().getTemplatesCodetemplateParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Codetemplates__TemplatesAssignment_4"


    // $ANTLR start "rule__Codetemplate__NameAssignment_0"
    // InternalCodetemplatesParser.g:2078:1: rule__Codetemplate__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__Codetemplate__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2082:1: ( ( ruleValidID ) )
            // InternalCodetemplatesParser.g:2083:2: ( ruleValidID )
            {
            // InternalCodetemplatesParser.g:2083:2: ( ruleValidID )
            // InternalCodetemplatesParser.g:2084:3: ruleValidID
            {
             before(grammarAccess.getCodetemplateAccess().getNameValidIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getCodetemplateAccess().getNameValidIDParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Codetemplate__NameAssignment_0"


    // $ANTLR start "rule__Codetemplate__IdAssignment_2"
    // InternalCodetemplatesParser.g:2093:1: rule__Codetemplate__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__Codetemplate__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2097:1: ( ( RULE_ID ) )
            // InternalCodetemplatesParser.g:2098:2: ( RULE_ID )
            {
            // InternalCodetemplatesParser.g:2098:2: ( RULE_ID )
            // InternalCodetemplatesParser.g:2099:3: RULE_ID
            {
             before(grammarAccess.getCodetemplateAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCodetemplateAccess().getIdIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Codetemplate__IdAssignment_2"


    // $ANTLR start "rule__Codetemplate__DescriptionAssignment_4"
    // InternalCodetemplatesParser.g:2108:1: rule__Codetemplate__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Codetemplate__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2112:1: ( ( RULE_STRING ) )
            // InternalCodetemplatesParser.g:2113:2: ( RULE_STRING )
            {
            // InternalCodetemplatesParser.g:2113:2: ( RULE_STRING )
            // InternalCodetemplatesParser.g:2114:3: RULE_STRING
            {
             before(grammarAccess.getCodetemplateAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCodetemplateAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Codetemplate__DescriptionAssignment_4"


    // $ANTLR start "rule__Codetemplate__ContextAssignment_7_0"
    // InternalCodetemplatesParser.g:2123:1: rule__Codetemplate__ContextAssignment_7_0 : ( ( ruleValidID ) ) ;
    public final void rule__Codetemplate__ContextAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2127:1: ( ( ( ruleValidID ) ) )
            // InternalCodetemplatesParser.g:2128:2: ( ( ruleValidID ) )
            {
            // InternalCodetemplatesParser.g:2128:2: ( ( ruleValidID ) )
            // InternalCodetemplatesParser.g:2129:3: ( ruleValidID )
            {
             before(grammarAccess.getCodetemplateAccess().getContextAbstractRuleCrossReference_7_0_0()); 
            // InternalCodetemplatesParser.g:2130:3: ( ruleValidID )
            // InternalCodetemplatesParser.g:2131:4: ruleValidID
            {
             before(grammarAccess.getCodetemplateAccess().getContextAbstractRuleValidIDParserRuleCall_7_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getCodetemplateAccess().getContextAbstractRuleValidIDParserRuleCall_7_0_0_1()); 

            }

             after(grammarAccess.getCodetemplateAccess().getContextAbstractRuleCrossReference_7_0_0()); 

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
    // $ANTLR end "rule__Codetemplate__ContextAssignment_7_0"


    // $ANTLR start "rule__Codetemplate__KeywordContextAssignment_7_1"
    // InternalCodetemplatesParser.g:2142:1: rule__Codetemplate__KeywordContextAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Codetemplate__KeywordContextAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2146:1: ( ( RULE_STRING ) )
            // InternalCodetemplatesParser.g:2147:2: ( RULE_STRING )
            {
            // InternalCodetemplatesParser.g:2147:2: ( RULE_STRING )
            // InternalCodetemplatesParser.g:2148:3: RULE_STRING
            {
             before(grammarAccess.getCodetemplateAccess().getKeywordContextSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCodetemplateAccess().getKeywordContextSTRINGTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Codetemplate__KeywordContextAssignment_7_1"


    // $ANTLR start "rule__Codetemplate__BodyAssignment_8"
    // InternalCodetemplatesParser.g:2157:1: rule__Codetemplate__BodyAssignment_8 : ( ruleTemplateBodyWithQuotes ) ;
    public final void rule__Codetemplate__BodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2161:1: ( ( ruleTemplateBodyWithQuotes ) )
            // InternalCodetemplatesParser.g:2162:2: ( ruleTemplateBodyWithQuotes )
            {
            // InternalCodetemplatesParser.g:2162:2: ( ruleTemplateBodyWithQuotes )
            // InternalCodetemplatesParser.g:2163:3: ruleTemplateBodyWithQuotes
            {
             before(grammarAccess.getCodetemplateAccess().getBodyTemplateBodyWithQuotesParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateBodyWithQuotes();

            state._fsp--;

             after(grammarAccess.getCodetemplateAccess().getBodyTemplateBodyWithQuotesParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Codetemplate__BodyAssignment_8"


    // $ANTLR start "rule__TemplateBody__PartsAssignment_1"
    // InternalCodetemplatesParser.g:2172:1: rule__TemplateBody__PartsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__TemplateBody__PartsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2176:1: ( ( ruleLiteral ) )
            // InternalCodetemplatesParser.g:2177:2: ( ruleLiteral )
            {
            // InternalCodetemplatesParser.g:2177:2: ( ruleLiteral )
            // InternalCodetemplatesParser.g:2178:3: ruleLiteral
            {
             before(grammarAccess.getTemplateBodyAccess().getPartsLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getTemplateBodyAccess().getPartsLiteralParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TemplateBody__PartsAssignment_1"


    // $ANTLR start "rule__TemplateBody__PartsAssignment_2_0"
    // InternalCodetemplatesParser.g:2187:1: rule__TemplateBody__PartsAssignment_2_0 : ( ruleVariableOrDollar ) ;
    public final void rule__TemplateBody__PartsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2191:1: ( ( ruleVariableOrDollar ) )
            // InternalCodetemplatesParser.g:2192:2: ( ruleVariableOrDollar )
            {
            // InternalCodetemplatesParser.g:2192:2: ( ruleVariableOrDollar )
            // InternalCodetemplatesParser.g:2193:3: ruleVariableOrDollar
            {
             before(grammarAccess.getTemplateBodyAccess().getPartsVariableOrDollarParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableOrDollar();

            state._fsp--;

             after(grammarAccess.getTemplateBodyAccess().getPartsVariableOrDollarParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__TemplateBody__PartsAssignment_2_0"


    // $ANTLR start "rule__TemplateBody__PartsAssignment_2_1"
    // InternalCodetemplatesParser.g:2202:1: rule__TemplateBody__PartsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__TemplateBody__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2206:1: ( ( ruleLiteral ) )
            // InternalCodetemplatesParser.g:2207:2: ( ruleLiteral )
            {
            // InternalCodetemplatesParser.g:2207:2: ( ruleLiteral )
            // InternalCodetemplatesParser.g:2208:3: ruleLiteral
            {
             before(grammarAccess.getTemplateBodyAccess().getPartsLiteralParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getTemplateBodyAccess().getPartsLiteralParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__TemplateBody__PartsAssignment_2_1"


    // $ANTLR start "rule__Variable__NameAssignment_2_0"
    // InternalCodetemplatesParser.g:2217:1: rule__Variable__NameAssignment_2_0 : ( ruleValidID ) ;
    public final void rule__Variable__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2221:1: ( ( ruleValidID ) )
            // InternalCodetemplatesParser.g:2222:2: ( ruleValidID )
            {
            // InternalCodetemplatesParser.g:2222:2: ( ruleValidID )
            // InternalCodetemplatesParser.g:2223:3: ruleValidID
            {
             before(grammarAccess.getVariableAccess().getNameValidIDParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameValidIDParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_2_0"


    // $ANTLR start "rule__Variable__NameAssignment_2_1_0_0"
    // InternalCodetemplatesParser.g:2232:1: rule__Variable__NameAssignment_2_1_0_0 : ( ruleValidID ) ;
    public final void rule__Variable__NameAssignment_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2236:1: ( ( ruleValidID ) )
            // InternalCodetemplatesParser.g:2237:2: ( ruleValidID )
            {
            // InternalCodetemplatesParser.g:2237:2: ( ruleValidID )
            // InternalCodetemplatesParser.g:2238:3: ruleValidID
            {
             before(grammarAccess.getVariableAccess().getNameValidIDParserRuleCall_2_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameValidIDParserRuleCall_2_1_0_0_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_2_1_0_0"


    // $ANTLR start "rule__Variable__TypeAssignment_2_1_3"
    // InternalCodetemplatesParser.g:2247:1: rule__Variable__TypeAssignment_2_1_3 : ( ruleValidID ) ;
    public final void rule__Variable__TypeAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2251:1: ( ( ruleValidID ) )
            // InternalCodetemplatesParser.g:2252:2: ( ruleValidID )
            {
            // InternalCodetemplatesParser.g:2252:2: ( ruleValidID )
            // InternalCodetemplatesParser.g:2253:3: ruleValidID
            {
             before(grammarAccess.getVariableAccess().getTypeValidIDParserRuleCall_2_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypeValidIDParserRuleCall_2_1_3_0()); 

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
    // $ANTLR end "rule__Variable__TypeAssignment_2_1_3"


    // $ANTLR start "rule__Variable__ExpectingParametersAssignment_2_1_4_1"
    // InternalCodetemplatesParser.g:2262:1: rule__Variable__ExpectingParametersAssignment_2_1_4_1 : ( ( LeftParenthesis ) ) ;
    public final void rule__Variable__ExpectingParametersAssignment_2_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2266:1: ( ( ( LeftParenthesis ) ) )
            // InternalCodetemplatesParser.g:2267:2: ( ( LeftParenthesis ) )
            {
            // InternalCodetemplatesParser.g:2267:2: ( ( LeftParenthesis ) )
            // InternalCodetemplatesParser.g:2268:3: ( LeftParenthesis )
            {
             before(grammarAccess.getVariableAccess().getExpectingParametersLeftParenthesisKeyword_2_1_4_1_0()); 
            // InternalCodetemplatesParser.g:2269:3: ( LeftParenthesis )
            // InternalCodetemplatesParser.g:2270:4: LeftParenthesis
            {
             before(grammarAccess.getVariableAccess().getExpectingParametersLeftParenthesisKeyword_2_1_4_1_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getExpectingParametersLeftParenthesisKeyword_2_1_4_1_0()); 

            }

             after(grammarAccess.getVariableAccess().getExpectingParametersLeftParenthesisKeyword_2_1_4_1_0()); 

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
    // $ANTLR end "rule__Variable__ExpectingParametersAssignment_2_1_4_1"


    // $ANTLR start "rule__Variable__ParametersAssignment_2_1_4_3_0"
    // InternalCodetemplatesParser.g:2281:1: rule__Variable__ParametersAssignment_2_1_4_3_0 : ( ( rule__Variable__ParametersAlternatives_2_1_4_3_0_0 ) ) ;
    public final void rule__Variable__ParametersAssignment_2_1_4_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2285:1: ( ( ( rule__Variable__ParametersAlternatives_2_1_4_3_0_0 ) ) )
            // InternalCodetemplatesParser.g:2286:2: ( ( rule__Variable__ParametersAlternatives_2_1_4_3_0_0 ) )
            {
            // InternalCodetemplatesParser.g:2286:2: ( ( rule__Variable__ParametersAlternatives_2_1_4_3_0_0 ) )
            // InternalCodetemplatesParser.g:2287:3: ( rule__Variable__ParametersAlternatives_2_1_4_3_0_0 )
            {
             before(grammarAccess.getVariableAccess().getParametersAlternatives_2_1_4_3_0_0()); 
            // InternalCodetemplatesParser.g:2288:3: ( rule__Variable__ParametersAlternatives_2_1_4_3_0_0 )
            // InternalCodetemplatesParser.g:2288:4: rule__Variable__ParametersAlternatives_2_1_4_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ParametersAlternatives_2_1_4_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getParametersAlternatives_2_1_4_3_0_0()); 

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
    // $ANTLR end "rule__Variable__ParametersAssignment_2_1_4_3_0"


    // $ANTLR start "rule__Variable__ParametersAssignment_2_1_4_3_1_3"
    // InternalCodetemplatesParser.g:2296:1: rule__Variable__ParametersAssignment_2_1_4_3_1_3 : ( ( rule__Variable__ParametersAlternatives_2_1_4_3_1_3_0 ) ) ;
    public final void rule__Variable__ParametersAssignment_2_1_4_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2300:1: ( ( ( rule__Variable__ParametersAlternatives_2_1_4_3_1_3_0 ) ) )
            // InternalCodetemplatesParser.g:2301:2: ( ( rule__Variable__ParametersAlternatives_2_1_4_3_1_3_0 ) )
            {
            // InternalCodetemplatesParser.g:2301:2: ( ( rule__Variable__ParametersAlternatives_2_1_4_3_1_3_0 ) )
            // InternalCodetemplatesParser.g:2302:3: ( rule__Variable__ParametersAlternatives_2_1_4_3_1_3_0 )
            {
             before(grammarAccess.getVariableAccess().getParametersAlternatives_2_1_4_3_1_3_0()); 
            // InternalCodetemplatesParser.g:2303:3: ( rule__Variable__ParametersAlternatives_2_1_4_3_1_3_0 )
            // InternalCodetemplatesParser.g:2303:4: rule__Variable__ParametersAlternatives_2_1_4_3_1_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ParametersAlternatives_2_1_4_3_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getParametersAlternatives_2_1_4_3_1_3_0()); 

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
    // $ANTLR end "rule__Variable__ParametersAssignment_2_1_4_3_1_3"


    // $ANTLR start "rule__Literal__ValueAssignment"
    // InternalCodetemplatesParser.g:2311:1: rule__Literal__ValueAssignment : ( ruleLiteralValue ) ;
    public final void rule__Literal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2315:1: ( ( ruleLiteralValue ) )
            // InternalCodetemplatesParser.g:2316:2: ( ruleLiteralValue )
            {
            // InternalCodetemplatesParser.g:2316:2: ( ruleLiteralValue )
            // InternalCodetemplatesParser.g:2317:3: ruleLiteralValue
            {
             before(grammarAccess.getLiteralAccess().getValueLiteralValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteralValue();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getValueLiteralValueParserRuleCall_0()); 

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
    // $ANTLR end "rule__Literal__ValueAssignment"


    // $ANTLR start "rule__Dollar__EscapedAssignment_1_0"
    // InternalCodetemplatesParser.g:2326:1: rule__Dollar__EscapedAssignment_1_0 : ( ( DollarSignDollarSign ) ) ;
    public final void rule__Dollar__EscapedAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCodetemplatesParser.g:2330:1: ( ( ( DollarSignDollarSign ) ) )
            // InternalCodetemplatesParser.g:2331:2: ( ( DollarSignDollarSign ) )
            {
            // InternalCodetemplatesParser.g:2331:2: ( ( DollarSignDollarSign ) )
            // InternalCodetemplatesParser.g:2332:3: ( DollarSignDollarSign )
            {
             before(grammarAccess.getDollarAccess().getEscapedDollarSignDollarSignKeyword_1_0_0()); 
            // InternalCodetemplatesParser.g:2333:3: ( DollarSignDollarSign )
            // InternalCodetemplatesParser.g:2334:4: DollarSignDollarSign
            {
             before(grammarAccess.getDollarAccess().getEscapedDollarSignDollarSignKeyword_1_0_0()); 
            match(input,DollarSignDollarSign,FOLLOW_2); 
             after(grammarAccess.getDollarAccess().getEscapedDollarSignDollarSignKeyword_1_0_0()); 

            }

             after(grammarAccess.getDollarAccess().getEscapedDollarSignDollarSignKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Dollar__EscapedAssignment_1_0"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\4\3\20\1\uffff\1\20\1\uffff";
    static final String dfa_3s = "\1\22\3\24\1\uffff\1\24\1\uffff";
    static final String dfa_4s = "\4\uffff\1\2\1\uffff\1\1";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\uffff\1\2\11\uffff\1\4\1\uffff\1\1",
            "\1\4\1\6\2\uffff\1\5",
            "\1\4\1\6\2\uffff\1\5",
            "\1\4\1\6\2\uffff\1\5",
            "",
            "\1\4\1\6\2\uffff\1\5",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "469:1: rule__Variable__Alternatives_2 : ( ( ( rule__Variable__NameAssignment_2_0 ) ) | ( ( rule__Variable__Group_2_1__0 ) ) );";
        }
    }
    static final String dfa_7s = "\4\uffff";
    static final String dfa_8s = "\2\14\2\uffff";
    static final String dfa_9s = "\2\24\2\uffff";
    static final String dfa_10s = "\2\uffff\1\1\1\2";
    static final String dfa_11s = "\4\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\4\uffff\1\3\2\uffff\1\1",
            "\1\2\4\uffff\1\3\2\uffff\1\1",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1495:2: ( rule__Variable__Group_2_1_4__0 )?";
        }
    }
    static final String dfa_13s = "\2\15\2\uffff";
    static final String dfa_14s = "\2\uffff\1\2\1\1";
    static final String[] dfa_15s = {
            "\1\2\1\3\5\uffff\1\1",
            "\1\2\1\3\5\uffff\1\1",
            "",
            ""
    };
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_9;
            this.accept = dfa_14;
            this.special = dfa_11;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "()* loopback of 1739:2: ( rule__Variable__Group_2_1_4_3_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000340022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040052L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000003409A0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000982L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000340020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000150050L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000140050L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000001C2050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000104002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000001C0050L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000980L});

}