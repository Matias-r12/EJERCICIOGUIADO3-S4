public class producto {
    private int id;
    private String nombre;
    private double precio;
    private String categoria;

    private static int contador = 0;

    public producto(String nombre, double precio, String categoria) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getId() {
        return this.id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public static int getTotalCreados() {
        return contador;
    }

    public void mostrarInformacion() {
        System.out.println("Objeto ID " + id + " -> Producto: " + nombre + " | Precio: $" + precio + " | Categoría: " + categoria);
    }
}
