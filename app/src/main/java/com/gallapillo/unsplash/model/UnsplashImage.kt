package com.gallapillo.unsplash.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gallapillo.unsplash.util.Constants.TABLE_NAME
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = TABLE_NAME)
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @Embedded
    val urls: Urls,
    val likes: Int,
    @Embedded
    val user: User
)
