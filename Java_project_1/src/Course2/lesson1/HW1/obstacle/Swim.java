package Course2.lesson1.HW1.obstacle;

import Course2.lesson1.HW1.team.Participant;

public class Swim extends Obstacle{
    private final int distance;

    public Swim(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(distance);
    }
}