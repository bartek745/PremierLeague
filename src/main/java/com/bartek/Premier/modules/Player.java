package com.bartek.Premier.modules;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Player")
public class Player {

    @Id
    private Long id;
    private String firstname;
    private String lastName;
    private int rating;

    public Player(Long id, String firstname, String lastName, int rating) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.rating = rating;
    }

    public Player() {

    }

    public Player setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public Player setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Player setRating(int rating) {
        this.rating = rating;
        return this;
    }
}
