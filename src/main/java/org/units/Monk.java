package org.example.units;

import org.example.BaseHero;
public class Monk extends BaseHero {
    int quoinMana, aura;  //количество магии, аура
    float backMana;     // скорость восстановления маны

    public Monk(String name, int x, int y, int atk, int [] dmg, float hP) {
        super(name, x, y, atk, dmg, hP);
        quoinMana = 100;
        backMana = 1.01F;
        aura = 100;
    }

    @Override
    public String getInfo() {
        return "Я монах";
    }
}