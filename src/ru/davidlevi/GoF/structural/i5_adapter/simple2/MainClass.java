package ru.davidlevi.GoF.structural.i5_adapter.simple2;

/**
 * Паттерн Adapter (Адаптер)
 * <p>
 * Назначение:
 * - для организации использования функций объекта, недоступного для модификации, через специально созданный интерфейс
 * (приводит интерфейс класса (или нескольких классов) к интерфейсу требуемого вида)
 * Применение в случаях:
 * - система поддерживает требуемые данные и поведение, но имеет неподходящий интерфейс. Чаще всего шаблон Адаптер
 * применяется если необходимо создать класс, производный от вновь определяемого или уже существующего абстрактного
 * класса.
 * Плюсы:
 * - инкапсуляция реализации внешних классов (компонентов, библиотек), система становится независимой от интерфейса
 * внешних классов;
 * - переход на использование других внешних классов не требует переделки самой системы, достаточно реализовать один
 * класс Adapter.
 * Примечание:
 * - родственные шаблоны: Фасад, Декоратор
 */
public class MainClass {

    private static void eat(Object dish) {
    }

    public static void main(String[] args) {
        /*
         Пример реализации через наследование, см. Adapter
         */
        Chief chiefAdapter = new Adapter();
        Object dish = chiefAdapter.makeBreakfast();
        eat(dish);
        dish = chiefAdapter.makeLunch();
        eat(dish);
        dish = chiefAdapter.makeDinner();
        eat(dish);
    }
}
