package com.gallapillo.unsplash.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.gallapillo.unsplash.model.UnsplashImage
import com.gallapillo.unsplash.util.Constants.TABLE_NAME

@Dao
interface UnsplashImageDao {

    @Query("SELECT * FROM $TABLE_NAME")
    fun getAllImages(): PagingSource<Int, UnsplashImage>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addImages(images: List<UnsplashImage>)

    @Query("DELETE FROM $TABLE_NAME")
    suspend fun deleteAllImages()

}