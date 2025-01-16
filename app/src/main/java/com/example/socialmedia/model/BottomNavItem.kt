package com.example.socialmedia.model

import androidx.compose.ui.graphics.vector.ImageVector

//creatind models
data class BottomNavItem(
    val title : String,
    val route : String,
    val icons : ImageVector
)
