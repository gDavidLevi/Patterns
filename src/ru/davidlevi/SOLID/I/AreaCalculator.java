package ru.davidlevi.SOLID.I;

/**
 * Калькулятор прощади
 */
public class AreaCalculator {
    // Сумматор
    double sum(Object... array) {
        int result = 0;
        for (Object elem : array)
            // Интерфейс FigureManage охватывает все фигуры
            // Если элемент фигура, то...
            if (elem instanceof FigureManage)
                result += ((FigureManage) elem).calculate(); //...считаем сумму.
            else
                throw new RuntimeException("Объект не является реализацией интрерфейса FigureManage.");
        return result;
    }
}
