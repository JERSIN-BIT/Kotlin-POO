package ejercicios.ejercicio02

class CuentaBancaria(val numeroCuenta: String, saldoInicial: Double) {
    private var saldo = saldoInicial

    fun consultarSaldo(): Double = saldo

    fun depositar(cantidad: Double) {
        require(cantidad > 0)
        saldo += cantidad
    }
}

fun main() {
    val cuenta = CuentaBancaria("001-ABC", 100.0)
    cuenta.depositar(25.0)
    println("Cuenta ${cuenta.numeroCuenta}; saldo ${cuenta.consultarSaldo()}")
}