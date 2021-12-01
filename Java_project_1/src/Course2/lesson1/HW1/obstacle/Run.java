package Course2.lesson1.HW1.obstacle;

import Course2.lesson1.HW1.team.Participant;

public class Run extends Obstacle{
    private final int distance;

    public Run(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(distance);
    }
}