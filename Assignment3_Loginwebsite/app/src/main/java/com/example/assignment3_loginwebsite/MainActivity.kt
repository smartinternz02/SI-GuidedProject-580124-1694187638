package com.example.assignment3_loginwebsite

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonColors
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment3_loginwebsite.ui.theme.Assignment3LoginwebsiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            loginpage()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun loginpage(){
    var context= LocalContext.current
    var username by remember{ mutableStateOf("") }
    var password by remember{ mutableStateOf("") }
    var ans by remember{ mutableStateOf("") }
    var url by remember{ mutableStateOf("") }
    Column(modifier= Modifier
        .fillMaxSize()
        ,
        horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier=Modifier.height(20.dp))
        Text(text="LOGIN PAGE",fontFamily= FontFamily.Serif, fontWeight= FontWeight.Bold, color = Color.Green)
        Spacer(modifier = Modifier.height(60.dp))
        Image(painter = painterResource(id = R.drawable.avatar), contentDescription = "Login Page",
            modifier = Modifier
                .clip(CircleShape)
                .size(160.dp))
        Spacer(modifier = Modifier.height(60.dp))
        OutlinedTextField(value = username, onValueChange ={username=it},label={Text("UserName")},
            modifier= Modifier
                .fillMaxWidth()
                .padding(16.dp))
        OutlinedTextField(value = password, onValueChange ={password=it},label={Text("Password")},
            modifier= Modifier
                .fillMaxWidth()
                .padding(16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Done),
            visualTransformation = PasswordVisualTransformation())
        Spacer(modifier = Modifier.height(16.dp))
        Text(text="choose any one of the website:")
        ans= chooseoption()
        when(ans){
            "amazon"->url="https://www.amazon.in"
            "flipkart"->url="https://www.flipkart.com"
            "swiggy"->url="https://www.swiggy.com"
            "zomato"->url="https://www.zomato.com"
            else-> url="https://www.google.com"
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
            modifier=Modifier.fillMaxWidth().padding(16.dp),
            onClick = {
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
        try{
            context.startActivity(intent)
        }
        catch(e:ActivityNotFoundException){
            Toast.makeText(context,"No Web Browser Available",Toast.LENGTH_LONG).show()
        }},
        ) {
            Text(text="Login to website", color = Color.White)

        }



    }
}
@Composable
fun chooseoption():String{
    var websites= listOf("amazon","flipkart","swiggy","zomato")
    var option by remember{ mutableStateOf("") }
    Column(modifier= Modifier
        .selectableGroup()
        .padding(2.dp)) {
        websites.forEach { item ->
            Row(modifier=Modifier.selectable(false, onClick = {option=item},
                role=Role.RadioButton)){
                RadioButton(item==option, onClick = null,
                    colors= RadioButtonDefaults.colors(selectedColor=Color.Green)
                )
                Text(text = item, modifier = Modifier.padding(5.dp), fontWeight = FontWeight.Bold)
            }
        }
    }
    return option
}


