package com.hamidjonhamidov.cvforkhamidjon.ui.achievments.viewmodel

import com.hamidjonhamidov.cvforkhamidjon.ui.achievments.viewmodel.state.AchievementsViewState
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.InternalCoroutinesApi


@FlowPreview
@ExperimentalCoroutinesApi
@InternalCoroutinesApi
fun AchievementsViewModel.getCurrentViewStateOrNew()
        : AchievementsViewState  = viewState.value ?: AchievementsViewState()
