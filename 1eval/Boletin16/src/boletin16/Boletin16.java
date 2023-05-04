
package boletin16;


public class Boletin16 {

   
    public static void main(String[] args) {
        
        Persona obxCliente = new Persona("Adrian", "Fernandez", "45626564D");
        String datosCliente = obxCliente.toString();
        System.out.println("Datos de Cliente = " + datosCliente);
       
        
        
        CuentaCorriente obxCuentaCorriente = new CuentaCorriente(2876768, 2000, obxCliente);
        String datosCuentaCorriente = obxCuentaCorriente.toString();
        System.out.println("Datos de la Cuenta Corriente = " + datosCuentaCorriente);
     
        
        
        CuentaAhorro obxCuentaAhorro = new CuentaAhorro(10, 6845455, 2000, obxCliente);
        String datosCuentaAhorro = obxCuentaAhorro.toString();
        System.out.println("Datos de la Cuenta de Ahorro = " + datosCuentaAhorro);
     
    }
    
}