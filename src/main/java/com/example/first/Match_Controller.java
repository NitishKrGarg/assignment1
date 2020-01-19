package com.example.first;

public class Match_Controller {

    public void initialize()
    {
        Player team_one[] = new Player[11];
        Player team_two[] = new Player[11];

        //assign player names

    }

    String start()
    {
        Match obj = new Match();
        obj.start_game();
        String str =  "Match stats are";
        String result;
        if(obj.result == 1)
            result = "Team one wins";
        else if(obj.result == 2)
            result = "Team two wins";
        else
            result = "Its a draw...";
        String spc = System.getProperty("line.separator");
        //Team one stats
        str = str.concat(" Team one score is : ").concat(Integer.toString(obj.score_team_one)).concat(" Team one wicket is : ").concat(Integer.toString(obj.wicket_team_one)).concat(" Overs played by team one is ").concat(Integer.toString((obj.balls_played_team_one)/6)).concat(".").concat(Integer.toString((obj.balls_played_team_one)%6)).concat(" overs......................................................................................................................................");
        str = str + spc;
        //Team two stats
        str = str.concat(" Team two score is : ").concat(Integer.toString(obj.score_team_two)).concat(" Team two wicket is : ").concat(Integer.toString(obj.wicket_team_two)).concat(" Overs played by team one is ").concat(Integer.toString((obj.balls_played_team_two)/6)).concat(".").concat(Integer.toString((obj.balls_played_team_two)%6)).concat(" overs.....................................................................................................");

        //Final result
        str = str.concat(" Match result is : ").concat(result);
        return str;
    }
}
