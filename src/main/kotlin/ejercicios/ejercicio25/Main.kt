package ejercicios.ejercicio25

class PersonaNormal(val nombre: String, val edad: Int)
data class PersonaData(val nombre: String, val edad: Int)

fun main() {
    val normal1 = PersonaNormal("Elena", 20)
    val normal2 = PersonaNormal("Elena", 20)
    val data1 = PersonaData("Elena", 20)
    val data2 = PersonaData("Elena", 20)

    println("Normal: $normal1; == ${normal1 == normal2}; === ${normal1 === normal2}")
    println("Data: $data1; == ${data1 == data2}; === ${data1 === data2}")
}