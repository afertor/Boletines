
package boletin11_4;

import java.util.Scanner;


public class Boletin11_4 {

 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int por=0;
       int opcion=1;
       while(opcion==1){
        System.out.println("Dame un numero");
        int n=sc.nextInt();
        for(int i=1;i<11;i++){
            por=n*1;
            System.out.println(n+" * "+1+" ="+por);
        }
        System.out.println("Presiona 0 para salir y 1 para continuar");
        opcion=sc.nextInt();
    }
    }
    
}
