package boletin16;

public class CuentaCorriente extends Cuenta{
    
    private final double interes_fijo = 0.800; 

    public CuentaCorriente() {
    }

    public CuentaCorriente(long numCuenta, double saldo, Persona cliente) {
        super(numCuenta, saldo, cliente);
        super.setSaldo(saldo * interes_fijo);
    }

    @Override
    public String toString() {
        return  super.toString() + "interes_fijo=" + interes_fijo;
    }
    
    

    

}
    
    
    