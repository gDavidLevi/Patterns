package ru.davidlevi.GoF.structural.i4_decorator.simple2;

import ru.davidlevi.GoF.structural.i4_decorator.simple2.decorators.Decorator;
import ru.davidlevi.GoF.structural.i4_decorator.simple2.decorators.DecoratorComma;
import ru.davidlevi.GoF.structural.i4_decorator.simple2.decorators.DecoratorHello;
import ru.davidlevi.GoF.structural.i4_decorator.simple2.decorators.DecoratorSpace;
import ru.davidlevi.GoF.structural.i4_decorator.simple2.objects.David;

/**
 * Паттерн Decorator (Декоратор), Wrapper (Обертка)
 * <p>
 * Назначение:
 * - Предназначен для динамического подключения дополнительного поведения к объекту
 * - Предоставляет гибкую альтернативу практике создания подклассов с целью расширения функциональности
 * Плюсы:
 * - нет необходимости создавать подклассы для расширения функциональности объекта;
 * - возможность динамически подключать новую функциональность до или после основной функциональности объекта
 * ConcreteComponent (класс, в который с помощью шаблона Декоратор добавляется новая функциональность).
 * Примечание:
 * - родственные шаблоны: Фасад, Адаптер
 */
public class MainClass {
    public static void main(String[] args) {
        Decorator decorator = new DecoratorHello(
                new DecoratorComma(
                        new DecoratorSpace(
                                new David())));
        decorator.humanGreeting();  // Hello, David!
        decorator.newOperation();   // DecoratorHello:: New hello operatio
    }
}
