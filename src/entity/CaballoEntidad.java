/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Scanner;
import service.AnimalInterface;

/**
 *
 * @author Gabi
 */
public class CaballoEntidad extends AnimalEntidad {
    
    
    private boolean herraduras;

    public CaballoEntidad() {
    }

    
    public CaballoEntidad(boolean herraduras, String nombre, String raza, int edad, String alimento) {
        super(nombre, raza, edad, alimento);
        this.herraduras = herraduras;
    }

    public boolean isHerraduras() {
        return herraduras;
    }

    public void setHerraduras(boolean herraduras) {
        this.herraduras = herraduras;
    }

    @Override
    public String toString() {
        return super.toString() + "GatoEntidad{" + "herraduras=" + herraduras + '}';
    }

   
    
    
    
    
}
