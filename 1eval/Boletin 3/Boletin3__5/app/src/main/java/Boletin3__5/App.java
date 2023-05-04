
package Boletin3__5;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
          Scanner sc = new Scanner(System.in);
        System.out.println("vamos a calcular el sueldo liquido y el bruto");
        double sueldo = 1000;
        System.out.println("Cuanto vendiste este mes?");
        double dist_ventas = sc.nextDouble();
        System.out.println("cuantos km te desplazaste?");
        double km = sc.nextDouble();
         System.out.println("Durante cuantos dias?");
        double diasDesplaz = sc.nextDouble();
        
        sueldo += dist_ventas * 0.05;
        sueldo += km * 2;
        sueldo += diasDesplaz*30;
        System.out.println("El sueldo bruto es de " + sueldo + "€");
        
        sueldo -= sueldo * 0.18;
        sueldo -= 36;
        System.out.println("El sueldo neto es de " + sueldo + "€");
        
    }
}