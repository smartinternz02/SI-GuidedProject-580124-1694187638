package com.example.assignment4_foodapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun nav(
    navController:NavHostController){
    NavHost(navController = navController, startDestination = screen.home.route ){
        composable(route=screen.home.route){
               homepage(navController)
        }
        composable(route=screen.second.route){
            restaurnantlist(navController)
        }
        composable(route=screen.third.route){
            foodlist(navController)
        }
        composable(route=screen.lastdosa.route){
            dosarupee(navController)
        }
        composable(route=screen.lastbriyani.route){
            briyanirupee(navController)
        }
        composable(route=screen.lastfriedrice.route){
            friedricerupee(navController)
        }
        composable(route=screen.lastnaan.route){
            naanrupee(navController)
        }
        composable(route=screen.lastgravy.route){
            gravyrupee(navController)
        }

}}