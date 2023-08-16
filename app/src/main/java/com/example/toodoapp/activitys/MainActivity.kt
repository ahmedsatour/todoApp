package com.example.toodoapp.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.toodoapp.R
import com.example.toodoapp.databinding.ActivityMainBinding
import com.example.toodoapp.fragments.TodoListFragment
import com.example.toodoapp.fragments.TodoSettingFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding :ActivityMainBinding
    val listFragment = TodoListFragment()
    val settingFragment = TodoSettingFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonNavigationViewId.setOnItemSelectedListener {
            when(it.itemId){
                R.id.listIcon_id -> {pushFragment(listFragment)}
                R.id.settingIcon_id -> {pushFragment(settingFragment)}

            }
            return@setOnItemSelectedListener true
        }


    }
   private fun pushFragment(fragment: Fragment){
       supportFragmentManager.beginTransaction()
           .replace(R.id.fragmentContainerView_id,fragment)
           .commit()
   }
}