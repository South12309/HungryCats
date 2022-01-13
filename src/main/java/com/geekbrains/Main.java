package com.geekbrains;

public class Main {
    public static void main(String[] args) {


        Plate plate = new Plate(30);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Cat1", 10);
        cats[1] = new Cat("Cat2", 10);
        cats[2] = new Cat("Cat3", 10);
        cats[3] = new Cat("Cat4", 10);
        cats[4] = new Cat("Cat5", 10);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.printSatiety();
        }

    }
}
