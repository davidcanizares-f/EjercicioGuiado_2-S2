package negocio;

public class Producto {
    //nombre, precio, categoria
    public String nombre;
    public double precio;
    String categoria;

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $ " + precio);
        System.out.println("Categoria: " + categoria);
    }

    /*void mostrarCategoria(){

    }*/
}
