/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug332217TestLanguage;

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
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug332217TestLanguageGrammarAccess;

}
@parser::members {
	private Bug332217TestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(Bug332217TestLanguageGrammarAccess grammarAccess) {
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
		{ before(grammarAccess.getModelAccess().getElementsAssignment()); }
		(rule__Model__ElementsAssignment)*
		{ after(grammarAccess.getModelAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeDescription
entryRuleTypeDescription
:
{ before(grammarAccess.getTypeDescriptionRule()); }
	 ruleTypeDescription
{ after(grammarAccess.getTypeDescriptionRule()); } 
	 EOF 
;

// Rule TypeDescription
ruleTypeDescription 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeDescriptionAccess().getGroup()); }
		(rule__TypeDescription__Group__0)
		{ after(grammarAccess.getTypeDescriptionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameter
entryRuleParameter
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterAccess().getGroup()); }
		(rule__Parameter__Group__0)
		{ after(grammarAccess.getParameterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleObjectReference
entryRuleObjectReference
:
{ before(grammarAccess.getObjectReferenceRule()); }
	 ruleObjectReference
{ after(grammarAccess.getObjectReferenceRule()); } 
	 EOF 
;

// Rule ObjectReference
ruleObjectReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getObjectReferenceAccess().getGroup()); }
		(rule__ObjectReference__Group__0)
		{ after(grammarAccess.getObjectReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedObjectReference
entryRuleNestedObjectReference
:
{ before(grammarAccess.getNestedObjectReferenceRule()); }
	 ruleNestedObjectReference
{ after(grammarAccess.getNestedObjectReferenceRule()); } 
	 EOF 
;

// Rule NestedObjectReference
ruleNestedObjectReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedObjectReferenceAccess().getGroup()); }
		(rule__NestedObjectReference__Group__0)
		{ after(grammarAccess.getNestedObjectReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImageExpression
entryRuleImageExpression
:
{ before(grammarAccess.getImageExpressionRule()); }
	 ruleImageExpression
{ after(grammarAccess.getImageExpressionRule()); } 
	 EOF 
;

// Rule ImageExpression
ruleImageExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImageExpressionAccess().getScalarExpressionParserRuleCall()); }
		ruleScalarExpression
		{ after(grammarAccess.getImageExpressionAccess().getScalarExpressionParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScalarExpression
entryRuleScalarExpression
:
{ before(grammarAccess.getScalarExpressionRule()); }
	 ruleScalarExpression
{ after(grammarAccess.getScalarExpressionRule()); } 
	 EOF 
;

// Rule ScalarExpression
ruleScalarExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScalarExpressionAccess().getAlternatives()); }
		(rule__ScalarExpression__Alternatives)
		{ after(grammarAccess.getScalarExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCollectionExpression
entryRuleCollectionExpression
:
{ before(grammarAccess.getCollectionExpressionRule()); }
	 ruleCollectionExpression
{ after(grammarAccess.getCollectionExpressionRule()); } 
	 EOF 
;

// Rule CollectionExpression
ruleCollectionExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCollectionExpressionAccess().getAlternatives()); }
		(rule__CollectionExpression__Alternatives)
		{ after(grammarAccess.getCollectionExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringLiteral
entryRuleStringLiteral
:
{ before(grammarAccess.getStringLiteralRule()); }
	 ruleStringLiteral
{ after(grammarAccess.getStringLiteralRule()); } 
	 EOF 
;

// Rule StringLiteral
ruleStringLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringLiteralAccess().getValueAssignment()); }
		(rule__StringLiteral__ValueAssignment)
		{ after(grammarAccess.getStringLiteralAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringFunction
entryRuleStringFunction
:
{ before(grammarAccess.getStringFunctionRule()); }
	 ruleStringFunction
{ after(grammarAccess.getStringFunctionRule()); } 
	 EOF 
;

// Rule StringFunction
ruleStringFunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringFunctionAccess().getAlternatives()); }
		(rule__StringFunction__Alternatives)
		{ after(grammarAccess.getStringFunctionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCollectionLiteral
entryRuleCollectionLiteral
:
{ before(grammarAccess.getCollectionLiteralRule()); }
	 ruleCollectionLiteral
{ after(grammarAccess.getCollectionLiteralRule()); } 
	 EOF 
;

// Rule CollectionLiteral
ruleCollectionLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCollectionLiteralAccess().getGroup()); }
		(rule__CollectionLiteral__Group__0)
		{ after(grammarAccess.getCollectionLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCollectionFunction
entryRuleCollectionFunction
:
{ before(grammarAccess.getCollectionFunctionRule()); }
	 ruleCollectionFunction
{ after(grammarAccess.getCollectionFunctionRule()); } 
	 EOF 
;

// Rule CollectionFunction
ruleCollectionFunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCollectionFunctionAccess().getGroup()); }
		(rule__CollectionFunction__Group__0)
		{ after(grammarAccess.getCollectionFunctionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTableView
entryRuleTableView
:
{ before(grammarAccess.getTableViewRule()); }
	 ruleTableView
{ after(grammarAccess.getTableViewRule()); } 
	 EOF 
;

// Rule TableView
ruleTableView 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTableViewAccess().getGroup()); }
		(rule__TableView__Group__0)
		{ after(grammarAccess.getTableViewAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSection
entryRuleSection
:
{ before(grammarAccess.getSectionRule()); }
	 ruleSection
{ after(grammarAccess.getSectionRule()); } 
	 EOF 
;

// Rule Section
ruleSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSectionAccess().getGroup()); }
		(rule__Section__Group__0)
		{ after(grammarAccess.getSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCell
entryRuleCell
:
{ before(grammarAccess.getCellRule()); }
	 ruleCell
{ after(grammarAccess.getCellRule()); } 
	 EOF 
;

// Rule Cell
ruleCell 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCellAccess().getGroup()); }
		(rule__Cell__Group__0)
		{ after(grammarAccess.getCellAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCollectionIterator
entryRuleCollectionIterator
:
{ before(grammarAccess.getCollectionIteratorRule()); }
	 ruleCollectionIterator
{ after(grammarAccess.getCollectionIteratorRule()); } 
	 EOF 
;

// Rule CollectionIterator
ruleCollectionIterator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCollectionIteratorAccess().getGroup()); }
		(rule__CollectionIterator__Group__0)
		{ after(grammarAccess.getCollectionIteratorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleViewAction
entryRuleViewAction
:
{ before(grammarAccess.getViewActionRule()); }
	 ruleViewAction
{ after(grammarAccess.getViewActionRule()); } 
	 EOF 
;

// Rule ViewAction
ruleViewAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getViewActionAccess().getAlternatives()); }
		(rule__ViewAction__Alternatives)
		{ after(grammarAccess.getViewActionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSelectorName
entryRuleSelectorName
:
{ before(grammarAccess.getSelectorNameRule()); }
	 ruleSelectorName
{ after(grammarAccess.getSelectorNameRule()); } 
	 EOF 
;

// Rule SelectorName
ruleSelectorName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSelectorNameAccess().getGroup()); }
		(rule__SelectorName__Group__0)
		{ after(grammarAccess.getSelectorNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSelector
entryRuleSelector
:
{ before(grammarAccess.getSelectorRule()); }
	 ruleSelector
{ after(grammarAccess.getSelectorRule()); } 
	 EOF 
;

// Rule Selector
ruleSelector 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSelectorAccess().getGroup()); }
		(rule__Selector__Group__0)
		{ after(grammarAccess.getSelectorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExternalOpen
entryRuleExternalOpen
:
{ before(grammarAccess.getExternalOpenRule()); }
	 ruleExternalOpen
{ after(grammarAccess.getExternalOpenRule()); } 
	 EOF 
;

// Rule ExternalOpen
ruleExternalOpen 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExternalOpenAccess().getUrlAssignment()); }
		(rule__ExternalOpen__UrlAssignment)
		{ after(grammarAccess.getExternalOpenAccess().getUrlAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TableViewStyle
ruleTableViewStyle
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableViewStyleAccess().getAlternatives()); }
		(rule__TableViewStyle__Alternatives)
		{ after(grammarAccess.getTableViewStyleAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule CellType
ruleCellType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellTypeAccess().getAlternatives()); }
		(rule__CellType__Alternatives)
		{ after(grammarAccess.getCellTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule CellAccessory
ruleCellAccessory
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccessoryAccess().getAlternatives()); }
		(rule__CellAccessory__Alternatives)
		{ after(grammarAccess.getCellAccessoryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0()); }
		ruleStringLiteral
		{ after(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1()); }
		ruleStringFunction
		{ after(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2()); }
		ruleObjectReference
		{ after(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0()); }
		ruleCollectionLiteral
		{ after(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1()); }
		ruleCollectionFunction
		{ after(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2()); }
		ruleObjectReference
		{ after(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringFunctionAccess().getGroup_0()); }
		(rule__StringFunction__Group_0__0)
		{ after(grammarAccess.getStringFunctionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getStringFunctionAccess().getGroup_1()); }
		(rule__StringFunction__Group_1__0)
		{ after(grammarAccess.getStringFunctionAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getStringFunctionAccess().getGroup_2()); }
		(rule__StringFunction__Group_2__0)
		{ after(grammarAccess.getStringFunctionAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ViewAction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_0()); }
		ruleExternalOpen
		{ after(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getViewActionAccess().getSelectorParserRuleCall_1()); }
		ruleSelector
		{ after(grammarAccess.getViewActionAccess().getSelectorParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableViewStyle__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableViewStyleAccess().getPlainEnumLiteralDeclaration_0()); }
		('Plain')
		{ after(grammarAccess.getTableViewStyleAccess().getPlainEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTableViewStyleAccess().getGroupedEnumLiteralDeclaration_1()); }
		('Grouped')
		{ after(grammarAccess.getTableViewStyleAccess().getGroupedEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CellType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0()); }
		('Default')
		{ after(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getCellTypeAccess().getValue1EnumLiteralDeclaration_1()); }
		('Value1')
		{ after(grammarAccess.getCellTypeAccess().getValue1EnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2()); }
		('Value2')
		{ after(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_3()); }
		('Subtitle')
		{ after(grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CellAccessory__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccessoryAccess().getNoneEnumLiteralDeclaration_0()); }
		('None')
		{ after(grammarAccess.getCellAccessoryAccess().getNoneEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getCellAccessoryAccess().getLinkEnumLiteralDeclaration_1()); }
		('Link')
		{ after(grammarAccess.getCellAccessoryAccess().getLinkEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getCellAccessoryAccess().getDetailEnumLiteralDeclaration_2()); }
		('Detail')
		{ after(grammarAccess.getCellAccessoryAccess().getDetailEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getCellAccessoryAccess().getCheckEnumLiteralDeclaration_3()); }
		('Check')
		{ after(grammarAccess.getCellAccessoryAccess().getCheckEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDescription__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDescription__Group__0__Impl
	rule__TypeDescription__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDescription__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDescriptionAccess().getTypeAssignment_0()); }
	(rule__TypeDescription__TypeAssignment_0)
	{ after(grammarAccess.getTypeDescriptionAccess().getTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDescription__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDescription__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDescription__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDescriptionAccess().getManyAssignment_1()); }
	(rule__TypeDescription__ManyAssignment_1)?
	{ after(grammarAccess.getTypeDescriptionAccess().getManyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__0__Impl
	rule__Parameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getDescriptionAssignment_0()); }
	(rule__Parameter__DescriptionAssignment_0)
	{ after(grammarAccess.getParameterAccess().getDescriptionAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getNameAssignment_1()); }
	(rule__Parameter__NameAssignment_1)
	{ after(grammarAccess.getParameterAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectReference__Group__0__Impl
	rule__ObjectReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectReferenceAccess().getObjectAssignment_0()); }
	(rule__ObjectReference__ObjectAssignment_0)
	{ after(grammarAccess.getObjectReferenceAccess().getObjectAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectReferenceAccess().getTailAssignment_1()); }
	(rule__ObjectReference__TailAssignment_1)?
	{ after(grammarAccess.getObjectReferenceAccess().getTailAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedObjectReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedObjectReference__Group__0__Impl
	rule__NestedObjectReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedObjectReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0()); }
	'.'
	{ after(grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedObjectReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedObjectReference__Group__1__Impl
	rule__NestedObjectReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedObjectReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedObjectReferenceAccess().getObjectAssignment_1()); }
	(rule__NestedObjectReference__ObjectAssignment_1)
	{ after(grammarAccess.getNestedObjectReferenceAccess().getObjectAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedObjectReference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedObjectReference__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedObjectReference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedObjectReferenceAccess().getTailAssignment_2()); }
	(rule__NestedObjectReference__TailAssignment_2)?
	{ after(grammarAccess.getNestedObjectReferenceAccess().getTailAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringFunction__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_0__0__Impl
	rule__StringFunction__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0()); }
	()
	{ after(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_0__1__Impl
	rule__StringFunction__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1()); }
	'('
	{ after(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_0__2__Impl
	rule__StringFunction__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); }
		(rule__StringFunction__ValuesAssignment_0_2)
		{ after(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); }
	)
	(
		{ before(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); }
		(rule__StringFunction__ValuesAssignment_0_2)*
		{ after(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3()); }
	')'
	{ after(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringFunction__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_1__0__Impl
	rule__StringFunction__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0()); }
	()
	{ after(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_1__1__Impl
	rule__StringFunction__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1()); }
	'replace('
	{ after(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_1__2__Impl
	rule__StringFunction__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getValueAssignment_1_2()); }
	(rule__StringFunction__ValueAssignment_1_2)
	{ after(grammarAccess.getStringFunctionAccess().getValueAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_1__3__Impl
	rule__StringFunction__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3()); }
	','
	{ after(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_1__4__Impl
	rule__StringFunction__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getMatchAssignment_1_4()); }
	(rule__StringFunction__MatchAssignment_1_4)
	{ after(grammarAccess.getStringFunctionAccess().getMatchAssignment_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_1__5__Impl
	rule__StringFunction__Group_1__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5()); }
	','
	{ after(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_1__6__Impl
	rule__StringFunction__Group_1__7
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getReplacementAssignment_1_6()); }
	(rule__StringFunction__ReplacementAssignment_1_6)
	{ after(grammarAccess.getStringFunctionAccess().getReplacementAssignment_1_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_1__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_1__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7()); }
	')'
	{ after(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringFunction__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_2__0__Impl
	rule__StringFunction__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0()); }
	()
	{ after(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_2__1__Impl
	rule__StringFunction__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1()); }
	'urlconform('
	{ after(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_2__2__Impl
	rule__StringFunction__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getValueAssignment_2_2()); }
	(rule__StringFunction__ValueAssignment_2_2)
	{ after(grammarAccess.getStringFunctionAccess().getValueAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringFunction__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3()); }
	')'
	{ after(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CollectionLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionLiteral__Group__0__Impl
	rule__CollectionLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0()); }
	'['
	{ after(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionLiteral__Group__1__Impl
	rule__CollectionLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_1()); }
	(rule__CollectionLiteral__ItemsAssignment_1)
	{ after(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionLiteral__Group__2__Impl
	rule__CollectionLiteral__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionLiteralAccess().getGroup_2()); }
	(rule__CollectionLiteral__Group_2__0)*
	{ after(grammarAccess.getCollectionLiteralAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionLiteral__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionLiteral__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionLiteral__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3()); }
	']'
	{ after(grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CollectionLiteral__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionLiteral__Group_2__0__Impl
	rule__CollectionLiteral__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionLiteral__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionLiteral__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionLiteral__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionLiteral__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_2_1()); }
	(rule__CollectionLiteral__ItemsAssignment_2_1)
	{ after(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CollectionFunction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionFunction__Group__0__Impl
	rule__CollectionFunction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0()); }
	()
	{ after(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionFunction__Group__1__Impl
	rule__CollectionFunction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1()); }
	'split('
	{ after(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionFunction__Group__2__Impl
	rule__CollectionFunction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionFunctionAccess().getValueAssignment_2()); }
	(rule__CollectionFunction__ValueAssignment_2)
	{ after(grammarAccess.getCollectionFunctionAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionFunction__Group__3__Impl
	rule__CollectionFunction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3()); }
	','
	{ after(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionFunction__Group__4__Impl
	rule__CollectionFunction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionFunctionAccess().getDelimiterAssignment_4()); }
	(rule__CollectionFunction__DelimiterAssignment_4)
	{ after(grammarAccess.getCollectionFunctionAccess().getDelimiterAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionFunction__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TableView__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group__0__Impl
	rule__TableView__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getTableviewKeyword_0()); }
	'tableview'
	{ after(grammarAccess.getTableViewAccess().getTableviewKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group__1__Impl
	rule__TableView__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getNameAssignment_1()); }
	(rule__TableView__NameAssignment_1)
	{ after(grammarAccess.getTableViewAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group__2__Impl
	rule__TableView__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getGroup_2()); }
	(rule__TableView__Group_2__0)?
	{ after(grammarAccess.getTableViewAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group__3__Impl
	rule__TableView__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group__4__Impl
	rule__TableView__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getUnorderedGroup_4()); }
	(rule__TableView__UnorderedGroup_4)
	{ after(grammarAccess.getTableViewAccess().getUnorderedGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group__5__Impl
	rule__TableView__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getSectionsAssignment_5()); }
	(rule__TableView__SectionsAssignment_5)*
	{ after(grammarAccess.getTableViewAccess().getSectionsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TableView__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group_2__0__Impl
	rule__TableView__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group_2__1__Impl
	rule__TableView__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getContentAssignment_2_1()); }
	(rule__TableView__ContentAssignment_2_1)
	{ after(grammarAccess.getTableViewAccess().getContentAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2()); }
	')'
	{ after(grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TableView__Group_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group_4_0__0__Impl
	rule__TableView__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getTitleKeyword_4_0_0()); }
	'title:'
	{ after(grammarAccess.getTableViewAccess().getTitleKeyword_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_4_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group_4_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_4_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getTitleAssignment_4_0_1()); }
	(rule__TableView__TitleAssignment_4_0_1)
	{ after(grammarAccess.getTableViewAccess().getTitleAssignment_4_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TableView__Group_4_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group_4_1__0__Impl
	rule__TableView__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_4_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getTitleImageKeyword_4_1_0()); }
	'titleImage:'
	{ after(grammarAccess.getTableViewAccess().getTitleImageKeyword_4_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_4_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group_4_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_4_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getTitleImageAssignment_4_1_1()); }
	(rule__TableView__TitleImageAssignment_4_1_1)
	{ after(grammarAccess.getTableViewAccess().getTitleImageAssignment_4_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TableView__Group_4_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group_4_2__0__Impl
	rule__TableView__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_4_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getStyleKeyword_4_2_0()); }
	'style:'
	{ after(grammarAccess.getTableViewAccess().getStyleKeyword_4_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_4_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__Group_4_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTableViewAccess().getStyleAssignment_4_2_1()); }
	(rule__TableView__StyleAssignment_4_2_1)
	{ after(grammarAccess.getTableViewAccess().getStyleAssignment_4_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Section__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group__0__Impl
	rule__Section__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionAccess().getSectionKeyword_0()); }
	'section'
	{ after(grammarAccess.getSectionAccess().getSectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group__1__Impl
	rule__Section__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionAccess().getIteratorAssignment_1()); }
	(rule__Section__IteratorAssignment_1)?
	{ after(grammarAccess.getSectionAccess().getIteratorAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group__2__Impl
	rule__Section__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group__3__Impl
	rule__Section__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionAccess().getGroup_3()); }
	(rule__Section__Group_3__0)?
	{ after(grammarAccess.getSectionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group__4__Impl
	rule__Section__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSectionAccess().getCellsAssignment_4()); }
		(rule__Section__CellsAssignment_4)
		{ after(grammarAccess.getSectionAccess().getCellsAssignment_4()); }
	)
	(
		{ before(grammarAccess.getSectionAccess().getCellsAssignment_4()); }
		(rule__Section__CellsAssignment_4)*
		{ after(grammarAccess.getSectionAccess().getCellsAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Section__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group_3__0__Impl
	rule__Section__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionAccess().getTitleKeyword_3_0()); }
	'title:'
	{ after(grammarAccess.getSectionAccess().getTitleKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Section__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSectionAccess().getTitleAssignment_3_1()); }
	(rule__Section__TitleAssignment_3_1)
	{ after(grammarAccess.getSectionAccess().getTitleAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__0__Impl
	rule__Cell__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getCellKeyword_0()); }
	'cell'
	{ after(grammarAccess.getCellAccess().getCellKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__1__Impl
	rule__Cell__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getTypeAssignment_1()); }
	(rule__Cell__TypeAssignment_1)
	{ after(grammarAccess.getCellAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__2__Impl
	rule__Cell__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getIteratorAssignment_2()); }
	(rule__Cell__IteratorAssignment_2)?
	{ after(grammarAccess.getCellAccess().getIteratorAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__3__Impl
	rule__Cell__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getCellAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__4__Impl
	rule__Cell__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getUnorderedGroup_4()); }
	(rule__Cell__UnorderedGroup_4)
	{ after(grammarAccess.getCellAccess().getUnorderedGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getCellAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_4_0__0__Impl
	rule__Cell__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getTextKeyword_4_0_0()); }
	'text:'
	{ after(grammarAccess.getCellAccess().getTextKeyword_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_4_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getTextAssignment_4_0_1()); }
	(rule__Cell__TextAssignment_4_0_1)
	{ after(grammarAccess.getCellAccess().getTextAssignment_4_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group_4_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_4_1__0__Impl
	rule__Cell__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getDetailsKeyword_4_1_0()); }
	'details:'
	{ after(grammarAccess.getCellAccess().getDetailsKeyword_4_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_4_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getDetailsAssignment_4_1_1()); }
	(rule__Cell__DetailsAssignment_4_1_1)
	{ after(grammarAccess.getCellAccess().getDetailsAssignment_4_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group_4_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_4_2__0__Impl
	rule__Cell__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getImageKeyword_4_2_0()); }
	'image:'
	{ after(grammarAccess.getCellAccess().getImageKeyword_4_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getImageAssignment_4_2_1()); }
	(rule__Cell__ImageAssignment_4_2_1)
	{ after(grammarAccess.getCellAccess().getImageAssignment_4_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_4_3__0__Impl
	rule__Cell__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getActionKeyword_4_3_0()); }
	'action:'
	{ after(grammarAccess.getCellAccess().getActionKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getActionAssignment_4_3_1()); }
	(rule__Cell__ActionAssignment_4_3_1)
	{ after(grammarAccess.getCellAccess().getActionAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group_4_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_4_4__0__Impl
	rule__Cell__Group_4_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getAccessoryKeyword_4_4_0()); }
	'accessory:'
	{ after(grammarAccess.getCellAccess().getAccessoryKeyword_4_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_4_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_4_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getAccessoryAssignment_4_4_1()); }
	(rule__Cell__AccessoryAssignment_4_4_1)
	{ after(grammarAccess.getCellAccess().getAccessoryAssignment_4_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CollectionIterator__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionIterator__Group__0__Impl
	rule__CollectionIterator__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionIterator__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionIteratorAccess().getForKeyword_0()); }
	'for'
	{ after(grammarAccess.getCollectionIteratorAccess().getForKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionIterator__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionIterator__Group__1__Impl
	rule__CollectionIterator__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionIterator__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionIteratorAccess().getNameAssignment_1()); }
	(rule__CollectionIterator__NameAssignment_1)
	{ after(grammarAccess.getCollectionIteratorAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionIterator__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionIterator__Group__2__Impl
	rule__CollectionIterator__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionIterator__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionIteratorAccess().getInKeyword_2()); }
	'in'
	{ after(grammarAccess.getCollectionIteratorAccess().getInKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionIterator__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CollectionIterator__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionIterator__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCollectionIteratorAccess().getCollectionAssignment_3()); }
	(rule__CollectionIterator__CollectionAssignment_3)
	{ after(grammarAccess.getCollectionIteratorAccess().getCollectionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SelectorName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectorName__Group__0__Impl
	rule__SelectorName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectorName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectorNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getSelectorNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectorName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectorName__Group__1__Impl
	rule__SelectorName__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectorName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectorNameAccess().getGroup_1()); }
	(rule__SelectorName__Group_1__0)*
	{ after(grammarAccess.getSelectorNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectorName__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectorName__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectorName__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectorNameAccess().getColonKeyword_2()); }
	(':')?
	{ after(grammarAccess.getSelectorNameAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SelectorName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectorName__Group_1__0__Impl
	rule__SelectorName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectorName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectorNameAccess().getColonKeyword_1_0()); }
	':'
	{ after(grammarAccess.getSelectorNameAccess().getColonKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectorName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelectorName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SelectorName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectorNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getSelectorNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Selector__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Selector__Group__0__Impl
	rule__Selector__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectorAccess().getSelectorKeyword_0()); }
	'@selector'
	{ after(grammarAccess.getSelectorAccess().getSelectorKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Selector__Group__1__Impl
	rule__Selector__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectorAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getSelectorAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Selector__Group__2__Impl
	rule__Selector__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectorAccess().getNameAssignment_2()); }
	(rule__Selector__NameAssignment_2)
	{ after(grammarAccess.getSelectorAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Selector__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelectorAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getSelectorAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TableView__UnorderedGroup_4
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getTableViewAccess().getUnorderedGroup_4());
	}
:
	rule__TableView__UnorderedGroup_4__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getTableViewAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}

rule__TableView__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTableViewAccess().getGroup_4_0()); }
					(rule__TableView__Group_4_0__0)
					{ after(grammarAccess.getTableViewAccess().getGroup_4_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTableViewAccess().getGroup_4_1()); }
					(rule__TableView__Group_4_1__0)
					{ after(grammarAccess.getTableViewAccess().getGroup_4_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTableViewAccess().getGroup_4_2()); }
					(rule__TableView__Group_4_2__0)
					{ after(grammarAccess.getTableViewAccess().getGroup_4_2()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableViewAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}

rule__TableView__UnorderedGroup_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__UnorderedGroup_4__Impl
	rule__TableView__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__UnorderedGroup_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__UnorderedGroup_4__Impl
	rule__TableView__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__UnorderedGroup_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TableView__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__UnorderedGroup_4
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getCellAccess().getUnorderedGroup_4());
	}
:
	rule__Cell__UnorderedGroup_4__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getCellAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}

rule__Cell__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCellAccess().getGroup_4_0()); }
					(rule__Cell__Group_4_0__0)
					{ after(grammarAccess.getCellAccess().getGroup_4_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCellAccess().getGroup_4_1()); }
					(rule__Cell__Group_4_1__0)
					{ after(grammarAccess.getCellAccess().getGroup_4_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCellAccess().getGroup_4_2()); }
					(rule__Cell__Group_4_2__0)
					{ after(grammarAccess.getCellAccess().getGroup_4_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCellAccess().getGroup_4_3()); }
					(rule__Cell__Group_4_3__0)
					{ after(grammarAccess.getCellAccess().getGroup_4_3()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 4);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCellAccess().getGroup_4_4()); }
					(rule__Cell__Group_4_4__0)
					{ after(grammarAccess.getCellAccess().getGroup_4_4()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}

rule__Cell__UnorderedGroup_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__UnorderedGroup_4__Impl
	rule__Cell__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__UnorderedGroup_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__UnorderedGroup_4__Impl
	rule__Cell__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__UnorderedGroup_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__UnorderedGroup_4__Impl
	rule__Cell__UnorderedGroup_4__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__UnorderedGroup_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__UnorderedGroup_4__Impl
	rule__Cell__UnorderedGroup_4__4?
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__UnorderedGroup_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElementsTableViewParserRuleCall_0()); }
		ruleTableView
		{ after(grammarAccess.getModelAccess().getElementsTableViewParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDescription__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDescriptionAccess().getTypeIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getTypeDescriptionAccess().getTypeIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDescription__ManyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); }
		(
			{ before(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); }
			'[]'
			{ after(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); }
		)
		{ after(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__DescriptionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0()); }
		ruleTypeDescription
		{ after(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectReference__ObjectAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectReferenceAccess().getObjectPropertyPathPartCrossReference_0_0()); }
		(
			{ before(grammarAccess.getObjectReferenceAccess().getObjectPropertyPathPartIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getObjectReferenceAccess().getObjectPropertyPathPartIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getObjectReferenceAccess().getObjectPropertyPathPartCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectReference__TailAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0()); }
		ruleNestedObjectReference
		{ after(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedObjectReference__ObjectAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedObjectReferenceAccess().getObjectPropertyPathPartCrossReference_1_0()); }
		(
			{ before(grammarAccess.getNestedObjectReferenceAccess().getObjectPropertyPathPartIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getNestedObjectReferenceAccess().getObjectPropertyPathPartIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getNestedObjectReferenceAccess().getObjectPropertyPathPartCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedObjectReference__TailAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0()); }
		ruleNestedObjectReference
		{ after(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__ValuesAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__ValueAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__MatchAssignment_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__ReplacementAssignment_1_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringFunction__ValueAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionLiteral__ItemsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionLiteral__ItemsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionFunction__DelimiterAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__ContentAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0()); }
		ruleParameter
		{ after(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__TitleAssignment_4_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_4_0_1_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_4_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__TitleImageAssignment_4_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableViewAccess().getTitleImageImageExpressionParserRuleCall_4_1_1_0()); }
		ruleImageExpression
		{ after(grammarAccess.getTableViewAccess().getTitleImageImageExpressionParserRuleCall_4_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__StyleAssignment_4_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableViewAccess().getStyleTableViewStyleEnumRuleCall_4_2_1_0()); }
		ruleTableViewStyle
		{ after(grammarAccess.getTableViewAccess().getStyleTableViewStyleEnumRuleCall_4_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TableView__SectionsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTableViewAccess().getSectionsSectionParserRuleCall_5_0()); }
		ruleSection
		{ after(grammarAccess.getTableViewAccess().getSectionsSectionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__IteratorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionAccess().getIteratorCollectionIteratorParserRuleCall_1_0()); }
		ruleCollectionIterator
		{ after(grammarAccess.getSectionAccess().getIteratorCollectionIteratorParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__TitleAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionAccess().getTitleScalarExpressionParserRuleCall_3_1_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getSectionAccess().getTitleScalarExpressionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__CellsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSectionAccess().getCellsCellParserRuleCall_4_0()); }
		ruleCell
		{ after(grammarAccess.getSectionAccess().getCellsCellParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getTypeCellTypeEnumRuleCall_1_0()); }
		ruleCellType
		{ after(grammarAccess.getCellAccess().getTypeCellTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__IteratorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getIteratorCollectionIteratorParserRuleCall_2_0()); }
		ruleCollectionIterator
		{ after(grammarAccess.getCellAccess().getIteratorCollectionIteratorParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__TextAssignment_4_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getTextScalarExpressionParserRuleCall_4_0_1_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getCellAccess().getTextScalarExpressionParserRuleCall_4_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__DetailsAssignment_4_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getDetailsScalarExpressionParserRuleCall_4_1_1_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getCellAccess().getDetailsScalarExpressionParserRuleCall_4_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__ImageAssignment_4_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getImageScalarExpressionParserRuleCall_4_2_1_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getCellAccess().getImageScalarExpressionParserRuleCall_4_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__ActionAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getActionViewActionParserRuleCall_4_3_1_0()); }
		ruleViewAction
		{ after(grammarAccess.getCellAccess().getActionViewActionParserRuleCall_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__AccessoryAssignment_4_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getAccessoryCellAccessoryEnumRuleCall_4_4_1_0()); }
		ruleCellAccessory
		{ after(grammarAccess.getCellAccess().getAccessoryCellAccessoryEnumRuleCall_4_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionIterator__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CollectionIterator__CollectionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_3_0()); }
		ruleCollectionExpression
		{ after(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Selector__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelectorAccess().getNameSelectorNameParserRuleCall_2_0()); }
		ruleSelectorName
		{ after(grammarAccess.getSelectorAccess().getNameSelectorNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalOpen__UrlAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0()); }
		ruleScalarExpression
		{ after(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0()); }
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
