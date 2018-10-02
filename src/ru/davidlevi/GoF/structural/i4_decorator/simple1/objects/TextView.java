package ru.davidlevi.GoF.structural.i4_decorator.simple1.objects;

/**
 * Метка
 */
public class TextView implements Component {
    @Override
    public void draw() {
        System.out.println("draw textview");
    }
}
