package ru.davidlevi.GoF.structural.i4_decorator.simple1.decorators;

import ru.davidlevi.GoF.structural.i4_decorator.simple1.objects.Component;

/**
 * Граница
 */
public class BorderDecorator extends Decorator {
    @Override
    public void draw() {
        super.draw();
    }

    @Override
    protected void drawAfter() {
        System.out.println(" ... add border");
    }

    public BorderDecorator(Component component) {
        super(component);
    }
}
