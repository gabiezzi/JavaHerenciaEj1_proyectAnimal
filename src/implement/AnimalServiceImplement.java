/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.AnimalEntidad;
import entity.CaballoEntidad;
import java.util.Scanner;
import service.AnimalInterface;

/**
 *
 * @author Gabi
 */
public class AnimalServiceImplement implements AnimalInterface {

    public AnimalEntidad crearAnimal(){
        
        String nombre;
        String raza;
        String alimento;
        int edad;
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Insert nombre");
        nombre = sc.next();
        System.out.println("Insert raza");
        raza = sc.next();
        System.out.println("Insert alimento");
        alimento = sc.next();
        System.out.println("Insert edad");
        edad = sc.nextInt();
        
        
        
        return new AnimalEntidad( nombre, raza, edad, alimento);
        
    }
    
    
    @Override
    public boolean alimentarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
