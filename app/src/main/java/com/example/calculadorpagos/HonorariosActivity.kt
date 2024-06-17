package com.example.calculadorpagos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HonorariosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                var sueldoBruto by remember { mutableStateOf("") }
                var resultado by remember { mutableStateOf(0.0) }

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    BasicTextField(
                        value = sueldoBruto,
                        onValueChange = { sueldoBruto = it },
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                        textStyle = androidx.compose.ui.text.TextStyle(fontSize = 24.sp)
                    )
                    Button(onClick = {
                        val sueldo = sueldoBruto.toDoubleOrNull()
                        if (sueldo != null) {
                            val empleado = EmpleadoHonorarios(sueldo)
                            resultado = empleado.calcularLiquido()
                        }
                    }) {
                        Text(text = "Calcular")
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(text = "Resultado: $resultado", fontSize = 24.sp)
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = { finish() }) {
                        Text(text = "Volver")
                    }
                }
            }
        }
    }
