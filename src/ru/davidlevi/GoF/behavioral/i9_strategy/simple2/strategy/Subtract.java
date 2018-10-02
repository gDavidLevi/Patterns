package ru.davidlevi.GoF.behavioral.i9_strategy.simple2.strategy;

public class Subtract implements StrategyCalculate {
    public int execute(int a, int b) {
        System.out.println("Called Subtract's execute()");
        return a - b;  // Do a subtraction with a and b
    }
}
