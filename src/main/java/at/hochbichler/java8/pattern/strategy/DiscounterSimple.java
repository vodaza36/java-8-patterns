package at.hochbichler.java8.pattern.strategy;

import java.math.BigDecimal;

public interface DiscounterSimple {
    BigDecimal applyDiscount(BigDecimal amount);

    static DiscounterSimple christmasDisacounter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.9));
    }

    static DiscounterSimple newYearDiscounter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.8));
    }

    static DiscounterSimple easterDiscounter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.5));
    }
}
