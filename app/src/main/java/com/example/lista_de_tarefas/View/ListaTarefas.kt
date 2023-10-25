package com.example.lista_de_tarefas.View

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lista_de_tarefas.R
import com.example.lista_de_tarefas.ui.theme.Black
import com.example.lista_de_tarefas.ui.theme.Silver

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListaTarefas(
    navController: NavController
){
    //modificar cor de fundo
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )

    //inclui um app bar na parte superior, um conteúdo no meio e uma barra na parte inferior.
    Scaffold(

        // topBar é um parâmetro do Scaffold que permite definir o conteúdo que aparecerá na parte superior da tela.
        topBar = {
            TopAppBar(
                title = { Text(
                    text = "Lista de Tarefas",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Black
                    )},

            )
        },
        //botão para salvar o conteúdo,
        floatingActionButton = {
            FloatingActionButton(
                //botão já com a rota
                onClick = {
                    navController.navigate("SalvarTarefa")
                },
                Modifier.background(Silver)
                ) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_add),
                    contentDescription = "icone de salvar tarefa"
                )
            }
        }
    ) {
        
    }
}