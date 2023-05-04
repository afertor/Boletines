 
package boletin20;

public class Papagaio extends Aves implements IPodeCamiñar, IPodeVolar {

    @Override
    public void Camiñar() {
        System.out.println("Camina");
    }
    @Override
    public void voar() {
        System.out.println("Puede volar");
        
}
}