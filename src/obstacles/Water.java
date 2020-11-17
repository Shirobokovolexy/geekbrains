package obstacles;

import ru.geekbrains.competition.team.Team;

public class Water extends  Obstacle {
    int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Team o) {
        o.swim(distance);
    }
}
