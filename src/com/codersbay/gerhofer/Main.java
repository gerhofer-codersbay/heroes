package com.codersbay.gerhofer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<RPGCharacter> allCharacters = new ArrayList<>();

        Wizard gandalf = new Wizard("Gandalf");
        Dwarf gimli = new Dwarf("Gimli");
        Elf legolas = new Elf("Legolas");
        Warrior aragon = new Warrior("Warrior");

        Dragon smaug = new FieryDragon("Smaug");
        Troll troll1 = new Troll("troll", "green");

        DarkElf evilElf = new DarkElf("EvilKnievel");
        // view dark elf as elf and you can not call isEvil anymore
        ((Elf) evilElf).shootArrow();
        // view dark elf as dark elf and you can call isEvil
        evilElf.isEvil();

        allCharacters.add(gandalf);
        allCharacters.add(gimli);
        allCharacters.add(legolas);
        allCharacters.add(aragon);
        allCharacters.add(smaug);
        allCharacters.add(troll1);
        allCharacters.add(evilElf);

        for (RPGCharacter character: allCharacters) {
            if (character instanceof Wizard) {
                ((Wizard) character).makeMagic();
            }
            if (character instanceof Elf) {
                ((Elf) character).shootArrow();
                if (character instanceof DarkElf) {
                    ((DarkElf) character).isEvil();
                }
            }
        }

        IceDragon icy = new IceDragon("icy");
        icy.spew();
        icy.roar();

        takePhoto(aragon);
        takePhoto(gandalf);
        takePhoto(troll1);

        captureMonster(troll1);
        captureMonster(icy);

        //exceptionHandlingExample();
    }

    private static void captureMonster(Monster monster) {
        monster.roar();
        System.out.println("captured monster :)");
    }

    private static void takePhoto(Hero someHero) {
        someHero.pose();
        System.out.println("taking picture");
    }

    private static void exceptionHandlingExample() {
        try {
            iCanCauseSilentTrouble(2);
            iCanCauseTrouble(2);
        } catch (LoudException e) {
            System.out.println("Loud exception but recovered");
            //e.printStackTrace();
        }

        try {
            iCanCauseSilentTrouble(3);
            iCanCauseTrouble(3);
        } catch (LoudException e) {
            System.out.println("Loud Exception but recovered");
            //e.printStackTrace();
        } catch (SilentException e) {
            System.out.println("Silent Exception but recovered");
            //e.printStackTrace();
        }

        System.out.println("My program is happy :)");
    }

    public static void iCanCauseTrouble(int i) throws LoudException {
        if (i % 2 == 0) {
            // I don't like even numbers
            throw new LoudException();
        }
    }

    public static void iCanCauseSilentTrouble(int i) throws SilentException {
        if (i % 2 == 1) {
            // I don't like odd numbers
            throw new SilentException();
        }
    }

}
