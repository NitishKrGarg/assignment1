package com.example.first;
import lombok.Data;

import java.lang.Math;

@Data
public class Match {
    // 7 is wicket
    //int score_range[] = {0,1,2,3,4,5,6,7};

    private int max_overs = 50;


    public void start_game(Team team_one,Team team_two)
    {
        //play first innings
        play_inning(team_one,team_two,1);

        //play second innings
        play_inning(team_two,team_one,2);
    }

    public void play_inning(Team bat,Team bowl,int inning)
    {
        int striker = bat.getWickets();
        int non_striker = bat.getWickets() + 1;

        int score;
        int bowler = get_bowler(-1,bowl);
        int maiden_balls = 0;

        int balls;
        for(balls = 1 ; balls <= (max_overs * 6) ; balls++)
        {
            //score = (int)(Math.random() * 8) ;
            score = getScore(bat.player[striker].getRating());
            // 7 is wicket;
            if(score == 0)
            {
                bat.player[striker].updateBalls_played(1);
                maiden_balls ++ ;
            }
            else if(score == 1 || score == 3 || score == 5)
            {
                bat.updateScore(score);
                if(inning == 2 && bat.getScore() > bowl.getScore())
                    break;

                bat.player[striker].updateRuns(score);
                bat.player[striker].updateBalls_played(1);

                int tmp = striker;
                striker = non_striker;
                non_striker = tmp;

                bowl.player[bowler].updateRuns_given(score);
            }
            else if(score == 2)
            {
                bat.updateScore(score);
                if(inning == 2 && bat.getScore() > bowl.getScore())
                    break;

                bat.player[striker].updateRuns(score);
                bat.player[striker].updateBalls_played(1);

                bowl.player[bowler].updateRuns_given(score);
            }
            else if(score == 4 || score == 6)
            {
                bat.updateScore(score);
                if(inning == 2 && bat.getScore() > bowl.getScore())
                    break;

                bat.player[striker].updateRuns(score);
                bat.player[striker].updateBoundaries_hit(1);
                bat.player[striker].updateBalls_played(1);

                bowl.player[bowler].updateRuns_given(score);
            }
            else
            {
                bat.updateWickets(1);
                bat.player[striker].updateBalls_played(1);
                if(bat.getWickets() == 10)
                    break;

                striker = bat.getWickets() + 1;
                bowl.player[bowler].updateWickets_taken(1);
            }


            if(balls % 6 == 0)
            {
                int tmp = striker;
                striker = non_striker;
                non_striker = tmp;

                bowl.player[bowler].updateOvers_bowled(1);
                if(maiden_balls == 6)
                    bowl.player[bowler].updateMaidens_bowled(1);

                bowler = get_bowler(bowler,bowl);
            }
        }
        bat.setTotal_balls_played(balls);
    }

    public int get_bowler(int current_bowler,Team bowl)
    {
        int bowler = (int)(Math.random() * 11) ;
        while( bowler == current_bowler || bowl.player[bowler].getOvers_bowled() == 10 || bowl.player[bowler].getRole() != "bowler")
            bowler = (int)(Math.random() * 11);
        return bowler;
    }

    public int getScore(int rating)
    {
        //int wicket =
        int total = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8) * rating;
        int x  = (int)(Math.random() * total) ;

        if(x<=4*rating)
            return 7;
        else if(x <= (10*rating) )
            return 0;
        else if(x <= (18*rating) )
            return 1;
        else if(x <= (25*rating) )
            return 2;
        else if(x <= (28*rating) )
            return 3;
        else if(x <= (33*rating) )
            return 4;
        else if(x <= (34*rating) )
            return 5;
        else
            return 6;

    }
}
