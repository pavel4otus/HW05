package ru.pavel2107.otus.hw05.domain;

public class Genre extends AbstractNamedEntity{

    @Override
    public String toString() {
        return "Genre{id=" + getID() + ", name='" + getName() + "'}";
    }
}
