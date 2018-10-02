package ru.davidlevi.GoF.behavioral.i9_strategy.simple2.strategy;

public class Add implements StrategyCalculate {
    public int execute(int a, int b) {
        System.out.println("Called Add's execute()");
        return a + b;  // Do an addition with a and b
    }
}
