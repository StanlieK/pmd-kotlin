package org.jetbrains.pmdkotlin.lang.kotlin.rule.deadcode

import org.junit.Before


class VariableWithRedundantInitializerTest : BaseDeadcode() {

    @Before
    override fun setUp() {
        addRule(RULESET, "VariableWithRedundantInitializer")
    }
}