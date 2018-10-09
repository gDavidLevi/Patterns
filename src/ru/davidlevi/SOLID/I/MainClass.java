package ru.davidlevi.SOLID.I;

/**
 * I Принцип разделения интерфейса
 * <p>
 * «много интерфейсов, специально предназначенных для клиентов, лучше, чем один интерфейс общего назначения.»
 */
public class MainClass {
    public static void main(String[] args) {
        /*
         * Создано 3 интерфейса:
         * - интерфейс управления, FigureManage
         * - интерфейс 2D-фигуры, Shape
         * - интерфейс 3D-фигуры, SolidShape
         */

        Square square = new Square();
        Cuboid cuboid = new Cuboid();

        // Интерфейс FigureManage охватывает все фигуры
        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.sum(square, cuboid);
    }
}
