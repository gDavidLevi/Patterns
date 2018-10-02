package ru.davidlevi.GoF.behavioral.i9_strategy.simple2.context;

import ru.davidlevi.GoF.behavioral.i9_strategy.simple2.strategy.StrategyCalculate;

/**
 * Класс Calculate использующий интерфейс стратегии
 */
public class Calculate {
    private StrategyCalculate strategy;

    /**
     * Метод устнанавливает стратегию
     *
     * @param strategy StrategyCalculate
     */
    public void setStrategy(StrategyCalculate strategy) {
        this.strategy = strategy;
    }

    /**
     * Метод исполняет стратегию
     *
     * @param a int
     * @param b int
     * @return int
     */
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
