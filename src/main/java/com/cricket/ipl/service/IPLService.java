package com.cricket.ipl.service;

import com.cricket.ipl.model.Team;
import com.cricket.ipl.repo.IPLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPLService {

    @Autowired
    private IPLRepository iplRepository;

    public List<Team> getTeams() {
        return iplRepository.getTeams();
    }
}
