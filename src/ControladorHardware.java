public class ControladorHardware {
    private static ControladorHardware instancia;
    private String estado;
    private boolean disponible;

    private ControladorHardware() {
        this.estado = "Listo";
        this.disponible = true;
    }

    public static ControladorHardware getInstancia() {
        if (instancia == null) {
            instancia = new ControladorHardware();
        }
        return instancia;
    }

    public void enviarComando(String comando) {
        if (disponible) {
            System.out.println("Enviando comando al puerto serial: " + comando);
        } else {
            System.out.println("Dispositivo ocupado.");
        }
    }

    public String getEstado() {
        return estado;
    }

    public boolean isDisponible() {
        return disponible;
    }
}