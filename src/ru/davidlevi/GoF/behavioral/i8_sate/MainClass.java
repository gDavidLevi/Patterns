package ru.davidlevi.GoF.behavioral.i8_sate;

import ru.davidlevi.GoF.behavioral.i8_sate.context.Context;
import ru.davidlevi.GoF.behavioral.i8_sate.state.InterfaceState;
import ru.davidlevi.GoF.behavioral.i8_sate.state.StateA;
import ru.davidlevi.GoF.behavioral.i8_sate.state.StateB;

/**
 * Паттерн State (Состояние)
 * <p>
 * Назначение:
 * - используется в тех случаях, когда во время выполнения программы объект должен менять своё поведение в зависимости
 * от своего состояния.
 * Конструкция:
 * - Calculate — класс, объекты которого должны менять своё поведение в зависимости от состояния.
 * - InterfaceState — интерфейс, который должен реализовать каждое из конкретных состояний. Через этот интерфейс объект
 * Calculate взаимодействует с состоянием, делегируя ему вызовы методов. Интерфейс должен содержать средства для обратной связи с
 * объектом, поведение которого нужно изменить. Для этого используется событие (паттерн Publisher — Subscriber). Это
 * необходимо для того, чтобы в процессе выполнения программы заменять объект состояния при появлении событий.
 * Возможны случаи, когда сам Calculate периодически опрашивает объект состояние на наличие перехода.
 * - StateA … StateZ — классы конкретных состояний. Должны содержать информацию о том, при каких условиях и в какие
 * состояния может переходить объект из текущего состояния.
 * <p>
 * Например, из StateA объект может переходить в состояние StateB и StateC, а из StateB — обратно в StateA и так далее.
 * Объект одного из них должен содержать Widget при создании.
 */
public class MainClass {
    public static void main(String[] args) {
        // Объект будет менять свое поведение в зависомости от состояния.
        Context context = new Context();

        // Создадим состояния
        InterfaceState stateA = new StateA();
        InterfaceState stateB = new StateB();

        // Установим контексту состояние stateB
        context.setState(stateB);
        context.whatIsTheState();

        // Установим контексту состояние stateA
        context.setState(stateA);
        context.whatIsTheState();
    }
}
