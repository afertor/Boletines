
package boletin_17;

import javax.swing.JOptionPane;


public class Metodos {
    private float exTeorico1;
    private float exTeorico2;
    private float exPractico;
    private int numBoletines;
    private int nota;
    private String cont;
    private final static int BOLETINES=15;

    
    public void CuentasNota(){
        
        while(!"no".equalsIgnoreCase(cont)){
        exTeorico1= Notas();
        exTeorico2= Notas();
        exPractico= Notas();
        numBoletines=(int) Notas();
        float PruebasTeoricas=((exTeorico1+exTeorico2)/2)*(float)0.4;
        float PruebasPracticas= exPractico*(float)0.4;       
        float boletin= (float)numBoletines/BOLETINES;
        if(boletin>0.9)
            nota=2;
        else if(boletin>=0.70 && boletin<=0.9)
            nota=1;
        else if(boletin<0.70)
            nota=0;
        
        float totalNota= PruebasTeoricas+PruebasPracticas+nota;
        JOptionPane.showMessageDialog(null, "Tu nota final es =" +totalNota);
        cont=JOptionPane.showInputDialog("¿Quieres calcular otra nota?");
        }
    }
   
    public Metodos() {
    }

    public Metodos (float exTeorico1, float exTeorico2, float exPractico, int numBoletines) {
        this.exTeorico1 = exTeorico1;
        this.exTeorico2 = exTeorico2;
        this.exPractico = exPractico;
        this.numBoletines = numBoletines;
    }

    public float getExTeorico1() {
        return exTeorico1;
    }

    public void setExTeorico1(float exTeorico1) {
        this.exTeorico1 = exTeorico1;
    }

    public float getExTeorico2() {
        return exTeorico2;
    }

    public void setExTeorico2(float exTeorico2) {
        this.exTeorico2 = exTeorico2;
    }

    public float getExPractico() {
        return exPractico;
    }

    public void setExPractico(float exPractico) {
        this.exPractico = exPractico;
    }

    public int getNumBoletines() {
        return numBoletines;
    }

    public void setNumBoletines(int numBoletins) {
        this.numBoletines = numBoletins;
    }

    @Override
    public String toString() {
        return "Nota{" + "exTeorico1=" + exTeorico1 + ", exTeorico2=" + exTeorico2 + ", exPractico=" + exPractico + ", numBoletines=" + numBoletines + '}';
    }
    public static float Notas(){
        
        return Float.parseFloat(JOptionPane.showInputDialog("Escribe las notas de los 3 examenes y el numero de boletines: "));
        
    }
}
