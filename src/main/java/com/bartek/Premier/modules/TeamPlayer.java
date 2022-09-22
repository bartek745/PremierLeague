package com.bartek.Premier.modules;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Player")
public class TeamPlayer {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private int rating;

    private String teamName;
    private String nationality;

    public TeamPlayer(Long id, String firstname, String lastName, int rating, String teamName, String nationality) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
        this.teamName = teamName;
        this.nationality = nationality;
    }

    public TeamPlayer() {

    }

    public Long getId() {
        return id;
    }

    public TeamPlayer setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public TeamPlayer setFirstName(String firstname) {
        this.firstName = firstname;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public TeamPlayer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getRating() {
        return rating;
    }

    public TeamPlayer setRating(int rating) {
        this.rating = rating;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public TeamPlayer setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public TeamPlayer setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
}
