package ru.pavel2107.otus.hw05.domain;

import java.time.LocalDate;
import java.util.List;

public class Book extends AbstractNamedEntity{
    private Author author;
    private Genre genre;
    private String    publishingHouse;
    private Integer   publicationYear;
    private String    publicationPlace;
    private String    ISBN;

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublicationPlace() {
        return publicationPlace;
    }

    public void setPublicationPlace(String publicationPlace) {
        this.publicationPlace = publicationPlace;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + getID() +
                ", name=" + getName() +
                ", author=" + author.getName() +
                ", genre=" + genre.getName() +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publicationYear=" + publicationYear +
                ", publicationPlace='" + publicationPlace + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
