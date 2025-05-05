package com.dci.controller;


import com.dci.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api")
public class BookController {
    @GetMapping("/books")
    public String getBook(Model model) {
        List<Book> books = Arrays.asList(
                new Book("1984", "George Orwell", 1949, "Dystopian", 9.99, true),
                new Book("Brave New World", "Aldous Huxley", 1932, "Sci-Fi", 12.50, false),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Classic", 14.99, true),
                new Book("The Hobbit", "J.R.R. Tolkien", 1937, "Fantasy", 11.00, true),
                new Book("Fahrenheit 451", "Ray Bradbury", 1953, "Sci-Fi", 10.00, false),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Classic", 13.25, true),
                new Book("Dracula", "Bram Stoker", 1897, "Horror", 8.75, false),
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "Fiction", 10.99, true)
        );
       model.addAttribute("books", books);
        return "books";
    }
}
