/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject.model;

import animalproject.model.persist.AnimalDaoInterface;
import animalproject.model.persist.AnimalDaoList;
import java.util.List;

/**
 *
 * @author Waner Kevin
 */
public class Model {
    private final AnimalDaoInterface animalDao;
    
    
    public Model(){
        animalDao = AnimalDaoList.getInstance();
    }
    
    /**
     * Find all animals
     * @return a list of Animals or null in case of error
     */
    public List<Animal> findAllAnimals(){
       List<Animal> data = null;
       return data = animalDao.selectAll();
       //return data;
    }
    
    /**
     * Find animals by name
     * @param name
     * @return a list of Animals or null in case of error
     */
    public List<Animal> findLikeName(String name){
        if(name != null){
            List <Animal> data = null;
            return data = animalDao.selectLikeName(name);
            //return data;
        }else{
            return null;
        }
    }
    
    /**
     * Find animals by name
     * @param eat
     * @return a list of Animals or null in case of error
     */
    public List<Animal> findByEat(String eat){
        if(eat != null){
            List<Animal> data = null;
            return data = animalDao.selectLikeEat(eat);
        }else{
            return null;
        }
    }
    
    
    /**
     * Find animal by ID
     * @param id
     * @return 
     */
    public Animal findLikeId(int id){
        Animal data = null;
        return data = animalDao.selectLikeID(id);    
    }
    
    /**
     * Add new animal in the list
     * @param animal
     * @return boolean, true in case correct and false in case of fail 
     */
    public boolean addAnimal(Animal animal){
        if (animal != null && animal.getName() != null && animal.getEat()!= null) {
            boolean result = false;
            result = animalDao.insert(animal);
            return result;
        } else {
            return false;
        }
    }
    
    
}
