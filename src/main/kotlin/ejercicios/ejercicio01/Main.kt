package ejercicios.ejercicio01

class Libro(
    val titulo: String,
    internal val categoria: String,
    private val codigoInterno: String
)

fun main() {
    val libro = Libro("Kotlin desde cero", "Programacion", "LIB-2048")
    println("${libro.titulo} / ${libro.categoria}")
    println("El codigo interno es privado y no se expone fuera de Libro")
}
