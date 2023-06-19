package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;
import java.util.Random;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {


        Random r = new Random();
        Box<Fruit> apple1 = new Box<>();
        for (int i = 0; i < r.nextInt(10); i++) {
            apple1.add(new Apple());
        }
        System.out.printf("\nЯблок в ящике %s шт\n", apple1.getFruits().size());
        System.out.println(apple1);
        System.out.printf("масса ящика %s\n", weightBox(apple1));

        Random r2 = new Random();
        Box<Fruit> orange1 = new Box<>();
        for (int i = 0; i < r2.nextInt(10); i++) {
            orange1.add(new Orange());
        }
        System.out.printf("\nАпельсинов в ящике %s шт\n", orange1.getFruits().size());
        System.out.println(orange1);
        System.out.printf("масса ящика %s\n", weightBox(orange1));

    }
    public static float weightBox (Box<Fruit> box){
        float weightBox;
        weightBox = box.getFruits().size() * Fruit.getWeight();
        return weightBox;
    }
}
