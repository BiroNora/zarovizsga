package com.codecool.farm.animal;

public class Pig extends Animal {
    private int size;
    @Override
    public void feed() {
        size = getSize() + 1;
    }

    @Override
    public int getSize() {
        return size;
    }
}
