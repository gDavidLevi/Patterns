package ru.davidlevi.GoF.creational.i2_factorymethod.simple1;

/**
 * Фабрика FactoryMethod по созданию орбъектов (автомобилей)
 */
public class FactoryMethod {

    /**
     * Поскольку фабрика у нас одна, будет рационально ее организовать через синглтон,
     * а затем уже обратиться к методу createCar().
     */
    private static FactoryMethod instance;

    public static FactoryMethod getInstance() {
        if (instance == null)
            instance = new FactoryMethod();
        return instance;
    }

    /**
     * Метод возвращает (создает) нужный тип автомобиля в зависимости от типа дороги
     *
     * @param roadType RoadType тип дороги
     * @return Car
     */
    public Car createCar(RoadType roadType) {
        Car result = null;
        switch (roadType) {
            case CITY:
                result = new Porsche();
                break;
            case OFF_ROAD:
                result = new Geep();
                break;
            case GAZON:
                result = new NewGeep();
                break;
        }
        return result;
    }
}
