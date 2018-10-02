package ru.davidlevi.GoF.creational.i1_singleton;

/**
 * Обычный Singleton (альтернативная запись через final)
 */
public class MySingletonFinal {
    private static final MySingletonFinal INSTANCE = new MySingletonFinal();

    /**
     * Статический метод возвращает экземпляр класса
     *
     * @return MySingletonFinal INSTANCE
     */
    public static MySingletonFinal getInstance() {
        return INSTANCE;
    }

    /**
     * Именно приватный конструктор!
     */
    private MySingletonFinal() {
    }
}
