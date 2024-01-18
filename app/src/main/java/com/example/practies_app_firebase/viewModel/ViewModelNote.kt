package com.example.practies_app_firebase.viewModel

import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.practies_app_firebase.model.NoteModel
import com.example.practies_app_firebase.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelNote @Inject constructor(val repository: Repository) : ViewModel() {


    private val notes=MutableLiveData<List<NoteModel>>()
    val note:LiveData<List<NoteModel>>
        get() = notes
    fun getNotes(){
       notes.value=repository.getNotes()
    }
}