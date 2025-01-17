/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalImportUriUiTestLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.eclipse.xtext.ui.tests.linking.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.xtext.ui.tests.linking.ide.contentassist.antlr.internal;

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
import org.eclipse.xtext.ui.tests.linking.services.ImportUriUiTestLanguageGrammarAccess;

}
@parser::members {
	private ImportUriUiTestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(ImportUriUiTestLanguageGrammarAccess grammarAccess) {
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
		{ before(grammarAccess.getMainAccess().getGroup()); }
		(rule__Main__Group__0)
		{ after(grammarAccess.getMainAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImport
entryRuleImport
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportAccess().getGroup()); }
		(rule__Import__Group__0)
		{ after(grammarAccess.getImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getGroup()); }
		(rule__Type__Group__0)
		{ after(grammarAccess.getTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Main__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Main__Group__0__Impl
	rule__Main__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Main__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMainAccess().getImportsAssignment_0()); }
	(rule__Main__ImportsAssignment_0)*
	{ after(grammarAccess.getMainAccess().getImportsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Main__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Main__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Main__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMainAccess().getTypesAssignment_1()); }
	(rule__Main__TypesAssignment_1)*
	{ after(grammarAccess.getMainAccess().getTypesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportURIAssignment_1()); }
	(rule__Import__ImportURIAssignment_1)
	{ after(grammarAccess.getImportAccess().getImportURIAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group__0__Impl
	rule__Type__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getTypeKeyword_0()); }
	'type'
	{ after(grammarAccess.getTypeAccess().getTypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group__1__Impl
	rule__Type__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getNameAssignment_1()); }
	(rule__Type__NameAssignment_1)
	{ after(grammarAccess.getTypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group__2__Impl
	rule__Type__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getExtendsKeyword_2()); }
	'extends'
	{ after(grammarAccess.getTypeAccess().getExtendsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getExtendsAssignment_3()); }
	(rule__Type__ExtendsAssignment_3)
	{ after(grammarAccess.getTypeAccess().getExtendsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Main__ImportsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMainAccess().getImportsImportParserRuleCall_0_0()); }
		ruleImport
		{ after(grammarAccess.getMainAccess().getImportsImportParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Main__TypesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMainAccess().getTypesTypeParserRuleCall_1_0()); }
		ruleType
		{ after(grammarAccess.getMainAccess().getTypesTypeParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportURIAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__ExtendsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getExtendsTypeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getTypeAccess().getExtendsTypeIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTypeAccess().getExtendsTypeIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getTypeAccess().getExtendsTypeCrossReference_3_0()); }
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
