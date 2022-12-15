/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_3;

import javax.swing.JOptionPane;

public class Metodos {
    public void calcularRectangulo(){
        System.out.println("calcularRectangulos");
        double base = 0;
        double altura=0;
        
        do{
            base=Double.parseDouble(JOptionPane.showInputDialog("Itroduzca la base"));
            altura=Double.parseDouble(JOptionPane.showInputDialog("Itroduzca la altura"));
            double area = (base * altura)/2;
            if(base >0 && altura>0){
                System.out.println("El area es "+area);
            }else if(base <3&& altura<3){
                System.out.println("Introduzca un número positivo");
            }
        }while (base <=0 || altura <=0);
    }
}
    