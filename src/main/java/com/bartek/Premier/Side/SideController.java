package com.bartek.Premier.Side;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

    @Controller
public class SideController {


        @RequestMapping(path = "/pl/side/table", method = RequestMethod.GET)
        public String getSideForm(Model model) {
            model.addAttribute(("SideForm"), new SideForm());
            model.addAttribute("Table", SideMemoryStorageService.getTableTeam());
            return "pl/side/table";


        }


        @RequestMapping(path = "/pl/side/match", method = RequestMethod.GET)
        public String getSideForm1(Model model) {
            model.addAttribute((""), new SideForm());
            model.addAttribute("Match", SideMemoryStorageService.getTableMatch());
            return "pl/side/table";
        }

        @RequestMapping(path = "/pl/side/team", method = RequestMethod.GET)
        public String getSideForm2(Model model) {
            model.addAttribute(("SideForm"), new SideForm());
            model.addAttribute("Table", SideMemoryStorageService.getTeamEntity());
            return "pl/side/table";
        }


    }




