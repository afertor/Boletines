package boletin26;

import java.util.ArrayList;
import java.util.Collections;

public class Metodos <T>{

    public <T> void añade(T elemento, ArrayList<T> lista){
        lista.add(elemento);
    }
    public <T> void Minim(ArrayList<T> aux){
        System.out.println("\nElemento minimo: " + Collections.min(aux, null));   
    }
    public <T> void Maxim(ArrayList<T> aux){
        System.out.println("\nElemento maximo: " + Collections.max(aux, null));
    }
    public <T> int buscaElement(ArrayList<T> auxili, T buscar){
        int position = -1;
        if(auxili.indexOf(buscar)>=0){
            position = auxili.indexOf(buscar)+1;
            System.out.println("\nEl elemento " + buscar + " aparece en la posicion " + position);
        }        
        else{
            position = 0;
            System.out.println("\nEl elemento " + buscar + " no existe");
        }
        return position;
    }
    public <T> void borrar(ArrayList<T> auxili, T elemento){
        int posit = buscaElement(auxili,elemento);
        T element;
        if(posit>-1){
            element = auxili.get(posit);
            auxili.remove(posit);
            System.out.println("\nSe ha borrado el elemento " + element);
        }
        else{
            System.out.println("\nNo se puede borrar elemento porque no existe");
        }   
    }
}