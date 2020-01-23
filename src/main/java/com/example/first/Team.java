package com.example.first;

public class Team {
    private int score;
    private int wickets;
    private int total_balls_played;
    Batsmen batter[] = new Batsmen[11];
    Bowler bowlers[] = new Bowler[6];

    Team(int team_number)
    {
        this.batter[0] = new Batsmen(team_number+"_one");
        this.batter[1] = new Batsmen(team_number+"_two");
        this.batter[2] = new Batsmen(team_number+"_three");
        this.batter[3] = new Batsmen(team_number+"_four");
        this.batter[4] = new Batsmen(team_number+"_five");
        this.batter[5] = new Batsmen(team_number+"_six");
        this.batter[6] = new Batsmen(team_number+"_seven");
        this.batter[7] = new Batsmen(team_number+"_eight");
        this.batter[8] = new Batsmen(team_number+"_nine");
        this.batter[9] = new Batsmen(team_number+"_ten");
        this.batter[10] = new Batsmen(team_number+"_eleven");

        this.bowlers[0] = new Bowler(team_number+"one");
        this.bowlers[1] = new Bowler(team_number+"two");
        this.bowlers[2] = new Bowler(team_number+"three");
        this.bowlers[3] = new Bowler(team_number+"four");
        this.bowlers[4] = new Bowler(team_number+"five");
        this.bowlers[5] = new Bowler(team_number+"six");

        this.score = 0;
        this.wickets = 0;
        this.total_balls_played = 0;
    }

    public int getScore() {
        return score;
    }

    public int getWickets() {
        return wickets;
    }

    public int getTotal_balls_played() {
        return total_balls_played;
    }

    public Batsmen[] getBatter() {
        return batter;
    }

    public Bowler[] getBowlers() {
        return bowlers;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTotal_balls_played(int total_balls_played) {
        this.total_balls_played = total_balls_played;
    }

    public void updateScore(int score)
    {
        this.score += score;
    }

    public void updateWickets(int wickets) {
        this.wickets += wickets;
    }

}
