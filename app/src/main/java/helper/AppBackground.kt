package helper

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AppBackground(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Box(modifier = modifier
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

        content()
    }
}