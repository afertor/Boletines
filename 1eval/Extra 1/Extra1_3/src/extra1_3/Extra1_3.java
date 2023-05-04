package extra1_3;


import java.util.Scanner;

public class Extra1_3 {
  public static void main(String[] args) {
    double a, b, c, x1, x2;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce el valor de a: ");
    a = scanner.nextDouble();
    System.out.print("Introduce el valor de b: ");
    b = scanner.nextDouble();
    System.out.print("Introduce el valor de c: ");
    c = scanner.nextDouble();

    double valor = b * b - 4 * a * c;
    if (valor < 0) {
      System.out.println("La ecuacion no tiene soluciones reales.");
    } else if (valor == 0) {
      x1 = -b / (2 * a);
      System.out.println("La ecuacion tiene una raiz doble: " + x1);
    } else {
      x1 = (-b + Math.sqrt(valor)) / (2 * a);
      x2 = (-b - Math.sqrt(valor)) / (2 * a);
      System.out.println("La ecuacion tiene dos raices: " + x1 + " y " + x2);
    }
  }
}