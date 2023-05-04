
package bolentin2.pkg4;

import java.util.Scanner;

public class Bolentin24 {



   public static void main(String[] args) {
        float num1, num2;
        Scanner obxScaner = new Scanner (System.in);
        System.out.println("teclea el primer numero");
        num1=obxScaner.nextFloat();
        System.out.println("teclea el segundo numero");
        num2=obxScaner.nextFloat();
        float suma=num1+num2;
        float resta=num1-num2;
        float producto=num1*num2;
        float cociente=num1/num2;
        System.out.println("Suma ="+suma+
                "\nResta ="+resta+
                "\nProducto ="+producto+
                "\nCociente ="+cociente); 
    }
}