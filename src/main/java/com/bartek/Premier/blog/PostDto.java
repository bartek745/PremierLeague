package com.bartek.Premier.blog;

import org.springframework.beans.factory.annotation.Autowired;

public class PostDto {
    private String match;
    private String winner;
    @Autowired
    public PostDto(String match, String winner) {
        this.match = match;
        this.winner = winner;
    }

    public String getMatch() {
        return match;
    }

    public PostDto setMatch(String match) {
        this.match = match;
        return this;
    }

    public String getWinner() {
        return winner;
    }

    public PostDto setWinner(String winner) {
        this.winner = winner;
        return this;
    }



}
