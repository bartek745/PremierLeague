package com.bartek.Premier.modules;


import javax.persistence.*;

@Entity
@Table(name= "Teams")
public class TeamEntity{
    @Id
    private long id;
    private String teamName;
    private int won;
    private int drawn;
    private int lost;
    private int goalsScored;
    private int goalsLost;
    private int points;



    private byte tablePosition;
    private String startingElevenPower;
    @OneToOne
    @JoinColumn(name = "manager_id")
    private TeamManager manager;
    private String stadium;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private TeamPlayer player;

    public TeamPlayer getPlayer() {
        return player;
    }

    public TeamManager getManager() {
        return manager;
    }


    public TeamEntity() {

    }

    public TeamEntity(long id, String teamName, int won, int drawn, int lost, int goalsScored, int goalsLost, int points) {
        this.id = id;
        this.teamName = teamName;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.goalsScored = goalsScored;
        this.goalsLost = goalsLost;
        this.points = points;
    }

    public TeamEntity(long id, String teamName, TeamManager manager, String stadium) {
        this.id = id;
        this.teamName = teamName;
        this.manager = manager;
        this.stadium = stadium;
    }

    public TeamEntity(long id, String teamName, int won, int drawn, int lost, int goalsScored, int goalsLost, int points, byte tablePosition, String startingElevenPower, TeamManager manager, String stadium, TeamPlayer player) {
        this.id = id;
        this.teamName = teamName;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.goalsScored = goalsScored;
        this.goalsLost = goalsLost;
        this.points = points;
        this.tablePosition = tablePosition;
        this.startingElevenPower = startingElevenPower;
        this.manager = manager;
        this.stadium = stadium;
        this.player = player;
    }

    public long getId() {
        return id;
    }

    public TeamEntity setId(long id) {
        this.id = id;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public TeamEntity setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    public int getWon() {
        return won;
    }

    public TeamEntity setWon(int won) {
        this.won = won;
        return this;
    }

    public int getDrawn() {
        return drawn;
    }

    public TeamEntity setDrawn(int drawn) {
        this.drawn = drawn;
        return this;
    }

    public int getLost() {
        return lost;
    }

    public TeamEntity setLost(int lost) {
        this.lost = lost;
        return this;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public TeamEntity setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
        return this;
    }

    public int getGoalsLost() {
        return goalsLost;
    }

    public TeamEntity setGoalsLost(int goalsLost) {
        this.goalsLost = goalsLost;
        return this;
    }

    public int getPoints() {
        return points;
    }

    public TeamEntity setPoints(int points) {
        this.points = points;
        return this;
    }


    public String getStadium() {
        return stadium;
    }

    public TeamEntity setStadium(String stadium) {
        this.stadium = stadium;
        return this;
    }

    public TeamEntity setManager(TeamManager manager) {
        this.manager = manager;
        return this;
    }

    public TeamEntity setPlayer(TeamPlayer player) {
        this.player = player;
        return this;
    }

    public byte getTablePosition() {
        return tablePosition;
    }

    public TeamEntity setTablePosition(byte tablePosition) {
        this.tablePosition = tablePosition;
        return this;
    }

    public String getStartingElevenPower() {
        return startingElevenPower;
    }

    public TeamEntity setStartingElevenPower(String startingElevenPower) {
        this.startingElevenPower = startingElevenPower;
        return this;
    }
}
