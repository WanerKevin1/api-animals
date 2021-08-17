/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject.model.persist;

import animalproject.model.Animal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Waner Kevin
 */
public class AnimalDaoList implements AnimalDaoInterface{

    public static AnimalDaoList instance;
    
   private final List<Animal> animals;
   
   private static int lastId = 0;
   
   private AnimalDaoList() {
        animals = new ArrayList<>();
        loadTestData();
    }
    
    /**
     * Implements access to singleton object reference.
     *
     * @return instance of object.
     */
    public static AnimalDaoList getInstance(){
        if(instance == null){
            instance = new AnimalDaoList();
        }
        return instance;
    }
    
    /**
     * Get all animals in the list
     * @return the list
     */
    
    @Override
    public List<Animal> selectAll() {
        List<Animal> result = new ArrayList<>();
        for (Animal a: animals) {
            result.add(a);
        }
        return result;
    }

    
    /**
     * Get  animal in base of ID
     * @param id
     * @return Animal
     */
    @Override
    public Animal selectLikeID(int id) {
        Animal result = null;
        for(Animal animal1 : animals){
            if(animal1.getId() == id){
                result = animal1;
            }
        }
        return result;
    }

    /**
     * Select all animals in base of Eat
     * @param eat
     * @return the list
     */
    @Override
    public List<Animal> selectLikeEat(String eat) {
        List<Animal> result = new ArrayList<>();
        for(Animal animal1 : animals){
            if(animal1.getEat().contains(eat)){
                result.add(animal1);
            }
        }
        return result;
    }

    
    /**
     * Get all animas in base of Name
     * @param name
     * @return the list
     */
    @Override
    public List<Animal> selectLikeName(String name) {
        List<Animal> result = new ArrayList<>();
        for(Animal animal1 : animals){
            if(animal1.getName().contains(name)){
                result.add(animal1);
            }
        }
        return result;
    }
    
    /**
     * Inser new animal in the collection
     * @param animal
     * @return boolean, true in case of correct and false in case of fail
     */
    public boolean insert (Animal animal){
        boolean isAdded = true;
        for(Animal animalFound : animals){
            if (animal.getId() == animalFound.getId()){
                isAdded = false;
                break;
            }
        }
        if(isAdded){
            animals.add(animal);
            lastId++;
            
        }
        return isAdded;
    }

    /**
     * Data of testing the app
     */
    private void loadTestData() {
        animals.add(new Animal(1, "Leon", "Carne"));
        animals.add(new Animal(2, "Vaca", "Hierba"));
        animals.add(new Animal(3, "Tiburon", "Peces"));
        animals.add(new Animal(4, "Leon Marino", "Pinguinos"));
        animals.add(new Animal(5,"Perro" ,"Pienso"));
        lastId = 5;
    }
    
}
