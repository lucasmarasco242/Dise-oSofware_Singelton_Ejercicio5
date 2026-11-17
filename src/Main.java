//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ControladorHardware d1 = ControladorHardware.getInstancia();
        ControladorHardware d2 = ControladorHardware.getInstancia();

        System.out.println("¿Es la misma instancia?: " + (d1 == d2));
        System.out.println("¿Dispositivo disponible?: " + d1.isDisponible());
        System.out.println("Estado actual: " + d1.getEstado());

        d1.enviarComando("MOVER_BRAZO_IZQUIERDO");
    }
}