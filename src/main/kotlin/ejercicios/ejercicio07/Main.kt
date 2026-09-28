package ejercicios.ejercicio07

data class Coordenada(val x: Int, val y: Int)

fun main() {
    val ubicacion = Coordenada(3, 4)
    val copia = ubicacion.copy(x = 5)
    val (x, y) = ubicacion
    println("Igualdad: ${ubicacion == Coordenada(3, 4)}; copia: $copia; componentes: x=$x, y=$y")
}