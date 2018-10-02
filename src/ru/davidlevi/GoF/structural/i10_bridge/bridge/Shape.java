package ru.davidlevi.GoF.structural.i10_bridge.bridge;

/**
 * Фигура
 */
public abstract class Shape {
    protected Drawer drawer;

    protected Shape(Drawer drawer) {
        this.drawer = drawer;
    }

    /**
     * Метод производит отрисовку
     */
    public abstract void draw();
}
