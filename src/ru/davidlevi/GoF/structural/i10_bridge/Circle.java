package ru.davidlevi.GoF.structural.i10_bridge;

import ru.davidlevi.GoF.structural.i10_bridge.bridge.Drawer;
import ru.davidlevi.GoF.structural.i10_bridge.bridge.Shape;

/**
 * Окружность
 */
public class Circle extends Shape {
    /**
     * Рисование круга в зависимости от drawer'а
     */
    @Override
    public void draw() {
        drawer.drawCircle(x, y, radius);
    }

    private int x;
    private int y;
    private int radius;

    /**
     * Конструктор
     *
     * @param x      координата
     * @param y      координата
     * @param radius радиус
     * @param drawer мост-отрисовщик
     */
    Circle(int x, int y, int radius, Drawer drawer) {
        super(drawer);
        setX(x);
        setY(y);
        setRadius(radius);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}