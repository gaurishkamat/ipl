package com.cricket.ipl.repo;

import com.cricket.ipl.model.Team;
import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class IPLRepository {

    private List<Team> teams = new ArrayList<>(Arrays.asList(new Team(1, "Chennai Super Kings", 5)));

    public List<Team> getTeams() {
        return teams;
    }
}
