package ru.davidlevi.GoF.structural.i5_adapter.simple3;

/**
 * Адаптер (Adapter) наделяется поведением шеф-повара (КОМПОЗИЦИЯ)
 */
class Adapter implements Chief {
    private Plumber plumber = new Plumber();

    @Override
    public Object makeBreakfast() {
        return plumber.getKey();
    }

    @Override
    public Object makeLunch() {
        return plumber.getScrewDriver();
    }

    @Override
    public Object makeDinner() {
        return plumber.getPipe();
    }
}
