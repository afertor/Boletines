
package boletin12_1;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Boletin12_1 {

 
    public static void main(String[] args) {
        int p1 =(int)(Math.random()*(50 -1)+1);
        int p2 = 0;
        int intento = Integer.parseInt(JOptionPane.showInputDialog("Cuantos intentos"));
        if (intento ==3){
            JOptionPane.showMessageDialog(null,"Toma 5 intentos");
            intento = intento +5;
        }
        else if(intento<3){
            JOptionPane.showMessageDialog(null,"dices"+(-intento)+"intentos no?");
        }
        for(int i=3;i<intento;i++){
            p2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta"));
            if((p2<0)||(p2>53)){
                JOptionPane.showMessageDialog(null, "Es del 1 al 53 eso no vale");
                break;
            }
            else if (p2>(p1+23)||p2<(p1-23)){
                JOptionPane.showMessageDialog(null,"Estas muy lejos");
            }
                  else if (p2>(p1+9)||p2<(p1-9)){
                JOptionPane.showMessageDialog(null,"Estas lejos");
        }
                  else if (p2>(p1+5)||p2<(p1-5)){
                JOptionPane.showMessageDialog(null,"Estas cerca");
    }
                  else if (p2>(p1+2)||p2<(p1-2)){
                JOptionPane.showMessageDialog(null,"Estas muy cerca");
                  }else{
                      JOptionPane.showMessageDialog(null,"Enhorabuena has acertado");
                  break;
                  }
        }
    if(p2!=p1)
    JOptionPane.showMessageDialog(null,"Mas suerte la proxima");
}
}