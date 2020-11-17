package ru.geekbrains.competition.team;

public class Competition extends Team {

    public Competition(String teamName, String motto) {
        super(teamName, motto);
    }

    public Competition(String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxSwimDistance, maxJumpHeight);
    }
}
