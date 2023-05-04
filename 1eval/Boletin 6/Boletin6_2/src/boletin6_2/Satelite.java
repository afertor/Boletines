/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6_2;

/**
 *
 * @author Adrian
 */

public class Satelite{
 
     private double meridiano ;
     private double paralelo;
     private double distanciaTerra ;

 public Satelite() {

  meridiano = paralelo = distanciaTerra = 0;
}

public Satelite ( double meridiano, double paralelo, double distanciaTerra ){

this.meridiano = meridiano;
this.paralelo = paralelo;
this.distanciaTerra = distanciaTerra;

}
public void verPosicion ( ) {

System.out.println("o satelite atopase  no paralelo " +paralelo + " meridiano " + meridiano + " a unha distancia da terra " + distanciaTerra );     

    }
}