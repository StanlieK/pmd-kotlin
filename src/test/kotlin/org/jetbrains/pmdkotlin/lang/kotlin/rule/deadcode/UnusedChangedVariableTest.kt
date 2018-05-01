package org.jetbrains.pmdkotlin.lang.kotlin.rule.deadcode

import net.sourceforge.pmd.testframework.SimpleAggregatorTst
import org.junit.Before


class UnusedChangedVariableTest : SimpleAggregatorTst() {

    private val RULESET = "kotlin-deadcode"

    @Before
    override fun setUp() {
        addRule(RULESET, "UnusedChangedVariable")
    }
}