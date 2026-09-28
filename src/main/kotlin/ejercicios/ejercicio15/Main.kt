package ejercicios.ejercicio15

interface CanalNotificacion {
    fun enviar(mensaje: String): String
}

class NotificacionPush(private val dispositivo: String) : CanalNotificacion {
    override fun enviar(mensaje: String) = "Push a $dispositivo: $mensaje"
}

class NotificacionCorreo(private val direccion: String) : CanalNotificacion {
    override fun enviar(mensaje: String) = "Correo a $direccion: $mensaje"
}

fun main() {
    println(NotificacionPush("movil-1").enviar("Actualizacion disponible"))
    println(NotificacionCorreo("ana@example.com").enviar("Actualizacion disponible"))
}