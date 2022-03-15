/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Gabi
 */
public class PerroEntidad extends AnimalEntidad {
    
    private boolean colaCortada;

    public PerroEntidad(boolean colaCortada, String nombre, String raza, int edad, String alimento) {
        super(nombre, raza, edad, alimento);
        this.colaCortada = colaCortada;
    }

    public PerroEntidad() {
        
    }

    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }

    
    public String toString() {
        return super.toString() + "{" + "cola=" + colaCortada + '}';
    }
    
    
    
    
    
}
