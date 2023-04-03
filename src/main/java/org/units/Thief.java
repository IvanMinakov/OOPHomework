package org.example.units;
import org.example.BaseHero;
public class Thief extends BaseHero {
    boolean stealth, magicResistance; // скрытность, сопротивляемость магии
    int timeStealth, timeResistance;  // время скрытности, время сопротивления магии

    public Thief(String name, int x, int y, int atk, int[] dmg, float hP) {
        super(name, x, y, atk, dmg, hP);
        timeStealth = timeResistance = 60;
        stealth = magicResistance = false;
    }

    @Override
    public String getInfo() {
        return "Я вор!";
    }
}
