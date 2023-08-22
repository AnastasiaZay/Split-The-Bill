package com.splitthebill.navigation

import androidx.annotation.StringRes

sealed class NavDestinations(val route: String) {

    object Onboarding : NavDestinations("onboarding_screen")
    object SetUpLimits : NavDestinations("set_up_limits_screen")

    object Home : NavDestinations("home_screen")
    object Profile : NavDestinations("profile_screen")
    object Expense : NavDestinations("expense_screen")
    object Receieve : NavDestinations("receive_screen")

    object Statistics : NavDestinations("statistics_screen")

    object School : NavDestinations("school_screen")

    object MoneyBox : NavDestinations("money_box_screen")
}