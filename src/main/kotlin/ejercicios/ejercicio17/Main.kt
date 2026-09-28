package ejercicios.ejercicio17

class Producto(val nombre: String, val descripcion: String, precioInicial: Double) {
    var precio: Double = precioInicial
        internal set
}

fun main() {
    val producto = Producto("Mouse", "Inalambrico", 50000.0)
    producto.precio = 45000.0
    println("${producto.nombre}: ${producto.descripcion}; precio ${producto.precio}")
}