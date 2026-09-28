package ejercicios.ejercicio04

class Pedido(val numero: Int, val subtotal: Double) {
    class CalculadoraImpuestos {
        fun calcular(subtotal: Double, porcentaje: Double) = subtotal * porcentaje / 100
    }

    inner class Estado {
        private var actual = "Creado"

        fun cambiar(nuevo: String): String {
            actual = nuevo
            return "Pedido $numero: $actual (subtotal $subtotal)"
        }
    }
}

fun main() {
    val pedido = Pedido(42, 100.0)
    println("Impuesto: ${Pedido.CalculadoraImpuestos().calcular(pedido.subtotal, 19.0)}")
    println(pedido.Estado().cambiar("Enviado"))
}