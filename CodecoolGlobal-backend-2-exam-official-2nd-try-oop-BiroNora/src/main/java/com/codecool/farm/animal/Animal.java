package com.codecool.farm.animal;

public abstract class Animal {
    private int size;

    public Animal() {
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public abstract void feed();
}
