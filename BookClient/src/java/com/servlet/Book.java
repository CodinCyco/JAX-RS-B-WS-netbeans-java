/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.ws;

/**
 *
 * @author saifeddine
 */
public class Book {
    private int id;
    private int ISBN;
    private String title;
    private String author;
    private String editionInfo;

    public Book(int id, int ISBN, String title, String author, String editionInfo) {
        this.id = id;
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.editionInfo = editionInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditionInfo() {
        return editionInfo;
    }

    public void setEditionInfo(String editionInfo) {
        this.editionInfo = editionInfo;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", editionInfo=" + editionInfo + '}';
    }
    
    
    
}
