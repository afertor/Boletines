package boletin22;

import Datos.IntroduceDatos;


public class Metodo {
    int filas = 20;
    int columnas = 36;
    int [][]goles;
    int []jornadas = new int[columnas];
    String []equipos = {"Barcelona      ", "Real Madrid    ", "Atletico Madrid", "Real Sociedad  ", "Betis          ", "Villareal      ", "Rayo Vallecano ", "Osasuna        ", "Athtletic      ", "Mallorca       ", "Girona         ", "Celta de Vigo  ", "Espanyol       ", "Real Valladolid", "Cadiz          ", "Getafe         ", "Sevilla        ", "Almeria        ", "Valencia       ", "Elche C.F      "};
    
    public int[][] ArraydeGoles(){
        goles = new int[filas][columnas];
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                goles[i][j] = (int) (Math.random()*10);
            }
        }
        return goles;
    }
    
    public int[] Jornadas(){
        for(int i = 0; i < jornadas.length; i++){
            jornadas[i] = (i+1);
        }
        return jornadas;
    }
    
    public void Table(int[] Jornadas, String[] equipos, int[][] goles){
        System.out.print("Equipo/ Jornada |");
        for(int i = 0; i < columnas; i++){
            if(Jornadas[i] < 10){
                System.out.print("  J");
            }
            else{
                System.out.print("  J");
            }
            System.out.print(Jornadas[i]);
        }
        System.out.println("");
        
        for(int i = 0; i < filas; i++){
            System.out.print(equipos[i] + " |   ");
            for(int j = 0; j < columnas; j++){
                System.out.print(goles[i][j]);
                if(j < 9){
                    System.out.print("   ");
                }
                else{
                    System.out.print("    ");
                }
            }
            System.out.println("");
        }
        
    }
    
    public void TablaOrdenada(String[] equipos, int[][] goles){
        int Goles;
        int GolesSuma;
        int[] sumaGoles = new int[goles.length];
        System.out.println("");
        String Equipos;
       
        for(int i = 0; i < goles.length; i++){
            int suma = 0;
            for(int j = 0; j < columnas; j++){
                suma = suma + goles[i][j];
            }
            sumaGoles[i] = suma;
            System.out.println(equipos[i] + " " + sumaGoles[i]);
        }
        
        for(int i = 0; i < goles.length-1; i++){
            for(int j = i+1; j < sumaGoles.length; j++){
                if(sumaGoles[i] > sumaGoles[j]){
                    GolesSuma = sumaGoles[i];
                    sumaGoles[i] = sumaGoles[j];
                    sumaGoles[j] = GolesSuma;
                    Equipos = equipos[i];
                    equipos[i] = equipos[j];
                    equipos[j] = Equipos;
                    
                    for (int k = 0; k < goles[i].length; k++){
                        Goles = goles[i][k];
                        goles[i][k] = goles[j][k];
                        goles[j][k] = Goles;
                    }
                }
                
            }
        }
        System.out.println("\nTabla ordenada\n");
    }
    
    public void MaximoGoleador(String[] equipos, int[] jornadas, int[][] goles){
        int numGoles = 0;
        System.out.println("");
        for (int i = 0; i < jornadas.length; i++){
            for (int j = 0; j < goles.length; j++){
                if(goles[j][i] > numGoles){
                    numGoles = goles[j][i];
                }
            }
            System.out.println("En la jornada " + jornadas[i] + " los goles maximos fueron " + numGoles + " y los marco:" + equipos );
            for (int k = 0; k < goles.length; k++){
                if(goles[k][i] == numGoles){
                    System.out.println(equipos[k]);
                }
            }
            numGoles = 0;
        }
    }
    
    public void EquipoMaxGolJornada(String []equipos, int[] jornadas, int[][] goles){
        int BuscarJornada = IntroduceDatos.Introduceint("Escribe la jornada para saber que equipo marco mas goles");
    }
    
    public void EquipoJornadaPorGoles(String[] equipos, int[] jornadas, int[][] goles){
        int encontrado = 0;
        int numGoles = IntroduceDatos.Introduceint("Escribe el numero de goles");
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                if(numGoles == goles[i][j]){
                    System.out.println("Los " + numGoles + " goles los han marcado en la " + jornadas[j] + "jornada y fue " + equipos[i]);
                    encontrado = 1;
                }
            }
        }
        if(encontrado == 0){
            System.out.println("Nadie marco esos goles");
        }
    }
}