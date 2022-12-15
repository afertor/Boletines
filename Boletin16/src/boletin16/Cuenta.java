package boletin16;

import javax.swing.JOptionPane;


public class Cuenta{
    private long numeroCuenta;
    private double saldo;
    private Persona cliente;
    
    public Cuenta() {
        
    }

    public Cuenta(long numeroCuenta, double saldo, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    
    public void Ingresar (String mensaxe){
        double ingreso = Double.parseDouble(JOptionPane.showInputDialog(mensaxe));
        this.saldo = this.saldo + ingreso;
        
    }
    
    public void Retiro (String mensaje){
        double retiro = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        if (saldo > 0) {
            this.saldo = this.saldo - retiro;
        }
        else {
            System.out.println("No hay saldo");
        }
       
    }
    
    public double actualizarSaldo (){
        System.out.println("El saldo actual es:");
        return this.saldo;
    }
    
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("numeroCuenta=").append(numeroCuenta);
        sb.append(", saldo=").append(saldo);
        sb.append(", cliente=").append(cliente);
        sb.append('}');
        return sb.toString();
    }
  
}