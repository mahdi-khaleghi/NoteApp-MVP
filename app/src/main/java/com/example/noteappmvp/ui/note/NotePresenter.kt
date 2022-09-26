package com.example.noteappmvp.ui.note

import com.example.noteappmvp.base.BasePresenterImpl
import com.example.noteappmvp.data.model.NoteEntity
import com.example.noteappmvp.data.repository.add.AddNoteRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class NotePresenter @Inject constructor(
    private val repository: AddNoteRepository,
    private val view: NoteContracts.View
) : NoteContracts.Presenter, BasePresenterImpl() {

    override fun saveNote(entity: NoteEntity) {
        disposable = repository.saveNote(entity)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                view.close()
            }
    }

    override fun detailNote(id: Int) {
        disposable = repository.detailNote(id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                view.loadNote(it)
            }
    }

    override fun updateNote(entity: NoteEntity) {
        disposable = repository.updateNote(entity)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                view.close()
            }
    }
}