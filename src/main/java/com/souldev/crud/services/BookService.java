package com.souldev.crud.services;

import com.souldev.crud.entities.Book;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


public interface BookService {
    Book saveBook(Book book, MultipartFile file) throws IOException;
    Book updateBook(Book book);
    List<Book> getBooks();
    Optional<Book> getBookById(Long id);
    void deleteBook(Book book) throws IOException;
    Book updateBookImage(MultipartFile file, Book book) throws IOException;
}
