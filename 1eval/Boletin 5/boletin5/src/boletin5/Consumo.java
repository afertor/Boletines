/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin5;

/**
 *
 * @author Adrian
 */
public class Consumo {
    private int km;
    private int litros;
    private int vMed;
    private float pGas;
    
    public Consumo(){
    }
        public Consumo(int km, int litros, int vMed,float pGas){
            this.km= km;
            this.litros = litros;
            this.vMed = vMed;
            this.pGas = pGas;
        }
        //metodos
        public float getTiempo(){
            return(1/vMed*km);
        }
   public float consumoMedio(){
       return (litros * 100/km);
   }
   public float consumoEuros(){
       return (litros*100/km);
   }
   public void consumoKms(int km){
       this.km = km;
   }
   public void setLitros(int litros){
       this.litros = litros;
   }
   public void setVMed(int vMed){
       this.vMed = vMed;
   }
   public int getVMed(){
       return vMed;
   }
   public void setPGas(float pGas){
       this.pGas = pGas;
   }
}
