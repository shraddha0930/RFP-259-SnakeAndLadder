package assignments.SnakeAndLadder;

public class SnakeAndLadder {
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    static int START_POSITION = 0;
    static int NEW_POSITION = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Program");

        String p1 = "Player1";
        String p2 = "Player2";


        int WIN_POSITION = 100;
        int player1_position = 0;
        int player2_position = 0;


        System.out.println("Starting position of Player is:" + START_POSITION);

        int count1 = getCount(p1, player1_position, WIN_POSITION);
        int count2 = getCount(p2, player2_position, WIN_POSITION);

        //comparing and finding the winner
        if (count1 > count2)
            System.out.println(p2 + " is the winner ");
        else if (count2 > count1)
            System.out.println(p1 + "is the  winner");
        else if (count1 == count2)
            System.out.println("Match Draw");
    }
    public static int getCount(String name, int START_POSITION,int WIN_POSITION){
        int count=0;

        while (START_POSITION < WIN_POSITION) {

            int DieRoll = (int) (Math.random() * 6) + 1;
            System.out.println("After rolling die number is:" + DieRoll);
            count++;

            int CheckOption = (int) (Math.random() * 3);
            System.out.println("Checkoption is:" +CheckOption);



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
            System.out.println("Now"+ name +" at " + START_POSITION + "th" + " Position");
        }
        System.out.println(name + "won!! \nAfter Die Rolled "+ count +" Times");

        return count;
    }
}
