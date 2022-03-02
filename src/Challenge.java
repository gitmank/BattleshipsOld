import java.io.*;
class Challenge {
    Challenge() {
    }
    void start(Board computerhits,Board playerships,Board playerhits) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Board    b  = new Board();
        Gameplay gp = new Gameplay();

        b.defaultValues(playerships);
        try {
            new Play().playComputer(computerhits,playerships,playerhits);
        }
        catch (Exception e) {
            gp.scorecard(computerhits);
        }
        double computer_score = gp.getScore(computerhits);
        double player_score = gp.getScore(playerhits);
        System.out.println("\nPlayer score\t"+player_score);
        System.out.println("\nComputer score\t"+computer_score);
        if (player_score>computer_score)
            System.out.println("\nYOU WON!");
        else
            System.out.println("The computer beat you ;(");
        Thread.sleep(4000);
        new Printables().loadingscreen();
    }
}