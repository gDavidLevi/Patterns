package ru.davidlevi.GoF.creational.i2_factorymethod.simple1;

/**
 * Паттерн Factory Method (Virtual Constructor), Фабричный метод (Виртуальный конструктор)
 * <p>
 * Назначение:
 * - Для создания объектов различных типов одним интерфейсом. Иными словами, данный шаблон делегирует создание объектов
 * наследникам родительского класса. Это позволяет использовать в коде программы не специфические классы, а
 * манипулировать абстрактными объектами на более высоком уровне.
 * - Известен интерфейс, но заранее неизвестно какая из реализаций будет использоваться
 * - Получение ссылки на объект в зависимости от входящих условий
 * Плюсы:
 * - Создание объектов, независимо от их типов и сложности процесса создания.
 * Минусы:
 * - Даже для одного объекта необходимо создать соответствующую фабрику, что увеличивает код.
 */
public class MainClass {
    public static void main(String[] args) {
        // Допустим мы создаем много разных объектов. Это неудобно и грамоздко.
        Car geep = new Geep();
        geep.drive();
        Car porsche = new Porsche();
        porsche.drive();
        //...

        // Теперь создадим используя фабричный метод
        FactoryMethod factoryMethod = new FactoryMethod();
        Car car;
        car = factoryMethod.createCar(RoadType.CITY);
        car.drive();
        car.stop();
        car = factoryMethod.createCar(RoadType.OFF_ROAD);
        car = factoryMethod.createCar(RoadType.GAZON);

        // Теперь создадим используя фабричный метод через встроенный синглтон
        Car carS = FactoryMethod.getInstance().createCar(RoadType.GAZON);
    }
}
