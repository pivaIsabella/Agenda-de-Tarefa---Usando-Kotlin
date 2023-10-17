package com.example.lista_de_tarefas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lista_de_tarefas.View.ListaTarefas
import com.example.lista_de_tarefas.View.SalvarTarefa
import com.example.lista_de_tarefas.ui.theme.Lista_de_TarefasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lista_de_TarefasTheme {

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "listaTarefas"){
                    composable(
                        route = "listaTarefas"
                    ){
                        ListaTarefas(navController)
                    }
                    composable(
                        route = "SalvarTarefa"
                    ){
                        SalvarTarefa(navController)
                    }
                }

                }
            }
        }


}