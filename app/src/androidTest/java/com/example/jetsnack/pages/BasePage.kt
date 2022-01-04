package com.example.jetsnack.pages

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.example.jetsnack.ui.MainActivity
import org.junit.Rule


open class BasePage {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    val device: UiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

}