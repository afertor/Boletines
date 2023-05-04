package boletin15;

public class Disco extends Multimedia{
    private String genero;

    public Disco(String titulo, String autor, String formato, float duracion,String genero) {
        super(titulo, autor, formato, duracion);
        this.genero=genero;
    }

    public Disco() {
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()+ "Disco{" + "genero=" + genero + '}';
    }
    
    
}