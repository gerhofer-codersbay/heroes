package com.codersbay.gerhofer;

public class IceDragon extends Dragon {

    public IceDragon(String name) {
        super(name, 500);
    }

    @Override
    public void spew() {
        spew(this.age / 10);
    }

    public void spew(int count) {
        for (int i = 0; i <= count; i++) {
            System.out.println("spew ice");
        }
    }
}
