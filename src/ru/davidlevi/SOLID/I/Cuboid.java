package ru.davidlevi.SOLID.I;

public class Cuboid implements SolidShape, FigureManage {
    @Override
    public double calculate() { // общий метод с Square
        return volume();
    }

    @Override
    public double volume() {
        return 0f;
    }
}
