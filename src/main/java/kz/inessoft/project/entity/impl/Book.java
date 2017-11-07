package kz.inessoft.project.entity.impl;

import kz.inessoft.project.consatnts.Constants;
import kz.inessoft.project.entity.Publication;

import static kz.inessoft.project.consatnts.Constants.FORMAT_BOOK_BODY;
import static kz.inessoft.project.consatnts.Constants.FORMAT_REGISTERED_PUB_BODY;

/**
 * This class implements abstract operands from abstract class publication
 * and adds operands of its own entity
 * @author Artyom Revinov
 */
public class Book extends Publication {

    private String author;
    private int countPage;
    private String genre;

    @Override
    public String getType() {

        return Constants.BOOK;
    }

    @Override
    public String getAllInfo() {

        return String.format(FORMAT_BOOK_BODY,getId(),
                getAuthor(),getName(),getYear(),getCountPage(),getPublisher(),getGenre(),getDescription());
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format(FORMAT_REGISTERED_PUB_BODY,getId(),getType(),getName(),getYear(),getCountPage(),getPublisher());
    }

}


