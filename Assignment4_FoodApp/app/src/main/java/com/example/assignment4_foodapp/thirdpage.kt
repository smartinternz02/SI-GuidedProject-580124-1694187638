package com.example.assignment4_foodapp

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun foods(name:String,@DrawableRes image:Int,navController: NavController,screen: screen){

        Card(colors = CardDefaults.cardColors(containerColor = Color.Yellow,
            contentColor = Color.Black),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            modifier=Modifier.fillMaxWidth().padding(16.dp)
                .clickable{ navController.navigate(route=screen.route)}){
            Column(modifier=Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(image),
                    contentDescription = "bg image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .height(150.dp)
                )
                Spacer(modifier=Modifier.height(10.dp))
                Text(text=name,modifier=Modifier.padding(16.dp),
                    fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
            }
}}
@Composable

fun foodlist(navController: NavController){
    Column(modifier= Modifier
        .fillMaxSize()
        .padding(16.dp)
        .verticalScroll(rememberScrollState())){
        foods("Dosa",R.drawable.dosa, navController,screen.lastdosa)
        foods("Briyani",R.drawable.briyani,navController,screen.lastbriyani)
        foods("Fried Rice",R.drawable.friedrice,navController,screen.lastfriedrice)
        foods("Naan",R.drawable.naan,navController,screen.lastnaan)
        foods("Gravy",R.drawable.gravy,navController,screen.lastgravy)
}}