package ejercicios.ejercicio10

abstract class Empleado(val nombre: String) {
    abstract fun calcularSalario(): Double
}

class EmpleadoFijo(nombre: String, private val salarioMensual: Double) : Empleado(nombre) {
    override fun calcularSalario() = salarioMensual
}

class EmpleadoPorComision(nombre: String, private val ventas: Double, private val porcentaje: Double) : Empleado(nombre) {
    override fun calcularSalario() = ventas * porcentaje / 100
}

fun main() {
    val empleados = listOf(EmpleadoFijo("Luis", 2000000.0), EmpleadoPorComision("Marta", 10000000.0, 5.0))
    empleados.forEach { println("${it.nombre}: salario ${it.calcularSalario()}") }
}