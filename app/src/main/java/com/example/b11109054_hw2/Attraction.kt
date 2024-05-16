package com.example.b11109054_hw2

data class Attraction(
    val name: String,
    val frontpagedes: String,
    val description: String,
    val imageResourceID: Int,
    val rating: String? = null,
    val phoneNumber: String? = null,
    val address: String
)
