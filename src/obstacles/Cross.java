package obstacles;

import ru.geekbrains.competition.team.Team;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Team o) {
        o.run(length);
    }
}
