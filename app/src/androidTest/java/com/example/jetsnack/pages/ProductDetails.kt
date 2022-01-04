package com.example.jetsnack.pages

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText


class ProductDetails : BasePage() {

    var homeButton = composeTestRule.onNodeWithText("HOME")
    var dummytextcheck = composeTestRule.onNodeWithText("Android's picks")


    fun validateAppLaunches() {
        // Check app launches at the correct destination
        homeButton.assertIsDisplayed()
        dummytextcheck.assertIsDisplayed()
    }
    
}