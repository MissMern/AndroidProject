package com.example.deesgasdelivery

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

    Image(painter = painterResource(id = R.drawable.b), contentDescription = "Login Image",
        modifier = Modifier.size(200.dp))
        Spacer(modifier = Modifier.height(14.dp))
Text(text = "Login",
    fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(14.dp))
        OutlinedTextField(value = "", onValueChange ={} , label = {
            Text(text = "Email Address")
        })
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(value = "", onValueChange ={} , label = {
            Text(text = "Password")
        })
        Spacer(modifier = Modifier.height(14.dp))
        
        Button(onClick = { }) {
            Text(text = "Login")
            
        }
        Spacer(modifier = Modifier.height(14.dp))
        
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Forgot Password?", modifier = Modifier.clickable {  })
            
        }
}
}
