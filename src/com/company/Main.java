package com.company;


public class Main {
    public enum waterLevel {
        EMPTY,
        ALMOST_EMPTY,
        HALF_FULL,
        ALMOST_FULL,
        FULL
    }

    public static void main(String[] args) {
        WaterBottle myBottle = new WaterBottle();
        myBottle.openBottle();
        myBottle.drinkWater();
        myBottle.fillWaterBottle();
        for (int i = 0; i < 5; i++) {
            myBottle.drinkWater();
            System.out.println(myBottle.level);
        }
    }


}
