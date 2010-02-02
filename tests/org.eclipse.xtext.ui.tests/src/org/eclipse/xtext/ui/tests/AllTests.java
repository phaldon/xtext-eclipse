package org.eclipse.xtext.ui.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

/*
 * automatically generated by org.eclipse.emf.mwe.releng.GenerateTestSuite 
 * 
 * @generated 
 */
public class AllTests {
   public static Test suite() {
      TestSuite suite = new TestSuite("Tests for org.eclipse.xtext.ui.tests");
      suite.addTestSuite(org.eclipse.xtext.ui.tests.DefaultLabelProviderTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.editor.DirtyStateEditorSupportTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.editor.DocumentBasedDirtyResourceTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.editor.XtextDamageRepairerTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.editor.contentassist.CamelCasePrefixMatcherTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.editor.contentassist.DefaultLastSegmentFinderTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.editor.contentassist.FQNPrefixMatcherTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.editor.contentassist.IgnoreCasePrefixMatcherTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.editor.model.edit.DefaultDocumentEditorTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.editor.model.edit.DefaultTextEditComposerTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.editor.quickfix.DeclarativeQuickfixProviderTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.editor.reconciler.ReplaceRegionTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.scoping.namespaces.JavaProjectsStateTest.class);
      suite.addTestSuite(org.eclipse.xtext.ui.tests.scoping.namespaces.WorkspaceProjectsStateTest.class);
      return suite;
   }
}
