package com.petshop.model;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Animal> listeAnimaux;
    public Panier(){
        this.listeAnimaux = new ArrayList<>();
    }
    public List<Animal> getListeAnimaux() {return listeAnimaux;}
    public void ajouterAnimal(Animal a){
        this.listeAnimaux.add(a);
    }

    public double getTotal(){
        double total = 0;
        for(Animal a : listeAnimaux){
            total += a.getPrix();
        }
        return total;
    }
    public void retirerAnimal(int id){
        this.listeAnimaux.removeIf(a -> a.getId() == id);
    }
    public void viderPanier(){
        this.listeAnimaux.clear();
    }

}
