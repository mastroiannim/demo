package it.paleocapa.mastroiannim.demo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Borrow {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "book", referencedColumnName = "id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "user_account", referencedColumnName = "id")
    private UserAccount userAccount;

    @Column(nullable = false, unique = false)
    private Date borrowDate = new Date(System.currentTimeMillis());

    @Column(nullable = false, unique = false)
    private Date returnDate = new Date(System.currentTimeMillis() + 604800000);

    public long getId() {
        return id;
    }   

    public Book getBook() {
        return book;
    }   

    public UserAccount getUserAccount() {
        return userAccount;
    }   

    public Date getBorrowDate() {
        return borrowDate;
    }   

    public Date getReturnDate() {
        return returnDate;
    }   


}
