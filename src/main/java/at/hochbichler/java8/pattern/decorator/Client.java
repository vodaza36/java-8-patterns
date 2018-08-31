package at.hochbichler.java8.pattern.decorator;

import at.hochbichler.java8.pattern.decorator.basisgericht.Hueftsteak;
import at.hochbichler.java8.pattern.decorator.beilagen.Nudeln;
import at.hochbichler.java8.pattern.decorator.beilagen.Salat;

public class Client {
    public static void main(String[] args) {
        Gericht gericht = new Salat(new Nudeln(new Hueftsteak()));
        gericht.druckeBeschreibung();
        System.out.println("Kostet: " + gericht.getPreis());
    }
}
