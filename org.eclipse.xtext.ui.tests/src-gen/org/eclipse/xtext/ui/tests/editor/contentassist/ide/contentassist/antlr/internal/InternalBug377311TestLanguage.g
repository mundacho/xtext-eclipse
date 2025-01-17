/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug377311TestLanguage;

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
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug377311TestLanguageGrammarAccess;

}
@parser::members {
	private Bug377311TestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(Bug377311TestLanguageGrammarAccess grammarAccess) {
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

// Entry rule entryRuleRoot
entryRuleRoot
:
{ before(grammarAccess.getRootRule()); }
	 ruleRoot
{ after(grammarAccess.getRootRule()); } 
	 EOF 
;

// Rule Root
ruleRoot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRootAccess().getChildsAssignment()); }
		(rule__Root__ChildsAssignment)*
		{ after(grammarAccess.getRootAccess().getChildsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChild
entryRuleChild
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ID");
}
:
{ before(grammarAccess.getChildRule()); }
	 ruleChild
{ after(grammarAccess.getChildRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Child
ruleChild 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ID");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChildAccess().getGroup()); }
		(rule__Child__Group__0)
		{ after(grammarAccess.getChildAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

rule__Child__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child__Group__0__Impl
	rule__Child__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Child__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildAccess().getChildKeyword_0()); }
	'child'
	{ after(grammarAccess.getChildAccess().getChildKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Child__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Child__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildAccess().getNameAssignment_1()); }
	(rule__Child__NameAssignment_1)
	{ after(grammarAccess.getChildAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Root__ChildsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootAccess().getChildsChildParserRuleCall_0()); }
		ruleChild
		{ after(grammarAccess.getRootAccess().getChildsChildParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Child__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChildAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getChildAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_WS : (' '|'\t')+;

RULE_NEWLINE : '\r'? '\n';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ANY_OTHER : .;
