/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug348199TestLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.eclipse.xtext.ui.tests.editor.contentassist.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.xtext.ui.tests.editor.contentassist.ide.contentassist.antlr.internal;

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
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug348199TestLanguageGrammarAccess;

}
@parser::members {
	private Bug348199TestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(Bug348199TestLanguageGrammarAccess grammarAccess) {
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

// Entry rule entryRuleTimeperiod
entryRuleTimeperiod
:
{ before(grammarAccess.getTimeperiodRule()); }
	 ruleTimeperiod
{ after(grammarAccess.getTimeperiodRule()); } 
	 EOF 
;

// Rule Timeperiod
ruleTimeperiod 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup()); }
		(rule__Timeperiod__Group__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTimeDef1
entryRuleTimeDef1
:
{ before(grammarAccess.getTimeDef1Rule()); }
	 ruleTimeDef1
{ after(grammarAccess.getTimeDef1Rule()); } 
	 EOF 
;

// Rule TimeDef1
ruleTimeDef1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimeDef1Access().getGroup()); }
		(rule__TimeDef1__Group__0)
		{ after(grammarAccess.getTimeDef1Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTimeDef2
entryRuleTimeDef2
:
{ before(grammarAccess.getTimeDef2Rule()); }
	 ruleTimeDef2
{ after(grammarAccess.getTimeDef2Rule()); } 
	 EOF 
;

// Rule TimeDef2
ruleTimeDef2 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimeDef2Access().getGroup()); }
		(rule__TimeDef2__Group__0)
		{ after(grammarAccess.getTimeDef2Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTimeDef3
entryRuleTimeDef3
:
{ before(grammarAccess.getTimeDef3Rule()); }
	 ruleTimeDef3
{ after(grammarAccess.getTimeDef3Rule()); } 
	 EOF 
;

// Rule TimeDef3
ruleTimeDef3 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimeDef3Access().getGroup()); }
		(rule__TimeDef3__Group__0)
		{ after(grammarAccess.getTimeDef3Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_0()); }
		(rule__Timeperiod__Group_3_0__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_1()); }
		(rule__Timeperiod__Group_3_1__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_1()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_2()); }
		(rule__Timeperiod__Group_3_2__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_2()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_3()); }
		(rule__Timeperiod__Group_3_3__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_3()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_4()); }
		(rule__Timeperiod__Group_3_4__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_4()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_5()); }
		(rule__Timeperiod__Group_3_5__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_5()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_6()); }
		(rule__Timeperiod__Group_3_6__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_6()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_7()); }
		(rule__Timeperiod__Group_3_7__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Alternatives_3_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_1_3_0()); }
		(rule__Timeperiod__Group_3_1_3_0__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_1_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_1_3_1()); }
		(rule__Timeperiod__Group_3_1_3_1__0)?
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_1_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Alternatives_3_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_2_3_0()); }
		(rule__Timeperiod__Group_3_2_3_0__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_2_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_2_3_1()); }
		(rule__Timeperiod__Group_3_2_3_1__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_2_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Alternatives_3_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_3_3_0()); }
		(rule__Timeperiod__Group_3_3_3_0__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_3_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_3_3_1()); }
		(rule__Timeperiod__Group_3_3_3_1__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_3_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Alternatives_3_5_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_5_4_0()); }
		(rule__Timeperiod__Group_3_5_4_0__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_5_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_5_4_1()); }
		(rule__Timeperiod__Group_3_5_4_1__0)?
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_5_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Alternatives_3_6_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_6_4_0()); }
		(rule__Timeperiod__Group_3_6_4_0__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_6_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_6_4_1()); }
		(rule__Timeperiod__Group_3_6_4_1__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_6_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Alternatives_3_7_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_7_4_0()); }
		(rule__Timeperiod__Group_3_7_4_0__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_7_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimeperiodAccess().getGroup_3_7_4_1()); }
		(rule__Timeperiod__Group_3_7_4_1__0)
		{ after(grammarAccess.getTimeperiodAccess().getGroup_3_7_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group__0__Impl
	rule__Timeperiod__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeperiodAction_0()); }
	()
	{ after(grammarAccess.getTimeperiodAccess().getTimeperiodAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group__1__Impl
	rule__Timeperiod__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getDefineKeyword_1()); }
	'define'
	{ after(grammarAccess.getTimeperiodAccess().getDefineKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group__2__Impl
	rule__Timeperiod__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeperiodKeyword_2()); }
	'timeperiod'
	{ after(grammarAccess.getTimeperiodAccess().getTimeperiodKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAlternatives_3()); }
	(rule__Timeperiod__Alternatives_3)
	{ after(grammarAccess.getTimeperiodAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0__0__Impl
	rule__Timeperiod__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getDigitOneKeyword_3_0_0()); }
	'1'
	{ after(grammarAccess.getTimeperiodAccess().getDigitOneKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0__1__Impl
	rule__Timeperiod__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_0_1()); }
	'{'
	{ after(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0__2__Impl
	rule__Timeperiod__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_0_2()); }
	(rule__Timeperiod__Group_3_0_2__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0__3__Impl
	rule__Timeperiod__Group_3_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_0_3()); }
	(rule__Timeperiod__UnorderedGroup_3_0_3)
	{ after(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0__4__Impl
	rule__Timeperiod__Group_3_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_4()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_4()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_4()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_0_5()); }
	'}'
	{ after(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_0_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_2__0__Impl
	rule__Timeperiod__Group_3_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_2_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_2_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_2_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_2_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_0_2_1()); }
	(rule__Timeperiod__TimeAssignment_3_0_2_1)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_0_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_3_0__0__Impl
	rule__Timeperiod__Group_3_0_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_0_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_0_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_0_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_0_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_3_0__1__Impl
	rule__Timeperiod__Group_3_0_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_0_3_0_1()); }
	'timeperiod_name'
	{ after(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_0_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_3_0__2__Impl
	rule__Timeperiod__Group_3_0_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getNameAssignment_3_0_3_0_2()); }
	(rule__Timeperiod__NameAssignment_3_0_3_0_2)
	{ after(grammarAccess.getTimeperiodAccess().getNameAssignment_3_0_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_0_3_0_3()); }
	(rule__Timeperiod__Group_3_0_3_0_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_0_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_0_3_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_3_0_3__0__Impl
	rule__Timeperiod__Group_3_0_3_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_0_3_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_0_3_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_0_3_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_0_3_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_3_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_0_3_0_3_1()); }
	(rule__Timeperiod__TimeAssignment_3_0_3_0_3_1)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_0_3_0_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_0_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_3_1__0__Impl
	rule__Timeperiod__Group_3_0_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_1_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_1_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_1_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_1_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_3_1__1__Impl
	rule__Timeperiod__Group_3_0_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_0_3_1_1()); }
	'otherelement'
	{ after(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_0_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_3_1__2__Impl
	rule__Timeperiod__Group_3_0_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_0_3_1_2()); }
	(rule__Timeperiod__AliasAssignment_3_0_3_1_2)
	{ after(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_0_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_0_3_1_3()); }
	(rule__Timeperiod__Group_3_0_3_1_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_0_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_0_3_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_3_1_3__0__Impl
	rule__Timeperiod__Group_3_0_3_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_1_3_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_1_3_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_1_3_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_0_3_1_3_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_0_3_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_0_3_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_0_3_1_3_1()); }
	(rule__Timeperiod__TimeAssignment_3_0_3_1_3_1)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_0_3_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1__0__Impl
	rule__Timeperiod__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getDigitTwoKeyword_3_1_0()); }
	'2'
	{ after(grammarAccess.getTimeperiodAccess().getDigitTwoKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1__1__Impl
	rule__Timeperiod__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_1_1()); }
	'{'
	{ after(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1__2__Impl
	rule__Timeperiod__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_1_2()); }
	(rule__Timeperiod__Group_3_1_2__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1__3__Impl
	rule__Timeperiod__Group_3_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAlternatives_3_1_3()); }
	(rule__Timeperiod__Alternatives_3_1_3)
	{ after(grammarAccess.getTimeperiodAccess().getAlternatives_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1__4__Impl
	rule__Timeperiod__Group_3_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_4()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_4()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_4()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_1_5()); }
	'}'
	{ after(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_2__0__Impl
	rule__Timeperiod__Group_3_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_2_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_2_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_2_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_2_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_1_2_1()); }
	(rule__Timeperiod__TimeAssignment_3_1_2_1)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_1_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_3_0__0__Impl
	rule__Timeperiod__Group_3_1_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_0_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_0_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_0_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_0_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_3_0__1__Impl
	rule__Timeperiod__Group_3_1_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_1_3_0_1()); }
	'timeperiod_name'
	{ after(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_1_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_3_0__2__Impl
	rule__Timeperiod__Group_3_1_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getNameAssignment_3_1_3_0_2()); }
	(rule__Timeperiod__NameAssignment_3_1_3_0_2)
	{ after(grammarAccess.getTimeperiodAccess().getNameAssignment_3_1_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_1_3_0_3()); }
	(rule__Timeperiod__Group_3_1_3_0_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_1_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_1_3_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_3_0_3__0__Impl
	rule__Timeperiod__Group_3_1_3_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_0_3_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_0_3_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_0_3_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_0_3_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_3_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_1_3_0_3_1()); }
	(rule__Timeperiod__TimeAssignment_3_1_3_0_3_1)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_1_3_0_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_1_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_3_1__0__Impl
	rule__Timeperiod__Group_3_1_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_1_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_1_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_1_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_1_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_3_1__1__Impl
	rule__Timeperiod__Group_3_1_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_1_3_1_1()); }
	'otherelement'
	{ after(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_1_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_3_1__2__Impl
	rule__Timeperiod__Group_3_1_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_1_3_1_2()); }
	(rule__Timeperiod__AliasAssignment_3_1_3_1_2)
	{ after(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_1_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_1_3_1_3()); }
	(rule__Timeperiod__Group_3_1_3_1_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_1_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_1_3_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_3_1_3__0__Impl
	rule__Timeperiod__Group_3_1_3_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_1_3_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_1_3_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_1_3_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_1_3_1_3_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_1_3_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_1_3_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_1_3_1_3_1()); }
	(rule__Timeperiod__TimeAssignment_3_1_3_1_3_1)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_1_3_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2__0__Impl
	rule__Timeperiod__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getDigitThreeKeyword_3_2_0()); }
	'3'
	{ after(grammarAccess.getTimeperiodAccess().getDigitThreeKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2__1__Impl
	rule__Timeperiod__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_2_1()); }
	'{'
	{ after(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2__2__Impl
	rule__Timeperiod__Group_3_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_2_2()); }
	(rule__Timeperiod__Group_3_2_2__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2__3__Impl
	rule__Timeperiod__Group_3_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getAlternatives_3_2_3()); }
		(rule__Timeperiod__Alternatives_3_2_3)
		{ after(grammarAccess.getTimeperiodAccess().getAlternatives_3_2_3()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getAlternatives_3_2_3()); }
		(rule__Timeperiod__Alternatives_3_2_3)*
		{ after(grammarAccess.getTimeperiodAccess().getAlternatives_3_2_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2__4__Impl
	rule__Timeperiod__Group_3_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_4()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_4()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_4()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_2_5()); }
	'}'
	{ after(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_2_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_2__0__Impl
	rule__Timeperiod__Group_3_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_2_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_2_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_2_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_2_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_2_2_1()); }
	(rule__Timeperiod__TimeAssignment_3_2_2_1)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_2_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_3_0__0__Impl
	rule__Timeperiod__Group_3_2_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_0_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_0_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_0_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_0_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_3_0__1__Impl
	rule__Timeperiod__Group_3_2_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_2_3_0_1()); }
	'timeperiod_name'
	{ after(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_2_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_3_0__2__Impl
	rule__Timeperiod__Group_3_2_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getNameAssignment_3_2_3_0_2()); }
	(rule__Timeperiod__NameAssignment_3_2_3_0_2)
	{ after(grammarAccess.getTimeperiodAccess().getNameAssignment_3_2_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_2_3_0_3()); }
	(rule__Timeperiod__Group_3_2_3_0_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_2_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_2_3_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_3_0_3__0__Impl
	rule__Timeperiod__Group_3_2_3_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_0_3_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_0_3_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_0_3_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_0_3_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_3_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_2_3_0_3_1()); }
	(rule__Timeperiod__TimeAssignment_3_2_3_0_3_1)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_2_3_0_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_2_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_3_1__0__Impl
	rule__Timeperiod__Group_3_2_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_1_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_1_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_1_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_1_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_3_1__1__Impl
	rule__Timeperiod__Group_3_2_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_2_3_1_1()); }
	'otherelement'
	{ after(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_2_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_3_1__2__Impl
	rule__Timeperiod__Group_3_2_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_2_3_1_2()); }
	(rule__Timeperiod__AliasAssignment_3_2_3_1_2)
	{ after(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_2_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_2_3_1_3()); }
	(rule__Timeperiod__Group_3_2_3_1_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_2_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_2_3_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_3_1_3__0__Impl
	rule__Timeperiod__Group_3_2_3_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_1_3_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_1_3_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_1_3_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_2_3_1_3_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_2_3_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_2_3_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_2_3_1_3_1()); }
	(rule__Timeperiod__TimeAssignment_3_2_3_1_3_1)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_2_3_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3__0__Impl
	rule__Timeperiod__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getDigitFourKeyword_3_3_0()); }
	'4'
	{ after(grammarAccess.getTimeperiodAccess().getDigitFourKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3__1__Impl
	rule__Timeperiod__Group_3_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_3_1()); }
	'{'
	{ after(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3__2__Impl
	rule__Timeperiod__Group_3_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_3_2()); }
	(rule__Timeperiod__Group_3_3_2__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3__3__Impl
	rule__Timeperiod__Group_3_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAlternatives_3_3_3()); }
	(rule__Timeperiod__Alternatives_3_3_3)*
	{ after(grammarAccess.getTimeperiodAccess().getAlternatives_3_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3__4__Impl
	rule__Timeperiod__Group_3_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_4()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_4()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_4()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_3_5()); }
	'}'
	{ after(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_3_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_2__0__Impl
	rule__Timeperiod__Group_3_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_2_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_2_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_2_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_2_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_3_2_1()); }
	(rule__Timeperiod__TimeAssignment_3_3_2_1)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_3_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_3_0__0__Impl
	rule__Timeperiod__Group_3_3_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_0_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_0_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_0_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_0_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_3_0__1__Impl
	rule__Timeperiod__Group_3_3_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_3_3_0_1()); }
	'timeperiod_name'
	{ after(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_3_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_3_0__2__Impl
	rule__Timeperiod__Group_3_3_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getNameAssignment_3_3_3_0_2()); }
	(rule__Timeperiod__NameAssignment_3_3_3_0_2)
	{ after(grammarAccess.getTimeperiodAccess().getNameAssignment_3_3_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_3_3_0_3()); }
	(rule__Timeperiod__Group_3_3_3_0_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_3_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_3_3_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_3_0_3__0__Impl
	rule__Timeperiod__Group_3_3_3_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_0_3_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_0_3_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_0_3_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_0_3_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_3_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_3_3_0_3_1()); }
	(rule__Timeperiod__TimeAssignment_3_3_3_0_3_1)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_3_3_0_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_3_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_3_1__0__Impl
	rule__Timeperiod__Group_3_3_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_1_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_1_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_1_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_1_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_3_1__1__Impl
	rule__Timeperiod__Group_3_3_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_3_3_1_1()); }
	'otherelement'
	{ after(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_3_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_3_1__2__Impl
	rule__Timeperiod__Group_3_3_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_3_3_1_2()); }
	(rule__Timeperiod__AliasAssignment_3_3_3_1_2)
	{ after(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_3_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_3_3_1_3()); }
	(rule__Timeperiod__Group_3_3_3_1_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_3_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_3_3_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_3_1_3__0__Impl
	rule__Timeperiod__Group_3_3_3_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_1_3_0()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_1_3_0()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_1_3_0()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_3_3_1_3_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_3_3_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_3_3_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_3_3_1_3_1()); }
	(rule__Timeperiod__TimeAssignment_3_3_3_1_3_1)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_3_3_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4__0__Impl
	rule__Timeperiod__Group_3_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getDigitFiveKeyword_3_4_0()); }
	'5'
	{ after(grammarAccess.getTimeperiodAccess().getDigitFiveKeyword_3_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4__1__Impl
	rule__Timeperiod__Group_3_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_4_1()); }
	'{'
	{ after(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4__2__Impl
	rule__Timeperiod__Group_3_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_2()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_2()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4__3__Impl
	rule__Timeperiod__Group_3_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_4_3()); }
	(rule__Timeperiod__Group_3_4_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4__4__Impl
	rule__Timeperiod__Group_3_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_4_4()); }
	(rule__Timeperiod__UnorderedGroup_3_4_4)
	{ after(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_4_5()); }
	'}'
	{ after(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_4_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_3__0__Impl
	rule__Timeperiod__Group_3_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_4_3_0()); }
	(rule__Timeperiod__TimeAssignment_3_4_3_0)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_3_1()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_3_1()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_3_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_4_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_4_0__0__Impl
	rule__Timeperiod__Group_3_4_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_4_4_0_0()); }
	'timeperiod_name'
	{ after(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_4_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_4_0__1__Impl
	rule__Timeperiod__Group_3_4_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getNameAssignment_3_4_4_0_1()); }
	(rule__Timeperiod__NameAssignment_3_4_4_0_1)
	{ after(grammarAccess.getTimeperiodAccess().getNameAssignment_3_4_4_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_4_0__2__Impl
	rule__Timeperiod__Group_3_4_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_0_2()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_0_2()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_0_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_0_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_4_4_0_3()); }
	(rule__Timeperiod__Group_3_4_4_0_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_4_4_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_4_4_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_4_0_3__0__Impl
	rule__Timeperiod__Group_3_4_4_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_4_4_0_3_0()); }
	(rule__Timeperiod__TimeAssignment_3_4_4_0_3_0)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_4_4_0_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_4_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_0_3_1()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_0_3_1()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_0_3_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_0_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_4_4_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_4_1__0__Impl
	rule__Timeperiod__Group_3_4_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_4_4_1_0()); }
	'otherelement'
	{ after(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_4_4_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_4_1__1__Impl
	rule__Timeperiod__Group_3_4_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_4_4_1_1()); }
	(rule__Timeperiod__AliasAssignment_3_4_4_1_1)
	{ after(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_4_4_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_4_1__2__Impl
	rule__Timeperiod__Group_3_4_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_1_2()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_1_2()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_1_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_1_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_4_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_4_4_1_3()); }
	(rule__Timeperiod__Group_3_4_4_1_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_4_4_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_4_4_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_4_1_3__0__Impl
	rule__Timeperiod__Group_3_4_4_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_4_4_1_3_0()); }
	(rule__Timeperiod__TimeAssignment_3_4_4_1_3_0)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_4_4_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_4_4_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_4_4_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_1_3_1()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_1_3_1()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_1_3_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_4_4_1_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5__0__Impl
	rule__Timeperiod__Group_3_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getDigitSixKeyword_3_5_0()); }
	'6'
	{ after(grammarAccess.getTimeperiodAccess().getDigitSixKeyword_3_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5__1__Impl
	rule__Timeperiod__Group_3_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_5_1()); }
	'{'
	{ after(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5__2__Impl
	rule__Timeperiod__Group_3_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_2()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_2()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5__3__Impl
	rule__Timeperiod__Group_3_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_5_3()); }
	(rule__Timeperiod__Group_3_5_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5__4__Impl
	rule__Timeperiod__Group_3_5__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAlternatives_3_5_4()); }
	(rule__Timeperiod__Alternatives_3_5_4)
	{ after(grammarAccess.getTimeperiodAccess().getAlternatives_3_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_5_5()); }
	'}'
	{ after(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_5_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_5_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_3__0__Impl
	rule__Timeperiod__Group_3_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_5_3_0()); }
	(rule__Timeperiod__TimeAssignment_3_5_3_0)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_5_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_3_1()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_3_1()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_3_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_5_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_4_0__0__Impl
	rule__Timeperiod__Group_3_5_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_5_4_0_0()); }
	'timeperiod_name'
	{ after(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_5_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_4_0__1__Impl
	rule__Timeperiod__Group_3_5_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getNameAssignment_3_5_4_0_1()); }
	(rule__Timeperiod__NameAssignment_3_5_4_0_1)
	{ after(grammarAccess.getTimeperiodAccess().getNameAssignment_3_5_4_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_4_0__2__Impl
	rule__Timeperiod__Group_3_5_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_0_2()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_0_2()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_0_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_0_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_5_4_0_3()); }
	(rule__Timeperiod__Group_3_5_4_0_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_5_4_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_5_4_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_4_0_3__0__Impl
	rule__Timeperiod__Group_3_5_4_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_5_4_0_3_0()); }
	(rule__Timeperiod__TimeAssignment_3_5_4_0_3_0)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_5_4_0_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_4_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_0_3_1()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_0_3_1()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_0_3_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_0_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_5_4_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_4_1__0__Impl
	rule__Timeperiod__Group_3_5_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_5_4_1_0()); }
	'otherelement'
	{ after(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_5_4_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_4_1__1__Impl
	rule__Timeperiod__Group_3_5_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_5_4_1_1()); }
	(rule__Timeperiod__AliasAssignment_3_5_4_1_1)
	{ after(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_5_4_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_4_1__2__Impl
	rule__Timeperiod__Group_3_5_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_1_2()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_1_2()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_1_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_1_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_4_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_5_4_1_3()); }
	(rule__Timeperiod__Group_3_5_4_1_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_5_4_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_5_4_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_4_1_3__0__Impl
	rule__Timeperiod__Group_3_5_4_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_5_4_1_3_0()); }
	(rule__Timeperiod__TimeAssignment_3_5_4_1_3_0)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_5_4_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_5_4_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_5_4_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_1_3_1()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_1_3_1()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_1_3_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_5_4_1_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6__0__Impl
	rule__Timeperiod__Group_3_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getDigitSevenKeyword_3_6_0()); }
	'7'
	{ after(grammarAccess.getTimeperiodAccess().getDigitSevenKeyword_3_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6__1__Impl
	rule__Timeperiod__Group_3_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_6_1()); }
	'{'
	{ after(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6__2__Impl
	rule__Timeperiod__Group_3_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_2()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_2()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6__3__Impl
	rule__Timeperiod__Group_3_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_6_3()); }
	(rule__Timeperiod__Group_3_6_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6__4__Impl
	rule__Timeperiod__Group_3_6__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getAlternatives_3_6_4()); }
		(rule__Timeperiod__Alternatives_3_6_4)
		{ after(grammarAccess.getTimeperiodAccess().getAlternatives_3_6_4()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getAlternatives_3_6_4()); }
		(rule__Timeperiod__Alternatives_3_6_4)*
		{ after(grammarAccess.getTimeperiodAccess().getAlternatives_3_6_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_6_5()); }
	'}'
	{ after(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_6_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_6_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_3__0__Impl
	rule__Timeperiod__Group_3_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_6_3_0()); }
	(rule__Timeperiod__TimeAssignment_3_6_3_0)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_6_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_3_1()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_3_1()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_3_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_6_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_4_0__0__Impl
	rule__Timeperiod__Group_3_6_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_6_4_0_0()); }
	'timeperiod_name'
	{ after(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_6_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_4_0__1__Impl
	rule__Timeperiod__Group_3_6_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getNameAssignment_3_6_4_0_1()); }
	(rule__Timeperiod__NameAssignment_3_6_4_0_1)
	{ after(grammarAccess.getTimeperiodAccess().getNameAssignment_3_6_4_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_4_0__2__Impl
	rule__Timeperiod__Group_3_6_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_0_2()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_0_2()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_0_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_0_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_6_4_0_3()); }
	(rule__Timeperiod__Group_3_6_4_0_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_6_4_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_6_4_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_4_0_3__0__Impl
	rule__Timeperiod__Group_3_6_4_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_6_4_0_3_0()); }
	(rule__Timeperiod__TimeAssignment_3_6_4_0_3_0)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_6_4_0_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_4_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_0_3_1()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_0_3_1()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_0_3_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_0_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_6_4_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_4_1__0__Impl
	rule__Timeperiod__Group_3_6_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_6_4_1_0()); }
	'otherelement'
	{ after(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_6_4_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_4_1__1__Impl
	rule__Timeperiod__Group_3_6_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_6_4_1_1()); }
	(rule__Timeperiod__AliasAssignment_3_6_4_1_1)
	{ after(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_6_4_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_4_1__2__Impl
	rule__Timeperiod__Group_3_6_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_1_2()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_1_2()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_1_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_1_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_4_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_6_4_1_3()); }
	(rule__Timeperiod__Group_3_6_4_1_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_6_4_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_6_4_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_4_1_3__0__Impl
	rule__Timeperiod__Group_3_6_4_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_6_4_1_3_0()); }
	(rule__Timeperiod__TimeAssignment_3_6_4_1_3_0)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_6_4_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_6_4_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_6_4_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_1_3_1()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_1_3_1()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_1_3_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_6_4_1_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7__0__Impl
	rule__Timeperiod__Group_3_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getDigitEightKeyword_3_7_0()); }
	'8'
	{ after(grammarAccess.getTimeperiodAccess().getDigitEightKeyword_3_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7__1__Impl
	rule__Timeperiod__Group_3_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_7_1()); }
	'{'
	{ after(grammarAccess.getTimeperiodAccess().getLeftCurlyBracketKeyword_3_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7__2__Impl
	rule__Timeperiod__Group_3_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_2()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_2()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7__3__Impl
	rule__Timeperiod__Group_3_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_7_3()); }
	(rule__Timeperiod__Group_3_7_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7__4__Impl
	rule__Timeperiod__Group_3_7__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAlternatives_3_7_4()); }
	(rule__Timeperiod__Alternatives_3_7_4)*
	{ after(grammarAccess.getTimeperiodAccess().getAlternatives_3_7_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_7_5()); }
	'}'
	{ after(grammarAccess.getTimeperiodAccess().getRightCurlyBracketKeyword_3_7_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_7_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_3__0__Impl
	rule__Timeperiod__Group_3_7_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_7_3_0()); }
	(rule__Timeperiod__TimeAssignment_3_7_3_0)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_7_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_3_1()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_3_1()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_3_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_7_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_4_0__0__Impl
	rule__Timeperiod__Group_3_7_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_7_4_0_0()); }
	'timeperiod_name'
	{ after(grammarAccess.getTimeperiodAccess().getTimeperiod_nameKeyword_3_7_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_4_0__1__Impl
	rule__Timeperiod__Group_3_7_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getNameAssignment_3_7_4_0_1()); }
	(rule__Timeperiod__NameAssignment_3_7_4_0_1)
	{ after(grammarAccess.getTimeperiodAccess().getNameAssignment_3_7_4_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_4_0__2__Impl
	rule__Timeperiod__Group_3_7_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_0_2()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_0_2()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_0_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_0_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_7_4_0_3()); }
	(rule__Timeperiod__Group_3_7_4_0_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_7_4_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_7_4_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_4_0_3__0__Impl
	rule__Timeperiod__Group_3_7_4_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_7_4_0_3_0()); }
	(rule__Timeperiod__TimeAssignment_3_7_4_0_3_0)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_7_4_0_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_4_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_0_3_1()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_0_3_1()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_0_3_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_0_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_7_4_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_4_1__0__Impl
	rule__Timeperiod__Group_3_7_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_7_4_1_0()); }
	'otherelement'
	{ after(grammarAccess.getTimeperiodAccess().getOtherelementKeyword_3_7_4_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_4_1__1__Impl
	rule__Timeperiod__Group_3_7_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_7_4_1_1()); }
	(rule__Timeperiod__AliasAssignment_3_7_4_1_1)
	{ after(grammarAccess.getTimeperiodAccess().getAliasAssignment_3_7_4_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_4_1__2__Impl
	rule__Timeperiod__Group_3_7_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_1_2()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_1_2()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_1_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_1_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_4_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getGroup_3_7_4_1_3()); }
	(rule__Timeperiod__Group_3_7_4_1_3__0)*
	{ after(grammarAccess.getTimeperiodAccess().getGroup_3_7_4_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__Group_3_7_4_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_4_1_3__0__Impl
	rule__Timeperiod__Group_3_7_4_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_7_4_1_3_0()); }
	(rule__Timeperiod__TimeAssignment_3_7_4_1_3_0)
	{ after(grammarAccess.getTimeperiodAccess().getTimeAssignment_3_7_4_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__Group_3_7_4_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__Group_3_7_4_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_1_3_1()); }
		(RULE_NL)
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_1_3_1()); }
	)
	(
		{ before(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_1_3_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getTimeperiodAccess().getNLTerminalRuleCall_3_7_4_1_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimeDef1__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeDef1__Group__0__Impl
	rule__TimeDef1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeDef1__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeDef1Access().getJulyKeyword_0()); }
	'july'
	{ after(grammarAccess.getTimeDef1Access().getJulyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeDef1__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeDef1__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeDef1__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeDef1Access().getDayAssignment_1()); }
	(rule__TimeDef1__DayAssignment_1)
	{ after(grammarAccess.getTimeDef1Access().getDayAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimeDef2__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeDef2__Group__0__Impl
	rule__TimeDef2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeDef2__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeDef2Access().getAugustKeyword_0()); }
	'august'
	{ after(grammarAccess.getTimeDef2Access().getAugustKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeDef2__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeDef2__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeDef2__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeDef2Access().getDayAssignment_1()); }
	(rule__TimeDef2__DayAssignment_1)
	{ after(grammarAccess.getTimeDef2Access().getDayAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimeDef3__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeDef3__Group__0__Impl
	rule__TimeDef3__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeDef3__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeDef3Access().getSeptemberKeyword_0()); }
	'september'
	{ after(grammarAccess.getTimeDef3Access().getSeptemberKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeDef3__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeDef3__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeDef3__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeDef3Access().getDayAssignment_1()); }
	(rule__TimeDef3__DayAssignment_1)
	{ after(grammarAccess.getTimeDef3Access().getDayAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__UnorderedGroup_3_0_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_0_3());
	}
:
	rule__Timeperiod__UnorderedGroup_3_0_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_0_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_0_3());
	restoreStackSize(stackSize);
}

rule__Timeperiod__UnorderedGroup_3_0_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_0_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_0_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTimeperiodAccess().getGroup_3_0_3_0()); }
					(rule__Timeperiod__Group_3_0_3_0__0)
					{ after(grammarAccess.getTimeperiodAccess().getGroup_3_0_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_0_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_0_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTimeperiodAccess().getGroup_3_0_3_1()); }
					(rule__Timeperiod__Group_3_0_3_1__0)
					{ after(grammarAccess.getTimeperiodAccess().getGroup_3_0_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_0_3());
	restoreStackSize(stackSize);
}

rule__Timeperiod__UnorderedGroup_3_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__UnorderedGroup_3_0_3__Impl
	rule__Timeperiod__UnorderedGroup_3_0_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__UnorderedGroup_3_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__UnorderedGroup_3_0_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__UnorderedGroup_3_4_4
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_4_4());
	}
:
	rule__Timeperiod__UnorderedGroup_3_4_4__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_4_4())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_4_4());
	restoreStackSize(stackSize);
}

rule__Timeperiod__UnorderedGroup_3_4_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_4_4(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_4_4(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTimeperiodAccess().getGroup_3_4_4_0()); }
					(rule__Timeperiod__Group_3_4_4_0__0)
					{ after(grammarAccess.getTimeperiodAccess().getGroup_3_4_4_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_4_4(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_4_4(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTimeperiodAccess().getGroup_3_4_4_1()); }
					(rule__Timeperiod__Group_3_4_4_1__0)
					{ after(grammarAccess.getTimeperiodAccess().getGroup_3_4_4_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTimeperiodAccess().getUnorderedGroup_3_4_4());
	restoreStackSize(stackSize);
}

rule__Timeperiod__UnorderedGroup_3_4_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__UnorderedGroup_3_4_4__Impl
	rule__Timeperiod__UnorderedGroup_3_4_4__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__UnorderedGroup_3_4_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Timeperiod__UnorderedGroup_3_4_4__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__Timeperiod__TimeAssignment_3_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_0_2_1_0()); }
		ruleTimeDef1
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__NameAssignment_3_0_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_0_3_0_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_0_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_0_3_0_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_0_3_0_3_1_0()); }
		ruleTimeDef2
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_0_3_0_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__AliasAssignment_3_0_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_0_3_1_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_0_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_0_3_1_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_0_3_1_3_1_0()); }
		ruleTimeDef3
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_0_3_1_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_1_2_1_0()); }
		ruleTimeDef1
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__NameAssignment_3_1_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_1_3_0_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_1_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_1_3_0_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_1_3_0_3_1_0()); }
		ruleTimeDef2
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_1_3_0_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__AliasAssignment_3_1_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_1_3_1_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_1_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_1_3_1_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_1_3_1_3_1_0()); }
		ruleTimeDef3
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_1_3_1_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_2_2_1_0()); }
		ruleTimeDef1
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__NameAssignment_3_2_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_2_3_0_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_2_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_2_3_0_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_2_3_0_3_1_0()); }
		ruleTimeDef2
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_2_3_0_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__AliasAssignment_3_2_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_2_3_1_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_2_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_2_3_1_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_2_3_1_3_1_0()); }
		ruleTimeDef3
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_2_3_1_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_3_2_1_0()); }
		ruleTimeDef1
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__NameAssignment_3_3_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_3_3_0_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_3_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_3_3_0_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_3_3_0_3_1_0()); }
		ruleTimeDef2
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_3_3_0_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__AliasAssignment_3_3_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_3_3_1_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_3_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_3_3_1_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_3_3_1_3_1_0()); }
		ruleTimeDef3
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_3_3_1_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_4_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_4_3_0_0()); }
		ruleTimeDef1
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_4_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__NameAssignment_3_4_4_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_4_4_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_4_4_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_4_4_0_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_4_4_0_3_0_0()); }
		ruleTimeDef2
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_4_4_0_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__AliasAssignment_3_4_4_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_4_4_1_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_4_4_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_4_4_1_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_4_4_1_3_0_0()); }
		ruleTimeDef3
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_4_4_1_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_5_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_5_3_0_0()); }
		ruleTimeDef1
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_5_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__NameAssignment_3_5_4_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_5_4_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_5_4_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_5_4_0_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_5_4_0_3_0_0()); }
		ruleTimeDef2
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_5_4_0_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__AliasAssignment_3_5_4_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_5_4_1_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_5_4_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_5_4_1_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_5_4_1_3_0_0()); }
		ruleTimeDef3
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_5_4_1_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_6_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_6_3_0_0()); }
		ruleTimeDef1
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_6_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__NameAssignment_3_6_4_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_6_4_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_6_4_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_6_4_0_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_6_4_0_3_0_0()); }
		ruleTimeDef2
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_6_4_0_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__AliasAssignment_3_6_4_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_6_4_1_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_6_4_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_6_4_1_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_6_4_1_3_0_0()); }
		ruleTimeDef3
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_6_4_1_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_7_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_7_3_0_0()); }
		ruleTimeDef1
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef1ParserRuleCall_3_7_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__NameAssignment_3_7_4_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_7_4_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getNameIDTerminalRuleCall_3_7_4_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_7_4_0_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_7_4_0_3_0_0()); }
		ruleTimeDef2
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef2ParserRuleCall_3_7_4_0_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__AliasAssignment_3_7_4_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_7_4_1_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeperiodAccess().getAliasIDTerminalRuleCall_3_7_4_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timeperiod__TimeAssignment_3_7_4_1_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_7_4_1_3_0_0()); }
		ruleTimeDef3
		{ after(grammarAccess.getTimeperiodAccess().getTimeTimeDef3ParserRuleCall_3_7_4_1_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeDef1__DayAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeDef1Access().getDayINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getTimeDef1Access().getDayINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeDef2__DayAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeDef2Access().getDayINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getTimeDef2Access().getDayINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeDef3__DayAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeDef3Access().getDayINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getTimeDef3Access().getDayINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_NL : '\r'? '\n';

RULE_WS : (' '|'\t');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ANY_OTHER : .;
