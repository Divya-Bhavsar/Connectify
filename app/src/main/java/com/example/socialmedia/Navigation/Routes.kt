package com.example.socialmedia.Navigation

//routes for different screens.
sealed class Routes(val routes:String) {
    object Home : Routes("home")
    object Notification : Routes("notification")
    object Profile : Routes("profile")
    object Search : Routes("search")
    object Splash: Routes("splash")
    object AddThreads : Routes("add_thread")
    object BottomNav : Routes("bottom_nav")

}