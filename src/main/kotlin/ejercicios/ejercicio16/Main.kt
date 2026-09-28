package ejercicios.ejercicio16

class Usuario(val nombre: String, correoInicial: String, contrasenaInicial: String) {
    var correo: String = correoInicial
        private set

    private var contrasena: String = contrasenaInicial

    fun actualizarCorreo(nuevoCorreo: String) {
        require(nuevoCorreo.contains('@'))
        correo = nuevoCorreo
    }

    fun verificarContrasena(intento: String) = contrasena == intento

    fun cambiarContrasena(actual: String, nueva: String): Boolean {
        if (!verificarContrasena(actual) || nueva.length < 8) return false
        contrasena = nueva
        return true
    }
}

fun main() {
    val usuario = Usuario("Sofia", "sofia@example.com", "clave-segura")
    usuario.actualizarCorreo("sofia.nueva@example.com")
    println("${usuario.nombre}, ${usuario.correo}; contrasena valida: ${usuario.verificarContrasena("clave-segura")}")
}