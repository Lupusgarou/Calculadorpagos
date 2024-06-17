package com.example.calculadorpagos

class EmpleadoHonorarios(sueldoBruto: Double) : Empleado(sueldoBruto) {
    override fun calcularLiquido(): Double {
        val retencion = 0.13
        return sueldoBruto * (1 - retencion)
    }
}