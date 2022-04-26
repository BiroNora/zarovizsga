package com.codecool.farm;

import com.codecool.farm.animal.Animal;
import com.codecool.farm.animal.Pig;

import java.util.ArrayList;
import java.util.List;

class Farm {
    List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).feed();
        }
    }

    public void butcher(Butcher butcher) {
        for (int i = 0; i < animals.size(); i++) {
            if (butcher.canButcher(animals.get(i))) {
                animals.remove(i);
            }
        }
    }

    public boolean isEmpty() {
        return animals.size() < 1;
    }

    public List<String> getStatus() {
        List<String> myAnimals = new ArrayList<>();
        String size = " ";
        for (Animal animal : animals) {
            StringBuilder sb = new StringBuilder();
            sb.append("There is a ");
            sb.append(String.valueOf(animal.getSize()));
            sb.append(" sized ");
            if (animal instanceof Pig) {
                sb.append("pig");
            } else {
                sb.append("cattle");
            }
            sb.append(" in the farm.");
            myAnimals.add(String.valueOf(sb));
        }
        return myAnimals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
