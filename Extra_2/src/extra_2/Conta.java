
package extra_2;

public class Conta {
  private String nomeCliente;
  private String numeroConta;
  private double tipoInterese;
  private double saldo;

  public Conta() {
    this.nomeCliente = "";
    this.numeroConta = "";
    this.tipoInterese = 0.0;
    this.saldo = 0.0;
  }

  public Conta(String nomeCliente, String numeroConta, double tipoInterese, double saldo) {
    this.nomeCliente = nomeCliente;
    this.numeroConta = numeroConta;
    this.tipoInterese = tipoInterese;
    this.saldo = saldo;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  public String getNumeroConta() {
    return numeroConta;
  }

  public void setTipoInterese(double tipoInterese) {
    this.tipoInterese = tipoInterese;
  }

  public double getTipoInterese() {
    return tipoInterese;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  public void ingreso(double cantidad) {
    if (cantidad >= 0) {
      this.saldo += cantidad;
    }
  }

  public void reintegro(double cantidad) {
    if (cantidad >= 0 && cantidad <= this.saldo) {
      this.saldo -= cantidad;
    }
  }

  public void transferencia(Conta destino, double cantidad) {
    if (cantidad >= 0 && cantidad <= this.saldo) {
      this.saldo -= cantidad;
      destino.ingreso(cantidad);
    }
  }
}