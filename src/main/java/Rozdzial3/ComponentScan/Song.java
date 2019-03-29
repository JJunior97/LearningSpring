package Rozdzial3.ComponentScan;

import org.springframework.stereotype.Component;

@Component
public class Song {

    private String author = "Queen";
    private String title = "We will rock you";

    public Song() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
