package ru.davidlevi.GoF.structural.i5_adapter.simple2;

/**
 * Шеф-повар и его поведения
 */
public interface Chief {
    Object makeBreakfast(); // готовит завтрак

    Object makeLunch(); // готовит обед

    Object makeDinner(); // готовит ужин
}
