package kg.istschool.bookservice.controller;

import kg.istschool.bookservice.model.dto.BookDTO;
import kg.istschool.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {


    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/save")
    public BookDTO save(@RequestBody BookDTO bookDTO) {
    return bookService.save(bookDTO);
    }

}
