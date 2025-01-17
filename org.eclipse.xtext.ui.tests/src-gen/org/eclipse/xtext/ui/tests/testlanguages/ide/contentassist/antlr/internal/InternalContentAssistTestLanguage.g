/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalContentAssistTestLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.eclipse.xtext.ui.tests.testlanguages.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.xtext.ui.tests.testlanguages.ide.contentassist.antlr.internal;

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
import org.eclipse.xtext.ui.tests.testlanguages.services.ContentAssistTestLanguageGrammarAccess;

}
@parser::members {
	private ContentAssistTestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(ContentAssistTestLanguageGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleStart
entryRuleStart
:
{ before(grammarAccess.getStartRule()); }
	 ruleStart
{ after(grammarAccess.getStartRule()); } 
	 EOF 
;

// Rule Start
ruleStart 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStartAccess().getGroup()); }
		(rule__Start__Group__0)
		{ after(grammarAccess.getStartAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractRule
entryRuleAbstractRule
:
{ before(grammarAccess.getAbstractRuleRule()); }
	 ruleAbstractRule
{ after(grammarAccess.getAbstractRuleRule()); } 
	 EOF 
;

// Rule AbstractRule
ruleAbstractRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractRuleAccess().getAlternatives()); }
		(rule__AbstractRule__Alternatives)
		{ after(grammarAccess.getAbstractRuleAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFirstAbstractRuleChild
entryRuleFirstAbstractRuleChild
:
{ before(grammarAccess.getFirstAbstractRuleChildRule()); }
	 ruleFirstAbstractRuleChild
{ after(grammarAccess.getFirstAbstractRuleChildRule()); } 
	 EOF 
;

// Rule FirstAbstractRuleChild
ruleFirstAbstractRuleChild 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFirstAbstractRuleChildAccess().getGroup()); }
		(rule__FirstAbstractRuleChild__Group__0)
		{ after(grammarAccess.getFirstAbstractRuleChildAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSecondAbstractRuleChild
entryRuleSecondAbstractRuleChild
:
{ before(grammarAccess.getSecondAbstractRuleChildRule()); }
	 ruleSecondAbstractRuleChild
{ after(grammarAccess.getSecondAbstractRuleChildRule()); } 
	 EOF 
;

// Rule SecondAbstractRuleChild
ruleSecondAbstractRuleChild 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSecondAbstractRuleChildAccess().getGroup()); }
		(rule__SecondAbstractRuleChild__Group__0)
		{ after(grammarAccess.getSecondAbstractRuleChildAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractRuleCall
entryRuleAbstractRuleCall
:
{ before(grammarAccess.getAbstractRuleCallRule()); }
	 ruleAbstractRuleCall
{ after(grammarAccess.getAbstractRuleCallRule()); } 
	 EOF 
;

// Rule AbstractRuleCall
ruleAbstractRuleCall 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractRuleCallAccess().getRuleAssignment()); }
		(rule__AbstractRuleCall__RuleAssignment)
		{ after(grammarAccess.getAbstractRuleCallAccess().getRuleAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractRule__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractRuleAccess().getFirstAbstractRuleChildParserRuleCall_0()); }
		ruleFirstAbstractRuleChild
		{ after(grammarAccess.getAbstractRuleAccess().getFirstAbstractRuleChildParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractRuleAccess().getSecondAbstractRuleChildParserRuleCall_1()); }
		ruleSecondAbstractRuleChild
		{ after(grammarAccess.getAbstractRuleAccess().getSecondAbstractRuleChildParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Start__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Start__Group__0__Impl
	rule__Start__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Start__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartAccess().getAbstractRulesKeyword_0()); }
	'abstract rules'
	{ after(grammarAccess.getStartAccess().getAbstractRulesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Start__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Start__Group__1__Impl
	rule__Start__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Start__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getStartAccess().getRulesAssignment_1()); }
		(rule__Start__RulesAssignment_1)
		{ after(grammarAccess.getStartAccess().getRulesAssignment_1()); }
	)
	(
		{ before(grammarAccess.getStartAccess().getRulesAssignment_1()); }
		(rule__Start__RulesAssignment_1)*
		{ after(grammarAccess.getStartAccess().getRulesAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Start__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Start__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Start__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartAccess().getEndKeyword_2()); }
	'end'
	{ after(grammarAccess.getStartAccess().getEndKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FirstAbstractRuleChild__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FirstAbstractRuleChild__Group__0__Impl
	rule__FirstAbstractRuleChild__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FirstAbstractRuleChild__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFirstAbstractRuleChildAccess().getNameAssignment_0()); }
	(rule__FirstAbstractRuleChild__NameAssignment_0)
	{ after(grammarAccess.getFirstAbstractRuleChildAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FirstAbstractRuleChild__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FirstAbstractRuleChild__Group__1__Impl
	rule__FirstAbstractRuleChild__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FirstAbstractRuleChild__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFirstAbstractRuleChildAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getFirstAbstractRuleChildAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FirstAbstractRuleChild__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FirstAbstractRuleChild__Group__2__Impl
	rule__FirstAbstractRuleChild__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FirstAbstractRuleChild__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getFirstAbstractRuleChildAccess().getElementsAssignment_2()); }
		(rule__FirstAbstractRuleChild__ElementsAssignment_2)
		{ after(grammarAccess.getFirstAbstractRuleChildAccess().getElementsAssignment_2()); }
	)
	(
		{ before(grammarAccess.getFirstAbstractRuleChildAccess().getElementsAssignment_2()); }
		(rule__FirstAbstractRuleChild__ElementsAssignment_2)*
		{ after(grammarAccess.getFirstAbstractRuleChildAccess().getElementsAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FirstAbstractRuleChild__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FirstAbstractRuleChild__Group__3__Impl
	rule__FirstAbstractRuleChild__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FirstAbstractRuleChild__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFirstAbstractRuleChildAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getFirstAbstractRuleChildAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FirstAbstractRuleChild__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FirstAbstractRuleChild__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FirstAbstractRuleChild__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFirstAbstractRuleChildAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getFirstAbstractRuleChildAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SecondAbstractRuleChild__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecondAbstractRuleChild__Group__0__Impl
	rule__SecondAbstractRuleChild__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondAbstractRuleChild__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecondAbstractRuleChildAccess().getNameAssignment_0()); }
	(rule__SecondAbstractRuleChild__NameAssignment_0)
	{ after(grammarAccess.getSecondAbstractRuleChildAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondAbstractRuleChild__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecondAbstractRuleChild__Group__1__Impl
	rule__SecondAbstractRuleChild__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondAbstractRuleChild__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecondAbstractRuleChildAccess().getRuleKeyword_1()); }
	'rule'
	{ after(grammarAccess.getSecondAbstractRuleChildAccess().getRuleKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondAbstractRuleChild__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecondAbstractRuleChild__Group__2__Impl
	rule__SecondAbstractRuleChild__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondAbstractRuleChild__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecondAbstractRuleChildAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getSecondAbstractRuleChildAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondAbstractRuleChild__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecondAbstractRuleChild__Group__3__Impl
	rule__SecondAbstractRuleChild__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondAbstractRuleChild__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecondAbstractRuleChildAccess().getRuleAssignment_3()); }
	(rule__SecondAbstractRuleChild__RuleAssignment_3)
	{ after(grammarAccess.getSecondAbstractRuleChildAccess().getRuleAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondAbstractRuleChild__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SecondAbstractRuleChild__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondAbstractRuleChild__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSecondAbstractRuleChildAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getSecondAbstractRuleChildAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Start__RulesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStartAccess().getRulesAbstractRuleParserRuleCall_1_0()); }
		ruleAbstractRule
		{ after(grammarAccess.getStartAccess().getRulesAbstractRuleParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FirstAbstractRuleChild__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFirstAbstractRuleChildAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getFirstAbstractRuleChildAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FirstAbstractRuleChild__ElementsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFirstAbstractRuleChildAccess().getElementsAbstractRuleParserRuleCall_2_0()); }
		ruleAbstractRule
		{ after(grammarAccess.getFirstAbstractRuleChildAccess().getElementsAbstractRuleParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondAbstractRuleChild__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecondAbstractRuleChildAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getSecondAbstractRuleChildAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SecondAbstractRuleChild__RuleAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSecondAbstractRuleChildAccess().getRuleAbstractRuleCallParserRuleCall_3_0()); }
		ruleAbstractRuleCall
		{ after(grammarAccess.getSecondAbstractRuleChildAccess().getRuleAbstractRuleCallParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractRuleCall__RuleAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractRuleCallAccess().getRuleAbstractRuleCrossReference_0()); }
		(
			{ before(grammarAccess.getAbstractRuleCallAccess().getRuleAbstractRuleIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAbstractRuleCallAccess().getRuleAbstractRuleIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getAbstractRuleCallAccess().getRuleAbstractRuleCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
