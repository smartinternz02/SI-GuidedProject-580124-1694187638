package com.example.assignment4_foodapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun dosarupee(navController: NavController){
    Column(modifier= Modifier.fillMaxSize()
        .background(color = Color.Cyan)){
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Plain Dosa", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-30/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor= Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Masala Dosa", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-65/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Onion Dosa", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-60/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Rava Dosa", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-70/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }

    }
}
@Composable
fun briyanirupee(navController: NavController){
    Column(modifier= Modifier.fillMaxSize()
        .background(color = Color.Cyan)){
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Plain Briyani", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-60/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor= Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Mushroom Briyani", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-80/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Chicken Briyani", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-100/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Mutton Briyani", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-170/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }

    }
}
@Composable
fun friedricerupee(navController: NavController){
    Column(modifier= Modifier.fillMaxSize()
        .background(color = Color.Cyan)){
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Plain Fried Rice", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-60/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor= Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Gobi Fried Rice", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-70/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Egg Fried Rice", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-80/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Chicken Fried Rice", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-90/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }

    }
}
@Composable
fun naanrupee(navController: NavController){
    Column(modifier= Modifier.fillMaxSize()
        .background(color = Color.Cyan)){
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Plain Naan", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-25/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor= Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Butter Naan", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-40/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Cheese Naan", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-45/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Ginger Naan", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-45/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }

    }
}
@Composable
fun gravyrupee(navController: NavController){
    Column(modifier= Modifier.fillMaxSize()
        .background(color = Color.Cyan)){
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Green Peas Masala", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-70/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor= Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Paneer Butter Masala", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-90/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Egg pepper Masala", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-85/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }
        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(26.dp),
            verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(){Text(text="Chicken Butter Masala", fontSize = 20.sp,
                fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
            Text(text="Rupee-110/-")}
            Button(onClick = {  navController.navigate(route=screen.home.route) },
                colors = ButtonDefaults.buttonColors(containerColor=Color.Red)) {
                Text("Order",color=Color.White)
            }
        }

    }
}
