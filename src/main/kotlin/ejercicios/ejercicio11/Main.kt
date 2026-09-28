package ejercicios.ejercicio11

import kotlin.math.PI

abstract class Figura {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double
}

class Circulo(private val radio: Double) : Figura() {
    override fun calcularArea() = PI * radio * radio
    override fun calcularPerimetro() = 2 * PI * radio
}

class Rectangulo(private val base: Double, private val altura: Double) : Figura() {
    override fun calcularArea() = base * altura
    override fun calcularPerimetro() = 2 * (base + altura)
}

fun main() {
    listOf(Circulo(2.0), Rectangulo(3.0, 4.0)).forEach {
        println("Area=${it.calcularArea()}, perimetro=${it.calcularPerimetro()}")
    }
}