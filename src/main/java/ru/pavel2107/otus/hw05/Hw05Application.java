package ru.pavel2107.otus.hw05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.pavel2107.otus.hw05.domain.Author;
import ru.pavel2107.otus.hw05.domain.Genre;
import ru.pavel2107.otus.hw05.repository.AuthorRepository;
import ru.pavel2107.otus.hw05.repository.GenreRepository;
import ru.pavel2107.otus.hw05.repository.jdbc.JdbcAuthorRepositoryImpl;
import ru.pavel2107.otus.hw05.repository.jdbc.JdbcGenreRepositoryImpl;

import org.h2.tools.Console;


import java.time.LocalDate;

@SpringBootApplication
public class Hw05Application {


    public static void main(String[] args)  throws Exception {
        ApplicationContext context = SpringApplication.run(Hw05Application.class, args);

//        Console.main( args);
    }

}
