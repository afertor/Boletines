/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6.pkg1;

/**
 *
 * @author Adrian
 */
public class Coche {
         private int velocidade ;

    public Coche(){
    velocidade =0 ;
}
    public int getVelocidade (){
        return velocidade;
    }
    public void acelerar (int valor){
        velocidade =velocidade + valor;
    }
    public void frenar(int menos){
        velocidade = velocidade-menos;
    }
}
