
package boletin22;
import Datos.IntroduceDatos;


public class Boletin22 {

    public static void main(String[] args) {
        int num;
        int [][]Goles = null;
        int []Jornadas;
        Metodo obx = new Metodo();
        Goles= obx.ArraydeGoles();
       Jornadas = obx.Jornadas();
        do{
            num = IntroduceDatos.Introduceint("1. Mostrar tabla\n2. Ordenado por los goles maximos\n3. Equipo con mas goles\n4. Equipo y jornada en la que hubo mas goles\n5. Mostrar equipo y jornada introduciendo numero de goles\n6. Salir ");
            switch(num){
                case 1:
                    obx.Table(Jornadas, obx.equipos, Goles);
                    break;
                case 2:
                    obx.TablaOrdenada(obx.equipos, Goles);
                    break;
                case 3:
                    obx.MaximoGoleador(obx.equipos, Jornadas, Goles);
                    break;
                case 4:
                    obx.EquipoMaxGolJornada(obx.equipos, Jornadas, Goles);
                    break;
                case 5:
                   obx.EquipoJornadaPorGoles(obx.equipos, Jornadas, Goles);
                    break;
                case 6:System.exit(num);
                default:
            }
            
        }while(num>0);
    }
    
}