package com.example.jocene.adapters.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jocene.databinding.RecyclerViewCategoryItemBinding
import com.example.jocene.model.Category

class CategoriesRecyclerAdapter(val imgCategory: ImageView) : RecyclerView.Adapter<CategoriesRecyclerAdapter.CategoriesRecyclerAdapterViewHolder>() {
    inner class CategoriesRecyclerAdapterViewHolder(val binding:RecyclerViewCategoryItemBinding) : RecyclerView.ViewHolder(binding.root)
    private val diffCallback = object : DiffUtil.ItemCallback<Category>(){
        override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
            return oldItem.rank == newItem.rank
        }

        override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this,diffCallback)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriesRecyclerAdapter.CategoriesRecyclerAdapterViewHolder {
        return CategoriesRecyclerAdapterViewHolder(
            RecyclerViewCategoryItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: CategoriesRecyclerAdapter.CategoriesRecyclerAdapterViewHolder,
        position: Int
    ) {
        val category = differ.currentList[position]
        holder.binding.apply {
            Glide.with(holder.itemView).load(category.image).into(imgCategory)
            tvCategoryName.text = category.name
        }
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(category)
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

     var onItemClick :((Category)->Unit)?=null
}