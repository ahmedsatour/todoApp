package com.example.toodoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.toodoapp.R
import com.example.toodoapp.databinding.FragmentButtonsheetTodoBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class TodoButtonSheetFragment : BottomSheetDialogFragment() {
    lateinit var binding : FragmentButtonsheetTodoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inflater.inflate(R.layout.fragment_buttonsheet_todo,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }





}