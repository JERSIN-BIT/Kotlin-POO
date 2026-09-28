package ejercicios.ejercicio03

class Computador(val marca: String, val modelo: String) {
    class Procesador(val nombre: String) {
        fun descripcion() = "Procesador: $nombre"
    }

    inner class Memoria(val gigabytes: Int) {
        fun descripcion() = "$gigabytes GB en $marca $modelo"
    }
}

fun main() {
    println(Computador.Procesador("Ryzen 7").descripcion())
    println(Computador("Lenovo", "ThinkPad").Memoria(16).descripcion())
}