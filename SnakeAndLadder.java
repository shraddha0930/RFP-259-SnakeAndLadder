package assignments.SnakeAndLadder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Program");

        int START_POSITION = 0;
        System.out.println("Starting postion is:" +START_POSITION);

        int DieRoll = (int) (Math.random()*6)+1;
        System.out.println("After rolling die number is:" +DieRoll);

    }
}
