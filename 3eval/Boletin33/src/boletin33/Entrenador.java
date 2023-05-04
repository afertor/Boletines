
package boletin33;

import boletin33.SeleccionFutbol;


public class Entrenador extends SeleccionFutbol{

    private Integer idFederacion;
    
    @Override
    public void concentrarse() {
        System.out.println("concentrar jugadores");
    }

    @Override
    public void viajar() {
        System.out.println("viaja el entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("entrenador entrena futbolistas");
    }

    @Override
    public void jugarPartido() {
        System.out.println("entrenador dirije jugadores en el partido");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("entrenador planifica entrenamientos");
    }

    @Override
    public String toString() {
        return super.toString() + ", idFederacion=" + idFederacion;
    }
    
    
}
