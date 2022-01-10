package com.gallapillo.unsplash.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.gallapillo.unsplash.model.UnsplashRemoteKeys
import com.gallapillo.unsplash.util.Constants.TABLE_NAME_UNSPLASH_KEYS

@Dao
interface UnsplashRemoteKeysDao {

    @Query("SELECT * FROM $TABLE_NAME_UNSPLASH_KEYS WHERE id =:id")
    suspend fun getRemoteKeys(id: String): UnsplashRemoteKeys

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(remoteKeys: List<UnsplashRemoteKeys>)

    @Query("DELETE FROM $TABLE_NAME_UNSPLASH_KEYS")
    suspend fun deleteAllRemoteKeys()

}