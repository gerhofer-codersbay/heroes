package com.codersbay.gerhofer;

public class Troll extends RPGCharacter implements Monster, Hero {

    private String color;

    public Troll(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void throwRock() {
        System.out.println("Throws rock");
    }

    @Override
    public void pose() {
        System.out.println("Make handstand");
    }

    @Override
    public void roar() {
        System.out.println("wraaah - I'm a troll");
    }
}
