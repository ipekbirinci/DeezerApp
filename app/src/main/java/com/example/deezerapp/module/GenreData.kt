package com.example.deezerapp.module

data class GenreResponse(val data: List<GenreData>)

data class GenreData(
    val id: Int,
    val name: String,
    val picture: String,
    val picture_small: String,
    val picture_medium: String,
    val picture_big: String,
    val picture_xl: String,
    val type: String
)

