package com.geekbrains;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        int tmpFood = food - appetite;
        if (tmpFood>=0) {
            food = tmpFood;
            return true;
        } else
            return false;
    }

    public void increaseFood(int food) {
        this.food += food;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }
}
