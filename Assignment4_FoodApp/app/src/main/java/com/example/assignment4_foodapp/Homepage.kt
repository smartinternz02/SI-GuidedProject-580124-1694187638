package com.example.assignment4_foodapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun homepage(navController: NavController){
    Column(modifier= Modifier.fillMaxSize()){
        Box(modifier= Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.foodwallpaper),
                contentDescription = "bg image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            var text by remember{ mutableStateOf("") }
            var text1 by remember{ mutableStateOf("") }
            Column(modifier= Modifier
                .fillMaxSize(),horizontalAlignment= Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                Text(text="Welcome",fontSize=40.sp, color = Color.White, fontWeight = FontWeight.ExtraBold)
                Spacer(modifier= Modifier.height(300.dp))
                TextField(value = text, onValueChange={it -> text = it}, label ={ Text(text="User Name") },
                    modifier= Modifier
                        .fillMaxWidth()
                        .padding(16.dp))

                TextField(value = text1, onValueChange={it -> text1 = it}, label ={ Text(text="Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Done),

                    modifier= Modifier
                        .fillMaxWidth()
                        .padding(16.dp))
                Spacer(modifier= Modifier.height(80.dp))
                Column(modifier= Modifier.fillMaxSize(),verticalArrangement = Arrangement.Bottom) {
                    Button(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(20.dp),
                        onClick = {navController.navigate(route=screen.second.route)}) { Text(text = "LOGIN") }
                    Spacer(modifier= Modifier.height(50.dp))
                }}}
    }



}

/*@OptIn(ExperimentalMaterial3Api::class)
navController: NavController
navController.navigate(screen.second.route)
@Composable
fun simpleTextField(navController: NavController){
    var text by remember{ mutableStateOf("") }
    var text1 by remember{ mutableStateOf("") }
    Column(modifier= Modifier
        .fillMaxSize(),horizontalAlignment= Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Spacer(modifier= Modifier.height(300.dp))
        TextField(value = text, onValueChange={it -> text = it}, label ={ Text(text="User Name") },
            modifier= Modifier
                .fillMaxWidth()
                .padding(16.dp))

        TextField(value = text1, onValueChange={it -> text1 = it}, label ={ Text(text="Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier= Modifier
                .fillMaxWidth()
                .padding(16.dp))
        Spacer(modifier= Modifier.height(80.dp))
        submitbutton(navController: NavController)}

}
@Composable
fun submitbutton(navController: NavController){
    Column(modifier= Modifier.fillMaxSize(),verticalArrangement = Arrangement.Bottom) {
        Button(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp),
            onClick = {navController.navigate(screen.second.route)}) { Text(text = "LOGIN") }
        Spacer(modifier= Modifier.height(50.dp))
    }
}*/
@Composable
@Preview(showBackground = true)
fun pre(){
    homepage(navController= rememberNavController())
}

