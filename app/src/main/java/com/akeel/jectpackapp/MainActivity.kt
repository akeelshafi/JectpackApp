package com.akeel.jectpackapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akeel.jectpackapp.ui.theme.JectpackAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JectpackAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Akeel",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .background(Color.Red)
            .padding(16.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "Welcome $name!",
            modifier = modifier,
            fontSize = 24.sp,
        )

        Button(onClick = {
            println("Button clicked!")
        }) {
            Text(text = "Continue")
        }

        Image(painter = painterResource(id=R.drawable.ic_launcher_background),
            contentDescription = "App icon")

        Row(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)) {
            Text(text = "Hello")
            Text(text = "World")
        }
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JectpackAppTheme {
        Greeting("Akeel")

    }
}