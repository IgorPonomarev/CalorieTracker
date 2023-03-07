package com.dviss.tracker_presentation.tracker_overview

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.dviss.core.util.UiEvent
import com.dviss.core_ui.LocalSpacing
import com.dviss.tracker_presentation.tracker_overview.components.DaySelector
import com.dviss.tracker_presentation.tracker_overview.components.NutrientsHeader

@Composable
fun TrackerOverviewScreen(
    onNavigate: (UiEvent.Navigate) -> Unit,
    viewmodel: TrackerOverviewViewmodel = hiltViewModel()
) {
    val spacing = LocalSpacing.current
    val state = viewmodel.state
    val context = LocalContext.current
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = spacing.spaceMedium)
    ) {
        item {
            NutrientsHeader(state = state)
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
            DaySelector(
                date = state.date,
                onPreviousDayClick = {
                    viewmodel.onEvent(TrackerOverviewEvent.OnPreviousDayClick)
                },
                onNextDayClick = {
                    viewmodel.onEvent(TrackerOverviewEvent.OnNextDayClick)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = spacing.spaceMedium)
            )
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
        }
    }
}