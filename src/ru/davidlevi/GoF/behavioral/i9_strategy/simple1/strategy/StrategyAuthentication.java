package ru.davidlevi.GoF.behavioral.i9_strategy.simple1.strategy;

/**
 * Класс StrategyAuthentication определяет стратегию аутентификации
 */
public interface StrategyAuthentication {
    boolean checkLogin(String name, String password); // стратегия поведния
}
