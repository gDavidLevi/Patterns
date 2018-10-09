package ru.davidlevi.SOLID.O;

/**
 * Калькулятор прощади
 */
public class AreaCalculator {
    // Сумматор
    double sum(Object... array) {
        int result = 0;
        for (Object elem : array)
            // Если элемент фигура, то считаем суммарную площадь
            if (elem instanceof ShapeInterface)
                result += ((ShapeInterface) elem).area();
            else
                throw new RuntimeException("Объект не является реализацией интрерфейса Shape.");
        return result;
    }
}
