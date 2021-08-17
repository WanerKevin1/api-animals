/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

import animalproject.model.Animal;
import animalproject.model.Model;
import java.util.List;

/**
 *
 * @author Waner Kevin
 */
public class AnimalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Model model = new Model();
        Animal newAnimal = new Animal(6, "Pez gato", "Algas");
        
        boolean added = model.addAnimal(newAnimal);
        if(added){
            System.out.println("Se ha añadido correctamente! ");
        }else{
            System.out.println("No se ha podido añadir el Animal");
            System.out.println("Por favor comprueba que los parametros esten correctos");
        }
        
        List<Animal>allAnimals = model.findAllAnimals();
        System.out.println("Lista de todos los animales-> ");
        displayAnimals(allAnimals);
        
        
        String name = "Leon";
        List <Animal> likeName = model.findLikeName(name);
        System.out.println("Lista de animales con el nombre 'Leon' ->");
        displayAnimals(likeName);
        
        int id = 1;
        Animal likeID = model.findLikeId(id);
        System.out.println("Listar animal por ID (1) -> ");
        displayAnimal(likeID);
        
        
     
          
    }
    

    private static void displayAnimals(List<Animal> data) {
        if(data.size() > 0){
            System.out.println(data.toString());
        }else{
            System.out.println("No se han encontrado coinidencias");
        }
    }

    private static void displayAnimal(Animal data) {
        if(data != null){
            System.out.println(data.toString());
        }else{
            System.out.println("No se han encontrado coindicendiaas");
        }
    }
    
    
    
}
