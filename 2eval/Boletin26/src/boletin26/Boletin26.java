
package boletin26;

import Datos.IntroduceDatos;
import java.util.ArrayList;


public class Boletin26 {

    public static void main(String[] args) {
       
        Metodos<Integer> obx = new Metodos();
        int opcion;
        ArrayList<Integer> lista= new ArrayList(); 
        do{
            opcion = IntroduceDatos.Introduceint("1. Añadir elemento\n2. Elemento minimo\n3. Elemento maximo\n4. Buscar un elemento\n5. Borrar un elemento\n6. Salir");
            switch(opcion){
                case 1:
                    int num = IntroduceDatos.Introduceint("Cuantos numeros vas a añadir?");
                    for(int i = 0; i < num; i++){
                        obx.añade(IntroduceDatos.Introduceint("Escribe un numero"), lista);
                    }
                    break;
                case 2:
                    obx.Minim(lista);
                    break;
                case 3:
                    obx.Maxim(lista);
                    break;
                case 4:
                    int posicion = obx.buscaElement(lista, IntroduceDatos.Introduceint("Escribe el numero que quieres buscar"));
                    if(posicion == -1){
                        System.out.println("");
                    }
                    break;
                case 5:
                    obx.borrar(lista, IntroduceDatos.Introduceint("Escribe el numero que quieres borrar"));
                    break;
                     case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Salir del programa");
            }
        }while(opcion > 0 && opcion < 6);
    }
    
}