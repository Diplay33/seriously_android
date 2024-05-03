package view.start_view.sign_in_view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.seriously.R
import helper.AppStartButton
import helper.AppTextField
import kotlin.math.log

@Composable
fun SignInViewMain(navController: NavController) {
    val loginText = remember { mutableStateOf("") }
    val passwordText = remember { mutableStateOf("") }

    Scaffold(topBar = { SignInViewTopBar(navController) }, containerColor = Color.Transparent) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(vertical = 30.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy((-20).dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.seriously),
                    contentDescription = null,
                    modifier = Modifier
                        .size(333.dp)
                        .padding(horizontal = 0.dp)
                )

                Text(
                    text = "Seriously",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 28.sp
                )
            }

            Column(verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier
                .padding(horizontal = 30.dp)
            ) {
                AppTextField(
                    textValue = loginText,
                    placeholder = "Entrer votre email"
                )

                AppTextField(
                    textValue = passwordText,
                    placeholder = "Entrer votre mot de passe",
                    secured = true
                )
            }
            
            AppStartButton(label = "Se connecter")

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Tu as oublié ton mot de passe ?",
                    fontSize = 17.sp,
                    color = Color.White
                )

                Text(
                    text = "Réinitialise ton mot de passe",
                    fontSize = 17.sp,
                    color = colorResource(id = R.color.apple_purple),
                    modifier = Modifier
                        .clickable { }
                )
            }
        }
    }
}