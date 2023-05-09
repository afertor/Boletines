package boletin_34;

import java.time.LocalDate;

public  abstract  class   Empleados {
    private String dni;
    private String nombre;
    private String apellidos;
    private double salarBase;
    private LocalDate fechaIngreso;

    public Empleados(String dni, String nombre, String apellidos,double salarBase, LocalDate fechaIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarBase= salarBase;
        this.fechaIngreso= fechaIngreso;
    
    }
   

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalarBase() {
        return salarBase;
    }

    public void setSalarBase(double salarioBase) {
        this.salarBase = salarBase;
    }
    

    public LocalDate  getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate  fechaDeIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public abstract double calcularSalar();

    @Override
    public String toString() {
        return  "\nDNI:" + dni + "\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nSalario base: " +salarBase+ "€" + "\nFecha de Contratacion : " +fechaIngreso ;
    }
    
    
    
}
