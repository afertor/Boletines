package boletin21;

import Datos.IntroduceDatos;
import javax.swing.JOptionPane;


public class Boletin21 {

    
    public static void main(String[] args) {
       
        Metodos obx1 = new Metodos();
        String NombresAuxi[] = null;
        int number;
        int notasAuxi[] = null;
        int numberAuxi[];
        do{
            number = IntroduceDatos.Introduceint("1. Array numeros aleatorios\n2. Alumnos\n3. Calculo de la letra NIF\n4. Saír");
            switch(number){
                case 1:
                    numberAuxi = obx1.arrayNumeros();
                    obx1.MostrarNumbers(numberAuxi);
                    break;
                case 2:
                    int num = 0;
                    do{
                        num = IntroduceDatos.Introduceint("1. Crear alumno con notas\n2. Numero de aprobados y suspensos\n3. Media de las notas\n4. Mostrar nota más alta\n5. Mostrar nota recibiendo un nombre\n6. Alumnos aprobados\n7. Notas ordenadas de menor a mayor\n8. Salir");
                        switch(num){
                            case 1:
                                notasAuxi = obx1.Notas();
                                NombresAuxi = obx1.Nombre();
                                break;
                            case 2:
                                obx1.MostrarNotas(notasAuxi);
                                break;
                            case 3:
                                obx1.NotaMedia(notasAuxi);
                                break;
                            case 4:
                                obx1.NotaAlta(notasAuxi);
                                break;
                            case 5:
                                obx1.NotaFinal(NombresAuxi, notasAuxi);
                                break;
                            case 6:
                                obx1.Aprobados(NombresAuxi, notasAuxi);
                                break;
                            case 7:
                                obx1.List(NombresAuxi, notasAuxi);
                                break;
                        }
                        
                    }while (num > 0 && num < 8);
                    break;
                case 3:
                    obx1.LetraNIF();
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;                    
            }
        }while(number < 4 && number > 0);
        
    }
    
}