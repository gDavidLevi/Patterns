package ru.davidlevi.GoF.structural.i4_decorator.simple2.decorators;

import ru.davidlevi.GoF.structural.i4_decorator.simple2.objects.Human;

public class DecoratorComma extends Decorator {
    @Override
    public void humanGreeting() {
        System.out.print(",");
        super.humanGreeting();
    }

    public DecoratorComma(Human human) {
        super(human);
    }

    @Override
    public void newOperation() {
        System.out.println("DecoratorComma:: New comma operation");
    }
}
