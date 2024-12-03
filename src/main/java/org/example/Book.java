package org.example;

public class Book extends LibraryItem{
    private String author;
    private String genre;
    public Book(String title, int publicationYear, String author, String genre) {
        super( title, publicationYear);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String getDetails() {
        return super.getClass().getSimpleName() +"Titre"+ getTitle()+"Author: " + author + ", Genre: " + genre + "Année" + getPublicationYear();
    }
}
