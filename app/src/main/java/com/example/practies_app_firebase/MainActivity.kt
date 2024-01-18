package com.example.practies_app_firebase

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.practies_app_firebase.viewModel.ViewModelNote
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: ViewModelNote by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db= Firebase.firestore

        val user= hashMapOf(
            "first" to "Hamza",
            "last" to "Alam",
            "born" to 2000
        )


    }
}
