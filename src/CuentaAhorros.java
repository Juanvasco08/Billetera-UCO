public class CuentaAhorros extends Cuenta {
    private double interesMensual;

    public CuentaAhorros(String numeroCuenta, double saldoInicial, double interesMensual) {
        super(numeroCuenta, saldoInicial);
        this.interesMensual = interesMensual;
    }

    @Override
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto + " de la Cuenta de Ahorros " + getNumeroCuenta());
            return true;
        }
        System.out.println("Saldo insuficiente en la Cuenta de Ahorros " + getNumeroCuenta());
        return false;
    }

    public void aplicarInteres() {
        double rendimiento = saldo * (interesMensual / 100);
        saldo += rendimiento;
        System.out.println("Interés aplicado de $" + rendimiento + ". Nuevo saldo: $" + saldo);
    }
}