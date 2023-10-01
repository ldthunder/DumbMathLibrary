package com.example.dumb_math

import org.junit.Assert.*
import org.junit.Test

class MathrixTest {
    @Test
    fun testXThree(){
        assertEquals(Mathrix.xThree(3), 27)
        assertEquals(Mathrix.xThree(0), 0)
        assertEquals(Mathrix.xThree(-1), -1)
        assertEquals(Mathrix.xThree(1223), 1829276567)
    }

    @Test
    fun randomlyBuffed(){
        assertTrue(Mathrix.randomlyBuffed(3) > 3)
    }
}