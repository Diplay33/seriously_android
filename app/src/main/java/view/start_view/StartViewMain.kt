package view.start_view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.seriously.R

@Composable
fun StartViewMain(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxSize()
            .padding(vertical = 30.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.seriously),
            contentDescription = null,
            modifier = Modifier
                .size(333.dp)
        )

        Text(
            text = "Seriously",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 32.sp
        )

        StartViewSignUpOptions()

        Text(text = "Tu as déjà un compte ? Se connecter", fontSize = 18.sp, color = Color.White)
    }
}