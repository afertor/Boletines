/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra3;

/**
 *
 * @author Adrian
 */
import java.util.Scanner;

public class Extra3 {
  public static void main(String[] args) {
    int edad;
    boolean padresSocios;
    double cuota, descuento, importe;
    cuota = 800;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce tu edad: ");
    edad = scanner.nextInt();
    System.out.print("Tus padres son socios? (si/no) ");
    padresSocios = scanner.next().equals("si");

    if (edad > 65) {
      descuento = 0.4;
    } else if (edad < 21 && !padresSocios) {
      descuento = 0.25;
    } else if (edad < 21 && padresSocios) {
      descuento = 0.45;
    } else {
      descuento = 0;
    }

    importe = cuota - cuota * descuento;

    System.out.println("Importe a pagar: " + importe + " euros");
  }
}