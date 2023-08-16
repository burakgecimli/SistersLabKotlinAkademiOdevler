package com.example.odev1

import android.content.Context
import android.view.Display.Mode
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.odev1.databinding.CardDesignBinding
import java.math.MathContext

class FilmAdapter(val mContext: Context, val filmList: ArrayList<FilmModel>) :
    RecyclerView.Adapter<FilmAdapter.CardDesign>() {

    class CardDesign(val binding: CardDesignBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesign {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = CardDesignBinding.inflate(layoutInflater, parent, false)
        return CardDesign(binding)
    }

    override fun getItemCount() = filmList.size

    override fun onBindViewHolder(holder: CardDesign, position: Int) {
        val film = filmList[position]
        holder.binding.textViewFilm.text = film.filmName
        holder.binding.imageViewFilm.setImageResource(film.filmImage)
    }


}