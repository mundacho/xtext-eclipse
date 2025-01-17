/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalDomainModelTestLanguage;

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
import org.eclipse.xtext.ui.tests.editor.contentassist.services.DomainModelTestLanguageGrammarAccess;

}
@parser::members {
	private DomainModelTestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(DomainModelTestLanguageGrammarAccess grammarAccess) {
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
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
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
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataType
entryRuleDataType
:
{ before(grammarAccess.getDataTypeRule()); }
	 ruleDataType
{ after(grammarAccess.getDataTypeRule()); } 
	 EOF 
;

// Rule DataType
ruleDataType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataTypeAccess().getGroup()); }
		(rule__DataType__Group__0)
		{ after(grammarAccess.getDataTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClass
entryRuleClass
:
{ before(grammarAccess.getClassRule()); }
	 ruleClass
{ after(grammarAccess.getClassRule()); } 
	 EOF 
;

// Rule Class
ruleClass 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClassAccess().getGroup()); }
		(rule__Class__Group__0)
		{ after(grammarAccess.getClassAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProperty
entryRuleProperty
:
{ before(grammarAccess.getPropertyRule()); }
	 ruleProperty
{ after(grammarAccess.getPropertyRule()); } 
	 EOF 
;

// Rule Property
ruleProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyAccess().getAlternatives()); }
		(rule__Property__Alternatives)
		{ after(grammarAccess.getPropertyAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReference
entryRuleReference
:
{ before(grammarAccess.getReferenceRule()); }
	 ruleReference
{ after(grammarAccess.getReferenceRule()); } 
	 EOF 
;

// Rule Reference
ruleReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReferenceAccess().getGroup()); }
		(rule__Reference__Group__0)
		{ after(grammarAccess.getReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); }
		ruleDataType
		{ after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getClassParserRuleCall_1()); }
		ruleClass
		{ after(grammarAccess.getTypeAccess().getClassParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_0()); }
		ruleAttribute
		{ after(grammarAccess.getPropertyAccess().getAttributeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyAccess().getReferenceParserRuleCall_1()); }
		ruleReference
		{ after(grammarAccess.getPropertyAccess().getReferenceParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getImportsAssignment_0()); }
	(rule__Model__ImportsAssignment_0)*
	{ after(grammarAccess.getModelAccess().getImportsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getElementsAssignment_1()); }
	(rule__Model__ElementsAssignment_1)*
	{ after(grammarAccess.getModelAccess().getElementsAssignment_1()); }
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


rule__DataType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group__0__Impl
	rule__DataType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); }
	'datatype'
	{ after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group__1__Impl
	rule__DataType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); }
	(rule__DataType__NameAssignment_1)
	{ after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getDataTypeAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__0__Impl
	rule__Class__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getClassKeyword_0()); }
	'class'
	{ after(grammarAccess.getClassAccess().getClassKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__1__Impl
	rule__Class__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getNameAssignment_1()); }
	(rule__Class__NameAssignment_1)
	{ after(grammarAccess.getClassAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__2__Impl
	rule__Class__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getGroup_2()); }
	(rule__Class__Group_2__0)?
	{ after(grammarAccess.getClassAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__3__Impl
	rule__Class__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__4__Impl
	rule__Class__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getPropertiesAssignment_4()); }
	(rule__Class__PropertiesAssignment_4)*
	{ after(grammarAccess.getClassAccess().getPropertiesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__5__Impl
	rule__Class__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getSubClassesAssignment_5()); }
	(rule__Class__SubClassesAssignment_5)*
	{ after(grammarAccess.getClassAccess().getSubClassesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group_2__0__Impl
	rule__Class__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); }
	'extends'
	{ after(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Class__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClassAccess().getSuperClassAssignment_2_1()); }
	(rule__Class__SuperClassAssignment_2_1)
	{ after(grammarAccess.getClassAccess().getSuperClassAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getAttrKeyword_0()); }
	'attr'
	{ after(grammarAccess.getAttributeAccess().getAttrKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
	(rule__Attribute__NameAssignment_1)
	{ after(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getAttributeAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__3__Impl
	rule__Attribute__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); }
	(rule__Attribute__TypeAssignment_3)
	{ after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getSemicolonKeyword_4()); }
	(';')?
	{ after(grammarAccess.getAttributeAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Reference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reference__Group__0__Impl
	rule__Reference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceAccess().getRefKeyword_0()); }
	'ref'
	{ after(grammarAccess.getReferenceAccess().getRefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reference__Group__1__Impl
	rule__Reference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceAccess().getNameAssignment_1()); }
	(rule__Reference__NameAssignment_1)
	{ after(grammarAccess.getReferenceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reference__Group__2__Impl
	rule__Reference__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getReferenceAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reference__Group__3__Impl
	rule__Reference__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); }
	(rule__Reference__TypeAssignment_3)
	{ after(grammarAccess.getReferenceAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reference__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceAccess().getSemicolonKeyword_4()); }
	(';')?
	{ after(grammarAccess.getReferenceAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ImportsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); }
		ruleImport
		{ after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__ElementsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_1_0()); }
		ruleType
		{ after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_1_0()); }
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

rule__DataType__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__SuperClassAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassAccess().getSuperClassClassCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getClassAccess().getSuperClassClassIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getClassAccess().getSuperClassClassIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getClassAccess().getSuperClassClassCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__PropertiesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_4_0()); }
		ruleProperty
		{ after(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__SubClassesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassAccess().getSubClassesClassParserRuleCall_5_0()); }
		ruleClass
		{ after(grammarAccess.getClassAccess().getSubClassesClassParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getAttributeAccess().getTypeDataTypeIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAttributeAccess().getTypeDataTypeIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferenceAccess().getTypeClassCrossReference_3_0()); }
		(
			{ before(grammarAccess.getReferenceAccess().getTypeClassIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getReferenceAccess().getTypeClassIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getReferenceAccess().getTypeClassCrossReference_3_0()); }
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
