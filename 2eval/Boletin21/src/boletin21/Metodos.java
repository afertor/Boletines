package boletin21;
import Datos.IntroduceDatos;

public class Metodos {
    private int cuenta = 30;
       
    public int[] arrayNumeros(){
        int numeros[] = new int[6];
        for (int i = 0; i < numeros.length; i++){
            int num = (int) (Math.random()*50+1);
            for (int j = i; j > 0; j--){
                if(numeros[j] == num){
                    num = (int) (Math.random()*50+1);
                    j = i;
                }
            }
            numeros[i] = num;            
        }
        return numeros;        
    }
    
    
   
    
    public void MostrarNumbers(int numeros[]){
        for(int i = (numeros.length-1); i>=0; i--){
            System.out.println("El numero da "+ (i + 1) + " posicion = "+ numeros[i]);
        }
    }
    
      public String[] Nombre(){
        String nombres[] = new String[cuenta];
        for (int i = 0; i < nombres.length; i++){
            nombres[i] = IntroduceDatos.getString("Teclee el nombre del " + (i+1) +"a alumno");
        }
        return nombres;
    }
    
    public int[] Notas(){
        int notas[] = new int[cuenta];
        for (int i = 0; i < notas.length; i++){
            int num = (int) (Math.random()*10+1);
            notas[i] = num;
        }
        return notas;
    }    
    
        public void NotaMedia(int notas[]){
        int suma = 0;
        for (int i = 0; i < notas.length; i++){
            suma = suma + notas[i];
        }
        float media = (float) suma/(notas.length);
        System.out.println("La nota media es: " + media);
    }
    
    
    public void MostrarNotas(int notas[]){
        int aprobados = 0;
        int suspensos = 0;
        for (int i = 0; i < notas.length; i++){
            if(notas[i] >= 5){
                aprobados++;
            }
            else{
                suspensos++;
            }
        }
        System.out.println("Han aprobado= " + aprobados + "\nHan suspendido= " + suspensos);
    }
   
    
    public void NotaAlta(int notas[]){
        int notaAlta = 0;
        for (int i = 0; i < notas.length; i++){
            if(notaAlta < notas[i]){
                notaAlta = notas[i];
            }
           
        }
        System.out.println("La nota mas alta " + notaAlta);
    }
    
   
    
    public void Aprobados(String nombres[], int notas[]){
        System.out.println("Aprobados:");
        int num = 0;
        for (int i = 0; i < notas.length; i++){
            if(notas[i] >= 5){
                System.out.println((i+1) + " alumno: " + nombres[i] + " tiene un " + notas[i]);
                num = 1;
            }
        }
        if (num == 0){
            System.out.println("Nadie aprobado");
        }
    }
      public void NotaFinal(String nombres[], int notas[]){
        String nombreAlum = IntroduceDatos.getString("Escribe el nombre del alumno");
        int num = 0;
        for(int i = 0; i < nombres.length; i++){
            if(nombres[i].equalsIgnoreCase(nombreAlum)){
                System.out.println(nombres[i] + " Su nota es" + notas[i] );
                num = 1;
            }
        }
        if(num == 0){
            System.out.println("No se ha encontrado el nombre");
        }
    }
    
    public void List(String nombres[], int notas[]){
        String auxN;
        int aux;
        for(int i = 0; i < cuenta-1; i++){
            for(int j = i+1; j < cuenta ; j++){
                if(notas[i] > notas[j]){
                    aux = notas[i];
                    auxN = nombres[i];
                    notas[i] = notas[j];
                    nombres[i] = nombres[j];
                    notas[j] = aux;
                    nombres[j] = auxN;
                }
            }
        }
        System.out.println("Lista ordenada:");
        for(int i = 0; i < notas.length; i++){
            System.out.println(nombres[i] + ":" + notas[i]);
        }
    }
    
    public void LetraNIF(){
        long num;
        num = IntroduceDatos.Introducelong("Escribe el numero de tu NIF");
        while(num < 10000000 || num > 100000000){
            num = IntroduceDatos.Introducelong("El numero de tu NIF contiene 8 digitos, La primera combinacion posible seria 10000000");
        }
        float div = num%23;
        int resto = (int) div;
        char letra[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        for (int i = 0; i<letra.length; i++){
            if (resto == i){
                System.out.println("La letra de tu NIF es: " + letra[i]);
            }
        }
    }
}