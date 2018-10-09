package ru.davidlevi.SOLID.S;

/**
 * Данный класс нарушает принцип единственной ответственности потому, что в классе находится сущность книги
 * и ее функционал
 */
public class Book1 {
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

    // функционал
    public void printCurrentPage() {
        //todo print current page
    }
}
