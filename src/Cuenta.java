public abstract class Cuenta {
    private String numeroCuenta;
    protected double saldo;

    public Cuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso de $" + monto + " en cuenta " + numeroCuenta);
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    public abstract boolean retirar(double monto);
}