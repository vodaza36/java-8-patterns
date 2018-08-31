package at.hochbichler.java8.pattern.decorator.basisgericht;

import at.hochbichler.java8.pattern.decorator.Gericht;

public class Hueftsteak implements Gericht {

    @Override
    public double getPreis() {
        return 13.0;
    }

    @Override
    public void druckeBeschreibung() {
        System.out.println("Hüftsteak");
    }
}
