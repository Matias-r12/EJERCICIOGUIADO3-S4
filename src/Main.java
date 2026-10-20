public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA EJERCICIO 3: CONSTRUCTORES Y STATIC ===");

        System.out.println("Total antes de crear objetos: " + producto.getTotalCreados());

        producto producto1 = new producto("Mouse", 20.0, "Tecnología");
        System.out.println("Total después de crear uno: " + producto.getTotalCreados());

        producto producto2 = new producto("Teclado", 45.5, "Tecnología");
        producto producto3 = new producto("Monitor", 250.0, "Electrónica");

        System.out.println("Total después de crear tres: " + producto.getTotalCreados());

        System.out.println("\n--- Información detallada de los objetos ---");
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();
    }
}