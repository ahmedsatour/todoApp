package com.example.toodoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.toodoapp.R
import com.example.toodoapp.databinding.FragmentTodoListBinding

class TodoListFragment : Fragment() {
    lateinit var binding : FragmentTodoListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        inflater.inflate(R.layout.fragment_todo_list,container,false)
        return binding.root
    }
}