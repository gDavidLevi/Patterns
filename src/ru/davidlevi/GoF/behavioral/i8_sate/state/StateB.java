package ru.davidlevi.GoF.behavioral.i8_sate.state;

public class StateB implements InterfaceState {
    @Override
    public void whatIsTheState() {
        System.out.println("Состояние StateB");
    }
}
