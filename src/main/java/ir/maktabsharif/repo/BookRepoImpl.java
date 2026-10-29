package ir.maktabsharif.repo;

import ir.maktabsharif.db.InMemoryDB;
import ir.maktabsharif.model.Book;

import java.util.List;

public class BookRepoImpl implements BookRepo {
    private final InMemoryDB db;

    public BookRepoImpl(InMemoryDB db) {
        this.db = db;
    }

    @Override
    public void addBook(Book book) {
        db.addBook(book);
    }

    @Override
    public List<Book> findAll() {
        return db.getBooks();
    }
}
