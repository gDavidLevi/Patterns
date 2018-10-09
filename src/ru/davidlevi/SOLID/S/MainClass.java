package ru.davidlevi.SOLID.S;

/**
 * S Принцип единственной ответственности
 * <p>
 * - Каждый класс выполняет лишь одну задачу.
 * - Принцип единой ответственности гласит, что каждый модуль или класс должен нести ответственность только за одну
 * часть функциональности, предоставляемой программным обеспечением, и эта ответственность должна быть полностью
 * инкапсулирована классом.
 */
public class MainClass {
    public static void main(String[] args) {
        /*
         * Данный класс нарушает принцип единственной ответственности потому, что в классе находится сущность книги
         * и ее функционал printCurrentPage().
         */
        Book1 book1 = new Book1();
        book1.printCurrentPage();

        /*
         * Данный класс не нарушает принцип единственной ответственности потому, что из класса вынесен функционал в
         * отдельный класс HtmlPrinter
         */
        Book2 book2 = new Book2();
        HtmlPrinter htmlPrinter = new HtmlPrinter();
        htmlPrinter.printPage(book2.getPage(100));
    }
}

/**
 * Интерефейс Printer описывает поведение всех печатающих устройств
 */
interface Printer {
    void printPage(String string); // поведение
}

// Обычный текст
class PlainTextPrinter implements Printer {
    @Override
    public void printPage(String string) {
        System.out.println(string);
    }
}

// Форматированный текст
class HtmlPrinter implements Printer {
    @Override
    public void printPage(String string) {
        System.out.println("<div style=\"single-page\">" + string + "</div>");
    }
}

