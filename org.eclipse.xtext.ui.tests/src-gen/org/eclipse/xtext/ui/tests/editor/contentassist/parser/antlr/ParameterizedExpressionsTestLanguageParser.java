/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr.internal.InternalParameterizedExpressionsTestLanguageParser;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.ParameterizedExpressionsTestLanguageGrammarAccess;

public class ParameterizedExpressionsTestLanguageParser extends AbstractAntlrParser {

	@Inject
	private ParameterizedExpressionsTestLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalParameterizedExpressionsTestLanguageParser createParser(XtextTokenStream stream) {
		return new InternalParameterizedExpressionsTestLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "RootStatement";
	}

	public ParameterizedExpressionsTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ParameterizedExpressionsTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
