package com.bartek.Premier.Side;

import com.bartek.Premier.Winner.TeamChances;

public class SideDto {
    private String team1;
    private TeamChances teamChances=new TeamChances();
    Class pow=TeamChances.class;
    String powTOString=pow.toString();
    private String team2;

    public SideDto() {
    }
    public SideDto(String team1, String powTOString, String team2) {
        this.team1 = team1;
        this.powTOString = powTOString;
        this.team2 = team2;
    }
public SideDto(String team1, String team2) {
        this.team1 = team1;
        this.powTOString = powTOString;
        this.team2 = team2;
    }


    public String getTeam1() {
        return team1;
    }




    public String getTeam2() {
        return team2;
    }
}
