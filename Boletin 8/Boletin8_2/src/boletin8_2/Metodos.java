
package boletin8_2;

public class Metodos {
    public double calcularAreaRectang(double base, double altura){
        return Math.abs(base*altura);
    }

    public double calcularAreaTriang(double base,double altura){
        return  Math.abs(base*altura/2);
    }

    public double calcularAreaCircu(double r){
        return Math.abs(Math.PI * Math.pow(r,2));
    }
}