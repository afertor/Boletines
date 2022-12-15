
package boletin16;

import javax.swing.JOptionPane;


public class CuentaAhorro extends Cuenta{
    private double interesVariable;
    
    private double saldoMinim;
    
    public CuentaAhorro(double interesVariable, long numCuenta, double saldo, Persona cliente) {
        super(numCuenta, saldo, cliente);
        this.interesVariable = interesVariable;
        this.saldoMinim = saldoMinim;
     
 }
    public double cambioInteres (String mensaje){
        interesVariable = Double.parseDouble(JOptionPane.showInputDialog("mensaje"));
        return interesVariable;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + "CuentaAhorro{" + "interesVariable=" + interesVariable + ", saldoMinim=" + saldoMinim + '}';
        
    }  
}