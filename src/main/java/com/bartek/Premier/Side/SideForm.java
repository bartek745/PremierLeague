package com.bartek.Premier.Side;


import com.bartek.Premier.Table.TableMatch;
import com.bartek.Premier.Table.TableTeam;
import com.bartek.Premier.Winner.MatchPrediction;
import com.bartek.Premier.modules.TeamEntity;

import javax.persistence.Entity;
import javax.persistence.Table;


public class SideForm {
    private TeamEntity teamEntity;
    private TableMatch tableMatch;
    private TableTeam tableTeam;
    private MatchPrediction matchPrediction;

    public SideForm() {
    }

    public TeamEntity getTeamEntity() {
        return teamEntity;
    }

    public SideForm setTeamEntity(TeamEntity teamEntity) {
        this.teamEntity = teamEntity;
        return this;
    }

    public TableMatch getTableMatch() {
        return tableMatch;
    }

    public SideForm setTableMatch(TableMatch tableMatch) {
        this.tableMatch = tableMatch;
        return this;
    }

    public TableTeam getTableTeam() {
        return tableTeam;
    }

    public SideForm setTableTeam(TableTeam tableTeam) {
        this.tableTeam = tableTeam;
        return this;
    }

    public MatchPrediction getMatchPrediction() {
        return matchPrediction;
    }

    public SideForm setMatchPrediction(MatchPrediction matchPrediction) {
        this.matchPrediction = matchPrediction;
        return this;
    }
}


