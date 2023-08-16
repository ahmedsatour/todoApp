package com.example.toodoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.toodoapp.R
import com.example.toodoapp.databinding.FragmentSettingTodoBinding

class TodoSettingFragment : Fragment() {
    lateinit var binding : FragmentSettingTodoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inflater.inflate(R.layout.fragment_setting_todo,container,false)
        return binding.root

    }

}