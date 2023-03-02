package com.dviss.calorietracker.navigation

import androidx.navigation.NavController
import com.dviss.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}