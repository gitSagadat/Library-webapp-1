package io.saga.library.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    @NotEmpty(message = "Book title can't be empty!")
    @Size(min = 2, max = 100)
    private String title;

    @NotEmpty(message = "Who is Author of this book?")
    @Size(min = 2, max = 100)
    private String author;

    @Min(value = 1, message = "Please write correct year")
    private int year;
    public Book(){

    }
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}
}
