/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/outputPrefixPostfix")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class OutputPrefixPostfixTestGenerated extends AbstractOutputPrefixPostfixTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
    }

    public void testAllFilesPresentInOutputPrefixPostfix() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("js/js.translator/testData/outputPrefixPostfix"), Pattern.compile("^([^_](.+))\\.kt$"), TargetBackend.JS, true);
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("js/js.translator/testData/outputPrefixPostfix/simple.kt");
    }

    @TestMetadata("simpleWithPostfix.kt")
    public void testSimpleWithPostfix() throws Exception {
        runTest("js/js.translator/testData/outputPrefixPostfix/simpleWithPostfix.kt");
    }

    @TestMetadata("simpleWithPrefix.kt")
    public void testSimpleWithPrefix() throws Exception {
        runTest("js/js.translator/testData/outputPrefixPostfix/simpleWithPrefix.kt");
    }

    @TestMetadata("simpleWithPrefixAndPostfix.kt")
    public void testSimpleWithPrefixAndPostfix() throws Exception {
        runTest("js/js.translator/testData/outputPrefixPostfix/simpleWithPrefixAndPostfix.kt");
    }

    @TestMetadata("js/js.translator/testData/outputPrefixPostfix/out")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Out extends AbstractOutputPrefixPostfixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
        }

        public void testAllFilesPresentInOut() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("js/js.translator/testData/outputPrefixPostfix/out"), Pattern.compile("^([^_](.+))\\.kt$"), TargetBackend.JS, true);
        }
    }
}
