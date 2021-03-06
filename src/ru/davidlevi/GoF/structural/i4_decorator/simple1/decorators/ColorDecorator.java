package ru.davidlevi.GoF.structural.i4_decorator.simple1.decorators;

import ru.davidlevi.GoF.structural.i4_decorator.simple1.objects.Component;

/**
 * Цвет
 */
public class ColorDecorator extends Decorator {
    @Override
    public void draw() {
        super.draw();
    }

    @Override
    protected void drawAfter() {
        System.out.println("... added color");
    }

    public ColorDecorator(Component component) {
        super(component);
    }
}
