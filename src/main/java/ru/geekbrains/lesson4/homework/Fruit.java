package ru.geekbrains.lesson4.homework;

public abstract  class Fruit {
    protected static float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public static float getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "{weight=" + weight + '}';
    }
}
