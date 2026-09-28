package ejercicios.ejercicio21

interface Dibujable {
    val tipoTrazo: String
    fun dibujar()
}

abstract class Figura(protected val nombre: String, protected val color: String) : Dibujable {
    override val tipoTrazo: String = "continuo"
    abstract fun calcularArea(): Double

    override fun dibujar() {
        println("Dibujando $nombre con trazo $tipoTrazo")
    }
}

class Circulo(nombre: String, color: String, private val radio: Double) : Figura(nombre, color) {
    override fun calcularArea() = Math.PI * radio * radio
}

class Triangulo(nombre: String, color: String, private val base: Double, private val altura: Double) : Figura(nombre, color) {
    override fun calcularArea() = base * altura / 2

    override fun dibujar() {
        println("Dibujando triangulo con lineas punteadas")
    }
}

fun main() {
    Circulo("Circulo", "rojo", 2.0).dibujar()
    Triangulo("Triangulo", "verde", 3.0, 4.0).dibujar()
}