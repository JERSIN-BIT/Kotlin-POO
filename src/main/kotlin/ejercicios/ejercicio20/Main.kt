package ejercicios.ejercicio20

import kotlin.math.PI

abstract class Figura(protected val nombre: String, protected val color: String) {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double
    fun info() = "$nombre de color $color"
}

class Circulo(nombre: String, color: String, private val radio: Double) : Figura(nombre, color) {
    override fun calcularArea() = PI * radio * radio
    override fun calcularPerimetro() = 2 * PI * radio
}

class Rectangulo(nombre: String, color: String, private val base: Double, private val altura: Double) : Figura(nombre, color) {
    override fun calcularArea() = base * altura
    override fun calcularPerimetro() = 2 * (base + altura)
}

fun main() {
    val figuras: List<Figura> = listOf(Circulo("Circulo", "rojo", 2.0), Rectangulo("Rectangulo", "azul", 4.0, 3.0))
    figuras.forEach { println("${it.info()}; area=${it.calcularArea()}; perimetro=${it.calcularPerimetro()}") }
}