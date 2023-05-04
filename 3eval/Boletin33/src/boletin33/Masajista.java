
package boletin33;

import boletin33.SeleccionFutbol;


public class Masajista extends SeleccionFutbol{

    private String titulacion;
    private Integer anhosExperiencia;
    
    @Override
    public void concentrarse() {
        System.out.println("contentrar masajista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaje al masajista");
    }

    @Override
    public void entrenar() {
        System.out.println("el masajista entrena los masajes");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista no juega partidos");
    }
    
    public void darMensaje(){
        System.out.println("Masajista da un masaje");
    }

    @Override
    public String toString() {
        return super.toString() + ", titulacion=" + titulacion + ", anhosExperiencia=" + anhosExperiencia;
    }
    
    
}
