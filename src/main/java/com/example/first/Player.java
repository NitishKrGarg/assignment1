package com.example.first;

import lombok.Data;
import lombok.Getter;

@Data
public class Player {

    private String name;
    private int age;
    private String country;
    private String currentTeam;
    private String role;

    private int runs;
    private int balls_played;
    private int boundaries_hit;
    private int rating;

    private int overs_bowled;
    private int runs_given;
    private int wickets_taken;
    private int maidens_bowled;


    public Player(String name,String role,int rating)
    {
        this.name = name;
        this.role = role;
        this.rating = rating;
        runs = 0;
        balls_played = 0;
        boundaries_hit = 0;
        overs_bowled = 0;
        runs_given = 0;
        wickets_taken = 0;
        maidens_bowled = 0;
    }

//    public String getName() { return name; }

    public String getRole() { return role; }

    public int getRating() { return rating; }

    public int getOvers_bowled() { return this.overs_bowled; }


    public void updateRuns(int score)
    {
        this.runs += score;
    }

    public void updateBalls_played(int i)
    {
        this.balls_played += i;
    }

    public void updateBoundaries_hit(int i)
    {
        this.boundaries_hit += 1;
    }



    public void updateRuns_given(int score)
    {
        this.runs_given += score;
    }

    public void updateWickets_taken(int i) {
        this.wickets_taken += i;
    }

    public void updateOvers_bowled(int i)
    {
        this.overs_bowled += i;
    }

    public void updateMaidens_bowled(int i) { this.maidens_bowled += i; }

}
