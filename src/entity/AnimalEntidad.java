/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import service.AnimalInterface;


public class AnimalEntidad {
    
    protected String nombre;
    protected String raza;
    protected int edad;
    protected String alimento;

    public AnimalEntidad(String nombre, String raza, int edad, String alimento) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.alimento = alimento;
    }

    public AnimalEntidad() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "AnimalEntidad{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", alimento=" + alimento + '}';
    }

   
    
    
    
}
