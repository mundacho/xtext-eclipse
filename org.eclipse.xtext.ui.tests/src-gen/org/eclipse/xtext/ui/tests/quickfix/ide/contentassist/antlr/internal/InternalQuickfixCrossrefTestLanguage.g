/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalQuickfixCrossrefTestLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.eclipse.xtext.ui.tests.quickfix.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.xtext.ui.tests.quickfix.ide.contentassist.antlr.internal;

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
import org.eclipse.xtext.ui.tests.quickfix.services.QuickfixCrossrefTestLanguageGrammarAccess;

}
@parser::members {
	private QuickfixCrossrefTestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(QuickfixCrossrefTestLanguageGrammarAccess grammarAccess) {
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

// Entry rule entryRuleMain
entryRuleMain
:
{ before(grammarAccess.getMainRule()); }
	 ruleMain
{ after(grammarAccess.getMainRule()); } 
	 EOF 
;

// Rule Main
ruleMain 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMainAccess().getElementsAssignment()); }
		(rule__Main__ElementsAssignment)*
		{ after(grammarAccess.getMainAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElement
entryRuleElement
:
{ before(grammarAccess.getElementRule()); }
	 ruleElement
{ after(grammarAccess.getElementRule()); } 
	 EOF 
;

// Rule Element
ruleElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementAccess().getGroup()); }
		(rule__Element__Group__0)
		{ after(grammarAccess.getElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Element__Group__0__Impl
	rule__Element__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementAccess().getDocAssignment_0()); }
	(rule__Element__DocAssignment_0)?
	{ after(grammarAccess.getElementAccess().getDocAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Element__Group__1__Impl
	rule__Element__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementAccess().getNameAssignment_1()); }
	(rule__Element__NameAssignment_1)
	{ after(grammarAccess.getElementAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Element__Group__2__Impl
	rule__Element__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Element__Group__3__Impl
	rule__Element__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementAccess().getContainedAssignment_3()); }
	(rule__Element__ContainedAssignment_3)*
	{ after(grammarAccess.getElementAccess().getContainedAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Element__Group__4__Impl
	rule__Element__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementAccess().getGroup_4()); }
	(rule__Element__Group_4__0)*
	{ after(grammarAccess.getElementAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Element__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getElementAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Element__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Element__Group_4__0__Impl
	rule__Element__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementAccess().getRefKeyword_4_0()); }
	'ref'
	{ after(grammarAccess.getElementAccess().getRefKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Element__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementAccess().getReferencedAssignment_4_1()); }
	(rule__Element__ReferencedAssignment_4_1)
	{ after(grammarAccess.getElementAccess().getReferencedAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Main__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMainAccess().getElementsElementParserRuleCall_0()); }
		ruleElement
		{ after(grammarAccess.getMainAccess().getElementsElementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__DocAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getDocSTRINGTerminalRuleCall_0_0()); }
		RULE_STRING
		{ after(grammarAccess.getElementAccess().getDocSTRINGTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__ContainedAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getContainedElementParserRuleCall_3_0()); }
		ruleElement
		{ after(grammarAccess.getElementAccess().getContainedElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__ReferencedAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getReferencedElementCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getElementAccess().getReferencedElementIDTerminalRuleCall_4_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getElementAccess().getReferencedElementIDTerminalRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getElementAccess().getReferencedElementCrossReference_4_1_0()); }
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
