package boletin33;


public class Boletin33 {

   
    public static void main(String[] args) {
        SeleccionFutbol obxF;
        obxF = new Futbolista();
        llamada(obxF);
        obxF = new Entrenador();
        llamada(obxF);
        obxF = new Masajista();
        llamada(obxF);
        obxF = new Seleccionador();
        llamada(obxF);
    }
    
    public static void llamada(SeleccionFutbol obxF){
        obxF.concentrarse();
        obxF.viajar();
        obxF.entrenar();
        obxF.jugarPartido();
        System.out.println(obxF.toString());
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    
}
