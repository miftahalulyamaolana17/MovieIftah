package com.example.movieiftah

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pemainbola(
    val imgPemainbola: Int,
    val namePemainbola: String,
    val descPemainbola: String,
    val desc2Pemainbola: String,
) : Parcelable
