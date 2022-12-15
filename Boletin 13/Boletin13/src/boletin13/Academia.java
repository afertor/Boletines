package boletin13;


public class Academia {
    private int nota;
    private int numRefe = 2022;
    

    public Academia(int nota, int numReferencia) {
        this.nota = nota;
        this.numRefe = numRefe;
        numRefe++;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }


    public int getNumRefe() {
        return numRefe;
    }

    public void setNumRefe(int numReferencia) {
        this.numRefe= numReferencia;
    }

    @Override
    public String toString() {
        return "Academia{" + "nota=" + nota + ", numReferencia=" + numRefe + '}';
        
    }
       
}