package com.bartek.Premier.Table;

import com.bartek.Premier.modules.TeamEntity;

import javax.persistence.*;

@Entity
@Table(name = "TableMatch")
public class TableMatch {
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "team_entity_1_id")
    private TeamEntity teamEntity1;

    @OneToOne
    @JoinColumn(name = "team_entity_2_id")
    private TeamEntity teamEntity2;


    public TeamEntity getTeamEntity2() {
        return teamEntity2;
    }

    public TeamEntity getTeamEntity1() {
        return teamEntity1;
    }


}
