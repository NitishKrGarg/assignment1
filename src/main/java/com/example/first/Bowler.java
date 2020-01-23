package com.example.first;

public class Bowler extends Player {
    private int overs_bowled;
    private int runs_given;
    private int wickets_taken;
    private int maidens_bowled;

    Bowler(String name)
    {
        super(name);
        overs_bowled = 0;
        runs_given = 0;
        wickets_taken = 0;
        maidens_bowled = 0;
    }

    @Override
    public String getName()
    {
        return super.getName();
    }

    public int getOvers_bowled() {
        return this.overs_bowled;
    }

    public int getRuns_given() {
        return this.runs_given;
    }

    public int getWickets_taken() {
        return this.wickets_taken;
    }

    public int getMaidens_bowled() {
        return this.maidens_bowled;
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

    public void updateMaidens_bowled(int i)
    {
        this.maidens_bowled += i;
    }
}
