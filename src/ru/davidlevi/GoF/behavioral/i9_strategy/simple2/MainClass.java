package ru.davidlevi.GoF.behavioral.i9_strategy.simple2;

import ru.davidlevi.GoF.behavioral.i9_strategy.simple2.context.Calculate;
import ru.davidlevi.GoF.behavioral.i9_strategy.simple2.strategy.Add;
import ru.davidlevi.GoF.behavioral.i9_strategy.simple2.strategy.Multiply;
import ru.davidlevi.GoF.behavioral.i9_strategy.simple2.strategy.Subtract;

/**
 * Паттерн StrategyCalculate (Стратегия)
 * <p>
 * Назначение:
 * - предназначенный для определения семейства алгоритмов, инкапсуляции каждого из них и обеспечения их
 * взаимозаменяемости. Это позволяет выбирать алгоритм путём определения соответствующего класса. Шаблон StrategyCalculate
 * позволяет менять выбранный алгоритм независимо от объектов-клиентов, которые его используют.
 * Назначение:
 * - позволяет использовать различные бизнес-правила или алгоритмы в зависимости от контекста.
 * Применение:
 * - когда в одном и том же месте в зависимости от текущего состояния системы (или её окружения) должны использоваться
 * различные алгоритмы.
 * Плюсы:
 * - инкапсуляция реализации различных алгоритмов, система становится независимой от возможных изменений бизнес-правил;
 * - вызов всех алгоритмов одним стандартным образом;
 * - отказ от использования переключателей и/или условных операторов.
 * Минусы:
 * - создание дополнительных классов.
 * Примечание:
 * - родственные шаблоны: Мост, Шаблонный метод, Адаптер
 */
public class MainClass {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        // Стратегия "Сложение"
        calculate.setStrategy(new Add());
        int resultA = calculate.executeStrategy(3, 4);

        // Стратегия "Вычитание"
        calculate.setStrategy(new Subtract());
        int resultB = calculate.executeStrategy(3, 4);

        // Стратегия "Умножение"
        calculate.setStrategy(new Multiply());
        int resultC = calculate.executeStrategy(3, 4);

        System.out.println("Result A : " + resultA);
        System.out.println("Result B : " + resultB);
        System.out.println("Result C : " + resultC);
    }
}
