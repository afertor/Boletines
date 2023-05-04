
package boletin6_3;

public class Circulo {
    
    private double radio;
    public static final double PI=3.14;
    
    //CONSTRUCTOR
    public Circulo(){}
    
    public Circulo (double r){
        radio=r;
    }
    
    //SETTERS Y GETTERS
    public void setRadio(double r){
      radio=r;  
    }
    public double getRadio(){
        return radio;
    }
    
    //METODOS
    public double calcularArea(){
        double area=PI*Math.pow(radio,2);
        return area;
    }
    
    public double calcularLongitud(){
        double longitud=2*PI*radio;
        return longitud;
    }
}
