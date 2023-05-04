package boletin8;

public class Boletin8 {
    public static void main(String[] args) {
        System.out.println("Supermercad");
    Metodos dulces = new Metodos();
    dulces.setNombre("Haribo");
    dulces.setN_ventas(540);
    Metodos refresco = new Metodos();
    refresco.setNombre("Fanta");
    refresco.setN_ventas(1000);

    Metodos pan = new Metodos("Pan", 30000);

    pan.tipoArticulo();





    }
}