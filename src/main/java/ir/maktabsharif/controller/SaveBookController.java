package ir.maktabsharif.controller;

import ir.maktabsharif.model.Book;
import ir.maktabsharif.service.BookService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.math.BigDecimal;

public class SaveBookController implements Controller {
    private final BookService bookService;

    public SaveBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        BigDecimal price = new BigDecimal(request.getParameter("price"));

        bookService.addBook(new Book(title, author, price));

        ModelAndView modelAndView = new ModelAndView("show");

        modelAndView.addObject("books", bookService.findAll());

        return modelAndView;
    }
}
