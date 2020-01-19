package com.example.first;

public class Player {

    String name;
    int score;
    Player(String name)
    {
        this.name = name;
    }
    void update_score(int score)
    {
        this.score += score;
    }
    String get_name()
    {
        return this.name;
    }
    int get_score()
    {
        return this.score;
    }
}
