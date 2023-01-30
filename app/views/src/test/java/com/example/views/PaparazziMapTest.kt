package com.example.views

import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class PaparazziMapTest {
    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun default() {
        paparazzi.snapshot {
            PaparazziMap()
        }
    }
}