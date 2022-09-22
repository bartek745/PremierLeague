package com.bartek.Premier.Winner;

import com.bartek.Premier.Winner.StartingElevenPower;
import com.bartek.Premier.modules.TeamEntity;
import com.bartek.Premier.modules.TeamPower;
import org.springframework.web.bind.annotation.GetMapping;

public class TeamChances {
    private TeamPower teamPower;
    private int lastFiveMatches;
    private StartingElevenPower startingElevenPower;
    private boolean host;
    private float goalsPerGame;
    private float lostGoalsPerGame;


    public TeamPower getTeamPower() {
        return teamPower;
    }

    public TeamChances setTeamPower(TeamPower teamPower) {
        this.teamPower = teamPower;
        return this;
    }

    public int getLastFiveMatches() {
        return lastFiveMatches;
    }

    public TeamChances setLastFiveMatches(int lastFiveMatches) {
        this.lastFiveMatches = lastFiveMatches;
        return this;
    }

    public StartingElevenPower getStartingElevenPower() {
        return startingElevenPower;
    }

    public TeamChances setStartingElevenPower(StartingElevenPower startingElevenPower) {
        this.startingElevenPower = startingElevenPower;
        return this;
    }

    public boolean isHost() {
        return host;
    }

    public TeamChances setHost(boolean host) {
        this.host = host;
        return this;
    }

    public float getGoalsPerGame() {
        return goalsPerGame;
    }

    public TeamChances setGoalsPerGame(float goalsPerGame) {
        this.goalsPerGame = goalsPerGame;
        return this;
    }

    public float getLostGoalsPerGame() {
        return lostGoalsPerGame;
    }

    public TeamChances setLostGoalsPerGame(float lostGoalsPerGame) {
        this.lostGoalsPerGame = lostGoalsPerGame;
        return this;
    }

}
