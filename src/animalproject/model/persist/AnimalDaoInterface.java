/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject.model.persist;

import animalproject.model.Animal;
import java.util.List;

/**
 *
 * @author Waner Kevin
 */
public interface AnimalDaoInterface {
    
    List<Animal> selectAll();
    
    Animal selectLikeID(int id);
    
    List<Animal> selectLikeEat(String eat);
    
    List<Animal> selectLikeName(String name);
    
    boolean insert(Animal animal);
    
    
    
    
}
