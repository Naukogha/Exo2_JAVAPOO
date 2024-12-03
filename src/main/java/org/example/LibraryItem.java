package org.example;

import java.util.ArrayList;
import java.util.List;

public class LibraryItem {
    private int id;
    private String title;
    private int publicationYear;
    public static List<LibraryItem> getItems = new ArrayList<>();

    public LibraryItem(String title, int publicationYear) {
        id = getItems.size() +1;
        this.title = title;
        this.publicationYear = publicationYear;
        getItems.add(this);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Titre" + title +"; Date de publication " + publicationYear;
    };
}
