package com.example.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val recipesList: MutableList<Recipes> = mutableListOf(
        Recipes("Receita - 1"),
        Recipes("Receita - 2"),
        Recipes("Receita - 3"),
        Recipes("Receita - 4"),
        Recipes("Receita - 5"),
        Recipes("Receita - 6"),
        Recipes("Receita - 7"),
        Recipes("Receita - 8"),
        Recipes("Receita - 9"),
        Recipes("Receita - 10"),
        Recipes("Receita - 11"),
        Recipes("Receita - 12"),
        Recipes("Receita - 13"),
        Recipes("Receita - 14"),
        Recipes("Receita - 15"),
        Recipes("Receita - 16"),
        Recipes("Receita - 17"),
        Recipes("Receita - 18"),
        Recipes("Receita - 19"),
        Recipes("Receita - 20")
    )

    lateinit var recipesListAdapter: RecipesListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        recipesListAdapter = RecipesListAdapter(this, recipesList)
        binding.recyclerviewMain.adapter = recipesListAdapter
        binding.recyclerviewMain.layoutManager = LinearLayoutManager(this)
    }
}