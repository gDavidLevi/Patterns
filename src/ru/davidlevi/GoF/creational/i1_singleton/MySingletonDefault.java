package ru.davidlevi.GoF.creational.i1_singleton;

/**
 * Обычный Singleton (распространенный вариант)
 */
public class MySingletonDefault {
    // Хранит (static) экземпляр класса
    private static MySingletonDefault instance;

    /**
     * Статический метод возвращает экземпляр класса
     *
     * @return MySingletonDefault INSTANCE
     */
    public static MySingletonDefault getInstance() {
        if (instance == null)
            instance = new MySingletonDefault();
        return instance;
    }

    /**
     * Именно приватный конструктор!
     */
    private MySingletonDefault() {
    }

    /**
     * Доступ к этому методу возможен только через getInstance()
     */
    public void print() {
        System.out.println(this);
    }

    /**
     * Доступ к этому методу возможен только через getInstance()
     */
    public void stop() {
        System.out.println("стоп");
    }
}
