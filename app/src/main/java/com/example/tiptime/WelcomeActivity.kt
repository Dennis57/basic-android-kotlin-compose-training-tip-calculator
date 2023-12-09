package com.example.tiptime

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.tiptime.ui.theme.TipTimeTheme

class WelcomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TipTimeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Welcome()
                }
            }
        }
    }
}

@Composable
fun Welcome(modifier: Modifier = Modifier) {

    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Welcome to",
            fontSize = 18.sp,
            color = Color.Blue
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Text(
            text = "SIGN ME",
            fontSize = 48.sp,
            color = Color.Blue
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.money),
            contentDescription = "Welcome image"
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Text(
            text = "Your digital blablabla",
            fontSize = 18.sp,
            color = Color.Blue
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Button(
            shape = RoundedCornerShape(20),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
            onClick = {
                val intent = Intent(
                    context,
                    MainActivity::class.java
                )
                ContextCompat.startActivity(context, intent, Bundle())
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
        ) {
            Text(text = "LOGIN")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomePreview() {
    TipTimeTheme {
        Welcome()
    }
}