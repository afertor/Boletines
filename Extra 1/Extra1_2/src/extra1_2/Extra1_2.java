package extra1_2;

import java.util.Scanner;

public class Extra1_2 {
  public static void main(String[] args) {
   
              double a, b, c, x, y;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce el coeficiente a: ");
    a = scanner.nextDouble();
    System.out.print("Introduce el coeficiente b: ");
    b = scanner.nextDouble();
    System.out.print("Introduce el coeficiente c: ");
    c = scanner.nextDouble();
    System.out.print("Introduce el valor de x: ");
    x = scanner.nextDouble();

    y = a * x * x + b * x + c;

    System.out.println("Y = " + y);
  }
}
