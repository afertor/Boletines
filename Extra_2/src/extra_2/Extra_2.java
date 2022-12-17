
package extra_2;


public class Extra_2 {

public static void main(String[] args) {
  Conta cuenta1 = new Conta("Paco", "158496", 0.3, 200.0);
  Conta cuenta2 = new Conta("Maria", "756912", 0.4, 500.0);

  // Realizar un ingreso en cuenta1
  cuenta1.ingreso(40);
  System.out.println("Saldo de c1 despues de un ingreso: " + cuenta1.getSaldo());

  // Realizar un reintegro en cuenta1
  cuenta1.reintegro(30);
  System.out.println("Saldo de c1 despues de un reintegro: " + cuenta1.getSaldo());

  // Realizar una transferencia de cuenta1 a cuenta2
  cuenta1.transferencia(cuenta2, 47);
  System.out.println("Saldo de cuenta1 despues de una transferencia: " + cuenta1.getSaldo());
  System.out.println("Saldo de cuenta2 despues de una transferencia: " + cuenta2.getSaldo());
}
}