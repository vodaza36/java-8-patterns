package at.hochbichler.java8.pattern.decorator.beilagen;

import at.hochbichler.java8.pattern.decorator.Beilage;
import at.hochbichler.java8.pattern.decorator.Gericht;

public class Pommes extends Beilage {
    public Pommes(Gericht gericht) {
        super(gericht);
    }

    @Override
    public double getPreis() {
        return gericht.getPreis() + 2.5;
    }

    @Override
    public void druckeBeschreibung() {
        gericht.druckeBeschreibung();
        System.out.println(", Pommes");
    }
}
