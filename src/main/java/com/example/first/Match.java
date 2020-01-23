package com.example.first;
import java.lang.Math;

public class Match {
    // 7 is wicket
    //int score_range[] = {0,1,2,3,4,5,6,7};

    private int max_overs = 50;


    void start_game(Team team_one,Team team_two)
    {
        team_two.setScore(1800);
        play_inning(team_one,team_two);
        team_two.setScore(0);
        play_inning(team_two,team_one);
    }

    void play_inning(Team bat,Team bowl)
    {
        int striker = bat.getWickets();
        int non_striker = bat.getWickets() + 1;

        int score;
        int bowler = (int)(Math.random() * 6);
        int maiden_balls = 0;
        // team one batting

        int balls;
        for(balls = 1 ; balls <= (max_overs * 6) ; balls++)
        {
            score = (int)(Math.random() * 8) ;
            // 7 is wicket;
            if(score == 0)
            {
                bat.batter[striker].updateBalls_played(1);
                maiden_balls ++ ;
            }
            else if(score == 1 || score == 3 || score == 5)
            {
                bat.updateScore(score);
                if(bat.getScore() > bowl.getScore())
                    break;

                bat.batter[striker].updateRuns(score);
                bat.batter[striker].updateBalls_played(1);

                int tmp = striker;
                striker = non_striker;
                non_striker = tmp;

                bowl.bowlers[bowler].updateRuns_given(score);
            }
            else if(score == 2)
            {
                bat.updateScore(score);
                if(bat.getScore() > bowl.getScore())
                    break;

                bat.batter[striker].updateRuns(score);
                bat.batter[striker].updateBalls_played(1);

                bowl.bowlers[bowler].updateRuns_given(score);
            }
            else if(score == 4 || score == 6)
            {
                bat.updateScore(score);
                if(bat.getScore() > bowl.getScore())
                    break;

                bat.batter[striker].updateRuns(score);
                bat.batter[striker].updateBoundaries_hit(1);
                bat.batter[striker].updateBalls_played(1);

                bowl.bowlers[bowler].updateRuns_given(score);
            }
            else
            {
                bat.updateWickets(1);
                bat.batter[striker].updateBalls_played(1);
                if(bat.getWickets() == 10)
                    break;

                striker = bat.getWickets() + 1;
                bowl.bowlers[bowler].updateWickets_taken(1);
            }


            if(balls % 6 == 0)
            {
                bowl.bowlers[bowler].updateOvers_bowled(1);
                if(maiden_balls == 6)
                    bowl.bowlers[bowler].updateMaidens_bowled(1);

                bowler = get_bowler(bowler,bowl);
            }
        }
        bat.setTotal_balls_played(balls);
    }

    int get_bowler(int current_bowler,Team bowl)
    {
        int bowler = (int)(Math.random() * 6);
        while( bowler == current_bowler || bowl.bowlers[bowler].getOvers_bowled() == 10)
            bowler = (int)(Math.random() * 6);
        return bowler;
    }

    public int getMax_overs() {
        return max_overs;
    }

}
