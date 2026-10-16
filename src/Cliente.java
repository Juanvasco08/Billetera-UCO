public class Cliente {
    private String nombre;
    private String documento;
    private Cuenta cuenta;

    public Cliente(String nombre, String documento, Cuenta cuenta) {
        this.nombre = nombre;
        this.documento = documento;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + " | Documento: " + documento);
        System.out.println("Cuenta N°: " + cuenta.getNumeroCuenta() + " | Saldo Actual: $" + cuenta.getSaldo());
    }
}