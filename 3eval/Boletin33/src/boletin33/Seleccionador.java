
package boletin33;

public class Seleccionador extends SeleccionFutbol{
    
    
    public void seleccionar(){
        System.out.println("selecciona al jugador");
    }

    @Override
    public void concentrarse() {
        System.out.println("fijarse en seleccionar buenos jugadores");
    }

    @Override
    public void viajar() {
        System.out.println("viaje para buscar buenos jugadores");
    }

    @Override
    public void entrenar() {
        System.out.println("No entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("No juga partidos");
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
