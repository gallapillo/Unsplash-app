package com.gallapillo.unsplash.data.remote

import com.gallapillo.unsplash.model.SearchResult
import com.gallapillo.unsplash.model.UnsplashImage
import com.gallapillo.unsplash.util.Key.ACCESS_KEY
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Authorization: Client-ID $ACCESS_KEY")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): List<UnsplashImage>

    @Headers("Authorization: Client-ID $ACCESS_KEY")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("query") query: String,
        @Query("per_page") perPage: Int
    ): SearchResult

}