package boletin20;

public class Boletin20 {

    public static void main(String[] args) {
        System.out.println("El gato:");
        Gato cat = new Gato();
        cat.Camiñar();
        cat.nadar();

        System.out.println(" \nEl guacamayo:");

        Papagaio papag = new Papagaio();
        papag.Camiñar();
        papag.voar();
        

        System.out.println(" \n El mamifero:");
        Mamiferos mamife = new Mamiferos();
        mamife.Camiñar();

      

        System.out.println("\nEl Avestrus:");
        Avestruz aves = new Avestruz();
        aves.Camiñar();
        

        System.out.println("\nEl Murcielago:");

        Morcego morceg = new Morcego();
        morceg.Camiñar();
        morceg.voar();

        System.out.println("\nEl felino:");
        Felino felin = new Felino();
         felin.Camiñar();
         felin.nadar();

        System.out.println("\nEl tigre:");
        Tigre tiger = new Tigre();
        tiger.Camiñar();
        tiger.nadar();

    }

}