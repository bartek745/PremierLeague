package com.bartek.Premier.Side;

import org.springframework.beans.factory.annotation.Autowired;

public class SideDto {
    private String team1;
    private String possibilityOfWin;
    private String team2;

    public SideDto(String team1, String possibilityOfWin, String team2) {
        this.team1 = team1;
        this.possibilityOfWin = possibilityOfWin;
        this.team2 = team2;
    }

    public SideDto(String team1, String team2) {

    }

    public String getTeam1() {
        return team1;
    }



    public String getPossibilityOfWin() {
        return possibilityOfWin;
    }

    public String getTeam2() {
        return team2;
    }
}
