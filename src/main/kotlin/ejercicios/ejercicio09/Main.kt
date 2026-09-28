package ejercicios.ejercicio09

sealed class ResultadoAutenticacion {
    data class UsuarioValido(val nombre: String) : ResultadoAutenticacion()
    object CredencialesIncorrectas : ResultadoAutenticacion()
    data class CuentaBloqueada(val motivo: String) : ResultadoAutenticacion()
}

fun main() {
    val resultado: ResultadoAutenticacion = ResultadoAutenticacion.CuentaBloqueada("Demasiados intentos")
    println(when (resultado) {
        is ResultadoAutenticacion.UsuarioValido -> "Bienvenido ${resultado.nombre}"
        ResultadoAutenticacion.CredencialesIncorrectas -> "Credenciales incorrectas"
        is ResultadoAutenticacion.CuentaBloqueada -> "Cuenta bloqueada: ${resultado.motivo}"
    })
}