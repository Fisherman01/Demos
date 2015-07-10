package nl.test.model.impl;

import nl.test.model.Tank;

/**
 * 
 * @author Arno Visser
 * 
 */

public class Sherman implements Tank {
    private String name = "Sherman";
    private String report = "75 mil says: wooooops we just scratched your paint";
    
    public Sherman() {
        super();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String shootGun() {
        return report;
    }
}
