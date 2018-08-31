package at.hochbichler.java8.pattern.decorator;

public abstract class Beilage implements Gericht {
    protected  Gericht gericht;

    public Beilage(Gericht gericht) {
        this.gericht = gericht;
    }
}
