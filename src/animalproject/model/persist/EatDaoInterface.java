/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject.model.persist;

import animalproject.model.Eat;
import java.util.List;

/**
 *
 * @author Waner Kevin
 */
public interface EatDaoInterface {
    List<Eat> selectAllEat();
}
