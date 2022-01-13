package com.geekbrains;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        food -= appetite;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }
}
