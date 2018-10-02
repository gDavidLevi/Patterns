package ru.davidlevi.GoF.structural.i5_adapter.simple1.adapter;

import java.util.List;

/**
 * Интерфейс Behavior (анг. поведение) определяет поведение
 */
public interface Behavior {
    void print(List<String> list); // печать списка строк
}
