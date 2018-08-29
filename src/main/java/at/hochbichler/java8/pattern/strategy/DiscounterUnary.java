package at.hochbichler.java8.pattern.strategy;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

public interface DiscounterUnary extends UnaryOperator<BigDecimal> {
    default DiscounterUnary combine(DiscounterUnary after) {
        return value -> after.apply(this.apply(value));
    }
}
