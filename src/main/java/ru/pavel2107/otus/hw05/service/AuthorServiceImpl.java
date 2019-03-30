package ru.pavel2107.otus.hw05.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.pavel2107.otus.hw05.domain.Author;
import ru.pavel2107.otus.hw05.repository.AuthorRepository;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository repository;


    @Autowired
    public AuthorServiceImpl( AuthorRepository repository){
        this.repository = repository;
    }

    @Override
    public Author save(Author author) {
        return repository.save( author);
    }

    @Override
    public boolean delete(String ID) {
        return repository.delete( ID);
    }

    @Override
    public Author get(String ID) {
        return repository.get( ID);
    }

    @Override
    public List<Author> getByName(String name) {
        return repository.getByName( name);
    }

    @Override
    public List<Author> getAll() {
        return repository.getAll();
    }
}
