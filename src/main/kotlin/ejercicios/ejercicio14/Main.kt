package ejercicios.ejercicio14

interface CanalNotificacion {
    fun enviar(mensaje: String): String
}

class Correo(private val direccion: String) : CanalNotificacion {
    override fun enviar(mensaje: String) = "Correo a $direccion: $mensaje"
}

class Sms(private val telefono: String) : CanalNotificacion {
    override fun enviar(mensaje: String) = "SMS a $telefono: $mensaje"
}

fun main() {
    val canales: List<CanalNotificacion> = listOf(Correo("ana@example.com"), Sms("3001234567"))
    canales.forEach { println(it.enviar("Tu pedido fue enviado")) }
}