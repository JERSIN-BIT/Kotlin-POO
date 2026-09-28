package ejercicios.ejercicio05

data class Usuario(val nombre: String, val correo: String)

fun main() {
    val usuario = Usuario("Ana", "ana@example.com")
    val copia = usuario.copy(correo = "ana.nuevo@example.com")
    println(usuario)
    println("Igualdad: ${usuario == Usuario("Ana", "ana@example.com")}")
    println("Copia: $copia")
}