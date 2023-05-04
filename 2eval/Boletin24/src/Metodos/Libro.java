package Metodos;
public class Libro implements Comparable<Libro> {
    private String titulo;
    private String iSBN;
    private String autor;
    private double precio;
    private int unidades;

    public Libro(String titulo, String iSBN, String autor, double precio, int unidades) {
        this.titulo = titulo;
        this.iSBN = iSBN;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setunidades(int numeroUnidad) {
        this.unidades = numeroUnidad;
    }
    public int getunidades() {
        return unidades;
    }
    
    @Override
    public int compareTo(Libro libro) {

        Libro libros = (Libro) libro;
        if (this.titulo.compareToIgnoreCase(libros.titulo) > 0) {
            return 1;
        } else if (this.titulo.compareToIgnoreCase(libros.titulo) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    @Override
    public String toString() {
        return "\n titulo es :" + titulo + "\n iSBN :" + iSBN + "\n autor :" + autor + "\n precio :" + precio + "\n unidades :" + unidades + "\n";
    }
}