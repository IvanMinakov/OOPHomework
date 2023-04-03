package org.example.units;

import org.Coordinates;

public class Archer extends Shooter {
    private Coordinates coordinates;

    int quonBullets, maxQuonBullets, accuracy; // количество пуль, макс.кол-во стрел, точность

    float backBullets; // Скорость восстановления запаса стрел

    public Archer(String name, int x, int y, int def, int[] dmg, float hP, int arrowsCount) {
        super(name, x, y, def, dmg, hP, arrowsCount);
        quonBullets = maxQuonBullets = 100;
        accuracy = 95;
        backBullets = 1.01F;
        arrows = arrowsCount;
    }

    public Archer(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public boolean isAlive() {
        return hP > 0;
    }
    public boolean hasArrows() {
        return arrows > 0;
    }

    @Override
    public void step(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String getInfo() {
        return "Я лучник";
    }
}