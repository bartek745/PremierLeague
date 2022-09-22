package com.bartek.Premier.Side;

import com.bartek.Premier.Table.TableTeam;
import com.bartek.Premier.modules.TeamEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("singleton")

public class SideMemoryStorageService  {




        private static final List<SideDto> STORAGE=new ArrayList<>();




        public static List<SideDto> getTableMatch() {
            return STORAGE;
        }
        public static List<SideDto> getTeamEntity(){return STORAGE;}
        public static List<SideDto> getTableTeam(){return STORAGE;}


        public static SideDto createMatch(TeamEntity teamEntity1,TeamEntity teamEntity2){
            SideDto matchTable = new SideDto();
            STORAGE.add(matchTable);
            return matchTable;
        }



}
