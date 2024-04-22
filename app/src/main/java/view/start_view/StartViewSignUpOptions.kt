package view.start_view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.seriously.R

@Composable
fun StartViewSignUpOptions() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        StartViewSignUpButton(label = "Créer mon compte")

        StartViewSignUpButton(imageResource = R.drawable.google, label = "S'inscrire avec Google")
    }
}