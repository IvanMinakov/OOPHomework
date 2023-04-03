package org.example.units;
import org.example.BaseHero;

public class Crossbowman extends BaseHero {

    int quoinBolt, maxQuoinBolts, accuracy;


    public Crossbowman(String name, int x, int y, int atk, int [] dmg, float hP) {
        super (name, x, y, atk, dmg, hP);
        quoinBolt = maxQuoinBolts = 10;
        accuracy = 70;
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик!";
    }
}