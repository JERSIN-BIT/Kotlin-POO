package ejercicios.ejercicio12

abstract class MetodoDePago {
    fun procesarPago(monto: Double): String {
        require(monto > 0)
        return pagar(monto)
    }

    protected abstract fun pagar(monto: Double): String
}

class PagoTarjeta(private val ultimosDigitos: String) : MetodoDePago() {
    override fun pagar(monto: Double) = "Tarjeta ****$ultimosDigitos: \$$monto"
}

class PagoEfectivo : MetodoDePago() {
    override fun pagar(monto: Double) = "Pago en efectivo: \$$monto"
}

fun main() {
    println(PagoTarjeta("1234").procesarPago(50000.0))
    println(PagoEfectivo().procesarPago(12000.0))
}