package com.dviss.onboarding_presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dviss.core_ui.LocalSpacing

@Composable
fun UnitTextField(
    value: String,
    onValueChange: (String) -> Unit,
    unit: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TextStyle(
        color = MaterialTheme.colors.primaryVariant,
        fontSize = 70.sp
    )
) {
    val spacing = LocalSpacing.current
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            modifier = Modifier
                .width(IntrinsicSize.Min) //always takes minimum size
                .alignBy(LastBaseline), //align to bottom (text's baseline) of component
            textStyle = textStyle
        )
        Spacer(modifier = Modifier.width(spacing.spaceSmall))
        Text(
            text = unit,
            modifier = Modifier.alignBy(LastBaseline)
        )
    }
}

@Preview
@Composable
fun UnitTextFieldPreview() {
    UnitTextField(
        value = "20",
        onValueChange = {},
        unit = "cm"
    )
}