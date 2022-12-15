package boletin8_2;

import java.util.Scanner;

public class Boletin8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Metodos rectangulo = new Metodos();
    Metodos triangulo = new Metodos();
    Metodos circulo = new Metodos();

        System.out.println("Selecciona un ejercicio");
        int ejerc = sc.nextInt();
    switch (ejerc){
        case 1:
            double area = rectangulo.calcularAreaRectang(5,3);
            System.out.println(area);
            break;
        case 2:
            System.out.println(triangulo.calcularAreaTriang(2,6));
                    break;
        case 3:
            System.out.println(circulo.calcularAreaCircu(5));
            break;
        default:
            System.out.println("es incorrecto");
            break;

    }
    }
}