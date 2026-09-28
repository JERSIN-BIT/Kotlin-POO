package ejercicios.ejercicio06

data class Producto(val nombre: String, val precio: Double, val categoria: String)

fun main() {
    val producto = Producto("Teclado", 80000.0, "Tecnologia")
    println("Original: $producto")
    println("Iguales: ${producto == producto.copy()}")
    println("Oferta: ${producto.copy(precio = 75000.0)}")
}