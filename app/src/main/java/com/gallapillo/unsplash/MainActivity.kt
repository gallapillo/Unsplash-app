package com.gallapillo.unsplash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import androidx.paging.ExperimentalPagingApi
import coil.annotation.ExperimentalCoilApi
import com.gallapillo.unsplash.navigation.SetupNavGraph
import com.gallapillo.unsplash.ui.theme.UnsplashTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@ExperimentalPagingApi
@ExperimentalCoilApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnsplashTheme {
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
                // UnsplashImagePreview()
            }
        }
    }
}
