package at.hochbichler.java8.pattern.decorator.basisgericht;

import at.hochbichler.java8.pattern.decorator.Gericht;

class WienerSchnitzel implements Gericht {
    public void druckeBeschreibung() {
        System.out.print("WienerSchnitzel");
    }

    public double getPreis() {
        return 10.50;
    }
}
