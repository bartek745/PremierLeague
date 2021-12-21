package com.bartek.Premier.Side;

import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
@Service
@Scope("singleton")

public class SideMemoryStorageService  {



        private static final List<SideDto> STORAGE=new ArrayList<>();


    static {
            STORAGE.add(new SideDto("Manchester United","50%","Arsenal"));
            STORAGE.add(new SideDto("Liverpool", "60%", "Everton"));

        }

        public static List<SideDto> getMatch() {
            return STORAGE;
        }




        public static SideDto createMatch(String team1, String team2){
            SideDto match = new SideDto(team1, team2);
            STORAGE.add(match);
            return match;
        }
    }
