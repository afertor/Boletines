package com.computer.ordenador;

import computer.partes.Cpu;
import computer.partes.Monitor;
import computer.partes.Teclado;

public class Computer {
    private Cpu tipoCpu = new Cpu();
    private Monitor tipoMonit = new Monitor();
    private Teclado tipoTeclad = new Teclado();
    private float precio;
    
    public Computer(){
        
    }
    public Computer(Cpu tipo, Monitor tipoMonit,Teclado tipoTeclad ,float precio){
        this.tipoCpu = tipo;
        this.tipoMonit = tipoMonit;
        this.tipoTeclad =tipoTeclad;
        this.precio = precio;
        
    }

    public Cpu getTipoCpu() {
        return tipoCpu;
    }

    public void setTipoCpu(Cpu tipoCpu) {
        this.tipoCpu = tipoCpu;
    }

    public Monitor getTipoMonit() {
        return tipoMonit;
    }

    public void setTipoMonit(Monitor tipoMonit) {
        this.tipoMonit = tipoMonit;
    }

    public Teclado getTipoTeclad() {
        return tipoTeclad;
    }

    public void setTipoTeclad(Teclado tipoTeclad) {
        this.tipoTeclad = tipoTeclad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Computer{" + "tipoCpu=" + tipoCpu + ", tipoMonit=" + tipoMonit + ", tipoTeclad=" + tipoTeclad + ", precio=" + precio + '}';
    }
    
   
    
}