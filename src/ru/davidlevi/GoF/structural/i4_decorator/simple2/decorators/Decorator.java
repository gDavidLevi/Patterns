package ru.davidlevi.GoF.structural.i4_decorator.simple2.decorators;

import ru.davidlevi.GoF.structural.i4_decorator.simple2.objects.Human;

/**
 * Decorator
 *
 * 1. Наследует поведение от Human
 * 2. Decorator определяет поведение для наследников
 */
public abstract class Decorator implements Human {
    @Override
    public void humanGreeting() {
         human.humanGreeting();
    }

    private Human human;

    Decorator(Human human) {
        this.human = human;
    }

    public void newOperation() {
        System.out.println("Decorator:: Do Nothing");
    }
}
