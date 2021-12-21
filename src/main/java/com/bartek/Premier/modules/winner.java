package com.bartek.Premier.modules;

import javax.persistence.Id;
import java.sql.Connection;
import java.sql.SQLException;


public class winner {
    private String team1;
    private String team2;


    public String getTeam1() {
        return team1;
    }

    public winner setTeam1(String team1) {
        this.team1 = team1;
        return this;
    }

    public String getTeam2() {
        return team2;
    }

    public winner setTeam2(String team2) {
        this.team2 = team2;
        return this;
    }
}

