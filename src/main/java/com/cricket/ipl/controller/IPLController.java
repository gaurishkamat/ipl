package com.cricket.ipl.controller;

import com.cricket.ipl.model.Team;
import com.cricket.ipl.service.IPLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class IPLController {

    @Autowired
    private IPLService iplService;

    @GetMapping("greet")
    public String greet(){
        return "Welcome to IPL 2025";
    }

    @GetMapping("teams")
    public List<Team> getTeams(){
        return iplService.getTeams();
    }
}
