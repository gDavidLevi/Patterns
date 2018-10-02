package ru.davidlevi.GoF.behavioral.i9_strategy.simple2.strategy;

public class Multiply implements StrategyCalculate {
    public int execute(int a, int b) {
        System.out.println("Called Multiply's execute()");
        return a * b;   // Do a multiplication with a and b
    }
}
