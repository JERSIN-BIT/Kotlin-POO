package ejercicios.ejercicio19

import kotlin.math.PI

abstract class Figura(val nombre: String) {
    abstract fun calcularArea(): Double
    fun info() = "Figura geometrica: $nombre, area: ${calcularArea()}"
}

class Circulo(private val radio: Double) : Figura("Circulo") {
    override fun calcularArea() = PI * radio * radio
}

class Rectangulo(private val base: Double, private val altura: Double) : Figura("Rectangulo") {
    override fun calcularArea() = base * altura
}

fun main() {
    println(Circulo(2.0).info())
    println(Rectangulo(3.0, 4.0).info())
}