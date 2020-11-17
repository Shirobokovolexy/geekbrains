package obstacles;

import ru.geekbrains.competition.team.Team;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Team o) {
        o.jump(height);
    }
}
