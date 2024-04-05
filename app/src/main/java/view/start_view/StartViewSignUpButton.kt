package view.start_view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StartViewSignUpButton(modifier: Modifier = Modifier) {
    Box(contentAlignment = Alignment.Center, modifier = modifier
        .height(55.dp)
        .fillMaxWidth()
        .padding(horizontal = 30.dp)
        .background(Color.Black, shape = RoundedCornerShape(8.dp))
    ) {
        Text(
            text = "Créer mon compte",
            color = Color.White,
            fontSize = 18.sp
        )
    }
}