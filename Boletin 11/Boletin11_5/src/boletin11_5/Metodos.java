/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_5;

import javax.swing.JOptionPane;

public class Metodos {
    public void sueldos(){
        int cs=0;
        int cm=0;
        int c=0;
        int s;
        do{
            s= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un salario:"));
            if(s<0)
                System.out.println("ERROR");
            else if(s<1750 && s >1000){
                cs++;
            }
            else if(s<1000 && s>0){
                cs++;
            }
            c++;
            System.out.println("Salarios de 1750-1000: "+ cs + "\nProcentaje de salarios de merjos de 1000: "+(cm*100/c));
        }while(s!=0);
    }
    
}
