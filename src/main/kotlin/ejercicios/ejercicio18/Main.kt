package ejercicios.ejercicio18

class Universidad(val nombre: String) {
    class Facultad(val nombre: String) {
        fun descripcion() = "Facultad de $nombre"
    }

    inner class Estudiante(val nombre: String) {
        fun descripcion() = "$nombre estudia en ${this@Universidad.nombre}"
    }
}

fun main() {
    println(Universidad.Facultad("Ingenieria").descripcion())
    println(Universidad("SENA").Estudiante("Carlos").descripcion())
}