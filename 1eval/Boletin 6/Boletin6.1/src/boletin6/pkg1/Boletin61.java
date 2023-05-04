/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6.pkg1;

/**
 *
 * @author Adrian
 */
public class Boletin61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche obxCoche = new Coche();
                obxCoche.acelerar(50);
                System.out.println("Aceleracion de:"+obxCoche.getVelocidade());
                obxCoche.frenar(40);
                System.out.println("Diminuicion de:"+obxCoche.getVelocidade());
    }
    
}
