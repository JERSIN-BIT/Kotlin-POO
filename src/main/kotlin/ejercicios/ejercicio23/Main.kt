package ejercicios.ejercicio23

abstract class Figura(val nombre: String)
class Circulo(nombre: String) : Figura(nombre)

class Lienzo(private val ancho: Int, private val alto: Int) {
    private val figuras = mutableListOf<Figura>()
    private val historial = Historial()

    class Configuracion(val fondo: String, val resolucion: String)

    inner class Historial {
        private val acciones = mutableListOf<String>()

        fun registrar(accion: String) {
            acciones.add(accion)
        }

        fun imprimir() = "Lienzo ${ancho}x$alto: ${acciones.joinToString(" | ")}"
    }

    fun agregar(figura: Figura) {
        figuras.add(figura)
        historial.registrar("Agregada ${figura.nombre}")
    }

    fun eliminar(figura: Figura): Boolean {
        val eliminada = figuras.remove(figura)
        if (eliminada) historial.registrar("Eliminada ${figura.nombre}")
        return eliminada
    }

    fun mostrarHistorial() = historial.imprimir()
}

fun main() {
    val lienzo = Lienzo(800, 600)
    val circulo = Circulo("Circulo rojo")
    lienzo.agregar(circulo)
    lienzo.eliminar(circulo)
    println(lienzo.mostrarHistorial())
    println("Fondo: ${Lienzo.Configuracion("blanco", "1920x1080").fondo}")
}