package org.example.units;

import org.example.BaseHero;

public class Sniper extends Shooter {
    private Coordinates coordinates;
    int quonBullets, maxQuonBullets, accuracy; // количество пуль, макс.кол-во пуль, точность

    float backBullets; // Скорость восстановления запаса пуль

    public Sniper(String name, int x, int y, int def, int [] dmg, float hP) {
        super (name, x, y, def, dmg, hP);
        quonBullets = maxQuonBullets = 100;
        accuracy = 95;
        backBullets = 1.01F;
    }

    @Override
    public String getInfo() {
        return "Я снайпер";
    }
}