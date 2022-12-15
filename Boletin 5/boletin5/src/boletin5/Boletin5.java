/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5;

/**
 *
 * @author Adrian
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consumo obx1 = new Consumo();
        obx1.setLitros(50);
        obx1.setPGas(1.57f);
        
        Consumo obx2 = new Consumo (200,12,60,1.57f);
    
        var consumoMedio = obx2.consumoMedio();
        System.out.println("Consumo medio ="+consumoMedio);
        
       obx2.setLitros(15);
       var velocidadMedia = obx2.getVMed();
       System.out.println("Velocidad media = " + velocidadMedia);
    }
    
    
}
