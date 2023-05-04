
package boletin18;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrian 
 */
public class Boletin18 {

    public static void main(String[] args) {

TemperaturaConvert obx = new TemperaturaConvert();
JOptionPane.showMessageDialog(null,"Aplicacion de conversor de temperatura");
float temperatura = Float.parseFloat(JOptionPane.showInputDialog("introduce la temperatura"));
try{
    System.out.println("La temperatura es:  "+temperatura + "ºC"+ "\n y su conversion de centigrados a Fharengeit es:" +obx.centigradosAFharenheit(temperatura)+"ºF");
    obx.centigradosAReamur(temperatura);
    }
    catch(TempErrorExce e){
    System.out.println("La temperatura no puede ser menor de 80");
}
    System.out.println("Fin del programa");
    
}
}
