package com.codersbay.gerhofer;

public class Wizard extends RPGCharacter implements Hero {

    public Wizard(String name) {
        this.name = name;
    }

    public void makeMagic() {
        System.out.println("Apply magic!");
    }

    @Override
    public void pose() {
        System.out.println("show magic wand");
    }
}
