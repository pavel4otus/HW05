package ru.pavel2107.otus.hw05.domain;

import java.time.LocalDate;
import java.util.List;

public class Book extends AbstractNamedEntity{
    private List<Author> authors;
    private Genre genre;
    private PublishingHouse publishingHouse;
    private LocalDate publicationDate;
    private String    publicationPlace;


}
