package com.example.practies_app_firebase.repository

import com.example.practies_app_firebase.model.NoteModel

interface Repository {

    fun getNotes():List<NoteModel>
}