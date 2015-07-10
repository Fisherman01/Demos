package nl.test.ui;

import nl.test.model.impl.Sherman;
import nl.test.model.impl.Tiger;

/**
 * 
 * @author Arno Visser
 * 
 */

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Tiger tiger = new Tiger();
        Sherman sherman = new Sherman();

        System.out.println("creating tanks.....");
        System.out.println("tanks meet on battlefield.......");
        System.out.println("tank 1: " + sherman.getName());
        System.out.println("tank 2: " + tiger.getName());
        System.out.println("tank 1 shoots   " + sherman.shootGun());
        System.out.println("tank 2 shoots   " + tiger.shootGun());

        String s = "22 apcr";
        Tiger tiger2 = new Tiger(s);
        System.out.println("creating new tank........adding 22 rounds of apcr");
        System.out.println("tank is:   " + tiger2.getName());
        System.out.println("ammo loadout:   " + tiger2.getAmmo());

        Tiger tiger3 = new Tiger();
        System.out.println("creating new tank........adding no ammo");
        System.out.println("tank is:   " + tiger3.getName());
        System.out.println("ammo loadout:   " + tiger3.getAmmo());
        System.out.println("Woooops....let's hope you don't run in to some enemy tanks");
    }
}
