package Metodos;

import java.util.Collections;
import java.util.Iterator;
import Datos.IntroduceDatos;
import java.util.ArrayList;


public class MEtodos {

    public void add(ArrayList<Libro> libros) {
        Libro Datos = new Libro(IntroduceDatos.getString("Titulo: ") ,IntroduceDatos.getString("ISBN: "),IntroduceDatos.getString("Autor: "),IntroduceDatos.Introducefloat("Precio: "), IntroduceDatos.Introduceint("Numero de unidad: "));
        libros.add(Datos);
    }

    public void muestra(ArrayList<Libro> libros) {
        System.out.println(libros);
    }

    public void venta(ArrayList<Libro> libros) throws Exception {
        String busqueda = IntroduceDatos.getString("Escribe el titulo de un libro:");
        Libro libro = buscador(libros, busqueda);

        if (libro.getunidades() > 0) {
            RealizarVenta(libros, libro);
        } else {
            throw new Exception("No quedan unidades de este libro.");
        }
    }

    public void ordenado(ArrayList<Libro> libros) {
        Collections.sort(libros);
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void darBajaLibro(ArrayList<Libro> libros) {
        Iterator iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libroDarBaja = (Libro) iterator.next();

            if (libroDarBaja.getunidades() == 0) {
                iterator.remove();
            }
        }
    }
    public void consultaTitulo(ArrayList<Libro> libros) throws Exception {
        String busqueda = IntroduceDatos.getString("Introduce un titulo :");
        Libro libro = buscador(libros, busqueda);
        System.out.println("El libro es: " + libro.toString());
    }
    public void eliminarLibro(ArrayList<Libro> libros) throws Exception {
        String busqueda = IntroduceDatos.getString("Introduce un titulo :");
        Libro libro = buscador(libros, busqueda);
        libros.remove(libro);
    }
    
    private Libro buscador (ArrayList<Libro> libros, String titulo) throws Exception {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }

        throw new Exception("El libro no existe.");
    }
    private void RealizarVenta(ArrayList<Libro> libros, Libro libro) {
        libro.setunidades(libro.getunidades() - 1);

        if (libro.getunidades() == 0) {
            libros.remove(libro);
        }
    }
}