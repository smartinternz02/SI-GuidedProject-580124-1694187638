package com.example.project1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project1.ui.theme.MyAppTheme
import com.example.project1.ui.theme.Project1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                Surface(color=MaterialTheme.colorScheme.secondary) {


                    Column() {
                        Greeting("Login Screen")
                        simpleTextField()
                    }
                    sumbitbutton()

                }

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun simpleTextField(){
    var text by remember{ mutableStateOf("")}
    var text1 by remember{ mutableStateOf("")}
    Column(modifier=Modifier.fillMaxSize(),horizontalAlignment=Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
    TextField(value = text, onValueChange={it -> text = it}, label ={Text(text="User Name")})
        TextField(value = text1, onValueChange={it -> text1 = it}, label ={Text(text="Password")},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier=Modifier.height(80.dp))}

    }
@Composable
fun sumbitbutton(){
    Column(modifier=Modifier.fillMaxSize(),verticalArrangement = Arrangement.Bottom) {
        Button(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp),
            onClick = { /*TODO*/ }) { Text(text = "LOGIN") }
    Spacer(modifier=Modifier.height(50.dp))}}

@Composable
fun Greeting(name: String) {

 Column(modifier=Modifier.fillMaxWidth()) {
     Spacer(modifier=Modifier.height(50.dp))
     Text(
         text = "$name", fontSize = 30.sp, modifier = Modifier
             .align(Alignment.CenterHorizontally)
             .padding(10.dp)
     )


 }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
MyAppTheme {




    Column(){
        Greeting("Login Screen")
        simpleTextField()
    }
    sumbitbutton()
}}