package ru.davidlevi.GoF.structural.i5_adapter.simple3;

/**
 * Шеф-повар и его поведения
 */
interface Chief {
    Object makeBreakfast(); // готовит завтрак

    Object makeLunch(); // готовит обед

    Object makeDinner(); // готовит ужин
}
