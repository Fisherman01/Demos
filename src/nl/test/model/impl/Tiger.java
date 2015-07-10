package nl.test.model.impl;

import nl.test.model.Tank;

/**
 * 
 * @author Arno Visser
 * 
 */

public class Tiger implements Tank {

    private String name = "Tiger";
    private String report = "8.8 cm KwK 36 L/56 says: Booooom you are dead";
    private String ammo = "0";

    public Tiger() {
        super();
    }

    public Tiger(String ammo) {
        setAmmo(ammo);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String shootGun() {
        return report;
    }

    public void setAmmo(String ammo) {
        this.ammo = ammo;
    }

    public String getAmmo() {
        return ammo;
    }
}
