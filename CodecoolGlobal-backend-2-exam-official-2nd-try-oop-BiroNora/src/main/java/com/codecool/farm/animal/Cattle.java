package com.codecool.farm.animal;

public class Cattle extends Animal {
    private int size;
    @Override
    public void feed() {
        size = getSize() + 2;
    }

    @Override
    public int getSize() {
        return size;
    }
}
