package ru.geekbrains.competition.homework1;

import ru.geekbrains.competition.homework1.obstacles.Cross;
import ru.geekbrains.competition.homework1.obstacles.Obstacle;
import ru.geekbrains.competition.homework1.obstacles.Wall;
import ru.geekbrains.competition.homework1.obstacles.Water;
import ru.geekbrains.competition.homework1.team.Competition;
import ru.geekbrains.competition.homework1.team.Team;

public class MainClass {

    public static void main(String[] args) {
        Team[] competition1 = {
                new Competition("Саша", 5000, 500, 5),
                new Competition("Миша", 3000, 300, 3)
        };
        Team[] competition2 = {
                new Competition("Вася", 5500, 200, 7),
                new Competition("Женя", 3500, 600, 5)
        };

        Team teamOrange = new Team(
                "Апельсины",
                "Апельсинов ждет успех\n" + "Апельсины - лучше всех!",
                competition1
        );

        Team teamApple = new Team(
                "Яблоки",
                "яблоков ждет успех\n" + "Яблоки - лучше всех!",
                competition2
        );

        Team[] teams = {teamOrange, teamApple};

        Obstacle[] obstacles = {
                new Cross(3000),
                new Wall(5),
                new Water(100),
                new Cross(3000)
        };

//        for (int i = 0; i < teams.length; i++) {
//            for (int j = 0; j < teams[i].competition.length; j++) {
//                for (int k = 0; k < obstacles.length; k++) {
//                    obstacles[k].doIt(teams[i].competition[j]);
//                    if (!teams[i].competition[j].isOnDistance()) break;
//                }
//            }
//        }

        for (Team currentTeam : teams) {
            currentTeam.motto();
            for (Team competitor : currentTeam.competition) {
                for (Obstacle obstacle : obstacles) {
                    obstacle.doIt(competitor);
                    if (!competitor.isOnDistance()) break;
                }
            }
        }

        for (Team currentTeam : teams) {
            for (Team competitor : currentTeam.competition) {
                if (competitor.isOnDistance()) {
                    System.out.println(competitor.getName() + " - прошел дистанцию");
                } else {
                    System.out.println(competitor.getName() + " - не прошел дистанцию");
                }
            }
        }
    }
}

