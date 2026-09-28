package ejercicios.ejercicio24

open class CuentaBancaria(
    private val numeroCuenta: String,
    saldoInicial: Double,
    internal val tipoCuenta: String,
    val titular: String
) {
    protected var saldo: Double = saldoInicial

    fun depositar(cantidad: Double) {
        validarMovimiento(cantidad)
        saldo += cantidad
    }

    fun consultarSaldo() = saldo

    protected fun aplicarComision() {
        saldo -= 2.0
    }

    private fun validarMovimiento(cantidad: Double) {
        require(cantidad > 0)
    }
}

class CuentaAhorros(numeroCuenta: String, saldoInicial: Double, titular: String) :
    CuentaBancaria(numeroCuenta, saldoInicial, "Ahorros", titular) {
    fun aplicarComisionMensual() = aplicarComision()
    fun bonificar(cantidad: Double) {
        require(cantidad > 0)
        saldo += cantidad
    }
}

fun main() {
    val cuenta = CuentaAhorros("123456789012", 100000.0, "Diego")
    cuenta.depositar(50000.0)
    cuenta.bonificar(1000.0)
    cuenta.aplicarComisionMensual()
    println("${cuenta.titular}; tipo ${cuenta.tipoCuenta}; saldo ${cuenta.consultarSaldo()}")
    println("El numero de cuenta es privado; solo la clase valida movimientos internamente")
}