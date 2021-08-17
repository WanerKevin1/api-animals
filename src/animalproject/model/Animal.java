/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject.model;

/**
 *
 * @author Waner Kevin
 */
public class Animal {
    public int id;
    public String name;
    public String eat;

    public Animal(int id, String name, String eat) {
        this.id = id;
        this.name = name;
        this.eat = eat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "Animal{" + "id=" + id + ", name=" + name + ", eat=" + eat + '}';
        return "Animales -> \n" + "- ID : "+id + "\n - Nombre: " + name + "\n - Comida: " +eat +"\n";
    }

    
    
    
    
}
