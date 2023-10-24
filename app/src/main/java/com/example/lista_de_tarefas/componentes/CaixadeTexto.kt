package com.example.lista_de_tarefas.componentes

import android.widget.NumberPicker.OnValueChangeListener
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.lista_de_tarefas.ui.theme.Black
import com.example.lista_de_tarefas.ui.theme.Pink40
import com.example.lista_de_tarefas.ui.theme.ShapeEditText
import com.example.lista_de_tarefas.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CaixadeTexto(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    label: String,
){
    OutlinedTextField(
        value = value,
        onValueChange,
        modifier,
        label = {
            Text(text = label)
        },
        maxLines = Int.MAX_VALUE,
        colors =TextFieldDefaults.outlinedTextFieldColors(
            textColor = White,
            focusedBorderColor = Pink40,
            focusedLabelColor =  Pink40,
            cursorColor = White
        ),
        shape = ShapeEditText.small,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType
        )

    )
}
fun KeyboardOptions(keyboardType: KeyboardType.Companion): KeyboardOptions {
    return KeyboardOptions(keyboardType)
}

@Composable
@Preview
private fun CaixadeTextoPreview(){
    CaixadeTexto(
        value = "Marco",
        onValueChange = {},
        modifier = Modifier.fillMaxWidth(),
        label = "Descrição"

    )
}