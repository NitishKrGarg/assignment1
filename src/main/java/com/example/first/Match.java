package com.example.first;
import java.lang.Math;

public class Match {
    // 7 is wicket
    //int score_range[] = {0,1,2,3,4,5,6,7};
    int score_team_one = 0;
    int score_team_two = 0;
    int wicket_team_one = 0;
    int wicket_team_two = 0;
    int overs = 50;
    int result;
    int balls_played_team_one = 0;
    int balls_played_team_two = 0;
    void start_game()
    {
        int rand;
        // team one batting
        for(balls_played_team_one=1 ; balls_played_team_one<=(overs * 6) ; balls_played_team_one++)
        {
            rand = (int)(Math.random() * 8) ;
            // 7 is wicket;
            if(rand == 7)
            {

                this.wicket_team_one++ ;
                if(this.wicket_team_one == 10)
                    break;
            }
            else
                this.score_team_one += rand;
        }
        //System.out.println(this.wicket_team_one);
        //team two batting
        for(balls_played_team_two=1 ; balls_played_team_two<=(overs * 6) ; balls_played_team_two++)
        {
            rand = (int)(Math.random() * 8) ;
            // 7 is wicket;
            if(rand == 7)
            {
                this.wicket_team_two++ ;
                if(this.wicket_team_two == 10)
                    break;
            }
            else
            {
                this.score_team_two += rand;
                if(this.score_team_two > this.score_team_one)
                {
                    break;
                }
            }
        }
        //System.out.println(this.wicket_team_two);

        // if team one wins result is 1
        // if team two wins result is 2
        // if match is draw result is 0

        if(this.score_team_one > this.score_team_two)
            result = 1;
        else if(this.score_team_one < this.score_team_two)
            result = 2;
        else
            result = 0;

    }
}
