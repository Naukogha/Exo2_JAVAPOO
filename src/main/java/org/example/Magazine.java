package org.example;

public class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(String title, int publicationYear, int issueNumber) {
        super(title, publicationYear);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getDetails() {
        return super.getClass().getSimpleName() +"Titre"+ getTitle()+"Numéro"+ issueNumber+ "Année" + getPublicationYear();
    }
}
