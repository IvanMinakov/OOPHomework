package org.example.units;
import org.example.BaseHero;

public abstract class Shooter extends BaseHero {
    int accurance;
    int ammoreserve;
    public Shooter(String name, int x, int y, int def, int [] dmg, float hP) {
        super(name, x,y,def,dmg, hP);
        this.accurance = accurance;
        this.ammoreserve = ammoreserve;

    }

}
