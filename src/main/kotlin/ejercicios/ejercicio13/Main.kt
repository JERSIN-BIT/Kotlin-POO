package ejercicios.ejercicio13

abstract class Dispositivo(val nombre: String) {
    fun encender() = "$nombre encendido"
    fun apagar() = "$nombre apagado"
    abstract fun accionEspecifica(): String
}

class Televisor : Dispositivo("Televisor") {
    override fun accionEspecifica() = "Reproduciendo un canal"
}

class Parlante : Dispositivo("Parlante") {
    override fun accionEspecifica() = "Reproduciendo audio"
}

fun main() {
    val dispositivo: Dispositivo = Televisor()
    println("${dispositivo.encender()}; ${dispositivo.accionEspecifica()}; ${dispositivo.apagar()}")
    println(Parlante().accionEspecifica())
}