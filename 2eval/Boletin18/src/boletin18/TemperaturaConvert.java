
package boletin18;

/**
 *
 * @author Adrian
 */
public class TemperaturaConvert {
    
 final float tempConst = 80;   

public float centigradosAFharenheit(float temperatura)throws TempErrorExce{
if (temperatura < tempConst){
throw new TempErrorExce("No puede ser menor que 80 ºC");
}
return temperatura * 9 / 5 + 32;
}

public void centigradosAReamur(float temperatura)throws TempErrorExce{
    if(temperatura < tempConst){
        throw new TempErrorExce("No puede ser menor que 80 ºC");
        
    }
    System.out.println("La temperatura es:  "+ temperatura +"ºC"+"\n Y su conversion de centigrados a Reamur es:  " +(temperatura *4/5)+ "ºR");
    
}
}