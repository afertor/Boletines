package boletin7;


import java.util.Scanner;

public class Boletin7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num = sc.nextInt();
    Metodos ej1 = new Metodos();

    Metodos ej2 = new Metodos();
        System.out.println("Introduzca 2 numeros");
        short num1 = sc.nextShort();
        short num2 = sc.nextShort();

        ej2.sumaResta(num1,num2);

    Metodos ej3 = new Metodos();
        System.out.println("Introduzca 3 numeros");
        num1 =sc.nextShort();

    Metodos ej4 = new Metodos();
        System.out.println("Peso persona 1");
            short peso1 = sc.nextShort();
        System.out.println("Peso persona 2");
            short peso2 = sc.nextShort();

            ej4.pesoPerson(peso1,peso2);

    Metodos ej5 = new Metodos();

        ej5.tresNum(num1,num2,peso1);








    }

}