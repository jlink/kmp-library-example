package org.example.kmpLibExample

import kotlin.test.DefaultAsserter
import kotlin.test.Test

class GlobalFunctionsTests {

    @Test
    fun sayHelloReturnsHello() {
        DefaultAsserter.assertEquals(null, "Hello!", sayHello())
    }

    @Test
    fun sayNowReturnsATime() {
        DefaultAsserter.assertTrue(
            null,
            sayNow().startsWith("It is ")
        )
    }

}