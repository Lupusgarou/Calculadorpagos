package com.example.calculadorpagos

class EmpleadoRegular(sueldoBruto: Double) : Empleado(sueldoBruto) {
    override fun calcularLiquido(): Double {
        val retencion = 0.20
        return sueldoBruto * (1 - retencion)
    }
}