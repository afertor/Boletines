
package boletin33;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
protected String nombre,apellidos;
protected Integer id,edad;

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad;
    }
    
    
}
