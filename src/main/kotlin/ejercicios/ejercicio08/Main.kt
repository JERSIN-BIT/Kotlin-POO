package ejercicios.ejercicio08

sealed class ResultadoOperacion {
    data class Exito(val mensaje: String) : ResultadoOperacion()
    data class Error(val mensaje: String) : ResultadoOperacion()
    object EnProgreso : ResultadoOperacion()
}

fun main() {
    val resultado: ResultadoOperacion = ResultadoOperacion.Exito("Guardado correctamente")
    println(when (resultado) {
        is ResultadoOperacion.Exito -> "Exito: ${resultado.mensaje}"
        is ResultadoOperacion.Error -> "Error: ${resultado.mensaje}"
        ResultadoOperacion.EnProgreso -> "Operacion en progreso"
    })
}