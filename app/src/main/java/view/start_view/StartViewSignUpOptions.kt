package view.start_view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.seriously.R
import helper.AppStartButton

@Composable
fun StartViewSignUpOptions() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        AppStartButton(label = "Créer mon compte")

        AppStartButton(imageResource = R.drawable.google, label = "S'inscrire avec Google")
    }
}