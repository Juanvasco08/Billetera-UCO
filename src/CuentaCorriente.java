public class CuentaCorriente extends Cuenta {
    private double cupoSobregiro;

    public CuentaCorriente(String numeroCuenta, double saldoInicial, double cupoSobregiro) {
        super(numeroCuenta, saldoInicial);
        this.cupoSobregiro = cupoSobregiro;
    }

    @Override
    public boolean retirar(double monto) {
        if (monto > 0 && (saldo + cupoSobregiro) >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto + " en Cuenta Corriente " + getNumeroCuenta());
            return true;
        }
        System.out.println("El retiro supera el saldo disponible y el cupo de sobregiro.");
        return false;
    }
}