package com.example.first;

public class Match_Controller {

    String toss_won_by;

    Team team_one = new Team(1);
    Team team_two = new Team(2);

    Match match = new Match();

    String result;

    Match_Controller start()
    {
        int toss = ((int)(Math.random()*2));
        if(toss == 0)
        {
            toss_won_by = "Team One";
            match.start_game(team_one,team_two);
        }
        else
        {
            toss_won_by = "Team Two";
            match.start_game(team_two,team_one);
        }

        if(team_one.getScore() > team_two.getScore())
            result = "Team One Wins.";

        else if(team_one.getScore() < team_two.getScore())
            result = "Team Two Wins.";
        else
            result = "Its a Draw.";

        return this;
    }

    public Match getMatch() {
        return match;
    }

    public Team getTeam_one() {
        return team_one;
    }

    public Team getTeam_two() {
        return team_two;
    }

    public String getToss_won_by() {
        return toss_won_by;
    }

    public String getResult() {
        return result;
    }
}
