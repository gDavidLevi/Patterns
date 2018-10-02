package ru.davidlevi.GoF.structural.i4_decorator.simple2.decorators;

import ru.davidlevi.GoF.structural.i4_decorator.simple2.objects.Human;

public class DecoratorSpace extends Decorator {
    @Override
    public void humanGreeting() {
        System.out.print(" ");
        super.humanGreeting();
    }

    public DecoratorSpace(Human human) {
        super(human);
    }

    @Override
    public void newOperation() {
        System.out.println("DecoratorSpace:: New space operation");
    }
}
