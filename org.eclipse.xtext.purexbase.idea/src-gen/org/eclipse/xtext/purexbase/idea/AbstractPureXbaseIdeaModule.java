/*
 * generated by Xtext
 */
package org.eclipse.xtext.purexbase.idea;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import com.intellij.facet.FacetTypeId;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider;
import org.eclipse.xtext.ide.LexerIdeBindings;
import org.eclipse.xtext.ide.editor.bracketmatching.IBracePairProvider;
import org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser;
import org.eclipse.xtext.idea.DefaultIdeaModule;
import org.eclipse.xtext.idea.common.types.DerivedMemberAwarePsiModelAssociations;
import org.eclipse.xtext.idea.common.types.StubBasedTypeScopeProvider;
import org.eclipse.xtext.idea.facet.AbstractFacetConfiguration;
import org.eclipse.xtext.idea.findusages.IReferenceSearcher;
import org.eclipse.xtext.idea.findusages.WordsScannerProvider;
import org.eclipse.xtext.idea.formatting.BlockFactory;
import org.eclipse.xtext.idea.formatting.ChildAttributesProvider;
import org.eclipse.xtext.idea.highlighting.IHighlightingConfiguration;
import org.eclipse.xtext.idea.lang.IElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.parser.antlr.LexerBindings;
import org.eclipse.xtext.psi.IPsiModelAssociations;
import org.eclipse.xtext.purexbase.ide.contentassist.antlr.PureXbaseParser;
import org.eclipse.xtext.purexbase.ide.contentassist.antlr.internal.InternalPureXbaseLexer;
import org.eclipse.xtext.purexbase.idea.facet.PureXbaseFacetConfiguration;
import org.eclipse.xtext.purexbase.idea.facet.PureXbaseFacetType;
import org.eclipse.xtext.purexbase.idea.lang.PureXbaseElementTypeProvider;
import org.eclipse.xtext.purexbase.idea.lang.parser.PureXbaseParserDefinition;
import org.eclipse.xtext.purexbase.idea.lang.parser.PureXbasePsiParser;
import org.eclipse.xtext.purexbase.idea.lang.parser.PureXbaseTokenTypeProvider;
import org.eclipse.xtext.purexbase.idea.lang.parser.antlr.PureXbaseAntlrTokenFileProvider;
import org.eclipse.xtext.purexbase.idea.parser.antlr.internal.PsiInternalPureXbaseLexer;
import org.eclipse.xtext.service.LanguageSpecific;
import org.eclipse.xtext.service.SingletonBinding;
import org.eclipse.xtext.xbase.compiler.IGeneratorConfigProvider;
import org.eclipse.xtext.xbase.idea.bracketmatching.XbaseBracePairProvider;
import org.eclipse.xtext.xbase.idea.facet.XbaseGeneratorConfigProvider;
import org.eclipse.xtext.xbase.idea.findusages.JvmElementAwareReferenceSearcher;
import org.eclipse.xtext.xbase.idea.findusages.XbaseWordsScanner;
import org.eclipse.xtext.xbase.idea.formatting.XbaseBlockFactory;
import org.eclipse.xtext.xbase.idea.formatting.XbaseChildAttributesProvider;
import org.eclipse.xtext.xbase.idea.highlighting.XbaseHighlightingConfiguration;
import org.eclipse.xtext.xbase.typesystem.internal.IFeatureScopeTracker;
import org.eclipse.xtext.xbase.typesystem.internal.OptimizingFeatureScopeTrackerProvider;

/**
 * Manual modifications go to {@link PureXbaseIdeaModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractPureXbaseIdeaModule extends DefaultIdeaModule {
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return PureXbaseAntlrTokenFileProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends Lexer> bindLexer() {
		return PsiInternalPureXbaseLexer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public void configureRuntimeLexer(Binder binder) {
		binder.bind(Lexer.class)
			.annotatedWith(Names.named(LexerBindings.RUNTIME))
			.to(PsiInternalPureXbaseLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends PsiParser> bindPsiParser() {
		return PureXbasePsiParser.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends TokenTypeProvider> bindTokenTypeProvider() {
		return PureXbaseTokenTypeProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends ParserDefinition> bindParserDefinition() {
		return PureXbaseParserDefinition.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	@SingletonBinding
	public Class<? extends IElementTypeProvider> bindIElementTypeProvider() {
		return PureXbaseElementTypeProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends AbstractFacetConfiguration> bindAbstractFacetConfiguration() {
		return PureXbaseFacetConfiguration.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public FacetTypeId bindFacetTypeIdToInstance() {
		return PureXbaseFacetType.TYPEID;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return PureXbaseParser.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public void configureContentAssistLexer(Binder binder) {
		binder.bind(org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer.class).annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST)).to(InternalPureXbaseLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends AbstractTypeScopeProvider> bindAbstractTypeScopeProvider() {
		return StubBasedTypeScopeProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends IFeatureScopeTracker.Provider> bindIFeatureScopeTracker$Provider() {
		return OptimizingFeatureScopeTrackerProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public void configureLanguageSpecificPsiModelAssociations(Binder binder) {
		binder.bind(IPsiModelAssociations.class)
			.annotatedWith(LanguageSpecific.class)
			.to(DerivedMemberAwarePsiModelAssociations.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return XbaseHighlightingConfiguration.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends BlockFactory> bindBlockFactory() {
		return XbaseBlockFactory.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends ChildAttributesProvider> bindChildAttributesProvider() {
		return XbaseChildAttributesProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends IBracePairProvider> bindIBracePairProvider() {
		return XbaseBracePairProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends IReferenceSearcher> bindIReferenceSearcher() {
		return JvmElementAwareReferenceSearcher.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends IGeneratorConfigProvider> bindIGeneratorConfigProvider() {
		return XbaseGeneratorConfigProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.idea.IdeaPluginGenerator
	public Class<? extends WordsScannerProvider> bindWordsScannerProvider() {
		return XbaseWordsScanner.XbaseWordsScannerProvider.class;
	}
	
}
