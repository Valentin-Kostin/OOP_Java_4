package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private final ArrayList<T> fruits;
    private  float weight;


    public ArrayList<T> getFruits() {
        return fruits;
    }

    public Box() {
        fruits = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }

    public void add(T f) {
        fruits.add(f);
    }
}
