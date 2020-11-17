package ru.geekbrains.competition.homework1.obstacles;

import ru.geekbrains.competition.homework1.team.Team;

public class Water extends  Obstacle {

    int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Team team) {
        team.swim(distance);
    }
}
