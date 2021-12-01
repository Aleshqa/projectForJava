package Course2.lesson1.HW1.obstacle;

import Course2.lesson1.HW1.team.Participant;

public class Bar extends Obstacle{
    private final int height;

    public Bar(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}