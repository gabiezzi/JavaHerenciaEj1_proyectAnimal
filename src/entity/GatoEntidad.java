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
public class GatoEntidad extends AnimalEntidad {
    
    private boolean triquinosis;

    public GatoEntidad(boolean triquinosis, String nombre, String raza, int edad, String alimento) {
        super(nombre, raza, edad, alimento);
        this.triquinosis = triquinosis;
    }

    public boolean isTriquinosis() {
        return triquinosis;
    }

    public void setTriquinosis(boolean triquinosis) {
        this.triquinosis = triquinosis;
    }

   @Override
    public String toString() {
        
        return super.toString() + "{" + "triquinosis=" + triquinosis + '}';
    }
    
    
    
}
