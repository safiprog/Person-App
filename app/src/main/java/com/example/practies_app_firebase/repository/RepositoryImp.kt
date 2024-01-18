package com.example.practies_app_firebase.repository

import com.example.practies_app_firebase.model.NoteModel
import com.example.practies_app_firebase.util.Uistate
import com.google.firebase.firestore.FirebaseFirestore
import java.util.Date
import javax.inject.Inject

class RepositoryImp @Inject constructor(
    val database:FirebaseFirestore
):Repository {
    override fun getNotes(): Uistate<List<NoteModel>> {
        val data= listOf<NoteModel>()
        if (data.isNullOrEmpty()){
            return Uistate.Failure("Data is Empty")
        }else{
            return Uistate.Success(data)
        }

    }

}