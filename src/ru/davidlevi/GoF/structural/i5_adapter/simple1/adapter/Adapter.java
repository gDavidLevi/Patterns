package ru.davidlevi.GoF.structural.i5_adapter.simple1.adapter;

import ru.davidlevi.GoF.structural.i5_adapter.simple1.objects.Printer;

import java.util.List;

/**
 * Адаптер совмещает желание клиента и возможности принтера
 */
public class Adapter implements Behavior {
    private Printer printer = new Printer(); // в адаптер вставлен принтер

    /**
     * Данный метод посылает на принтер список строк
     *
     * @param list List<String>
     */
    @Override
    public void print(List<String> list) {
        for (String text : list)
            printer.print(text);
    }
}
