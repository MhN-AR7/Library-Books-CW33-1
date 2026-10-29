package ir.maktabsharif.db;

import ir.maktabsharif.model.Book;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InMemoryDB {
    private static final List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("Java", "Ali Najafi", new BigDecimal("99.9")));
        books.add(new Book("Python", "Ali Noori", new BigDecimal("55.9")));
        books.add(new Book("C#", "Ali Moradi", new BigDecimal("39.9")));
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
