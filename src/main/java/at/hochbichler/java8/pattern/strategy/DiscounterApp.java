package at.hochbichler.java8.pattern.strategy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class DiscounterApp {
    public static void main(String[] args) {
        // use of DiscounterSimple
        BigDecimal discount1 = DiscounterSimple.christmasDisacounter().applyDiscount(BigDecimal.valueOf(100));
        System.out.println("Discount Christmas: " + discount1);

        BigDecimal discount2 = DiscounterSimple.newYearDiscounter().applyDiscount(BigDecimal.valueOf(100));
        System.out.println("Discount New Year: " + discount2);

        BigDecimal discount3 = DiscounterSimple.easterDiscounter().applyDiscount(BigDecimal.valueOf(100));
        System.out.println("Discount Easter: " + discount3);

        // use of UnaryDiscounter
        // List<DiscounterUnary> discounters =Arrays.asList(DiscounterUnary.)
    }
}
