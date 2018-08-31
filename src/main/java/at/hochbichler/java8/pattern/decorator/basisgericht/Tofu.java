package at.hochbichler.java8.pattern.decorator.basisgericht;

import at.hochbichler.java8.pattern.decorator.Gericht;

public class Tofu implements Gericht {
    @Override
    public double getPreis() {
        return 8.5;
    }

    @Override
    public void druckeBeschreibung() {
        System.out.println("Tofu");
    }
}
