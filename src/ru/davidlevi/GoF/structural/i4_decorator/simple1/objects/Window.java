package ru.davidlevi.GoF.structural.i4_decorator.simple1.objects;

/**
 * Окно
 */
public class Window implements Component {
    @Override
    public void draw() {
        System.out.println("draw window");
    }
}
