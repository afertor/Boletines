
package boletin4;


public class Boletin4 {

  public static void main(String[] args) {
        // TODO code application logic here
        
        Libro lib1 = new Libro("titulo1","autor1",1000,(short)111,8f);
        Libro lib2 = new Libro();
        lib2.setTitulo("titulo1");
        lib2.setAutor("autor 2");
        lib2.setAnho(2000);
        lib2.setNumPaginas((short)222);
        lib2.setValoracion(9f);
        lib1.mostrarCaracteristicas();
        System.out.println("");
        System.out.println("");
        lib2.mostrarCaracteristicas();
        System.out.println("");
        System.out.println("");
        lib2.setNumPaginas((short)333);
        lib2.mostrarCaracteristicas();
        

    }
    
}