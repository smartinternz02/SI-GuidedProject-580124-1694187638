package com.example.assignment4_foodapp

sealed class screen(val route:String){
    object home:screen( "home_page")
    object second:screen( "second_page")
    object third:screen("third_page")
    object lastdosa:screen("last_dosapage")
    object lastbriyani:screen("last_briyanipage")
    object lastfriedrice:screen("last_friedricepage")
    object lastnaan:screen("last_naanpage")
    object lastgravy:screen("last_gravypage")
}
