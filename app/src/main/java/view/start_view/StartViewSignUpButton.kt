package view.start_view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StartViewSignUpButton(
    modifier: Modifier = Modifier,
    imageResource: Int? = null,
    label: String
) {
    Box(contentAlignment = Alignment.Center, modifier = modifier
        .height(55.dp)
        .fillMaxWidth()
        .padding(horizontal = 30.dp)
        .background(Color.Black, shape = RoundedCornerShape(8.dp))
        .clickable { }
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            imageResource?.let { value ->
                Image(
                    painter = painterResource(id = value),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .size(20.dp)
                )
            }

            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier
                .fillMaxWidth()
            ) {
                Text(
                    text = label,
                    color = Color.White,
                    fontSize = 17.sp
                )
            }
        }
    }
}