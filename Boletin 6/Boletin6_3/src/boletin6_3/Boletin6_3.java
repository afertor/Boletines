/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6_3;

/**
 *
 * @author Adrian
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo objC1 = new Circulo();
        objC1.setRadio(15);
        
        System.out.println("area"+objC1.calcularArea());
        System.out.println("longitud"+objC1.calcularLongitud());
        
        
        Circulo objC2 = new Circulo (10);
        System.out.println("area"+objC2.calcularArea());
        System.out.println("longitud"+objC2.calcularLongitud());

    }
    
}
