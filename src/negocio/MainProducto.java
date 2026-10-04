package negocio;

public class MainProducto {
    public static void main() {
        Producto producto1 = new Producto();
        producto1.nombre = "Lavadora";
        producto1.precio = 500;
        producto1.categoria = "Electrodomésticos";

        Producto producto2 = new Producto();
        producto2.nombre = "Power Bank";
        producto2.precio = 40;
        producto2.categoria = "Tecnología";

        System.out.println("===== PRODUCTO 1 =====");
        producto1.mostrarInformacion();
        producto1.mostrarCategoria();

        System.out.println("===== PRODUCTO 2 =====");
        producto2.mostrarInformacion();
        producto2.mostrarCategoria();




    }
}
