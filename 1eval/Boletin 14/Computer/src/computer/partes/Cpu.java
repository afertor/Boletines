package computer.partes;

public class Cpu {
    private int velocidad = 6;
    
    public Cpu(){
        
    }
    public Cpu(int velocidad){
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Cpu{" + "velocidad=" + velocidad + '}';
    }
    
    
}