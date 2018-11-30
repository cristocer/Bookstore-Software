package com.tawelib.Lib_Tawe;

import javax.persistence.*;

@Entity//Defining the class as a persistant entity allowing the hibernate API to interact with it 
@PrimaryKeyJoinColumn(name="ResourceUID")//Defining that this entity's primary key is imported from another class, Resources
public class Book extends Resources {
   
	public String author;
	public String publisher;
    public int isbn;
    public String genre;
    public String language;
    
    public Book() {}
    
    public void editResource(String author, String publisher, int isbn, String genre, String language, String title, 
    		String year, String thumbnailImagePath) {
        this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.genre = genre;
		this.language = language;
		this.year = year;
        this.title = title;
        this.thumbnailImagePath = thumbnailImagePath;
    } 
    
    public String getAuthor() {
        return author;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    
    public String getGenre() {
        return genre;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public int getIsbn() {
		return isbn;
	}
    
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
