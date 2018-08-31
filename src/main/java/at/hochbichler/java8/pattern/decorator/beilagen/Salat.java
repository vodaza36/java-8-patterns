package at.hochbichler.java8.pattern.decorator.beilagen;

import at.hochbichler.java8.pattern.decorator.Beilage;
import at.hochbichler.java8.pattern.decorator.Gericht;

public class Salat extends Beilage {
    public Salat(Gericht gericht) {
        super(gericht);
    }

    @Override
    public double getPreis() {
        return gericht.getPreis() + 2.25;
    }

    @Override
    public void druckeBeschreibung() {
        gericht.druckeBeschreibung();
        System.out.println(", Salat");
    }
}
