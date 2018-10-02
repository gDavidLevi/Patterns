package ru.davidlevi.GoF.behavioral.i8_sate.state;

public class StateA implements InterfaceState {
    @Override
    public void whatIsTheState() {
        System.out.println("Состояние StateA");
    }
}
