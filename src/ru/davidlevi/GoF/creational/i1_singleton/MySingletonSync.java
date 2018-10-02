package ru.davidlevi.GoF.creational.i1_singleton;

/**
 * Синхронизованный (для нескольких потоков) Singleton
 */
public class MySingletonSync {
    // Хранит (static) экземпляр класса
    private static MySingletonSync instance;

    /**
     * Статический метод возвращает экземпляр класса
     *
     * @return MySingletonSync INSTANCE
     */
    public static synchronized MySingletonSync getInstance() {
        if (instance == null)
            instance = new MySingletonSync();
        return instance;
    }

    /**
     * Именно приватный конструктор!
     */
    private MySingletonSync() {
    }
}
