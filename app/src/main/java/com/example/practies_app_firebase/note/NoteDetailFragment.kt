package com.example.practies_app_firebase.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.practies_app_firebase.R
import com.example.practies_app_firebase.databinding.FragmentNoteDetailBinding

class NoteDetailFragment : Fragment() {
    lateinit var binding: FragmentNoteDetailBinding
    val name="NoteDetailsFragment"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentNoteDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}