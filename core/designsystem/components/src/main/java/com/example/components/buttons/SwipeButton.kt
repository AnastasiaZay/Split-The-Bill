package com.example.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.resourses.R
import com.example.theme.LightDarkGrey
import com.example.theme.SkyBlue
import kotlin.math.roundToInt

enum class ConfirmationState {
    Default, Confirmed
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SwipeButton(modifier: Modifier = Modifier) {
    val gradientColors = listOf(Color.Transparent, SkyBlue)
    var offsetX by remember { mutableStateOf(0f) }
    val buttonSize = 52.dp
    var widthBox by remember { mutableStateOf(0.dp) }
    val width = 350.dp

    val swipeableState = rememberSwipeableState(ConfirmationState.Default)
    val sizePx = with(LocalDensity.current) { (widthBox - buttonSize).toPx() }
    val anchors = mapOf(0f to ConfirmationState.Default, sizePx / 3 to ConfirmationState.Confirmed)
    val progress = derivedStateOf {
        if (swipeableState.offset.value == 0f) 0f else swipeableState.offset.value / sizePx * 3
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .onGloballyPositioned { coordinates ->
                widthBox = coordinates.size.width.dp
            }
            .swipeable(
                state = swipeableState,
                anchors = anchors,
                thresholds = { _, _ -> FractionalThreshold(0.7f) },
                orientation = Orientation.Horizontal
            )

            .background(LightDarkGrey, RoundedCornerShape(16.dp))

    ) {
        Column(
            Modifier
                .align(Alignment.Center)
                .alpha(1f - progress.value),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Get started", color = SkyBlue, fontSize = 18.sp)
        }
        DraggableControl(
            modifier = Modifier
                .offset { IntOffset(swipeableState.offset.value.roundToInt(), 0) }
                .size(buttonSize),
            progress = progress.value
        )
    }
}

@Composable
private fun DraggableControl(
    modifier: Modifier,
    progress: Float
) {
    Box(
        modifier
            .background(SkyBlue, RoundedCornerShape(14.dp))
    ) {
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
    SwipeButton(modifier = Modifier.fillMaxWidth())
}