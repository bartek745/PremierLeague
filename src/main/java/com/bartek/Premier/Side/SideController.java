package com.bartek.Premier.Side;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

    @Controller
public class SideController {


        @RequestMapping(path="/pl/side/table", method= RequestMethod.GET)
    public String getSideForm(Model model){
        model.addAttribute(("SideForm"),new SideForm());
        model.addAttribute("posts",SideMemoryStorageService.getMatch());
        return "blog/posts";
    }
    @RequestMapping(path="/pl/side/match", method= RequestMethod.POST)
    public String createSideForm(SideForm sideForm) {
        SideDto sideDto =SideMemoryStorageService.createMatch(sideForm.getTeam1(), sideForm.getTeam2());
        return "/pl/side/match";
    }
    @RequestMapping(path = "/pl/table/posts/", method = RequestMethod.DELETE)
    public String deleteSideform (@PathVariable("table") String team1,String team2, Model model){
       model.addAttribute("match", SideMemoryStorageService.deleteMatch);
        return "table/post";
    }}



