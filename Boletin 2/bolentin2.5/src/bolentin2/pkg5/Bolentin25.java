/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bolentin2.pkg5;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Bolentin25 {

    /**
     * @param args the command line arguments
     */
        public static final int CONV=1852;//declaramos a constante conversion, de millas a metros
public static void main(String [] args) {
// TODO code application logic here
float millas, metros;
Scanner obxScanner = new Scanner(  System.in);
System.out.println("Teclee las millas a convertir");
millas=obxScanner.nextFloat();//leo/meto al objeto scanner
metros=millas*CONV;
System.out.println("La conversion es de "+metros+" metros");
    }
    
}
