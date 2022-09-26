package com.example.noteappmvp.utils.di

import androidx.fragment.app.Fragment
import com.example.noteappmvp.ui.note.NoteContracts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
class ContractsViewModuleFR {

    @Provides
    fun noteView(fragment: Fragment): NoteContracts.View {
        return fragment as NoteContracts.View
    }
}