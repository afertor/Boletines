
package Datos;

import javax.swing.JOptionPane;


public class IntroduceDatos {
    
     
    public static byte Introducebyte(String mensaxe){
        return Byte.parseByte(JOptionPane.showInputDialog(mensaxe));
    }
    
     public static Float IntroduceFloat(String mensaxe){
        return Float.valueOf(JOptionPane.showInputDialog(mensaxe));
    }
    
     public static String getString(String mensaxe){
        return JOptionPane.showInputDialog(mensaxe);
    }
     
      public static long Introducelong(String mensaxe){
        return Long.parseLong(JOptionPane.showInputDialog(mensaxe));
    }
    
    public static int Introduceint(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    
    public static Integer IntroduceInteger(String mensaxe){
        return Integer.valueOf(JOptionPane.showInputDialog(mensaxe));
    }
    
    public static float Introducefloat(String mensaxe){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
    }
    
    public static short Introduceshort(String mensaxe){
        return Short.parseShort(JOptionPane.showInputDialog(mensaxe));
    }
    
    public static double Introducedouble(String mensaxe){
        return Double.parseDouble(JOptionPane.showInputDialog(mensaxe));
    }
    
    
}