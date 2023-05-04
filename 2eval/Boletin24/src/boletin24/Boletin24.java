package boletin24;

import Datos.IntroduceDatos;
import java.util.ArrayList;
import Metodos.MEtodos;
import Metodos.Libro;

public class Boletin24 {
    public static void main(String[] args) throws Exception {
        MEtodos obx = new MEtodos();
        ArrayList<Libro> libros = new ArrayList<>();
        int option = 0;
        do {    
                option = IntroduceDatos.Introduceint("1. Añadir libro \n2. Mostrar libros ordenados por titulo \n3. Vender libro" + "\n4. Dar de baja un libro \n5. Consulta un libro determinado \n6. Eliminar un libro\n7. Salir");

                switch (option) {
                    case 1:
                        obx.add(libros);
                        break;
                    case 2:
                         obx.ordenado(libros);
                        break;
                    case 3:
                        obx.venta(libros);
                        break;
                    case 4:
                       obx.darBajaLibro(libros);
                        break;
                    case 5:
                       obx.consultaTitulo(libros);
                        break;
                    case 6:
                        obx.eliminarLibro(libros);
                        break;
                    default:
                        System.out.println(" Saliendo ");
                }          
        } while (option < 7);
    }
}