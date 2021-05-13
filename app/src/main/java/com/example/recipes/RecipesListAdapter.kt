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
    private val recipesList: MutableList<Recipes>) :
        RecyclerView.Adapter<RecipesListAdapter.RecipeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(context).inflate(
            R.layout.recipes_list_cell,
            parent,
            false)

        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bindView(recipesList[position])

        holder.itemView.setOnClickListener { v ->
            val activity = v.context as AppCompatActivity
            val fragmentDetail = FragmentRecipeDetail()

            activity.supportFragmentManager.beginTransaction()
                .replace(R.id.fragment, fragmentDetail)
                .addToBackStack(null)
                .commit()

            Toast.makeText(context, "item $position clicked", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount() = recipesList.size

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val cookRecipeItemList: TextView = view.findViewById(R.id.cook_recipe)

        fun bindView(items: Recipes) {
            cookRecipeItemList.text = items.recipe
        }
    }
}