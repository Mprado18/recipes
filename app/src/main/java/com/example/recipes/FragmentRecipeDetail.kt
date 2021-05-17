package com.example.recipes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recipes.databinding.FragmentRecipeDetailBinding

class FragmentRecipeDetail(private val position: Int) : Fragment() {

    private val recipeDetail: MutableList<RecipeItemDetail> = mutableListOf(
        RecipeItemDetail(R.string.recipe_detail),
        RecipeItemDetail(R.string.recipe_detail_3),
        RecipeItemDetail(R.string.recipe_detail),
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
        savedInstanceState: Bundle?): View {
        _binding = FragmentRecipeDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(bundle: Bundle?) {
        super.onActivityCreated(bundle)
        bundle?.getInt("key")

        //troca detalhe default por detalhes da receita clicada
        binding.recipeDetail.text = context!!.getString(recipeDetail[position].detail)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}