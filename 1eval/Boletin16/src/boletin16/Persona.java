package boletin16;

public class Persona {
     private String nombre;
     private String apellidos;
     private String NIF;
     
    public Persona(){
        
    }
    
    public Persona (String nombre, String apellidos, String NIF) {
        this.NIF = NIF;
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", NIF=").append(NIF);
        sb.append('}');
        return sb.toString();
    }
    
}
