package com.example.noteappmvp.utils.di

import android.app.Activity
import com.example.noteappmvp.ui.main.MainContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
class ContractsViewModuleAC {

    @Provides
    fun mainView(activity: Activity): MainContract.View {
        return activity as MainContract.View
    }
}