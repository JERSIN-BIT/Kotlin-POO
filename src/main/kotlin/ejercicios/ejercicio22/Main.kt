package ejercicios.ejercicio22

import kotlin.math.abs
import kotlin.math.hypot

data class Punto(val x: Int, val y: Int)

fun Punto.distanciaHasta(origen: Punto): Double = hypot((x - origen.x).toDouble(), (y - origen.y).toDouble())

abstract class Figura(protected val nombre: String, protected val color: String) {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double
}

class Rectangulo(
    nombre: String,
    color: String,
    private val esquinaSuperiorIzquierda: Punto,
    private val esquinaInferiorDerecha: Punto
) : Figura(nombre, color) {
    private val ancho get() = abs(esquinaInferiorDerecha.x - esquinaSuperiorIzquierda.x).toDouble()
    private val alto get() = abs(esquinaInferiorDerecha.y - esquinaSuperiorIzquierda.y).toDouble()

    override fun calcularArea() = ancho * alto
    override fun calcularPerimetro() = 2 * (ancho + alto)
}

fun main() {
    val rectangulo = Rectangulo("Rectangulo", "azul", Punto(1, 5), Punto(5, 2))
    println("Distancia: ${Punto(3, 4).distanciaHasta(Punto(0, 0))}")
    println("Area: ${rectangulo.calcularArea()}; perimetro: ${rectangulo.calcularPerimetro()}")
}