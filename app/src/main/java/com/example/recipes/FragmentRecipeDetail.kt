package com.example.recipes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes.databinding.FragmentRecipeDetailBinding

class FragmentRecipeDetail : Fragment() {

    private val recipeDetail: MutableList<RecipeItemDetail> = mutableListOf(
        RecipeItemDetail(R.string.recipe_detail),
        RecipeItemDetail(R.string.recipe_detail_3),
        RecipeItemDetail(R.string.recipe_detail_2),
        RecipeItemDetail(R.string.recipe_detail_2),
        RecipeItemDetail(R.string.recipe_detail),
        RecipeItemDetail(R.string.recipe_detail_2),
        RecipeItemDetail(R.string.recipe_detail_3),
        RecipeItemDetail(R.string.recipe_detail_2),
        RecipeItemDetail(R.string.recipe_detail_3),
        RecipeItemDetail(R.string.recipe_detail),
        RecipeItemDetail(R.string.recipe_detail),
        RecipeItemDetail(R.string.recipe_detail_3),
        RecipeItemDetail(R.string.recipe_detail),
        RecipeItemDetail(R.string.recipe_detail_2),
        RecipeItemDetail(R.string.recipe_detail),
        RecipeItemDetail(R.string.recipe_detail_2),
        RecipeItemDetail(R.string.recipe_detail_3),
        RecipeItemDetail(R.string.recipe_detail_2),
        RecipeItemDetail(R.string.recipe_detail),
        RecipeItemDetail(R.string.recipe_detail_3)
    )

    private var _binding: FragmentRecipeDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        _binding = FragmentRecipeDetailBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}