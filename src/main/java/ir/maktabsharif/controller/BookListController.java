package ir.maktabsharif.controller;

import ir.maktabsharif.model.Book;
import ir.maktabsharif.service.BookService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.List;

public class BookListController implements Controller {
    private final BookService bookService;

    public BookListController(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        List<Book> books = bookService.findAll();

        modelAndView.addObject("show", books);

        return modelAndView;
    }
}
