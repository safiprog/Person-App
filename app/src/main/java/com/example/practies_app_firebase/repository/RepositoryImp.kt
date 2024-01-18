package com.example.practies_app_firebase.repository

import com.example.practies_app_firebase.model.NoteModel
import com.google.firebase.firestore.FirebaseFirestore
import java.util.Date
import javax.inject.Inject

class RepositoryImp @Inject constructor(
    val database:FirebaseFirestore
):Repository {
    override fun getNotes(): List<NoteModel> {
        return arrayListOf(
            NoteModel("dfd1","note 1", data = Date()),
            NoteModel("dfd2","note 2", data = Date()),
            NoteModel("dfd3","note 3", data = Date())
            )
    }

}