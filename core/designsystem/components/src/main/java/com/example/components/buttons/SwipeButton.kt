package com.example.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.resourses.R
import com.example.theme.SkyBlue


@Composable
fun SwipeButton() {
    Box(
        modifier = Modifier
            .size(52.dp)
            .background(SkyBlue, RoundedCornerShape(14.dp))
    )
    {
        Icon(
            painterResource(id = R.drawable.ic_angle_double_right),
            "ic_angle_double_right",
            modifier = Modifier.align(Alignment.Center)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SwipeButton()
}