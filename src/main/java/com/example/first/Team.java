package com.example.first;

import lombok.Data;

@Data
public class Team {
    private int score;
    private int wickets;
    private int total_balls_played;

    Player player[] = new Player[11];

    public Team(int team_number)
    {
        if(team_number == 1) {
            this.player[0] = new Player(team_number + "_one", "batsmen", 9);
            this.player[1] = new Player(team_number + "_two", "batsmen", 9);
            this.player[2] = new Player(team_number + "_three", "batsmen", 7);
            this.player[3] = new Player(team_number + "_four", "batsmen", 8);
            this.player[4] = new Player(team_number + "_five", "batsmen", 7);
            this.player[5] = new Player(team_number + "_six", "batsmen", 9);
            this.player[6] = new Player(team_number + "_seven", "bowler", 6);
            this.player[7] = new Player(team_number + "_eight", "bowler", 5);
            this.player[8] = new Player(team_number + "_nine", "bowler", 3);
            this.player[9] = new Player(team_number + "_ten", "bowler", 2);
            this.player[10] = new Player(team_number + "_eleven", "bowler", 2);
        }
        else
        {
            this.player[0] = new Player(team_number + "_one", "batsmen", 9);
            this.player[1] = new Player(team_number + "_two", "batsmen", 8);
            this.player[2] = new Player(team_number + "_three", "batsmen", 7);
            this.player[3] = new Player(team_number + "_four", "batsmen", 9);
            this.player[4] = new Player(team_number + "_five", "batsmen", 7);
            this.player[5] = new Player(team_number + "_six", "batsmen", 8);
            this.player[6] = new Player(team_number + "_seven", "bowler", 6);
            this.player[7] = new Player(team_number + "_eight", "bowler", 5);
            this.player[8] = new Player(team_number + "_nine", "bowler", 4);
            this.player[9] = new Player(team_number + "_ten", "bowler", 2);
            this.player[10] = new Player(team_number + "_eleven", "bowler", 2);
        }

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
