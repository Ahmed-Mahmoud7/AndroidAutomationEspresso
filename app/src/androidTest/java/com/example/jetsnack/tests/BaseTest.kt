package com.example.jetsnack.tests

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.jetsnack.ui.JetsnackApp
import com.example.jetsnack.ui.MainActivity
import org.junit.After
import org.junit.Before
import org.junit.Rule


open class BaseTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setUp() {
        composeTestRule.setContent {
            JetsnackApp()
        }
    }

    @After
    fun tearDown() {
        // close or kill the app

    }

}