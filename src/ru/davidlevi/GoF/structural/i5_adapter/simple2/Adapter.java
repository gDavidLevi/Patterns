package ru.davidlevi.GoF.structural.i5_adapter.simple2;

/**
 * Адаптер (Adapter) наделяет водопроводчика (Plumber) поведением шефповара (НАСЛЕДОВАНИЕ)
 */
public class Adapter extends Plumber implements Chief {
    // Когда попросят приготовить завтрак, он поменяет прокладку
    @Override
    public Object makeBreakfast() {
        return getGasket();
    }

    // Когда попросят приготовить обед, он установит трубу
    @Override
    public Object makeLunch() {
        return getPipe();
    }

    // Когда попросят приготовить ужин, он завинтит гайку
    @Override
    public Object makeDinner() {
        return getScrewNut();
    }
}
