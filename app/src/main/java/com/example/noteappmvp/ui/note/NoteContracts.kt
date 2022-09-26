package com.example.noteappmvp.ui.note

import com.example.noteappmvp.base.BasePresenter
import com.example.noteappmvp.data.model.NoteEntity

interface NoteContracts {

    interface View {
        fun close()
        fun loadNote(note: NoteEntity)
    }

    interface Presenter : BasePresenter {
        fun saveNote(entity: NoteEntity)
        fun detailNote(id: Int)
        fun updateNote(entity: NoteEntity)
    }
}