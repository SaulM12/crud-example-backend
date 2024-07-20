package com.souldev.crud.services;

import com.souldev.crud.entities.Book;
import com.souldev.crud.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;
    @Override
    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book){
        return bookRepository.save(book);
    }
    @Override
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
    @Override
    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }
    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
