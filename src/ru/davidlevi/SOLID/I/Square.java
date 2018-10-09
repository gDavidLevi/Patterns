package ru.davidlevi.SOLID.I;

public class Square implements Shape, FigureManage {
    @Override
    public double calculate() {  // общий метод с Cuboid
        return area();
    }

    @Override
    public double area() {
        return 0f;
    }
}
