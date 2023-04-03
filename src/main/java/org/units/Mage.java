package org.example.units;

import org.example.BaseHero;

public class Mage extends BaseHero {
    int quoinMana;   //количество маны
    float backMana;     // скорость восстановления маны


    public Mage(String name, int x, int y, int atk, int [] dmg, float hP) {
        super(name, x, y, atk, dmg, hP);
        quoinMana = 100;
        backMana = 1.01F;
    }

    @Override
    public String getInfo() {
        return "Я маг";
    }
}