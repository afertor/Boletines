package boletin8;


public class Metodos {
    private String nombre;
    private int num_ventas;

    private String tipo;

    public Metodos(String nombre,int n_ventas){
        this.nombre = nombre;
        this.num_ventas = n_ventas;
    }
    public Metodos(){

    }

    public String getNombre() {
        return nombre;
    }

    public int getN_ventas() {
        return num_ventas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setN_ventas(int num_ventas) {
        this.num_ventas = num_ventas;
    }

    public int ponTipo(Metodos producto){
        return 1;
    }


    public void tipoArticulo(){
        if(this.num_ventas <= 100){
            this.tipo = "Bajo";
            System.out.println("Las "+this.nombre+" son un tipo de articulo de consumo" + this.tipo);
        } else if (this.num_ventas < 100 && this.num_ventas<=500) {
            this.tipo = "Medio";
            System.out.println("Las "+this.nombre+" son un tipo de articulo de consumo" + this.tipo);
        } else if (this.num_ventas >500 && this.num_ventas<=1000 ) {
            this.tipo = "Alto";
            System.out.println("Las "+this.nombre+" son un tipo de articulo de consumo" + this.tipo);
        }else {
            this.tipo = "Primera Necesidad";
            System.out.println("Las "+this.nombre+" son un tipo de articulo de consumo" + this.tipo);
        }
    }

}