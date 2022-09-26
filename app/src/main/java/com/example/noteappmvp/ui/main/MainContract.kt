package com.example.noteappmvp.ui.main

import com.example.noteappmvp.base.BasePresenter
import com.example.noteappmvp.data.model.NoteEntity

interface MainContract {
    interface View {
        fun showAllNotes(notes: List<NoteEntity>)
        fun showEmpty()
        fun deleteMessage()
    }

    interface Presenter : BasePresenter {
        fun loadAllNotes()
        fun deleteNote(entity: NoteEntity)
        fun filterNote(priority: String)
        fun searchNote(title: String)
    }
}