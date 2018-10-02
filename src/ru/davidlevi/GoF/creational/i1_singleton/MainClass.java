package ru.davidlevi.GoF.creational.i1_singleton;

/**
 * Паттерн Singleton
 * <p>
 * Плюсы:
 * - Создание объекта в единственном экземпляре
 * - Глобальный	доступ (например: замена глобальным переменным)
 * - Можно управлять количеством экземпляров объекта, которые можно создать
 * - Единая точка доступа (например: подключение к БД, ...)
 * Минусы:
 * - Опасность чрезмерного использования
 */
public class MainClass {
    public static void main(String[] args) {
        MySingletonDefault.getInstance().print();
        MySingletonDefault.getInstance().print();
        MySingletonDefault.getInstance().print();
        MySingletonDefault.getInstance().stop();
        /*
        GoF.creational.i1_singleton.MySingletonDefault@43a25848
        GoF.creational.i1_singleton.MySingletonDefault@43a25848
        GoF.creational.i1_singleton.MySingletonDefault@43a25848
        stop
         */
    }
}
