package extra1;

import java.util.Scanner;

public class Extra1 {
  public static void main(String[] args) {
    double baseImponible, iva, total;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce la base imponible: ");
    baseImponible = scanner.nextDouble();
    System.out.print("Introduce el porcentaje de IVE: ");
    iva = scanner.nextDouble();

    iva = baseImponible * iva / 100;

    total = baseImponible + iva;

    System.out.println("IVA: " + iva);
    System.out.println("Total: " + total);
  }
}