package com.example.practies_app_firebase.model

import com.google.firebase.firestore.ServerTimestamp
import java.util.Date

data class NoteModel(
    val id:String,
    val text:String,
    @ServerTimestamp
    val data:Date,
)
