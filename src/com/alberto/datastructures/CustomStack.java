package com.alberto.datastructures;

public class CustomStack {
    private static final int CAPACIDAD_INICIAL = 5;
    public int lenght = 0;

    private CustomCollection collection = new CustomCollection (CAPACIDAD_INICIAL);

    public void push(int element) {

        collection.insert(element, 0);
        lenght++;
    }

    public int pop() {
        return (int) collection.delete(0);
    }
}
