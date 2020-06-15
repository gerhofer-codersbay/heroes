package com.codersbay.gerhofer;

public class FieryDragon extends Dragon {

    public FieryDragon(String name) {
        super(name, 100);
    }

    @Override
    public void spew() {
        System.out.println("spews fire");
    }
}
