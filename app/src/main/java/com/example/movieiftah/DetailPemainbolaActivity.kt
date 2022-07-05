package com.example.movieiftah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailPemainbolaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pemainbola)

        supportActionBar?.title = "Biodata Lengkap Pemain"

        val pemainbola = intent.getParcelableExtra<Pemainbola>(MainActivity.INTENT_PARCELABLE)

        val imgPemainbola = findViewById<ImageView>(R.id.img_item_photo)
        val namePemainbola = findViewById<TextView>(R.id.tv_item_name)
        val descPemainbola = findViewById<TextView>(R.id.tv_item_description)
        val desc2Pemainbola = findViewById<TextView>(R.id.tv_item_description2)

        imgPemainbola.setImageResource(pemainbola?.imgPemainbola!!)
        namePemainbola.text = pemainbola.namePemainbola
        descPemainbola.text = pemainbola.descPemainbola
        desc2Pemainbola.text = pemainbola.desc2Pemainbola


    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }

}