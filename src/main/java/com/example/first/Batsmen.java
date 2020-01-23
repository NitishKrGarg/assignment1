package com.example.first;

public class Batsmen extends Player {
    private int runs;
    private int balls_played;
    private int boundaries_hit;

    Batsmen(String name)
    {
        super(name);
        runs = 0;
        balls_played = 0;
        boundaries_hit = 0;
    }

    @Override
    public String getName()
    {
        return super.getName();
    }

    public int getRuns() {
        return runs;
    }

    public int getBalls_played() {
        return balls_played;
    }

    public int getBoundaries_hit() {
        return boundaries_hit;
    }

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
}
