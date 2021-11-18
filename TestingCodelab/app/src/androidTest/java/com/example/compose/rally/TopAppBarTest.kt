package com.example.compose.rally

import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.hasParent
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.printToLog
import com.example.compose.rally.ui.components.RallyTopAppBar
import com.example.compose.rally.ui.theme.RallyTheme
import java.util.*
import org.junit.Rule
import org.junit.Test

class TopAppBarTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun rallyTopAppBarTest_currentTabSelected() {
        val allScreens = RallyScreen.values().toList()
        composeTestRule.setContent {
            RallyTheme {
                RallyTopAppBar(
                    allScreens = allScreens,
                    onTabSelected = {

                    },
                    currentScreen = RallyScreen.Accounts
                )
            }
        }

        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Accounts.name)
            .assertIsSelected()
    }


    @Test
    fun rallyTopAppBarTest_Accounts_is_selected() {
        val allScreens = RallyScreen.values().toList()
        composeTestRule.setContent {
            RallyTopAppBar(
                allScreens = allScreens,
                onTabSelected = { },
                currentScreen = RallyScreen.Accounts
            )
        }

        composeTestRule.onRoot(useUnmergedTree = true).printToLog("Accounts_is_selected")

        composeTestRule
            .onNode(
                hasText(RallyScreen.Accounts.name.uppercase(Locale.getDefault()))
                        and hasParent(hasContentDescription(RallyScreen.Accounts.name)
                ),
                useUnmergedTree = true
            )
            .assertExists()
    }

    @Test
    fun rallyTopAppBarTest_Bills_is_selected() {
        val allScreens = RallyScreen.values().toList()
        composeTestRule.setContent {
            RallyTopAppBar(
                allScreens = allScreens,
                onTabSelected = { },
                currentScreen = RallyScreen.Bills
            )
        }

        composeTestRule.onRoot(useUnmergedTree = true).printToLog("Bills_is_selected")

        composeTestRule
            .onNode(
                hasText(RallyScreen.Bills.name.uppercase(Locale.getDefault()))
                        and hasParent(hasContentDescription(RallyScreen.Bills.name)
                ),
                useUnmergedTree = true
            )
            .assertExists()
    }

    @Test
    fun rallyTopAppBarTest_Overview_is_selected() {
        val allScreens = RallyScreen.values().toList()
        composeTestRule.setContent {
            RallyTopAppBar(
                allScreens = allScreens,
                onTabSelected = { },
                currentScreen = RallyScreen.Overview
            )
        }

        composeTestRule.onRoot(useUnmergedTree = true).printToLog("Overview_is_selected")

        composeTestRule
            .onNode(
                hasText(RallyScreen.Overview.name.uppercase(Locale.getDefault()))
                        and hasParent(hasContentDescription(RallyScreen.Overview.name)
                ),
                useUnmergedTree = true
            )
            .assertExists()
    }

}
