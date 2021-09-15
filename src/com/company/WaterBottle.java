package com.company;

import com.company.Main.waterLevel;


public class WaterBottle {
    boolean closed;
    waterLevel level;

    WaterBottle() {
        System.out.println("new water bottle created, keep hydrated");
        closed = true;
        level = waterLevel.EMPTY;
    }

    public void lidStatus() {
        if (closed) {
            System.out.println("Lid is currently closed please open before drinking");
        } else {
            System.out.println("Lid is currently open, feel free to drink");
        }
    }

    public void closeBottle() {
        closed = true;
        lidStatus();
    }

    public void openBottle() {
        closed = false;
        lidStatus();
    }

    public void fillWaterBottle() {
        System.out.println("Filling bottle");
        for (waterLevel lvls : waterLevel.values()) {
            System.out.println(lvls);
            level = lvls;
        }
        System.out.printf("Water bottle is currently , %s", level);
    }

    public void drinkWater() {
        if (closed) {
            lidStatus();
        } else if (level == waterLevel.EMPTY) {
            System.out.printf("Water level is currently, %s, fill water bottle with water\n", level);
        } else {
            adjustWaterLevel();
        }
    }

    public void adjustWaterLevel() {
        System.out.println("water goes glug glug :)");
        waterLevel[] vals = waterLevel.values();
        System.out.println();
        System.out.println();
        int index = getWaterLevelIndex();
        level = vals[index];
    }

    public int getWaterLevelIndex() {
        int Index = 0;
        waterLevel[] arrOfLvls = waterLevel.values();
        for (int index = 0; index < waterLevel.values().length; index++) {
            if (arrOfLvls[index] == level) {
                Index = index - 1;
            }
        }
        return Index;
    }
}
