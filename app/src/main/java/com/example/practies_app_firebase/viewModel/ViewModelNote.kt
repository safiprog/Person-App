package com.example.practies_app_firebase.viewModel

import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.practies_app_firebase.model.NoteModel
import com.example.practies_app_firebase.repository.Repository
import com.example.practies_app_firebase.util.Uistate
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelNote @Inject constructor(val repository: Repository) : ViewModel() {


    private val notes=MutableLiveData<Uistate<List<NoteModel>>>()
    val note:LiveData<Uistate<List<NoteModel>>>
        get() = notes
    fun getNotes(){
        notes.value=Uistate.Loading
       notes.value=repository.getNotes()
    }
}