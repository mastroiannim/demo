package it.paleocapa.mastroiannim.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "author", referencedColumnName = "id")
    private Author author;

    // getters
    public long getId() {
        return id;
    }   
    public String getTitle() {
        return title;
    }   
    public Author getAuthor() {
        return author;
    }   
}