package com.example.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recipes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        loadList(FragmentList())
    }

    private fun loadList(frag1: FragmentList) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment, frag1)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}