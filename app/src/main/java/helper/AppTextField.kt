package helper

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppTextField(
    textValue: MutableState<String>,
    placeholder: String,
    secured: Boolean = false,
    modifier: Modifier = Modifier
) {
    val defaultTextFieldColors = TextFieldColors(
        focusedTextColor = Color.Black,
        unfocusedTextColor = Color.Black,
        disabledTextColor = Color.Gray,
        errorTextColor = Color.Transparent,
        focusedContainerColor = Color.Transparent,
        unfocusedContainerColor = Color.Transparent,
        disabledContainerColor = Color.Transparent,
        errorContainerColor = Color.Transparent,
        cursorColor = Color.Black,
        errorCursorColor = Color.Transparent,
        textSelectionColors = TextSelectionColors(Color.Transparent, Color.Transparent),
        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent,
        errorIndicatorColor = Color.Transparent,
        focusedLeadingIconColor = Color.Transparent,
        unfocusedLeadingIconColor = Color.Transparent,
        disabledLeadingIconColor = Color.Transparent,
        errorLeadingIconColor = Color.Transparent,
        focusedTrailingIconColor = Color.Transparent,
        unfocusedTrailingIconColor = Color.Transparent,
        disabledTrailingIconColor = Color.Transparent,
        errorTrailingIconColor = Color.Transparent,
        focusedLabelColor = Color.Transparent,
        unfocusedLabelColor = Color.Transparent,
        disabledLabelColor = Color.Transparent,
        errorLabelColor = Color.Transparent,
        focusedPlaceholderColor = Color.Transparent,
        unfocusedPlaceholderColor = Color.Transparent,
        disabledPlaceholderColor = Color.Transparent,
        errorPlaceholderColor = Color.Transparent,
        focusedSupportingTextColor = Color.Transparent,
        unfocusedSupportingTextColor = Color.Transparent,
        disabledSupportingTextColor = Color.Transparent,
        errorSupportingTextColor = Color.Transparent,
        focusedPrefixColor = Color.Transparent,
        unfocusedPrefixColor = Color.Transparent,
        disabledPrefixColor = Color.Transparent,
        errorPrefixColor = Color.Transparent,
        focusedSuffixColor = Color.Transparent,
        unfocusedSuffixColor = Color.Transparent,
        disabledSuffixColor = Color.Transparent,
        errorSuffixColor = Color.Transparent
    )

    Box(modifier = modifier
        .height(50.dp)
        .fillMaxWidth()
        .background(Color.White, shape = RoundedCornerShape(8.dp))
    ) {
        TextField(
            value = textValue.value,
            onValueChange = { textValue.value = it },
            colors = defaultTextFieldColors,
            singleLine = true,
            visualTransformation = if (secured)
                PasswordVisualTransformation()
            else
                VisualTransformation.None
        )
        if(textValue.value.isEmpty()) {
            Text(text = placeholder, color = Color.Gray, fontSize = 17.sp, modifier = Modifier
                .padding(start = 16.dp)
                .align(Alignment.CenterStart)
            )
        }
    }
}