package com.codersbay.gerhofer;

public abstract class Dragon extends RPGCharacter implements Monster {

    protected Integer age;

    public Dragon(String name,
                  Integer age) {
        this.name = name;
        this.age = age;
    }

    public abstract void spew();

    public void fly() {
        System.out.println("flies away");
    }

    @Override
    public void roar() {
        System.out.println("roaaar - I'm a dragon.");
    }
}
