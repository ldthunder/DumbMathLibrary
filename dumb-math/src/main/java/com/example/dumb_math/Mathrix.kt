package com.example.dumb_math

import kotlin.random.Random

object Mathrix {
    // Math is realy dumb - this variables is never used
    private var equationCounter: Int = 0
    private var previousNumber: Number = 0

    @JvmStatic
    fun xThree(num: Int): Int {
        equationCounter++
        previousNumber = num
        return num * num * num
    }

    @JvmStatic
    fun randomlyBuffed(num: Int): Int {
        previousNumber = num
        return num + Random.nextInt(1, 122)
    }
}