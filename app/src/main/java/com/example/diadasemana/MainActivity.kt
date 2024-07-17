package com.example.diadasemana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.diadasemana.ui.theme.DiaDaSemanaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DiaDaSemanaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DiaDaSemana(
                        modifier = Modifier.padding(innerPadding)
                    );
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun DiaDaSemana(modifier: Modifier = Modifier) {
    val hoje = Calendario().diaDaSemana()
    Text(
        text = "Dia: $hoje",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DiaDaSemanaTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun DiaDaSemanaPreview() {
    DiaDaSemanaTheme {
        DiaDaSemana()
    }
}