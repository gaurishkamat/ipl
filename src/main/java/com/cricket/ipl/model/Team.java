package com.cricket.ipl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Team {
    @Id
    private int Id;
    private String name;
    private int titlesWon;

    public Team() {
    }

    public Team(int id, String name, int titlesWon) {
        Id = id;
        this.name = name;
        this.titlesWon = titlesWon;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTitlesWon() {
        return titlesWon;
    }

    public void setTitlesWon(int titlesWon) {
        this.titlesWon = titlesWon;
    }

    @Override
    public String toString() {
        return "Team{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", titlesWon=" + titlesWon +
                '}';
    }
}
