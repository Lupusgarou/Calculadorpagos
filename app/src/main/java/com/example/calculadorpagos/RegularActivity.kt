package com.example.calculadorpagos

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegularActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regular)

        val etSueldoBruto = findViewById<EditText>(R.id.etSueldoBruto)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btnVolver = findViewById<Button>(R.id.btnVolver)

        btnCalcular.setOnClickListener {
            val sueldoBruto = etSueldoBruto.text.toString().toDoubleOrNull()
            if (sueldoBruto != null) {
                val empleado = EmpleadoRegular(sueldoBruto)
                val resultado = empleado.calcularLiquido()
                tvResultado.text = "Resultado: $resultado"
            } else {
                tvResultado.text = "Por favor, ingrese un número válido"
            }
        }

        btnVolver.setOnClickListener {
            finish()
        }
    }
}