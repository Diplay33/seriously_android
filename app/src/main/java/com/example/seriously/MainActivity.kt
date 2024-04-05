package com.example.seriously

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.seriously.ui.theme.SeriouslyTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val systemUiController = rememberSystemUiController()
            systemUiController.setSystemBarsColor(color = Color.Transparent)

            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color(35, 23, 50))
            ) {
                Box(contentAlignment = Alignment.Center, modifier = Modifier
                    .blur(170.dp)
                    .fillMaxSize()
                    .offset((-200).dp, (-420).dp)
                ) {
                    Box(modifier = Modifier
                        .clip(CircleShape)
                        .background(Color(250, 79, 173, 200))
                        .size(width = 225.dp, height = 300.dp)
                    )
                }

                Box(contentAlignment = Alignment.Center, modifier = Modifier
                    .blur(120.dp)
                    .fillMaxSize()
                    .offset(200.dp, 380.dp)
                ) {
                    Box(modifier = Modifier
                        .clip(CircleShape)
                        .background(Color(102, 40, 146, 200))
                        .size(width = 250.dp, height = 300.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SeriouslyTheme {
        Greeting("Android")
    }
}