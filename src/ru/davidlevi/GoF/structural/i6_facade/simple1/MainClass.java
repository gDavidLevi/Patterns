package ru.davidlevi.GoF.structural.i6_facade.simple1;

import ru.davidlevi.GoF.structural.i6_facade.simple1.parts.Door;
import ru.davidlevi.GoF.structural.i6_facade.simple1.parts.Ignition;
import ru.davidlevi.GoF.structural.i6_facade.simple1.parts.Wheel;

/**
 * Паттерн Facade (фасад)
 * <p>
 * Назначение:
 * - позволяет скрыть сложность системы путём сведения всех возможных внешних вызовов к одному объекту, делегирующему
 * их соответствующим объектам системы.
 * Для проектирование фасада необходимо определить одну точку взаимодействия с подсистемой — фасадный объект,
 * обеспечивающий общий интерфейс с подсистемой, и возложить на него обязанность по взаимодействию с её компонентами.
 * Фасад — это внешний объект, обеспечивающий единственную точку входа для служб подсистемы. Реализация других
 * компонентов подсистемы закрыта и не видна внешним компонентам. Фасадный объект обеспечивает реализацию GRASP
 * паттерна Устойчивый к изменениям (Protected Variations) с точки зрения защиты от изменений в реализации подсистемы.
 * <p>
 * Плюсы:
 * - инкапсуляция реализации внешних классов (компонентов, библиотек), система становится независимой от интерфейса
 * внешних классов;
 * - переход на использование других внешних классов не требует переделки самой системы, достаточно реализовать один
 * класс Adapter.
 * Примечание:
 * - родственные шаблоны: Фасад, Декоратор
 */
public class MainClass {
    public static void main(String[] args) {
        // Вызов без фасада
        Door door = new Door();
        door.open();
        Ignition zazhiganie = new Ignition();
        zazhiganie.fire();
        Wheel wheel = new Wheel();
        wheel.turn();

        // Вызов с фасадом
        Car car = new Car();
        car.go();
    }
}
