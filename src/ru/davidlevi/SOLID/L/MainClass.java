package ru.davidlevi.SOLID.L;

/**
 * L Принцип подстановки Барбары Лисков
 * <p>
 * «объекты в программе должны быть заменяемыми на экземпляры их подтипов без изменения правильности выполнения программы.»
 * <p>
 * Наследующий класс должен дополнять, а не изменять базовый.
 */
public class MainClass {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Car car = new Car();
        ElectricBus electricBus = new ElectricBus();

        driver.go(car);
        driver.go(electricBus);
    }
}
