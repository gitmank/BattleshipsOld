import java.io.*;
class Gameplay {
    static String oldgrid;
    static int a;
    Gameplay() {
        oldgrid = "";
        a = 0;
    }
    void play(Board playerhits,Board computerships,String grid) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Board b = new Board();
        try {
            if (b.checkMove(grid,computerships)) {
                System.out.println("\u000C");
                System.out.println("\nTotal points - "+playerhits.points+"\n");
                b.hitShip(grid,playerhits,computerships);
                b.printBoxes(playerhits);
            }
            else if(b.verify(grid)) {
                System.out.println("\u000C");
                System.out.println("\nTotal points - "+playerhits.points+"\n");
                b.missShip(grid,playerhits);
                b.printBoxes(playerhits);
                System.out.println("NO HIT in "+grid);
                if (grid.equalsIgnoreCase(oldgrid))
                    System.out.println("WARNING - Hitting the same grid repeatedly reduces your score...");
            }
        }
        catch (Exception e) {
            playerhits.c--;
            System.out.println("Please enter valid grid number");
        }
        oldgrid = grid;
        playerhits.c++;
    }
    String play(Board hits,Board ships,String grid,boolean smart) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Board b = new Board();
        if (Gameplay.a>4) {
            Gameplay.a = 0;
        }
        try {
            if (b.checkMove(grid,ships)) {
                System.out.println("\u000C");
                System.out.println("\nTotal points - "+hits.points+"\n");
                b.hitShip(grid,hits,ships);
                b.printBoxes(hits);
                if (Gameplay.a<5) {
                    Gameplay.a++;
                    smart = true;
                }
            }
            else if(b.verify(grid)) {
                System.out.println("\u000C");
                System.out.println("\nTotal points - "+hits.points+"\n");
                b.missShip(grid,hits);
                b.printBoxes(hits);
                System.out.println("NO HIT in "+grid);
                if (grid.equalsIgnoreCase(oldgrid))
                    System.out.println("WARNING - Hitting the same grid repeatedly reduces your score...");
            }
        }
        catch (Exception e) {
            hits.c--;
        }
        oldgrid = grid;
        hits.c++;
        if (smart)
            return grid;
        else
            return "";
    }
    void scorecard(Board b) throws Exception {
        try {
            new Printables().gameover();
            double score = getScore(b);
            System.out.println("\n\t\t\t*** Score is - "+score+" out of 100 ***");
        }
        catch (Exception e) {
            System.out.println("\n\n\t\t\t\t\tNO SCORES TO BE DISPLAYED!\n\n\t\t\t\t\tHope you enjoyed the game.\n\n\t\t\t\t\tPlay again soon ;-)");
        }
    }
    double getScore(Board b) throws Exception {
        try {
            double score = (double) ((double)b.points/(double)b.c);
            if (score==0.0)
                return score;
            score *= 10;
            score = Math.ceil(score);
            return score;
        }
        catch (Exception e) {
            return 0.0;
        }
    }
}