package ru.geekbrains.competition.homework1.obstacles;

import ru.geekbrains.competition.homework1.team.Team;

public class Wall extends Obstacle {

    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Team team) {
        team.jump(height);
    }
}
