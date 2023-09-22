package com.example.assignment4_foodapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun restaurant(name:String,navController: NavController){
    Column(modifier= Modifier
        .fillMaxWidth()
        .padding(vertical = 16.dp)
        .background(color = Color.Green)){
        Row(modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically ){
            Text(text = name, fontWeight = FontWeight.ExtraBold,
                fontSize=32.sp, fontFamily = FontFamily.Serif ,color = Color.White )
            OutlinedButton(onClick = { navController.navigate(route=screen.third.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.White)) {
                Text(text="GO IN", color = Color.Green)

            }
        }

    }
}
@Composable
//@Preview(showBackground = true)
fun restaurnantlist(navController: NavController){
    Column(modifier= Modifier.fillMaxSize()){
        Box(modifier= Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.restaurantwallpaper),
                contentDescription = "bg image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
    Column(modifier= Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        Text(
            text = "Restaurants", fontSize = 40.sp, color = Color.Green,
            fontWeight = FontWeight.ExtraBold, fontStyle = FontStyle.Italic,
            modifier = Modifier.fillMaxWidth()
                .background(color = Color.Black)
        )
        restaurant("Al-Taj",navController)
        restaurant("A2B",navController)
        restaurant("SBR",navController)
        restaurant("Darling",navController)
        restaurant("Limbra",navController)
        restaurant("Fortune",navController)
        restaurant("Foodies Kitchen",navController)
    }
}}}