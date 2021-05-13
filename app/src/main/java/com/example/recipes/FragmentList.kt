package com.example.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes.databinding.FragmentListBinding

class FragmentList : Fragment(){

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

    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!

    lateinit var recipesListAdapter: RecipesListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
            _binding = FragmentListBinding.inflate(inflater, container, false)
            val view = binding.root
            return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerview: RecyclerView = binding.recyclerviewMain
        recipesListAdapter = RecipesListAdapter(this.context!!, recipesList)
        recyclerview.adapter = recipesListAdapter
        recyclerview.layoutManager = LinearLayoutManager(this.context)

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}