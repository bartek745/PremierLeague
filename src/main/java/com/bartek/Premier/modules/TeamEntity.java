package com.bartek.Premier.modules;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "Teams")
public class TeamEntity {
    @Id
    private long id;
    private String teamName;
    private int won;
    private int drawn;
    private int lost;
    private int goalsScored;
    private int goalsLost;
    private int points;
    @OneToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;
    private String stadium;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public Manager getManager() {
        return manager;
    }


    public TeamEntity() {

    }


    public TeamEntity(long id, String teamName, int won, int drawn, int lost, int goalsScored, int goalsLost, int points, Manager manager, String stadium, Player player) {
        this.id = id;
        this.teamName = teamName;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.goalsScored = goalsScored;
        this.goalsLost = goalsLost;
        this.points = points;
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

    public TeamEntity setManager(Manager manager) {
        this.manager = manager;
        return this;
    }

    public TeamEntity setPlayer(Player player) {
        this.player = player;
        return this;
    }
}
