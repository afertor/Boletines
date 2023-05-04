
package boletin33;

import boletin33.SeleccionFutbol;


public class Futbolista extends SeleccionFutbol{

    private Integer dorsal;
    private String demarcacion;
    
    @Override
    public void concentrarse() {
        System.out.println("concentrar futbolista");
    }

    @Override
    public void viajar() {
        System.out.println("viaje de futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("entrena el futbolista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("juega el futbolista");
    }
    
    public void entrevista(){
        System.out.println("entrevista al futbolista");
    }

    @Override
    public String toString() {
        return super.toString() + ", dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }
    
    
}
