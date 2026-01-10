package com.akeel.jectpackapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.akeel.jectpackapp.ui.theme.JectpackAppTheme
import com.google.android.material.button.MaterialButtonToggleGroup

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JectpackAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Counter(
                        modifier = Modifier.padding(innerPadding)
                        .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
/*fun Greeting(name: String, modifier: Modifier = Modifier) {
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

}*/
fun Counter(modifier: Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    var checked by rememberSaveable { mutableStateOf(true) }


    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Count: $count")
        Log.d("Counter", "Count")
        Button(onClick = { count++ }) {
            Text("Increase")

           /* var count = 0

            Button(onClick = { count++ }) {
                Text(text = "Count: $count")
            }*/

        }
        Switch(checked = checked, onCheckedChange = { checked = it })
        Switch(checked = checked, onCheckedChange = { checked = it })
        Switch(checked = checked, onCheckedChange = { checked = it })


    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JectpackAppTheme {
        Counter(
            modifier = Modifier.fillMaxSize()
            .padding(16.dp)

        )

    }
}