package com.example.practies_app_firebase.repository

import com.example.practies_app_firebase.model.NoteModel
import com.example.practies_app_firebase.util.Uistate

interface Repository {

    fun getNotes():Uistate<List<NoteModel>>
}