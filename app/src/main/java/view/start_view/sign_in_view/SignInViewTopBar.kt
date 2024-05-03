package view.start_view.sign_in_view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInViewTopBar(navController: NavController) {
    TopAppBar(
        title = { },
        navigationIcon = {
            Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier
                .fillMaxSize()
            ) {
                Row(modifier = Modifier
                    .clickable { navController.navigateUp() }
                ) {
                    Icon(
                        imageVector = Icons.Rounded.ArrowBack,
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .align(Alignment.CenterVertically)
                    )

                    Spacer(modifier = Modifier.width(3.dp))

                    Text(text = "Retour", fontSize = 17.sp, modifier = Modifier
                        .align(Alignment.CenterVertically)
                    )
                }
            }
        },
        colors = TopAppBarColors(
            containerColor = Color.Transparent,
            scrolledContainerColor = Color.Transparent,
            navigationIconContentColor = Color.White,
            titleContentColor = Color.Transparent,
            actionIconContentColor = Color.Transparent,
        ),
        modifier = Modifier
            .height(50.dp)
    )
}