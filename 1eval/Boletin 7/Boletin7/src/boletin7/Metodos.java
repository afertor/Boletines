package boletin7;

public class Metodos {

    public void numPositivo(int num){
        if(num >= 0){
            System.out.println(num + "Es positivo");
        }else{
            System.out.println("Es negativo");
        }
    }


    public void sumaResta(short num1, short num2){
        if(num1 >= num2){
            System.out.println("La resta es " + (num1 -num2));
        }else {
            System.out.println("La suma es " + (num1 +num2));
        }
    }

    public void positivoNegativo(short num1){
        if (num1 >0){
            System.out.println("+ " +num1);
        } else if (num1 == 0) {
            System.out.println(" es " + num1);
        }else {
            System.out.println( "- " +num1);
        }
    }

    public void pesoPerson(short peso1,short peso2){
        if (peso1 > peso2){
            System.out.println("la persona 1 pesa más que al persona 2");
            System.out.println("La diferencia de peso es " + (peso1 -peso2));
        }else if(peso2 > peso1) {
            System.out.println("La persona 2 pesa más que la persona 1");
            System.out.println("La diferencia de peso es " + (peso2 -peso1));
        }else {
            System.out.println("Ambas personas pesan lo mismo");
        }
    }

    public void tresNum(short num1,short num2,short num3){
        if(num1 > num2 && num1 > num3){
            System.out.println("el numero 1 es mayor");
        } else if (num2 >num1 && num2 > num3) {
            System.out.println("el numero 2 es el mayor");
        }else {
            System.out.println("el numero 3 es el mayor");
        }
    }
}