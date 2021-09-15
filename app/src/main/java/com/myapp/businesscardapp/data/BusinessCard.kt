package com.myapp.businesscardapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BusinessCard (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val business: String,
    val tel: String,
    val mail: String,
    val color: String
)