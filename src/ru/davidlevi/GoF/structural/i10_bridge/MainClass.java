package ru.davidlevi.GoF.structural.i10_bridge;

import ru.davidlevi.GoF.structural.i10_bridge.bridge.LargeCircleDrawer;
import ru.davidlevi.GoF.structural.i10_bridge.bridge.Shape;
import ru.davidlevi.GoF.structural.i10_bridge.bridge.SmallCircleDrawer;

/**
 * Паттерн Bridge (Мост)
 * <p>
 * Назначение:
 * - в проектировании программного обеспечения используется чтобы «разделять абстракцию и реализацию так, чтобы они
 * могли изменяться независимо». Шаблон мост использует инкапсуляцию, агрегирование и может использовать наследование
 * для того, чтобы разделить ответственность между классами.
 * Плюсы:
 * - является полезным там, где часто меняется не только сам класс, но и то, что он делает.
 * Примечание:
 * - родственные шаблоны: Фасад, Адаптер
 */
public class MainClass {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5, 10, 10, new LargeCircleDrawer()),
                new Circle(20, 30, 100, new SmallCircleDrawer())
        };
        //
        for (Shape shape : shapes)
            shape.draw();
        /*
        Large circle center = 5,10 radius = 100
        Small circle center = 20,30 radius = 25.0
         */
    }
}
