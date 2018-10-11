package ru.davidlevi.GoF.behavioral.i13_mediator;

/**
 *  "Посредник" реализует кооперативное поведение, пересылая каждый запрос одному или нескольким "Коллегам".
 */
public class ConcreteMediator implements Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague) {
        this.colleague1 = colleague;
    }

    public void setColleague2(ConcreteColleague2 colleague) {
        this.colleague2 = colleague;
    }

    @Override
    public void send(String message, Colleague sender) {
        if (sender.equals(colleague2))
            colleague1.notify(message);
        else
            colleague2.notify(message);
    }
}
