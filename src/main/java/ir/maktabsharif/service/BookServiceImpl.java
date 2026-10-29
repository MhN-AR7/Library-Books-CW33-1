package ir.maktabsharif.service;

import ir.maktabsharif.model.Book;
import ir.maktabsharif.repo.BookRepo;

import java.util.List;

public class BookServiceImpl implements BookService {
    private final BookRepo bookRepo;

    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public void addBook(Book book) {
        bookRepo.addBook(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepo.findAll();
    }
}
