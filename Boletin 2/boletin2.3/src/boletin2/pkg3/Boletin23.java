/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2.pkg3;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Valor actual del dolar:");
       double c = scan.nextDouble();
       System.out.println("Cantidad de euros a cambiar");
       double e = scan.nextDouble();
       double d = c * e;
       System.out.println("Sus "+ e + " euros equivalen a "+ d +"$ ");
    }
    
}
