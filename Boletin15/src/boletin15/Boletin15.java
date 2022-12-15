package boletin15;

import java.util.Scanner;

public class Boletin15 {
    
    public static void main(String[] args) {
        
        Disco disc1 =new Disco("Peli1","autor1","Disco1",20f,"genero1");
        System.out.println(disc1.toString());
        Pelicula pel1 = new Pelicula("Peli2","autor2","formato",30f,"actor1","actor1");
        System.out.println(pel1.toString());
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de la peli");
        pel1.setTitulo(sc.nextLine());
        System.out.println("Autor de la peli");
        pel1.setAutor(sc.nextLine());
        System.out.println("Formato de la peli");
        pel1.setFormato(sc.nextLine());
        System.out.println("duraciond de la peli '(float)'");
        pel1.setDuracion(sc.nextFloat());
        System.out.println("Actor de la peli");
        pel1.setActor(sc.nextLine());
        System.out.println("Actriz de la peli");
        pel1.setActriz(sc.nextLine());
        
      
        
        
        
        
    }
}