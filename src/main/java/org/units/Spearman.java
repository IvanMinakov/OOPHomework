package org.example.units;

import org.example.BaseHero;

public class Spearman extends BaseHero {
    int accuracy; //точность удара
    int quoinSpears, maxQuoinSpears; // количество копьев, макс. кол-во копьев
    float backSpears; // скорость восстановления запаса копьев
    public Spearman(String name, int x, int y, int atk, int [] dmg, float hP) {
        super(name, x, y, atk, dmg, hP);
        accuracy = 30;
        quoinSpears = maxQuoinSpears = 10;
        backSpears = 1.01F;
    }

    @Override
    public String getInfo() {
        return "Я копейщик";
    }
}
