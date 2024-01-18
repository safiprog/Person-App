package com.example.practies_app_firebase.note

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.example.practies_app_firebase.R
import com.example.practies_app_firebase.databinding.FragmentNoteListingBinding
import com.example.practies_app_firebase.util.Uistate
import com.example.practies_app_firebase.viewModel.ViewModelNote
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class NoteListingFragment : Fragment() {
    lateinit var binding: FragmentNoteListingBinding
    private val viewModel: ViewModelNote by viewModels()

    val name = "NoteListingFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNoteListingBinding.inflate(layoutInflater)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(), "hamza is hero", Toast.LENGTH_SHORT).show()
        viewModel.getNotes()
        viewModel.note.observe(viewLifecycleOwner) {state->
           when(state){
               is Uistate.Loading ->{
                   Log.d("safik","Loading ...")
               }
               is Uistate.Failure->{
                   Log.d("safik",state.error.toString())
               }
               is Uistate.Success ->{
                   state.data.forEach {
                       Log.d("safik",it.toString())
                   }
               }


           }
        }
    }
}