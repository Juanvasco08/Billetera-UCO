public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BILLETERA DIGITAL UCO ===");

        CuentaAhorros ahorroJuan = new CuentaAhorros("AH-1001", 500000.0, 1.5);
        CuentaCorriente corrienteEmpresa = new CuentaCorriente("CC-2002", 1200000.0, 300000.0);

        Cliente cliente1 = new Cliente("Juan Manuel Vasco", "1036000000", ahorroJuan);
        Cliente cliente2 = new Cliente("Carlos Gómez", "1036111222", corrienteEmpresa);

        System.out.println("\n--- ESTADO INICIAL ---");
        cliente1.mostrarInfo();
        cliente2.mostrarInfo();

        System.out.println("\n--- OPERACIONES ---");
        cliente1.getCuenta().depositar(150000.0);
        cliente1.getCuenta().retirar(100000.0);
        ahorroJuan.aplicarInteres();

        System.out.println("\n--- ESTADO FINAL ---");
        cliente1.mostrarInfo();
    }
}