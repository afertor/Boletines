
package boletin4;

public class Libro {
   private String titulo;
   private String autor;
   private int ano;
   private short numPag;
   private float valoracion;

public Libro(String titulo,String autor,int ano,short numPaginas,float valoracion){
    this.titulo = titulo;
    this.autor=autor;
    this.ano=ano;
    this.numPag=numPaginas;
    this.valoracion=valoracion;
}

   public Libro(){
       
   }
   

   public String getTitulo(){
       return titulo;
   }
   public String getAutor(){
       return autor;
   }
   public int getAnho(){
       return ano;
   }
   public short getNumPaginas(){
       return numPag;
   }
   public float getValoracion(){
       return valoracion;
   }
   
   public void setTitulo(String titulo){
       this.titulo = titulo;
   }
    
   public void setAutor(String autor){
       this.autor = autor;
   }
   
   public void setAnho(int anho){
       this.ano=ano;
   }
   
   public void setNumPaginas(short numPaginas){
       this.numPag= numPaginas;
      
   }
   
   public void setValoracion(float valoracion){
       this.valoracion=valoracion;
   }
   
   
   
   
  
   public void mostrarCaracteristicas(){
       System.out.println("El titulo es: " + titulo);
       System.out.println("El autor del libro es: " + autor);
       System.out.println("El libro es del año " + ano);
       System.out.println("El libro tiene " + numPag + " páginas");
       System.out.println("El libro tiene una valoración de " + valoracion);
          
   }
   
  
}