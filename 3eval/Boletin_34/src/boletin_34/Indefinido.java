package boletin_34;

import boletin_34.Empleados;
import java.time.LocalDate;

public class Indefinido extends Empleados {

    private int clientescap;

    public Indefinido(String dni, String nombre, String apellidos, int clientesCap, double salarBase, LocalDate fechaIngreso) {
        super(dni, nombre, apellidos, salarBase, fechaIngreso);
        this.clientescap = clientesCap;

    }
    
    public int getClientescap() {
        return clientescap;
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.clientescap = clientesCaptados;
    }

    @Override
    public double calcularSalar() {
        return super.getSalarBase() + (clientescap * 100);

    }

    @Override
    public String toString() {
        return super.toString() +"\nClientes Contratados: "+ clientescap;
    }

}
