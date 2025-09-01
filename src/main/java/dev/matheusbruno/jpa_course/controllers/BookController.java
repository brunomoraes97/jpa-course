package dev.matheusbruno.jpa_course.controllers;

import dev.matheusbruno.jpa_course.dtos.BookRecordDTO;
import dev.matheusbruno.jpa_course.models.BookModel;
import dev.matheusbruno.jpa_course.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bookstore/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookModel>> getAllBooks() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(bookService.getAllBooks());
    }

    @PostMapping
    public ResponseEntity<BookModel> saveBook(@RequestBody BookRecordDTO bookRecordDTO) {
        return ResponseEntity.status(HttpStatus.CREATED
        ).body(bookService.saveBook(bookRecordDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable UUID id) {
        bookService.deleteBook(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body("Book deleted successfully");
    }

}
