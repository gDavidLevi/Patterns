package ru.davidlevi.GoF.structural.i4_decorator.simple2.decorators;

import ru.davidlevi.GoF.structural.i4_decorator.simple2.objects.Human;

public class DecoratorHello extends Decorator {
    @Override
    public void humanGreeting() {
        System.out.print("Hello");
        super.humanGreeting();
    }

    public DecoratorHello(Human human) {
        super(human);
    }

    @Override
    public void newOperation() {
        System.out.println("DecoratorHello:: New hello operation");
    }
}
