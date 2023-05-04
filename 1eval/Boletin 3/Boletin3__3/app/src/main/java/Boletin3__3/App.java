package Boletin3__3;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduca los billetes de 100 que tiene");
        int Bill_100 = sc.nextInt();
        Bill_100 = 100*Bill_100;
        System.out.println("Introduzca los billestes de 20 que tiene");
        int Bill_20 = sc.nextInt();
        Bill_20 = 20*Bill_20;
         System.out.println("Introduzca los billestes de 5 que tiene");
        int Bill_5 = sc.nextInt();
        Bill_5 = 5*Bill_5;
         System.out.println("Introduzca las monedas de 1 que tiene");
        int Moned_1 = sc.nextInt();
        
        int Dinero = Bill_100 + Bill_20 + Bill_5 + Moned_1;
        System.out.println("Usted tiene " + Dinero + " euros");
    }
}