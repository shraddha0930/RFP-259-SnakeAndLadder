package assignments.SnakeAndLadder;

public class SnakeAndLadder {
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Program");

        int START_POSITION = 0;
        int NEW_POSITION = 0;
        int WIN_POSITION = 100;
        int count=0;

        System.out.println("Starting position of Player is:" + START_POSITION);

        while (START_POSITION < WIN_POSITION) {

            int DieRoll = (int) (Math.random() * 6) + 1;
            System.out.println("After rolling die number is:" + DieRoll);

            int CheckOption = (int) (Math.random() * 3);
            System.out.println("Checkoption is:" +CheckOption);

            count++;

            switch (CheckOption) {
                case NO_PLAY:
                    NEW_POSITION = 0;
                    break;
                case LADDER:
                    NEW_POSITION = DieRoll;
                    break;
                case SNAKE:
                    NEW_POSITION = - DieRoll;
                    break;
            }

            START_POSITION = START_POSITION + NEW_POSITION;

            if (START_POSITION < 0) {
                START_POSITION = 0;
            }
            if (START_POSITION>100)
            {
                START_POSITION=NEW_POSITION;
            }
            System.out.println("Now Player at " + START_POSITION + "th" + " Position");
        }
        System.out.println("Player won!! \nAfter Die Rolled "+ count +" Times");
    }
}
