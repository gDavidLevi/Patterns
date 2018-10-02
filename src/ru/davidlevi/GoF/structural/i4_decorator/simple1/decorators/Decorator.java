package ru.davidlevi.GoF.structural.i4_decorator.simple1.decorators;

import ru.davidlevi.GoF.structural.i4_decorator.simple1.objects.Component;

/**
 * Декоратор
 * <p>
 * 1. Наследует поведение от Human
 * 2. Decorator определяет поведение для наследников
 */
public abstract class Decorator implements Component {
    /**
     * Отрисовать компонент и выволнить метод drawAfter() реализованный в потомке
     */
    @Override
    public void draw() {
        component.draw();
        drawAfter();
    }

    /**
     * Метод обязательно реализуемый в предках.
     *
     * Метод доступный только внутри класса в котором будет реализовываться, см. protected
     */
    protected abstract void drawAfter();

    private Component component;

    /**
     * Конструктор
     *
     * @param component Human
     */
    Decorator(Component component) {
        this.component = component;
    }
}
