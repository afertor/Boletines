package boletin_34;

import boletin_34.Empleados;
import java.time.LocalDate;
import java.time.Period;

public class Contratados extends Empleados {

    public Contratados(String dni, String nombre, String apellidos, double salarBase, LocalDate fechaDeIngreso) {
        super(dni, nombre, apellidos, salarBase, fechaDeIngreso);

    }

    @Override
    public double calcularSalar() {
        double salarioAdicional;

        LocalDate fechaActual = LocalDate.now();

        Period period = super.getFechaIngreso().until(fechaActual);

        int añostotales = period.getYears();

        if (añostotales <= 3) {
            salarioAdicional = 0.05;
        } else if (añostotales <= 7) {
            salarioAdicional = 0.10;
        } else if (añostotales <= 15) {
            salarioAdicional = 0.15;
        } else {
            salarioAdicional = 0.20;
        }
        return super.getSalarBase() * (1 + salarioAdicional);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
