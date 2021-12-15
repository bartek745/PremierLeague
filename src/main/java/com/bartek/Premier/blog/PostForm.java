package com.bartek.Premier.blog;

public class PostForm {
    private Long id;
    private String match;
    private String winner;
    public String getMatch() {
        return match;
    }

    public Long getId() {
        return id;
    }

    public PostForm setId(Long id) {
        this.id = id;
        return this;
    }

    public PostForm setMatch(String match) {
        this.match = match;
        return this;
    }

    public String getWinner() {
        return winner;
    }

    public PostForm setWinner(String winner) {
        this.winner = winner;
        return this;
    }

}


