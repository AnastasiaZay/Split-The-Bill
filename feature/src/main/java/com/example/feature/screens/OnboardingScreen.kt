package com.example.feature.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.theme.LightDarkGrey
import com.example.theme.SkyBlue
import com.example.theme.SplitTheBillTheme

class OnboardingScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplitTheBillTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = SplitTheBillTheme.colors.background
    ) {

        Column(modifier = Modifier.fillMaxSize().offset((-154).dp, (-52.9).dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,) {

            Box(
                modifier = Modifier
                    .rotate(-28.8f)
                    .size(253.dp)
                    .background(SkyBlue, RoundedCornerShape(20.dp))
            )
        }

        Column(modifier = Modifier.fillMaxSize().offset((300).dp, (219.21).dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,) {

            Box(
                modifier = Modifier
                    .rotate(-28.8f)
                    .size(197.61.dp)
                    .background(LightDarkGrey, RoundedCornerShape(20.dp))
            )
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start,
        ) {

            Text(
                text = "Refill\nyour wallet",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 40.sp,
                    fontWeight = FontWeight(700),
                    color = Color.White
                ),
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .widthIn(max = 300.dp)
                    .padding(horizontal = 16.dp),
                lineHeight = 48.sp
            )
            Text(
                text = "Get the tools for proper budget allocation. Read news from community members",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 16.sp,
                    color = Color.White
                ),
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SplitTheBillTheme {
        Greeting()
    }
}