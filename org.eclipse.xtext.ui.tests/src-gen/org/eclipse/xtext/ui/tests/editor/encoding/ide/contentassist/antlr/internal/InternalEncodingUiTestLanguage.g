/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalEncodingUiTestLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.eclipse.xtext.ui.tests.editor.encoding.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.xtext.ui.tests.editor.encoding.ide.contentassist.antlr.internal;

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
import org.eclipse.xtext.ui.tests.editor.encoding.services.EncodingUiTestLanguageGrammarAccess;

}
@parser::members {
	private EncodingUiTestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(EncodingUiTestLanguageGrammarAccess grammarAccess) {
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
		{ before(grammarAccess.getModelAccess().getWordsAssignment()); }
		(rule__Model__WordsAssignment)*
		{ after(grammarAccess.getModelAccess().getWordsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWord
entryRuleWord
:
{ before(grammarAccess.getWordRule()); }
	 ruleWord
{ after(grammarAccess.getWordRule()); } 
	 EOF 
;

// Rule Word
ruleWord 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWordAccess().getValueAssignment()); }
		(rule__Word__ValueAssignment)
		{ after(grammarAccess.getWordAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__WordsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getWordsWordParserRuleCall_0()); }
		ruleWord
		{ after(grammarAccess.getModelAccess().getWordsWordParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Word__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWordAccess().getValueLEXEMETerminalRuleCall_0()); }
		RULE_LEXEME
		{ after(grammarAccess.getWordAccess().getValueLEXEMETerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_LEXEME : ('a'..'z'|'A'..'Z'|'0'..'9'|'\u00E4'|'\u00F6'|'\u00FC'|'\u00DF'|'\u00C4'|'\u00D6'|'\u00DC')*;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
