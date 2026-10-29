package ir.maktabsharif.repo;

import ir.maktabsharif.model.Book;

import java.util.List;

public interface BookRepo {
    void addBook(Book book);
    List<Book> findAll();
}
