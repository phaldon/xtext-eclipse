/*
 * generated by Xtext
 */
package org.eclipse.xtext.parser.terminalrules.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.terminalrules.services.Bug317840TestLanguageGrammarAccess;

public class Bug317840TestLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private Bug317840TestLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.xtext.parser.terminalrules.parser.antlr.internal.InternalBug317840TestLanguageParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.parser.terminalrules.parser.antlr.internal.InternalBug317840TestLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public Bug317840TestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Bug317840TestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}