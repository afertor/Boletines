package computer.partes;


public class Monitor {
    
    private float pulgadas = 5f;
    
    public Monitor(float pulgadas){
        this.pulgadas = pulgadas;
    }
    
    public Monitor(){
        
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" + "pulgadas=" + pulgadas + '}';
    }
    
    
    
    
        
}