package com.example.recipes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class RecipesListAdapter(
    private val context: Context,
    private val recipesList: MutableList<Recipes>,
    private val onClick: (Int) -> Unit) :
        RecyclerView.Adapter<RecipesListAdapter.RecipeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(context).inflate(
            R.layout.recipes_list_cell,
            parent,
            false)

        return RecipeViewHolder(view, onClick)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bindView(recipesList[position])
    }

    override fun getItemCount() = recipesList.size

    class RecipeViewHolder(view: View, onClick: (Int) -> Unit) : RecyclerView.ViewHolder(view) {
        private val cookRecipeItemList: TextView = view.findViewById(R.id.cook_recipe)

        fun bindView(items: Recipes) {
            cookRecipeItemList.text = items.recipe
        }

        init {
            view.setOnClickListener { onClick(adapterPosition) }
        }
    }
}