
package com.computer.ordenador;
import computer.partes.Cpu;
import computer.partes.Monitor;
import computer.partes.Teclado;

public class Ordenador {

    public static void main(String[] args) {
        Computer pc1 = new Computer();
        Cpu AMD = new Cpu(6);
        pc1.setTipoCpu(AMD);
        Monitor AOC = new Monitor(45f);
        pc1.setTipoMonit(AOC);
        Teclado razer = new Teclado("Asus");
        pc1.setTipoTeclad(razer);
        pc1.setPrecio(1000f);
        

        System.out.println("datos del ordenador : "  + pc1.toString() );
        System.out.println("precio del ordenador : "  + pc1.getPrecio());
        System.out.println("marca del teclado: " +  razer.getMarca());
        System.out.println("velocidad de la cpu" +  AMD.getVelocidad());
        
    }
}