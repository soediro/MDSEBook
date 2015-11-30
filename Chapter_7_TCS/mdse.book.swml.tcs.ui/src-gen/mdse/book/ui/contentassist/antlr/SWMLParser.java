/*
* generated by Xtext
*/
package mdse.book.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import mdse.book.services.SWMLGrammarAccess;

public class SWMLParser extends AbstractContentAssistParser {
	
	@Inject
	private SWMLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected mdse.book.ui.contentassist.antlr.internal.InternalSWMLParser createParser() {
		mdse.book.ui.contentassist.antlr.internal.InternalSWMLParser result = new mdse.book.ui.contentassist.antlr.internal.InternalSWMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSWMLTypesAccess().getAlternatives(), "rule__SWMLTypes__Alternatives");
					put(grammarAccess.getWebModelAccess().getGroup(), "rule__WebModel__Group__0");
					put(grammarAccess.getHypertextLayerAccess().getGroup(), "rule__HypertextLayer__Group__0");
					put(grammarAccess.getIndexPageAccess().getGroup(), "rule__IndexPage__Group__0");
					put(grammarAccess.getContentLayerAccess().getGroup(), "rule__ContentLayer__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getWebModelAccess().getNameAssignment_1(), "rule__WebModel__NameAssignment_1");
					put(grammarAccess.getWebModelAccess().getHypertextAssignment_3(), "rule__WebModel__HypertextAssignment_3");
					put(grammarAccess.getWebModelAccess().getContentAssignment_4(), "rule__WebModel__ContentAssignment_4");
					put(grammarAccess.getHypertextLayerAccess().getPagesAssignment_1(), "rule__HypertextLayer__PagesAssignment_1");
					put(grammarAccess.getIndexPageAccess().getNameAssignment_1(), "rule__IndexPage__NameAssignment_1");
					put(grammarAccess.getIndexPageAccess().getDisplayedClassAssignment_3(), "rule__IndexPage__DisplayedClassAssignment_3");
					put(grammarAccess.getIndexPageAccess().getSizeAssignment_5(), "rule__IndexPage__SizeAssignment_5");
					put(grammarAccess.getContentLayerAccess().getClassesAssignment_1(), "rule__ContentLayer__ClassesAssignment_1");
					put(grammarAccess.getClassAccess().getNameAssignment_1(), "rule__Class__NameAssignment_1");
					put(grammarAccess.getClassAccess().getAttributesAssignment_3(), "rule__Class__AttributesAssignment_3");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			mdse.book.ui.contentassist.antlr.internal.InternalSWMLParser typedParser = (mdse.book.ui.contentassist.antlr.internal.InternalSWMLParser) parser;
			typedParser.entryRuleWebModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SWMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SWMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
