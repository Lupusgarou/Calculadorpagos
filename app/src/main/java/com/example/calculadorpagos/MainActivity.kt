package com.example.calculadorpagos

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                            Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Button(onClick = {
                        val intent = Intent(this@MainActivity, HonorariosActivity::class.java)
                        startActivity(intent)
                    }) {
                        Text(text = "Calcular Honorarios")
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        val intent = Intent(this@MainActivity, RegularActivity::class.java)
                        startActivity(intent)
                    }) {
                        Text(text = "Calcular Empleados Regular")
                    }
                }
            }
        }
    }
