package com.codersbay.gerhofer;

public class Warrior extends RPGCharacter implements Hero {

    public Warrior(String name) {
        this.name = name;
    }

    public void fightWithSword() {
        System.out.println("Swings sword");
    }

    @Override
    public void pose() {
        System.out.println("pose with sword");
    }
}
