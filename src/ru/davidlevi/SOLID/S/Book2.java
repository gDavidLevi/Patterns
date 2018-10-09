package ru.davidlevi.SOLID.S;

public class Book2 {
    // сущность
    private String title;
    private String author;
    private int currentPage;

    {
        currentPage = 0;
        title = "The Great Book";
        author = "John Doe";
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    void turnPage() {
        currentPage++;
    }

    // Метод возвращает текст со страниницы
    public String getPage(int page) {
        return "Text..";
    }

    // вынесли функциональный метод printPage()
}
