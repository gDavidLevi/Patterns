package ru.davidlevi.SOLID.O;

/**
 * O Принцип открытости/закрытости
 * <p>
 * Программные сущности (классы, модули, функции и т.п.) должны быть открытыми для расширения, но закрытыми для модификации.
 */
public class MainClass {
    public static void main(String[] args) {
        // Сущность открыта для расширения (является продолжение интерфейса), но закрыта для модификации
        Circle circle = new Circle(3.51f);


        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.sum(circle, circle, circle);
    }
}
