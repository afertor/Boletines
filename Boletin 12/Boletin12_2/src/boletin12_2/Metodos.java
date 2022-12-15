package boletin12_2;

import javax.swing.JOptionPane;


public class Metodos {
    private int numero1;
    private int numero2 = (int)(Math. random()*50+1);;
    private int distancia;

    
    public void juegoNums (){
        while(numero1<1 || numero1<50){
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 teclee el numero"));
            
            
            int distancia = Math.abs(numero1-numero2);
            
            
    if(distancia<50&&distancia>20){
                System.out.println("Muy lejos");
    }
    else if (distancia>=10 && distancia<=20){
                System.out.println("Lejos");
    }   
    else if (distancia<10 && distancia>5){
                System.out.println("Cerca");
    }    
    else if(distancia<=5 && distancia>=1){ 
            System.out.println("Muy cerca");
    }
    else if(distancia<=0){
        System.out.println("Acertaste");
        break; 
    }
    }            
    }

}