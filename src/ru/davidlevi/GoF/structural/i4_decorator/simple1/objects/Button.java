package ru.davidlevi.GoF.structural.i4_decorator.simple1.objects;

/**
 * Кнопка
 */
public class Button implements Component {
    @Override
    public void draw() {
        System.out.println("draw button");
    }
}
