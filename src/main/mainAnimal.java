/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.AnimalEntidad;
import entity.GatoEntidad;
import entity.PerroEntidad;
import java.util.ArrayList;
import entity.CaballoEntidad;
import implement.AnimalServiceImplement;

/**
 *
 * @author Gabi
 */
public class mainAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ArrayList<AnimalEntidad> animales = new ArrayList();
        
        AnimalServiceImplement nuevoServicioAnimal = new AnimalServiceImplement();
        
        animales.add(new PerroEntidad(true, "Thor", "ovejero", 2, "Lomo Beteado"));
       
        AnimalEntidad nuevoPerro = nuevoServicioAnimal.crearAnimal();
        
       
        
        //animales.add(new CaballoEntidad().crearCaballo());
        
        
//        for (AnimalEntidad animal : animales) {
//            System.out.println(animal);
//        }
        
        
    }
    
}
