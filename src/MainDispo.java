import jdk.swing.interop.SwingInterOpUtils;

public class MainDispo {
    public static void main() {
        System.out.println("Inicio");
        Dispositivo d1 = new Dispositivo(1, "Sensor A");
        System.out.println("Crear dispositivo1: Estado Activo: " + d1.isActivo());
        System.out.println("Consultar resumen "+ d1.obtenerResumen());
        boolean primerDesactivado = d1.desactivar();
        System.out.println("Desactivarlo nuevamente: ");
        d1.setNombre(" ");
        System.out.println("Cambiar nombre a \"\": cONSERVA NOMBRE: " + d1.getNombre());
    }
}
