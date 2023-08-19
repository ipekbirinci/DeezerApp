package com.example.deezerapirequest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.deezerapp.R
import com.example.deezerapp.module.GenreData

class ReyclerViewAdapter(private val genres: List<GenreData>) : RecyclerView.Adapter<ReyclerViewAdapter.GenreViewHolder>() {

    private var onItemClickListener: OnItemClickListener? = null

    fun setOnItemClickListener(listener: OnItemClickListener) {
        onItemClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return GenreViewHolder(view)
    }

    override fun onBindViewHolder(holder: GenreViewHolder, position: Int) {
        val genre = genres[position]
        holder.bind(genre)
        holder.itemView.setOnClickListener {
            onItemClickListener?.onItemClick(genre)
        }
    }

    override fun getItemCount(): Int = genres.size

    inner class GenreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val genreNameTextView: TextView = itemView.findViewById(R.id.cardImage)
        private val genreImageView: ImageView = itemView.findViewById(R.id.cardTitle)

        fun bind(genre: GenreData) {
            if (!genre.picture_medium.isNullOrEmpty() && !genre.name.isNullOrEmpty() && !genre.type.isNullOrEmpty()) {
                genreNameTextView.text = genre.name

                // Load image using a library like Glide or Picasso
                Glide.with(itemView.context)
                    .load(genre.picture_medium)
                    .into(genreImageView)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(genre: GenreData)
    }
}


