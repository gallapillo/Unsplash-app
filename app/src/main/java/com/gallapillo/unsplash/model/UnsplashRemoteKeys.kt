package com.gallapillo.unsplash.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gallapillo.unsplash.util.Constants.TABLE_NAME_UNSPLASH_KEYS


@Entity(tableName = TABLE_NAME_UNSPLASH_KEYS)
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevPage: Int?,
    val nextPage: Int?
)