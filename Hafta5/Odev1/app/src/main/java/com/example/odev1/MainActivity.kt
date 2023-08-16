package com.example.odev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.odev1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var filmList: ArrayList<FilmModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val film1 = FilmModel("Esaretin Bedeli", R.drawable.esaretinbedeli)
        val film2 = FilmModel("Kara Şövalye", R.drawable.karasovalye)
        val film3 = FilmModel("Yeşil Yol", R.drawable.yesilyol)
        val film4 = FilmModel("Esaretin Bedeli", R.drawable.esaretinbedeli)
        val film5 = FilmModel("Kara Şövalye", R.drawable.karasovalye)
        val film6 = FilmModel("Yeşil Yol", R.drawable.yesilyol)
        val film7 = FilmModel("Esaretin Bedeli", R.drawable.esaretinbedeli)
        val film8 = FilmModel("Kara Şövalye", R.drawable.karasovalye)
        val film9 = FilmModel("Yeşil Yol", R.drawable.yesilyol)
        val film10 = FilmModel("Esaretin Bedeli", R.drawable.esaretinbedeli)
        val film11 = FilmModel("Kara Şövalye", R.drawable.karasovalye)
        val film12 = FilmModel("Yeşil Yol", R.drawable.yesilyol)
        val film13 = FilmModel("Esaretin Bedeli", R.drawable.esaretinbedeli)
        val film14 = FilmModel("Kara Şövalye", R.drawable.karasovalye)
        val film15 = FilmModel("Yeşil Yol", R.drawable.yesilyol)


        filmList = ArrayList<FilmModel>()
        filmList.add(film1)
        filmList.add(film2)
        filmList.add(film3)
        filmList.add(film4)
        filmList.add(film5)
        filmList.add(film6)
        filmList.add(film7)
        filmList.add(film8)
        filmList.add(film9)
        filmList.add(film10)
        filmList.add(film11)
        filmList.add(film12)
        filmList.add(film13)
        filmList.add(film14)
        filmList.add(film15)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false)
        binding.rv.adapter = FilmAdapter(this@MainActivity, filmList)


    }
}