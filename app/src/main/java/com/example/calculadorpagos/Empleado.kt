package com.example.calculadorpagos

abstract class Empleado(protected val sueldoBruto: Double) {
    abstract fun calcularLiquido(): Double
}