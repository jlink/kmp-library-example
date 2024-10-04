package org.example.kmpLibExample

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

fun sayHello(): String {
    return "Hello!"
}

fun sayNow(): String {
    val currentMoment: Instant = Clock.System.now()
    return "It is $currentMoment"
}