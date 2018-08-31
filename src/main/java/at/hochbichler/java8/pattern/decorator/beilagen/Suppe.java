package at.hochbichler.java8.pattern.decorator.beilagen;

import at.hochbichler.java8.pattern.decorator.Beilage;
import at.hochbichler.java8.pattern.decorator.Gericht;

public class Suppe extends Beilage {
    public Suppe(Gericht gericht) {
        super(gericht);
    }

    @Override
    public double getPreis() {
        return gericht.getPreis() + 1.5;
    }

    @Override
    public void druckeBeschreibung() {
        gericht.druckeBeschreibung();
        System.out.println(", Suppe");
    }
}
