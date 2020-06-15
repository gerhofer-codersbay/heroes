package com.codersbay.gerhofer;

public class FairyDragon extends Dragon {

    public FairyDragon(String name) {
        super(name, 5);
    }

    @Override
    public void spew() {
        System.out.println("spews mana");
    }

    public void cuteness() {
        System.out.println("cuteness overload");
    }
}
