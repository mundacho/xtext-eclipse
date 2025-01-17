/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug348427TestLanguage;

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
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug348427TestLanguageGrammarAccess;

}
@parser::members {
	private Bug348427TestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(Bug348427TestLanguageGrammarAccess grammarAccess) {
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

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getAlternatives()); }
		(rule__Model__Alternatives)
		{ after(grammarAccess.getModelAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario1_1
entryRuleScenario1_1
:
{ before(grammarAccess.getScenario1_1Rule()); }
	 ruleScenario1_1
{ after(grammarAccess.getScenario1_1Rule()); } 
	 EOF 
;

// Rule Scenario1_1
ruleScenario1_1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenario1_1Access().getGroup()); }
		(rule__Scenario1_1__Group__0)
		{ after(grammarAccess.getScenario1_1Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario1_2
entryRuleScenario1_2
:
{ before(grammarAccess.getScenario1_2Rule()); }
	 ruleScenario1_2
{ after(grammarAccess.getScenario1_2Rule()); } 
	 EOF 
;

// Rule Scenario1_2
ruleScenario1_2 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenario1_2Access().getGroup()); }
		(rule__Scenario1_2__Group__0)
		{ after(grammarAccess.getScenario1_2Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario1_3
entryRuleScenario1_3
:
{ before(grammarAccess.getScenario1_3Rule()); }
	 ruleScenario1_3
{ after(grammarAccess.getScenario1_3Rule()); } 
	 EOF 
;

// Rule Scenario1_3
ruleScenario1_3 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenario1_3Access().getGroup()); }
		(rule__Scenario1_3__Group__0)
		{ after(grammarAccess.getScenario1_3Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario1_4
entryRuleScenario1_4
:
{ before(grammarAccess.getScenario1_4Rule()); }
	 ruleScenario1_4
{ after(grammarAccess.getScenario1_4Rule()); } 
	 EOF 
;

// Rule Scenario1_4
ruleScenario1_4 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenario1_4Access().getGroup()); }
		(rule__Scenario1_4__Group__0)
		{ after(grammarAccess.getScenario1_4Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChild1_1
entryRuleChild1_1
:
{ before(grammarAccess.getChild1_1Rule()); }
	 ruleChild1_1
{ after(grammarAccess.getChild1_1Rule()); } 
	 EOF 
;

// Rule Child1_1
ruleChild1_1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChild1_1Access().getGroup()); }
		(rule__Child1_1__Group__0)
		{ after(grammarAccess.getChild1_1Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChild1_2
entryRuleChild1_2
:
{ before(grammarAccess.getChild1_2Rule()); }
	 ruleChild1_2
{ after(grammarAccess.getChild1_2Rule()); } 
	 EOF 
;

// Rule Child1_2
ruleChild1_2 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChild1_2Access().getGroup()); }
		(rule__Child1_2__Group__0)
		{ after(grammarAccess.getChild1_2Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChild1_3
entryRuleChild1_3
:
{ before(grammarAccess.getChild1_3Rule()); }
	 ruleChild1_3
{ after(grammarAccess.getChild1_3Rule()); } 
	 EOF 
;

// Rule Child1_3
ruleChild1_3 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChild1_3Access().getGroup()); }
		(rule__Child1_3__Group__0)
		{ after(grammarAccess.getChild1_3Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario2_1
entryRuleScenario2_1
:
{ before(grammarAccess.getScenario2_1Rule()); }
	 ruleScenario2_1
{ after(grammarAccess.getScenario2_1Rule()); } 
	 EOF 
;

// Rule Scenario2_1
ruleScenario2_1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenario2_1Access().getGroup()); }
		(rule__Scenario2_1__Group__0)
		{ after(grammarAccess.getScenario2_1Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario2_2
entryRuleScenario2_2
:
{ before(grammarAccess.getScenario2_2Rule()); }
	 ruleScenario2_2
{ after(grammarAccess.getScenario2_2Rule()); } 
	 EOF 
;

// Rule Scenario2_2
ruleScenario2_2 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenario2_2Access().getGroup()); }
		(rule__Scenario2_2__Group__0)
		{ after(grammarAccess.getScenario2_2Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario2_3
entryRuleScenario2_3
:
{ before(grammarAccess.getScenario2_3Rule()); }
	 ruleScenario2_3
{ after(grammarAccess.getScenario2_3Rule()); } 
	 EOF 
;

// Rule Scenario2_3
ruleScenario2_3 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenario2_3Access().getGroup()); }
		(rule__Scenario2_3__Group__0)
		{ after(grammarAccess.getScenario2_3Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario2_4
entryRuleScenario2_4
:
{ before(grammarAccess.getScenario2_4Rule()); }
	 ruleScenario2_4
{ after(grammarAccess.getScenario2_4Rule()); } 
	 EOF 
;

// Rule Scenario2_4
ruleScenario2_4 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenario2_4Access().getGroup()); }
		(rule__Scenario2_4__Group__0)
		{ after(grammarAccess.getScenario2_4Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario2_5
entryRuleScenario2_5
:
{ before(grammarAccess.getScenario2_5Rule()); }
	 ruleScenario2_5
{ after(grammarAccess.getScenario2_5Rule()); } 
	 EOF 
;

// Rule Scenario2_5
ruleScenario2_5 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenario2_5Access().getGroup()); }
		(rule__Scenario2_5__Group__0)
		{ after(grammarAccess.getScenario2_5Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario2_6
entryRuleScenario2_6
:
{ before(grammarAccess.getScenario2_6Rule()); }
	 ruleScenario2_6
{ after(grammarAccess.getScenario2_6Rule()); } 
	 EOF 
;

// Rule Scenario2_6
ruleScenario2_6 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenario2_6Access().getGroup()); }
		(rule__Scenario2_6__Group__0)
		{ after(grammarAccess.getScenario2_6Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario2_7
entryRuleScenario2_7
:
{ before(grammarAccess.getScenario2_7Rule()); }
	 ruleScenario2_7
{ after(grammarAccess.getScenario2_7Rule()); } 
	 EOF 
;

// Rule Scenario2_7
ruleScenario2_7 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenario2_7Access().getGroup()); }
		(rule__Scenario2_7__Group__0)
		{ after(grammarAccess.getScenario2_7Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario2_8
entryRuleScenario2_8
:
{ before(grammarAccess.getScenario2_8Rule()); }
	 ruleScenario2_8
{ after(grammarAccess.getScenario2_8Rule()); } 
	 EOF 
;

// Rule Scenario2_8
ruleScenario2_8 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenario2_8Access().getGroup()); }
		(rule__Scenario2_8__Group__0)
		{ after(grammarAccess.getScenario2_8Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChild2_1
entryRuleChild2_1
:
{ before(grammarAccess.getChild2_1Rule()); }
	 ruleChild2_1
{ after(grammarAccess.getChild2_1Rule()); } 
	 EOF 
;

// Rule Child2_1
ruleChild2_1 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChild2_1Access().getGroup()); }
		(rule__Child2_1__Group__0)
		{ after(grammarAccess.getChild2_1Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChild2_2
entryRuleChild2_2
:
{ before(grammarAccess.getChild2_2Rule()); }
	 ruleChild2_2
{ after(grammarAccess.getChild2_2Rule()); } 
	 EOF 
;

// Rule Child2_2
ruleChild2_2 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChild2_2Access().getGroup()); }
		(rule__Child2_2__Group__0)
		{ after(grammarAccess.getChild2_2Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChild2_3
entryRuleChild2_3
:
{ before(grammarAccess.getChild2_3Rule()); }
	 ruleChild2_3
{ after(grammarAccess.getChild2_3Rule()); } 
	 EOF 
;

// Rule Child2_3
ruleChild2_3 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChild2_3Access().getGroup()); }
		(rule__Child2_3__Group__0)
		{ after(grammarAccess.getChild2_3Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChild2_4
entryRuleChild2_4
:
{ before(grammarAccess.getChild2_4Rule()); }
	 ruleChild2_4
{ after(grammarAccess.getChild2_4Rule()); } 
	 EOF 
;

// Rule Child2_4
ruleChild2_4 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChild2_4Access().getGroup()); }
		(rule__Child2_4__Group__0)
		{ after(grammarAccess.getChild2_4Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChild2_5
entryRuleChild2_5
:
{ before(grammarAccess.getChild2_5Rule()); }
	 ruleChild2_5
{ after(grammarAccess.getChild2_5Rule()); } 
	 EOF 
;

// Rule Child2_5
ruleChild2_5 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChild2_5Access().getGroup()); }
		(rule__Child2_5__Group__0)
		{ after(grammarAccess.getChild2_5Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChild2_6
entryRuleChild2_6
:
{ before(grammarAccess.getChild2_6Rule()); }
	 ruleChild2_6
{ after(grammarAccess.getChild2_6Rule()); } 
	 EOF 
;

// Rule Child2_6
ruleChild2_6 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChild2_6Access().getGroup()); }
		(rule__Child2_6__Group__0)
		{ after(grammarAccess.getChild2_6Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule EnumType
ruleEnumType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumTypeAccess().getAlternatives()); }
		(rule__EnumType__Alternatives)
		{ after(grammarAccess.getEnumTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement1Assignment_0()); }
		(rule__Model__Element1Assignment_0)
		{ after(grammarAccess.getModelAccess().getElement1Assignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getElement1Assignment_1()); }
		(rule__Model__Element1Assignment_1)
		{ after(grammarAccess.getModelAccess().getElement1Assignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getElement1Assignment_2()); }
		(rule__Model__Element1Assignment_2)
		{ after(grammarAccess.getModelAccess().getElement1Assignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getElement1Assignment_3()); }
		(rule__Model__Element1Assignment_3)
		{ after(grammarAccess.getModelAccess().getElement1Assignment_3()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getElement2Assignment_4()); }
		(rule__Model__Element2Assignment_4)
		{ after(grammarAccess.getModelAccess().getElement2Assignment_4()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getElement2Assignment_5()); }
		(rule__Model__Element2Assignment_5)
		{ after(grammarAccess.getModelAccess().getElement2Assignment_5()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getElement2Assignment_6()); }
		(rule__Model__Element2Assignment_6)
		{ after(grammarAccess.getModelAccess().getElement2Assignment_6()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getElement2Assignment_7()); }
		(rule__Model__Element2Assignment_7)
		{ after(grammarAccess.getModelAccess().getElement2Assignment_7()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getElement2Assignment_8()); }
		(rule__Model__Element2Assignment_8)
		{ after(grammarAccess.getModelAccess().getElement2Assignment_8()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getElement2Assignment_9()); }
		(rule__Model__Element2Assignment_9)
		{ after(grammarAccess.getModelAccess().getElement2Assignment_9()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getElement2Assignment_10()); }
		(rule__Model__Element2Assignment_10)
		{ after(grammarAccess.getModelAccess().getElement2Assignment_10()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getElement2Assignment_11()); }
		(rule__Model__Element2Assignment_11)
		{ after(grammarAccess.getModelAccess().getElement2Assignment_11()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_1__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_1Access().getChildAssignment_1_0()); }
		(rule__Scenario1_1__ChildAssignment_1_0)
		{ after(grammarAccess.getScenario1_1Access().getChildAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getScenario1_1Access().getChildAssignment_1_1()); }
		(rule__Scenario1_1__ChildAssignment_1_1)
		{ after(grammarAccess.getScenario1_1Access().getChildAssignment_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getScenario1_1Access().getChildAssignment_1_2()); }
		(rule__Scenario1_1__ChildAssignment_1_2)
		{ after(grammarAccess.getScenario1_1Access().getChildAssignment_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_2__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_2Access().getChildAssignment_1_0()); }
		(rule__Scenario1_2__ChildAssignment_1_0)
		{ after(grammarAccess.getScenario1_2Access().getChildAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getScenario1_2Access().getChildAssignment_1_1()); }
		(rule__Scenario1_2__ChildAssignment_1_1)
		{ after(grammarAccess.getScenario1_2Access().getChildAssignment_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getScenario1_2Access().getChildAssignment_1_2()); }
		(rule__Scenario1_2__ChildAssignment_1_2)
		{ after(grammarAccess.getScenario1_2Access().getChildAssignment_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_3__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_3Access().getChildAssignment_2_0()); }
		(rule__Scenario1_3__ChildAssignment_2_0)
		{ after(grammarAccess.getScenario1_3Access().getChildAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getScenario1_3Access().getChildAssignment_2_1()); }
		(rule__Scenario1_3__ChildAssignment_2_1)
		{ after(grammarAccess.getScenario1_3Access().getChildAssignment_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getScenario1_3Access().getChildAssignment_2_2()); }
		(rule__Scenario1_3__ChildAssignment_2_2)
		{ after(grammarAccess.getScenario1_3Access().getChildAssignment_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_4__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_4Access().getChildAssignment_2_0()); }
		(rule__Scenario1_4__ChildAssignment_2_0)
		{ after(grammarAccess.getScenario1_4Access().getChildAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getScenario1_4Access().getChildAssignment_2_1()); }
		(rule__Scenario1_4__ChildAssignment_2_1)
		{ after(grammarAccess.getScenario1_4Access().getChildAssignment_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getScenario1_4Access().getChildAssignment_2_2()); }
		(rule__Scenario1_4__ChildAssignment_2_2)
		{ after(grammarAccess.getScenario1_4Access().getChildAssignment_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_1__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_1Access().getChildAssignment_1_0()); }
		(rule__Scenario2_1__ChildAssignment_1_0)
		{ after(grammarAccess.getScenario2_1Access().getChildAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_1Access().getChildAssignment_1_1()); }
		(rule__Scenario2_1__ChildAssignment_1_1)
		{ after(grammarAccess.getScenario2_1Access().getChildAssignment_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_1Access().getChildAssignment_1_2()); }
		(rule__Scenario2_1__ChildAssignment_1_2)
		{ after(grammarAccess.getScenario2_1Access().getChildAssignment_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_2__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_2Access().getChildAssignment_1_0()); }
		(rule__Scenario2_2__ChildAssignment_1_0)
		{ after(grammarAccess.getScenario2_2Access().getChildAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_2Access().getChildAssignment_1_1()); }
		(rule__Scenario2_2__ChildAssignment_1_1)
		{ after(grammarAccess.getScenario2_2Access().getChildAssignment_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_2Access().getChildAssignment_1_2()); }
		(rule__Scenario2_2__ChildAssignment_1_2)
		{ after(grammarAccess.getScenario2_2Access().getChildAssignment_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_3__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_3Access().getChildAssignment_1_0()); }
		(rule__Scenario2_3__ChildAssignment_1_0)
		{ after(grammarAccess.getScenario2_3Access().getChildAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_3Access().getChildAssignment_1_1()); }
		(rule__Scenario2_3__ChildAssignment_1_1)
		{ after(grammarAccess.getScenario2_3Access().getChildAssignment_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_3Access().getChildAssignment_1_2()); }
		(rule__Scenario2_3__ChildAssignment_1_2)
		{ after(grammarAccess.getScenario2_3Access().getChildAssignment_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_4__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_4Access().getChildAssignment_1_0()); }
		(rule__Scenario2_4__ChildAssignment_1_0)
		{ after(grammarAccess.getScenario2_4Access().getChildAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_4Access().getChildAssignment_1_1()); }
		(rule__Scenario2_4__ChildAssignment_1_1)
		{ after(grammarAccess.getScenario2_4Access().getChildAssignment_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_4Access().getChildAssignment_1_2()); }
		(rule__Scenario2_4__ChildAssignment_1_2)
		{ after(grammarAccess.getScenario2_4Access().getChildAssignment_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_5__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_5Access().getChildAssignment_2_0()); }
		(rule__Scenario2_5__ChildAssignment_2_0)
		{ after(grammarAccess.getScenario2_5Access().getChildAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_5Access().getChildAssignment_2_1()); }
		(rule__Scenario2_5__ChildAssignment_2_1)
		{ after(grammarAccess.getScenario2_5Access().getChildAssignment_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_5Access().getChildAssignment_2_2()); }
		(rule__Scenario2_5__ChildAssignment_2_2)
		{ after(grammarAccess.getScenario2_5Access().getChildAssignment_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_6__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_6Access().getChildAssignment_2_0()); }
		(rule__Scenario2_6__ChildAssignment_2_0)
		{ after(grammarAccess.getScenario2_6Access().getChildAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_6Access().getChildAssignment_2_1()); }
		(rule__Scenario2_6__ChildAssignment_2_1)
		{ after(grammarAccess.getScenario2_6Access().getChildAssignment_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_6Access().getChildAssignment_2_2()); }
		(rule__Scenario2_6__ChildAssignment_2_2)
		{ after(grammarAccess.getScenario2_6Access().getChildAssignment_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_7__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_7Access().getChildAssignment_2_0()); }
		(rule__Scenario2_7__ChildAssignment_2_0)
		{ after(grammarAccess.getScenario2_7Access().getChildAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_7Access().getChildAssignment_2_1()); }
		(rule__Scenario2_7__ChildAssignment_2_1)
		{ after(grammarAccess.getScenario2_7Access().getChildAssignment_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_7Access().getChildAssignment_2_2()); }
		(rule__Scenario2_7__ChildAssignment_2_2)
		{ after(grammarAccess.getScenario2_7Access().getChildAssignment_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_8__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_8Access().getChildAssignment_2_0()); }
		(rule__Scenario2_8__ChildAssignment_2_0)
		{ after(grammarAccess.getScenario2_8Access().getChildAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_8Access().getChildAssignment_2_1()); }
		(rule__Scenario2_8__ChildAssignment_2_1)
		{ after(grammarAccess.getScenario2_8Access().getChildAssignment_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getScenario2_8Access().getChildAssignment_2_2()); }
		(rule__Scenario2_8__ChildAssignment_2_2)
		{ after(grammarAccess.getScenario2_8Access().getChildAssignment_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__StringAlternatives_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_1Access().getStringAKeyword_3_0_0()); }
		'a'
		{ after(grammarAccess.getChild2_1Access().getStringAKeyword_3_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getChild2_1Access().getStringBKeyword_3_0_1()); }
		'b'
		{ after(grammarAccess.getChild2_1Access().getStringBKeyword_3_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__StringAlternatives_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_2Access().getStringAKeyword_3_0_0()); }
		'a'
		{ after(grammarAccess.getChild2_2Access().getStringAKeyword_3_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getChild2_2Access().getStringBKeyword_3_0_1()); }
		'b'
		{ after(grammarAccess.getChild2_2Access().getStringBKeyword_3_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__StringAlternatives_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_3Access().getStringAKeyword_3_0_0()); }
		'a'
		{ after(grammarAccess.getChild2_3Access().getStringAKeyword_3_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getChild2_3Access().getStringBKeyword_3_0_1()); }
		'b'
		{ after(grammarAccess.getChild2_3Access().getStringBKeyword_3_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_4Access().getStringAssignment_3_0()); }
		(rule__Child2_4__StringAssignment_3_0)
		{ after(grammarAccess.getChild2_4Access().getStringAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getChild2_4Access().getStringAssignment_3_1()); }
		(rule__Child2_4__StringAssignment_3_1)
		{ after(grammarAccess.getChild2_4Access().getStringAssignment_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_5Access().getStringAssignment_3_0()); }
		(rule__Child2_5__StringAssignment_3_0)
		{ after(grammarAccess.getChild2_5Access().getStringAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getChild2_5Access().getStringAssignment_3_1()); }
		(rule__Child2_5__StringAssignment_3_1)
		{ after(grammarAccess.getChild2_5Access().getStringAssignment_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_6Access().getStringAssignment_3_0()); }
		(rule__Child2_6__StringAssignment_3_0)
		{ after(grammarAccess.getChild2_6Access().getStringAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getChild2_6Access().getStringAssignment_3_1()); }
		(rule__Child2_6__StringAssignment_3_1)
		{ after(grammarAccess.getChild2_6Access().getStringAssignment_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumTypeAccess().getAEnumLiteralDeclaration_0()); }
		('a')
		{ after(grammarAccess.getEnumTypeAccess().getAEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getEnumTypeAccess().getBEnumLiteralDeclaration_1()); }
		('b')
		{ after(grammarAccess.getEnumTypeAccess().getBEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_1__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_1__Group__0__Impl
	rule__Scenario1_1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_1__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_1Access().getDigitOneFullStopDigitOneKeyword_0()); }
	'1.1'
	{ after(grammarAccess.getScenario1_1Access().getDigitOneFullStopDigitOneKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_1__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_1__Group__1__Impl
	rule__Scenario1_1__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_1__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_1Access().getAlternatives_1()); }
	(rule__Scenario1_1__Alternatives_1)
	{ after(grammarAccess.getScenario1_1Access().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_1__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_1__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_1__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_1Access().getNextKeyword_2()); }
	'next'
	{ after(grammarAccess.getScenario1_1Access().getNextKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario1_2__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_2__Group__0__Impl
	rule__Scenario1_2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_2__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_2Access().getDigitOneFullStopDigitTwoKeyword_0()); }
	'1.2'
	{ after(grammarAccess.getScenario1_2Access().getDigitOneFullStopDigitTwoKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_2__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_2__Group__1__Impl
	rule__Scenario1_2__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_2__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getScenario1_2Access().getAlternatives_1()); }
		(rule__Scenario1_2__Alternatives_1)
		{ after(grammarAccess.getScenario1_2Access().getAlternatives_1()); }
	)
	(
		{ before(grammarAccess.getScenario1_2Access().getAlternatives_1()); }
		(rule__Scenario1_2__Alternatives_1)*
		{ after(grammarAccess.getScenario1_2Access().getAlternatives_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_2__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_2__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_2__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_2Access().getNextKeyword_2()); }
	'next'
	{ after(grammarAccess.getScenario1_2Access().getNextKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario1_3__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_3__Group__0__Impl
	rule__Scenario1_3__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_3__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_3Access().getScenario1Action_0()); }
	()
	{ after(grammarAccess.getScenario1_3Access().getScenario1Action_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_3__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_3__Group__1__Impl
	rule__Scenario1_3__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_3__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_3Access().getDigitOneFullStopDigitThreeKeyword_1()); }
	'1.3'
	{ after(grammarAccess.getScenario1_3Access().getDigitOneFullStopDigitThreeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_3__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_3__Group__2__Impl
	rule__Scenario1_3__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_3__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_3Access().getAlternatives_2()); }
	(rule__Scenario1_3__Alternatives_2)*
	{ after(grammarAccess.getScenario1_3Access().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_3__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_3__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_3__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_3Access().getNextKeyword_3()); }
	'next'
	{ after(grammarAccess.getScenario1_3Access().getNextKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario1_4__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_4__Group__0__Impl
	rule__Scenario1_4__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_4__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_4Access().getScenario1Action_0()); }
	()
	{ after(grammarAccess.getScenario1_4Access().getScenario1Action_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_4__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_4__Group__1__Impl
	rule__Scenario1_4__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_4__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_4Access().getDigitOneFullStopDigitFourKeyword_1()); }
	'1.4'
	{ after(grammarAccess.getScenario1_4Access().getDigitOneFullStopDigitFourKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_4__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_4__Group__2__Impl
	rule__Scenario1_4__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_4__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_4Access().getAlternatives_2()); }
	(rule__Scenario1_4__Alternatives_2)?
	{ after(grammarAccess.getScenario1_4Access().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_4__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario1_4__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_4__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario1_4Access().getNextKeyword_3()); }
	'next'
	{ after(grammarAccess.getScenario1_4Access().getNextKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child1_1__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_1__Group__0__Impl
	rule__Child1_1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_1Access().getNameAssignment_0()); }
	(rule__Child1_1__NameAssignment_0)
	{ after(grammarAccess.getChild1_1Access().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_1__Group__1__Impl
	rule__Child1_1__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_1Access().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getChild1_1Access().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_1__Group__2__Impl
	rule__Child1_1__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_1Access().getGroup_2()); }
	(rule__Child1_1__Group_2__0)?
	{ after(grammarAccess.getChild1_1Access().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_1__Group__3__Impl
	rule__Child1_1__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_1Access().getEnumTypeAssignment_3()); }
	(rule__Child1_1__EnumTypeAssignment_3)
	{ after(grammarAccess.getChild1_1Access().getEnumTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_1__Group__4__Impl
	rule__Child1_1__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_1Access().getChild1Keyword_4()); }
	'child1'
	{ after(grammarAccess.getChild1_1Access().getChild1Keyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_1__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_1Access().getEndKeyword_5()); }
	'end'
	{ after(grammarAccess.getChild1_1Access().getEndKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child1_1__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_1__Group_2__0__Impl
	rule__Child1_1__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_1Access().getBoolAssignment_2_0()); }
	(rule__Child1_1__BoolAssignment_2_0)
	{ after(grammarAccess.getChild1_1Access().getBoolAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_1__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_1Access().getKeywordKeyword_2_1()); }
	'keyword'
	{ after(grammarAccess.getChild1_1Access().getKeywordKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child1_2__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_2__Group__0__Impl
	rule__Child1_2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_2Access().getNameAssignment_0()); }
	(rule__Child1_2__NameAssignment_0)
	{ after(grammarAccess.getChild1_2Access().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_2__Group__1__Impl
	rule__Child1_2__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_2Access().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getChild1_2Access().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_2__Group__2__Impl
	rule__Child1_2__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_2Access().getGroup_2()); }
	(rule__Child1_2__Group_2__0)?
	{ after(grammarAccess.getChild1_2Access().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_2__Group__3__Impl
	rule__Child1_2__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_2Access().getEnumTypeAssignment_3()); }
	(rule__Child1_2__EnumTypeAssignment_3)
	{ after(grammarAccess.getChild1_2Access().getEnumTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_2__Group__4__Impl
	rule__Child1_2__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_2Access().getChild2Keyword_4()); }
	'child2'
	{ after(grammarAccess.getChild1_2Access().getChild2Keyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_2__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_2Access().getEndKeyword_5()); }
	'end'
	{ after(grammarAccess.getChild1_2Access().getEndKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child1_2__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_2__Group_2__0__Impl
	rule__Child1_2__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_2Access().getBoolAssignment_2_0()); }
	(rule__Child1_2__BoolAssignment_2_0)
	{ after(grammarAccess.getChild1_2Access().getBoolAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_2__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_2Access().getKeywordKeyword_2_1()); }
	'keyword'
	{ after(grammarAccess.getChild1_2Access().getKeywordKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child1_3__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_3__Group__0__Impl
	rule__Child1_3__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_3Access().getNameAssignment_0()); }
	(rule__Child1_3__NameAssignment_0)
	{ after(grammarAccess.getChild1_3Access().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_3__Group__1__Impl
	rule__Child1_3__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_3Access().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getChild1_3Access().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_3__Group__2__Impl
	rule__Child1_3__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_3Access().getGroup_2()); }
	(rule__Child1_3__Group_2__0)?
	{ after(grammarAccess.getChild1_3Access().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_3__Group__3__Impl
	rule__Child1_3__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_3Access().getEnumTypeAssignment_3()); }
	(rule__Child1_3__EnumTypeAssignment_3)
	{ after(grammarAccess.getChild1_3Access().getEnumTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_3__Group__4__Impl
	rule__Child1_3__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_3Access().getChild3Keyword_4()); }
	'child3'
	{ after(grammarAccess.getChild1_3Access().getChild3Keyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_3__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_3Access().getEndKeyword_5()); }
	'end'
	{ after(grammarAccess.getChild1_3Access().getEndKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child1_3__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_3__Group_2__0__Impl
	rule__Child1_3__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_3Access().getBoolAssignment_2_0()); }
	(rule__Child1_3__BoolAssignment_2_0)
	{ after(grammarAccess.getChild1_3Access().getBoolAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child1_3__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild1_3Access().getKeywordKeyword_2_1()); }
	'keyword'
	{ after(grammarAccess.getChild1_3Access().getKeywordKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario2_1__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_1__Group__0__Impl
	rule__Scenario2_1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_1__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_1Access().getDigitTwoFullStopDigitOneKeyword_0()); }
	'2.1'
	{ after(grammarAccess.getScenario2_1Access().getDigitTwoFullStopDigitOneKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_1__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_1__Group__1__Impl
	rule__Scenario2_1__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_1__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_1Access().getAlternatives_1()); }
	(rule__Scenario2_1__Alternatives_1)
	{ after(grammarAccess.getScenario2_1Access().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_1__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_1__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_1__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_1Access().getNextKeyword_2()); }
	'next'
	{ after(grammarAccess.getScenario2_1Access().getNextKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario2_2__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_2__Group__0__Impl
	rule__Scenario2_2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_2__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_2Access().getDigitTwoFullStopDigitTwoKeyword_0()); }
	'2.2'
	{ after(grammarAccess.getScenario2_2Access().getDigitTwoFullStopDigitTwoKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_2__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_2__Group__1__Impl
	rule__Scenario2_2__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_2__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getScenario2_2Access().getAlternatives_1()); }
		(rule__Scenario2_2__Alternatives_1)
		{ after(grammarAccess.getScenario2_2Access().getAlternatives_1()); }
	)
	(
		{ before(grammarAccess.getScenario2_2Access().getAlternatives_1()); }
		(rule__Scenario2_2__Alternatives_1)*
		{ after(grammarAccess.getScenario2_2Access().getAlternatives_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_2__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_2__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_2__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_2Access().getNextKeyword_2()); }
	'next'
	{ after(grammarAccess.getScenario2_2Access().getNextKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario2_3__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_3__Group__0__Impl
	rule__Scenario2_3__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_3__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_3Access().getDigitTwoFullStopDigitThreeKeyword_0()); }
	'2.3'
	{ after(grammarAccess.getScenario2_3Access().getDigitTwoFullStopDigitThreeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_3__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_3__Group__1__Impl
	rule__Scenario2_3__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_3__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_3Access().getAlternatives_1()); }
	(rule__Scenario2_3__Alternatives_1)
	{ after(grammarAccess.getScenario2_3Access().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_3__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_3__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_3__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_3Access().getNextKeyword_2()); }
	'next'
	{ after(grammarAccess.getScenario2_3Access().getNextKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario2_4__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_4__Group__0__Impl
	rule__Scenario2_4__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_4__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_4Access().getDigitTwoFullStopDigitFourKeyword_0()); }
	'2.4'
	{ after(grammarAccess.getScenario2_4Access().getDigitTwoFullStopDigitFourKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_4__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_4__Group__1__Impl
	rule__Scenario2_4__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_4__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getScenario2_4Access().getAlternatives_1()); }
		(rule__Scenario2_4__Alternatives_1)
		{ after(grammarAccess.getScenario2_4Access().getAlternatives_1()); }
	)
	(
		{ before(grammarAccess.getScenario2_4Access().getAlternatives_1()); }
		(rule__Scenario2_4__Alternatives_1)*
		{ after(grammarAccess.getScenario2_4Access().getAlternatives_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_4__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_4__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_4__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_4Access().getNextKeyword_2()); }
	'next'
	{ after(grammarAccess.getScenario2_4Access().getNextKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario2_5__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_5__Group__0__Impl
	rule__Scenario2_5__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_5__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_5Access().getScenario2Action_0()); }
	()
	{ after(grammarAccess.getScenario2_5Access().getScenario2Action_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_5__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_5__Group__1__Impl
	rule__Scenario2_5__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_5__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_5Access().getDigitTwoFullStopDigitFiveKeyword_1()); }
	'2.5'
	{ after(grammarAccess.getScenario2_5Access().getDigitTwoFullStopDigitFiveKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_5__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_5__Group__2__Impl
	rule__Scenario2_5__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_5__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_5Access().getAlternatives_2()); }
	(rule__Scenario2_5__Alternatives_2)?
	{ after(grammarAccess.getScenario2_5Access().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_5__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_5__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_5__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_5Access().getNextKeyword_3()); }
	'next'
	{ after(grammarAccess.getScenario2_5Access().getNextKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario2_6__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_6__Group__0__Impl
	rule__Scenario2_6__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_6__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_6Access().getScenario2Action_0()); }
	()
	{ after(grammarAccess.getScenario2_6Access().getScenario2Action_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_6__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_6__Group__1__Impl
	rule__Scenario2_6__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_6__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_6Access().getDigitTwoFullStopDigitSixKeyword_1()); }
	'2.6'
	{ after(grammarAccess.getScenario2_6Access().getDigitTwoFullStopDigitSixKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_6__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_6__Group__2__Impl
	rule__Scenario2_6__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_6__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_6Access().getAlternatives_2()); }
	(rule__Scenario2_6__Alternatives_2)*
	{ after(grammarAccess.getScenario2_6Access().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_6__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_6__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_6__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_6Access().getNextKeyword_3()); }
	'next'
	{ after(grammarAccess.getScenario2_6Access().getNextKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario2_7__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_7__Group__0__Impl
	rule__Scenario2_7__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_7__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_7Access().getScenario2Action_0()); }
	()
	{ after(grammarAccess.getScenario2_7Access().getScenario2Action_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_7__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_7__Group__1__Impl
	rule__Scenario2_7__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_7__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_7Access().getDigitTwoFullStopDigitSevenKeyword_1()); }
	'2.7'
	{ after(grammarAccess.getScenario2_7Access().getDigitTwoFullStopDigitSevenKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_7__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_7__Group__2__Impl
	rule__Scenario2_7__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_7__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_7Access().getAlternatives_2()); }
	(rule__Scenario2_7__Alternatives_2)?
	{ after(grammarAccess.getScenario2_7Access().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_7__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_7__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_7__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_7Access().getNextKeyword_3()); }
	'next'
	{ after(grammarAccess.getScenario2_7Access().getNextKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario2_8__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_8__Group__0__Impl
	rule__Scenario2_8__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_8__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_8Access().getScenario2Action_0()); }
	()
	{ after(grammarAccess.getScenario2_8Access().getScenario2Action_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_8__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_8__Group__1__Impl
	rule__Scenario2_8__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_8__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_8Access().getDigitTwoFullStopDigitEightKeyword_1()); }
	'2.8'
	{ after(grammarAccess.getScenario2_8Access().getDigitTwoFullStopDigitEightKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_8__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_8__Group__2__Impl
	rule__Scenario2_8__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_8__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_8Access().getAlternatives_2()); }
	(rule__Scenario2_8__Alternatives_2)*
	{ after(grammarAccess.getScenario2_8Access().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_8__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario2_8__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_8__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenario2_8Access().getNextKeyword_3()); }
	'next'
	{ after(grammarAccess.getScenario2_8Access().getNextKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child2_1__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_1__Group__0__Impl
	rule__Child2_1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_1Access().getNameAssignment_0()); }
	(rule__Child2_1__NameAssignment_0)
	{ after(grammarAccess.getChild2_1Access().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_1__Group__1__Impl
	rule__Child2_1__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_1Access().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getChild2_1Access().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_1__Group__2__Impl
	rule__Child2_1__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_1Access().getGroup_2()); }
	(rule__Child2_1__Group_2__0)?
	{ after(grammarAccess.getChild2_1Access().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_1__Group__3__Impl
	rule__Child2_1__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_1Access().getStringAssignment_3()); }
	(rule__Child2_1__StringAssignment_3)
	{ after(grammarAccess.getChild2_1Access().getStringAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_1__Group__4__Impl
	rule__Child2_1__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_1Access().getChild1Keyword_4()); }
	'child1'
	{ after(grammarAccess.getChild2_1Access().getChild1Keyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_1__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_1Access().getEndKeyword_5()); }
	'end'
	{ after(grammarAccess.getChild2_1Access().getEndKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child2_1__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_1__Group_2__0__Impl
	rule__Child2_1__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_1Access().getBoolAssignment_2_0()); }
	(rule__Child2_1__BoolAssignment_2_0)
	{ after(grammarAccess.getChild2_1Access().getBoolAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_1__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_1Access().getKeywordKeyword_2_1()); }
	'keyword'
	{ after(grammarAccess.getChild2_1Access().getKeywordKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child2_2__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_2__Group__0__Impl
	rule__Child2_2__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_2Access().getNameAssignment_0()); }
	(rule__Child2_2__NameAssignment_0)
	{ after(grammarAccess.getChild2_2Access().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_2__Group__1__Impl
	rule__Child2_2__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_2Access().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getChild2_2Access().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_2__Group__2__Impl
	rule__Child2_2__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_2Access().getGroup_2()); }
	(rule__Child2_2__Group_2__0)?
	{ after(grammarAccess.getChild2_2Access().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_2__Group__3__Impl
	rule__Child2_2__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_2Access().getStringAssignment_3()); }
	(rule__Child2_2__StringAssignment_3)
	{ after(grammarAccess.getChild2_2Access().getStringAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_2__Group__4__Impl
	rule__Child2_2__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_2Access().getChild2Keyword_4()); }
	'child2'
	{ after(grammarAccess.getChild2_2Access().getChild2Keyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_2__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_2Access().getEndKeyword_5()); }
	'end'
	{ after(grammarAccess.getChild2_2Access().getEndKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child2_2__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_2__Group_2__0__Impl
	rule__Child2_2__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_2Access().getBoolAssignment_2_0()); }
	(rule__Child2_2__BoolAssignment_2_0)
	{ after(grammarAccess.getChild2_2Access().getBoolAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_2__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_2Access().getKeywordKeyword_2_1()); }
	'keyword'
	{ after(grammarAccess.getChild2_2Access().getKeywordKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child2_3__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_3__Group__0__Impl
	rule__Child2_3__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_3Access().getNameAssignment_0()); }
	(rule__Child2_3__NameAssignment_0)
	{ after(grammarAccess.getChild2_3Access().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_3__Group__1__Impl
	rule__Child2_3__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_3Access().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getChild2_3Access().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_3__Group__2__Impl
	rule__Child2_3__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_3Access().getGroup_2()); }
	(rule__Child2_3__Group_2__0)?
	{ after(grammarAccess.getChild2_3Access().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_3__Group__3__Impl
	rule__Child2_3__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_3Access().getStringAssignment_3()); }
	(rule__Child2_3__StringAssignment_3)
	{ after(grammarAccess.getChild2_3Access().getStringAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_3__Group__4__Impl
	rule__Child2_3__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_3Access().getChild3Keyword_4()); }
	'child3'
	{ after(grammarAccess.getChild2_3Access().getChild3Keyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_3__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_3Access().getEndKeyword_5()); }
	'end'
	{ after(grammarAccess.getChild2_3Access().getEndKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child2_3__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_3__Group_2__0__Impl
	rule__Child2_3__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_3Access().getBoolAssignment_2_0()); }
	(rule__Child2_3__BoolAssignment_2_0)
	{ after(grammarAccess.getChild2_3Access().getBoolAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_3__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_3Access().getKeywordKeyword_2_1()); }
	'keyword'
	{ after(grammarAccess.getChild2_3Access().getKeywordKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child2_4__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_4__Group__0__Impl
	rule__Child2_4__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_4Access().getNameAssignment_0()); }
	(rule__Child2_4__NameAssignment_0)
	{ after(grammarAccess.getChild2_4Access().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_4__Group__1__Impl
	rule__Child2_4__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_4Access().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getChild2_4Access().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_4__Group__2__Impl
	rule__Child2_4__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_4Access().getGroup_2()); }
	(rule__Child2_4__Group_2__0)?
	{ after(grammarAccess.getChild2_4Access().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_4__Group__3__Impl
	rule__Child2_4__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_4Access().getAlternatives_3()); }
	(rule__Child2_4__Alternatives_3)
	{ after(grammarAccess.getChild2_4Access().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_4__Group__4__Impl
	rule__Child2_4__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_4Access().getChild1Keyword_4()); }
	'child1'
	{ after(grammarAccess.getChild2_4Access().getChild1Keyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_4__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_4Access().getEndKeyword_5()); }
	'end'
	{ after(grammarAccess.getChild2_4Access().getEndKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child2_4__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_4__Group_2__0__Impl
	rule__Child2_4__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_4Access().getBoolAssignment_2_0()); }
	(rule__Child2_4__BoolAssignment_2_0)
	{ after(grammarAccess.getChild2_4Access().getBoolAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_4__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_4Access().getKeywordKeyword_2_1()); }
	'keyword'
	{ after(grammarAccess.getChild2_4Access().getKeywordKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child2_5__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_5__Group__0__Impl
	rule__Child2_5__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_5Access().getNameAssignment_0()); }
	(rule__Child2_5__NameAssignment_0)
	{ after(grammarAccess.getChild2_5Access().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_5__Group__1__Impl
	rule__Child2_5__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_5Access().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getChild2_5Access().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_5__Group__2__Impl
	rule__Child2_5__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_5Access().getGroup_2()); }
	(rule__Child2_5__Group_2__0)?
	{ after(grammarAccess.getChild2_5Access().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_5__Group__3__Impl
	rule__Child2_5__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_5Access().getAlternatives_3()); }
	(rule__Child2_5__Alternatives_3)
	{ after(grammarAccess.getChild2_5Access().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_5__Group__4__Impl
	rule__Child2_5__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_5Access().getChild2Keyword_4()); }
	'child2'
	{ after(grammarAccess.getChild2_5Access().getChild2Keyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_5__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_5Access().getEndKeyword_5()); }
	'end'
	{ after(grammarAccess.getChild2_5Access().getEndKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child2_5__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_5__Group_2__0__Impl
	rule__Child2_5__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_5Access().getBoolAssignment_2_0()); }
	(rule__Child2_5__BoolAssignment_2_0)
	{ after(grammarAccess.getChild2_5Access().getBoolAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_5__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_5Access().getKeywordKeyword_2_1()); }
	'keyword'
	{ after(grammarAccess.getChild2_5Access().getKeywordKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child2_6__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_6__Group__0__Impl
	rule__Child2_6__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_6Access().getNameAssignment_0()); }
	(rule__Child2_6__NameAssignment_0)
	{ after(grammarAccess.getChild2_6Access().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_6__Group__1__Impl
	rule__Child2_6__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_6Access().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getChild2_6Access().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_6__Group__2__Impl
	rule__Child2_6__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_6Access().getGroup_2()); }
	(rule__Child2_6__Group_2__0)?
	{ after(grammarAccess.getChild2_6Access().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_6__Group__3__Impl
	rule__Child2_6__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_6Access().getAlternatives_3()); }
	(rule__Child2_6__Alternatives_3)
	{ after(grammarAccess.getChild2_6Access().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_6__Group__4__Impl
	rule__Child2_6__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_6Access().getChild3Keyword_4()); }
	'child3'
	{ after(grammarAccess.getChild2_6Access().getChild3Keyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_6__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_6Access().getEndKeyword_5()); }
	'end'
	{ after(grammarAccess.getChild2_6Access().getEndKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Child2_6__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_6__Group_2__0__Impl
	rule__Child2_6__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_6Access().getBoolAssignment_2_0()); }
	(rule__Child2_6__BoolAssignment_2_0)
	{ after(grammarAccess.getChild2_6Access().getBoolAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child2_6__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChild2_6Access().getKeywordKeyword_2_1()); }
	'keyword'
	{ after(grammarAccess.getChild2_6Access().getKeywordKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Element1Assignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement1Scenario1_1ParserRuleCall_0_0()); }
		ruleScenario1_1
		{ after(grammarAccess.getModelAccess().getElement1Scenario1_1ParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Element1Assignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement1Scenario1_2ParserRuleCall_1_0()); }
		ruleScenario1_2
		{ after(grammarAccess.getModelAccess().getElement1Scenario1_2ParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Element1Assignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement1Scenario1_3ParserRuleCall_2_0()); }
		ruleScenario1_3
		{ after(grammarAccess.getModelAccess().getElement1Scenario1_3ParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Element1Assignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement1Scenario1_4ParserRuleCall_3_0()); }
		ruleScenario1_4
		{ after(grammarAccess.getModelAccess().getElement1Scenario1_4ParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Element2Assignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement2Scenario2_1ParserRuleCall_4_0()); }
		ruleScenario2_1
		{ after(grammarAccess.getModelAccess().getElement2Scenario2_1ParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Element2Assignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement2Scenario2_2ParserRuleCall_5_0()); }
		ruleScenario2_2
		{ after(grammarAccess.getModelAccess().getElement2Scenario2_2ParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Element2Assignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement2Scenario2_3ParserRuleCall_6_0()); }
		ruleScenario2_3
		{ after(grammarAccess.getModelAccess().getElement2Scenario2_3ParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Element2Assignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement2Scenario2_4ParserRuleCall_7_0()); }
		ruleScenario2_4
		{ after(grammarAccess.getModelAccess().getElement2Scenario2_4ParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Element2Assignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement2Scenario2_5ParserRuleCall_8_0()); }
		ruleScenario2_5
		{ after(grammarAccess.getModelAccess().getElement2Scenario2_5ParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Element2Assignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement2Scenario2_6ParserRuleCall_9_0()); }
		ruleScenario2_6
		{ after(grammarAccess.getModelAccess().getElement2Scenario2_6ParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Element2Assignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement2Scenario2_7ParserRuleCall_10_0()); }
		ruleScenario2_7
		{ after(grammarAccess.getModelAccess().getElement2Scenario2_7ParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Element2Assignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElement2Scenario2_8ParserRuleCall_11_0()); }
		ruleScenario2_8
		{ after(grammarAccess.getModelAccess().getElement2Scenario2_8ParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_1__ChildAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_1Access().getChildChild1_1ParserRuleCall_1_0_0()); }
		ruleChild1_1
		{ after(grammarAccess.getScenario1_1Access().getChildChild1_1ParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_1__ChildAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_1Access().getChildChild1_2ParserRuleCall_1_1_0()); }
		ruleChild1_2
		{ after(grammarAccess.getScenario1_1Access().getChildChild1_2ParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_1__ChildAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_1Access().getChildChild1_3ParserRuleCall_1_2_0()); }
		ruleChild1_3
		{ after(grammarAccess.getScenario1_1Access().getChildChild1_3ParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_2__ChildAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_2Access().getChildChild1_1ParserRuleCall_1_0_0()); }
		ruleChild1_1
		{ after(grammarAccess.getScenario1_2Access().getChildChild1_1ParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_2__ChildAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_2Access().getChildChild1_2ParserRuleCall_1_1_0()); }
		ruleChild1_2
		{ after(grammarAccess.getScenario1_2Access().getChildChild1_2ParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_2__ChildAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_2Access().getChildChild1_3ParserRuleCall_1_2_0()); }
		ruleChild1_3
		{ after(grammarAccess.getScenario1_2Access().getChildChild1_3ParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_3__ChildAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_3Access().getChildChild1_1ParserRuleCall_2_0_0()); }
		ruleChild1_1
		{ after(grammarAccess.getScenario1_3Access().getChildChild1_1ParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_3__ChildAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_3Access().getChildChild1_2ParserRuleCall_2_1_0()); }
		ruleChild1_2
		{ after(grammarAccess.getScenario1_3Access().getChildChild1_2ParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_3__ChildAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_3Access().getChildChild1_3ParserRuleCall_2_2_0()); }
		ruleChild1_3
		{ after(grammarAccess.getScenario1_3Access().getChildChild1_3ParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_4__ChildAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_4Access().getChildChild1_1ParserRuleCall_2_0_0()); }
		ruleChild1_1
		{ after(grammarAccess.getScenario1_4Access().getChildChild1_1ParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_4__ChildAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_4Access().getChildChild1_2ParserRuleCall_2_1_0()); }
		ruleChild1_2
		{ after(grammarAccess.getScenario1_4Access().getChildChild1_2ParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario1_4__ChildAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario1_4Access().getChildChild1_3ParserRuleCall_2_2_0()); }
		ruleChild1_3
		{ after(grammarAccess.getScenario1_4Access().getChildChild1_3ParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild1_1Access().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getChild1_1Access().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__BoolAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild1_1Access().getBoolBoolKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getChild1_1Access().getBoolBoolKeyword_2_0_0()); }
			'bool'
			{ after(grammarAccess.getChild1_1Access().getBoolBoolKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getChild1_1Access().getBoolBoolKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_1__EnumTypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild1_1Access().getEnumTypeEnumTypeEnumRuleCall_3_0()); }
		ruleEnumType
		{ after(grammarAccess.getChild1_1Access().getEnumTypeEnumTypeEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild1_2Access().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getChild1_2Access().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__BoolAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild1_2Access().getBoolBoolKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getChild1_2Access().getBoolBoolKeyword_2_0_0()); }
			'bool'
			{ after(grammarAccess.getChild1_2Access().getBoolBoolKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getChild1_2Access().getBoolBoolKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_2__EnumTypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild1_2Access().getEnumTypeEnumTypeEnumRuleCall_3_0()); }
		ruleEnumType
		{ after(grammarAccess.getChild1_2Access().getEnumTypeEnumTypeEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild1_3Access().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getChild1_3Access().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__BoolAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild1_3Access().getBoolBoolKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getChild1_3Access().getBoolBoolKeyword_2_0_0()); }
			'bool'
			{ after(grammarAccess.getChild1_3Access().getBoolBoolKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getChild1_3Access().getBoolBoolKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child1_3__EnumTypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild1_3Access().getEnumTypeEnumTypeEnumRuleCall_3_0()); }
		ruleEnumType
		{ after(grammarAccess.getChild1_3Access().getEnumTypeEnumTypeEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_1__ChildAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_1Access().getChildChild2_1ParserRuleCall_1_0_0()); }
		ruleChild2_1
		{ after(grammarAccess.getScenario2_1Access().getChildChild2_1ParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_1__ChildAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_1Access().getChildChild2_2ParserRuleCall_1_1_0()); }
		ruleChild2_2
		{ after(grammarAccess.getScenario2_1Access().getChildChild2_2ParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_1__ChildAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_1Access().getChildChild2_3ParserRuleCall_1_2_0()); }
		ruleChild2_3
		{ after(grammarAccess.getScenario2_1Access().getChildChild2_3ParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_2__ChildAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_2Access().getChildChild2_1ParserRuleCall_1_0_0()); }
		ruleChild2_1
		{ after(grammarAccess.getScenario2_2Access().getChildChild2_1ParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_2__ChildAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_2Access().getChildChild2_2ParserRuleCall_1_1_0()); }
		ruleChild2_2
		{ after(grammarAccess.getScenario2_2Access().getChildChild2_2ParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_2__ChildAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_2Access().getChildChild2_3ParserRuleCall_1_2_0()); }
		ruleChild2_3
		{ after(grammarAccess.getScenario2_2Access().getChildChild2_3ParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_3__ChildAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_3Access().getChildChild2_4ParserRuleCall_1_0_0()); }
		ruleChild2_4
		{ after(grammarAccess.getScenario2_3Access().getChildChild2_4ParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_3__ChildAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_3Access().getChildChild2_5ParserRuleCall_1_1_0()); }
		ruleChild2_5
		{ after(grammarAccess.getScenario2_3Access().getChildChild2_5ParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_3__ChildAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_3Access().getChildChild2_6ParserRuleCall_1_2_0()); }
		ruleChild2_6
		{ after(grammarAccess.getScenario2_3Access().getChildChild2_6ParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_4__ChildAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_4Access().getChildChild2_4ParserRuleCall_1_0_0()); }
		ruleChild2_4
		{ after(grammarAccess.getScenario2_4Access().getChildChild2_4ParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_4__ChildAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_4Access().getChildChild2_5ParserRuleCall_1_1_0()); }
		ruleChild2_5
		{ after(grammarAccess.getScenario2_4Access().getChildChild2_5ParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_4__ChildAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_4Access().getChildChild2_6ParserRuleCall_1_2_0()); }
		ruleChild2_6
		{ after(grammarAccess.getScenario2_4Access().getChildChild2_6ParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_5__ChildAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_5Access().getChildChild2_1ParserRuleCall_2_0_0()); }
		ruleChild2_1
		{ after(grammarAccess.getScenario2_5Access().getChildChild2_1ParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_5__ChildAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_5Access().getChildChild2_2ParserRuleCall_2_1_0()); }
		ruleChild2_2
		{ after(grammarAccess.getScenario2_5Access().getChildChild2_2ParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_5__ChildAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_5Access().getChildChild2_3ParserRuleCall_2_2_0()); }
		ruleChild2_3
		{ after(grammarAccess.getScenario2_5Access().getChildChild2_3ParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_6__ChildAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_6Access().getChildChild2_1ParserRuleCall_2_0_0()); }
		ruleChild2_1
		{ after(grammarAccess.getScenario2_6Access().getChildChild2_1ParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_6__ChildAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_6Access().getChildChild2_2ParserRuleCall_2_1_0()); }
		ruleChild2_2
		{ after(grammarAccess.getScenario2_6Access().getChildChild2_2ParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_6__ChildAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_6Access().getChildChild2_3ParserRuleCall_2_2_0()); }
		ruleChild2_3
		{ after(grammarAccess.getScenario2_6Access().getChildChild2_3ParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_7__ChildAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_7Access().getChildChild2_4ParserRuleCall_2_0_0()); }
		ruleChild2_4
		{ after(grammarAccess.getScenario2_7Access().getChildChild2_4ParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_7__ChildAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_7Access().getChildChild2_5ParserRuleCall_2_1_0()); }
		ruleChild2_5
		{ after(grammarAccess.getScenario2_7Access().getChildChild2_5ParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_7__ChildAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_7Access().getChildChild2_6ParserRuleCall_2_2_0()); }
		ruleChild2_6
		{ after(grammarAccess.getScenario2_7Access().getChildChild2_6ParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_8__ChildAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_8Access().getChildChild2_4ParserRuleCall_2_0_0()); }
		ruleChild2_4
		{ after(grammarAccess.getScenario2_8Access().getChildChild2_4ParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_8__ChildAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_8Access().getChildChild2_5ParserRuleCall_2_1_0()); }
		ruleChild2_5
		{ after(grammarAccess.getScenario2_8Access().getChildChild2_5ParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario2_8__ChildAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenario2_8Access().getChildChild2_6ParserRuleCall_2_2_0()); }
		ruleChild2_6
		{ after(grammarAccess.getScenario2_8Access().getChildChild2_6ParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_1Access().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getChild2_1Access().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__BoolAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_1Access().getBoolBoolKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getChild2_1Access().getBoolBoolKeyword_2_0_0()); }
			'bool'
			{ after(grammarAccess.getChild2_1Access().getBoolBoolKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getChild2_1Access().getBoolBoolKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_1__StringAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_1Access().getStringAlternatives_3_0()); }
		(rule__Child2_1__StringAlternatives_3_0)
		{ after(grammarAccess.getChild2_1Access().getStringAlternatives_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_2Access().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getChild2_2Access().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__BoolAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_2Access().getBoolBoolKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getChild2_2Access().getBoolBoolKeyword_2_0_0()); }
			'bool'
			{ after(grammarAccess.getChild2_2Access().getBoolBoolKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getChild2_2Access().getBoolBoolKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_2__StringAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_2Access().getStringAlternatives_3_0()); }
		(rule__Child2_2__StringAlternatives_3_0)
		{ after(grammarAccess.getChild2_2Access().getStringAlternatives_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_3Access().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getChild2_3Access().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__BoolAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_3Access().getBoolBoolKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getChild2_3Access().getBoolBoolKeyword_2_0_0()); }
			'bool'
			{ after(grammarAccess.getChild2_3Access().getBoolBoolKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getChild2_3Access().getBoolBoolKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_3__StringAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_3Access().getStringAlternatives_3_0()); }
		(rule__Child2_3__StringAlternatives_3_0)
		{ after(grammarAccess.getChild2_3Access().getStringAlternatives_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_4Access().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getChild2_4Access().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__BoolAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_4Access().getBoolBoolKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getChild2_4Access().getBoolBoolKeyword_2_0_0()); }
			'bool'
			{ after(grammarAccess.getChild2_4Access().getBoolBoolKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getChild2_4Access().getBoolBoolKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__StringAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_4Access().getStringAKeyword_3_0_0()); }
		(
			{ before(grammarAccess.getChild2_4Access().getStringAKeyword_3_0_0()); }
			'a'
			{ after(grammarAccess.getChild2_4Access().getStringAKeyword_3_0_0()); }
		)
		{ after(grammarAccess.getChild2_4Access().getStringAKeyword_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_4__StringAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_4Access().getStringBKeyword_3_1_0()); }
		(
			{ before(grammarAccess.getChild2_4Access().getStringBKeyword_3_1_0()); }
			'b'
			{ after(grammarAccess.getChild2_4Access().getStringBKeyword_3_1_0()); }
		)
		{ after(grammarAccess.getChild2_4Access().getStringBKeyword_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_5Access().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getChild2_5Access().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__BoolAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_5Access().getBoolBoolKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getChild2_5Access().getBoolBoolKeyword_2_0_0()); }
			'bool'
			{ after(grammarAccess.getChild2_5Access().getBoolBoolKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getChild2_5Access().getBoolBoolKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__StringAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_5Access().getStringAKeyword_3_0_0()); }
		(
			{ before(grammarAccess.getChild2_5Access().getStringAKeyword_3_0_0()); }
			'a'
			{ after(grammarAccess.getChild2_5Access().getStringAKeyword_3_0_0()); }
		)
		{ after(grammarAccess.getChild2_5Access().getStringAKeyword_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_5__StringAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_5Access().getStringBKeyword_3_1_0()); }
		(
			{ before(grammarAccess.getChild2_5Access().getStringBKeyword_3_1_0()); }
			'b'
			{ after(grammarAccess.getChild2_5Access().getStringBKeyword_3_1_0()); }
		)
		{ after(grammarAccess.getChild2_5Access().getStringBKeyword_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_6Access().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getChild2_6Access().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__BoolAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_6Access().getBoolBoolKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getChild2_6Access().getBoolBoolKeyword_2_0_0()); }
			'bool'
			{ after(grammarAccess.getChild2_6Access().getBoolBoolKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getChild2_6Access().getBoolBoolKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__StringAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_6Access().getStringAKeyword_3_0_0()); }
		(
			{ before(grammarAccess.getChild2_6Access().getStringAKeyword_3_0_0()); }
			'a'
			{ after(grammarAccess.getChild2_6Access().getStringAKeyword_3_0_0()); }
		)
		{ after(grammarAccess.getChild2_6Access().getStringAKeyword_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child2_6__StringAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChild2_6Access().getStringBKeyword_3_1_0()); }
		(
			{ before(grammarAccess.getChild2_6Access().getStringBKeyword_3_1_0()); }
			'b'
			{ after(grammarAccess.getChild2_6Access().getStringBKeyword_3_1_0()); }
		)
		{ after(grammarAccess.getChild2_6Access().getStringBKeyword_3_1_0()); }
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
