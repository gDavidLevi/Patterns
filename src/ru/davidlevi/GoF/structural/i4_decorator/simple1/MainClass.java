package ru.davidlevi.GoF.structural.i4_decorator.simple1;

import ru.davidlevi.GoF.structural.i4_decorator.simple1.decorators.BorderDecorator;
import ru.davidlevi.GoF.structural.i4_decorator.simple1.decorators.ColorDecorator;
import ru.davidlevi.GoF.structural.i4_decorator.simple1.objects.Button;
import ru.davidlevi.GoF.structural.i4_decorator.simple1.objects.Component;
import ru.davidlevi.GoF.structural.i4_decorator.simple1.objects.TextView;
import ru.davidlevi.GoF.structural.i4_decorator.simple1.objects.Window;

/**
 * Паттерн Decorator (Декоратор), Wrapper (Обертка)
 * <p>
 * Назначение:
 * - Предназначен для динамического подключения дополнительного поведения к объекту
 * - Предоставляет гибкую альтернативу практике создания подклассов с целью расширения функциональности
 * Плюсы:
 * - нет необходимости создавать подклассы для расширения функциональности объекта;
 * - возможность динамически подключать новую функциональность до или после основной функциональности объекта
 * ConcreteComponent (класс, в который с помощью шаблона Декоратор добавляется новая функциональность).
 * Примечание:
 * - родственные шаблоны: Фасад, Адаптер
 */
public class MainClass {
    public static void main(String[] args) {
        Component textViewWithBorderAndColor = new ColorDecorator(new BorderDecorator(new TextView()));
        textViewWithBorderAndColor.draw();

        Component window;
        Component textView;
        Component button;

        boolean showBorder = true;

        // Не показывать границы?
        if (!showBorder) {
            window = new Window();
            textView = new TextView();
            button = new Button();
        } else {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }

        window.draw();
        textView.draw();
        button.draw();
    }
}
