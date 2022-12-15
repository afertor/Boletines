/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3.pkg1;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bienvenido"+ "\n" + "Hoy estamos de descuento");
    
    System.out.println("Precio tarifa?");
    double precioTarifa = scanner.nextDouble();
    
    System.out.println("Precio pagado?");
    double precioPagado = scanner.nextDouble();
    
    double porcentaje = 100 - ((precioPagado *100)/ precioTarifa);
    
    System.out.println("El porcentaje descontado de la compra es = " + Math.round(porcentaje)+"%"         
            +"\n" + " Gracias por su compra");
    
    
    
    
    }
    
    
}
