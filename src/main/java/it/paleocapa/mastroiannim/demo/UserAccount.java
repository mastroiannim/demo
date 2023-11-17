package it.paleocapa.mastroiannim.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class UserAccount {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @OneToOne  
    @JoinColumn(name = "profile", referencedColumnName = "id")
    private Profile profile;

    public String getUsername() {
        return username;
    }

    public Profile getProfile() {
        return profile;
    }

    public long getId() {
        return id;
    }
    
}
