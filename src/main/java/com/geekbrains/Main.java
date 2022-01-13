package com.geekbrains;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);

        cat.eat(plate);
        plate.info();
    }
}
