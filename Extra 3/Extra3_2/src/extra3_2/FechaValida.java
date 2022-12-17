package extra3_2;

public class FechaValida {
  public static boolean fecha(int dia, int mes, int ano) {
    if (mes < 1 || mes > 12) {
      return false;
    }
    int diasMes = 31;
    if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
      diasMes = 30;
    } else if (mes == 2) {
      diasMes = 28;
      
    }
    if (dia < 1 || dia > diasMes) {
      return false;
      
    }
    return true;
  }
}