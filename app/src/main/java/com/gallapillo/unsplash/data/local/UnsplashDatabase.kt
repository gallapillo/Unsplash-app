package com.gallapillo.unsplash.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gallapillo.unsplash.data.local.dao.UnsplashImageDao
import com.gallapillo.unsplash.data.local.dao.UnsplashRemoteKeysDao
import com.gallapillo.unsplash.model.UnsplashImage
import com.gallapillo.unsplash.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}