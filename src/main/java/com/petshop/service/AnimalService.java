package com.petshop.service;

import com.petshop.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {
    public List<Animal> getAnimaux(){
        List<Animal> animaux = new ArrayList<>();
        Animal a1 = new Animal(1,"Rex","Chien", 300);
        animaux.add(a1);
        Animal a2 = new Animal(2,"Mia","Chat", 90);
        animaux.add(a2);
        Animal a3 = new Animal(3,"Penguin","Chien", 250);
        animaux.add(a3);
        Animal a4=new Animal(4,"Pep","Oiseau", 100);
        animaux.add(a4);
        return animaux;
    }
    public Animal getAnimalById(int id){
        List<Animal> animaux = getAnimaux();
        for(Animal a : animaux){
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }
}
