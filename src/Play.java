import java.io.*;
class Play {
    Play() {
    }
    void playUser(Board playerhits,Board computerships,Board computerhits,Board playerships) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Gameplay gp            = new Gameplay();
        Board    b             = new Board();

        b.defaultValues(b);
        b.defaultValues(playerhits);
        b.defaultValues(computerships);

        System.out.print("\u000c");
        System.out.println("\n* You can end the game at any time by entering 'x' instead of a grid number *");
        System.out.println("\nComputer will plot ships now...");
        Thread.sleep(2000);
        b.plotShips(computerships,Generator.difficulty);
        System.out.println("\nEnter '1' for a hint...\nHit ENTER key to continue...");
        if (br.readLine().equals("1"))
            System.out.println("\nThere will be "+b.countShips(computerships)+" ship parts on the board.");
        System.out.println("\nComputer has placed ships in the grid!\nYour turn to attack by entering a grid number...");
        Thread.sleep(2000);
        b.printBoxes(b);
        while (true) {
            if (b.countShips(computerships)==0)
                break;
            System.out.println("\nEnter a grid number to make a hit!...");
            String in = br.readLine();
            if (in.equalsIgnoreCase("x"))
                break;
            gp.play(playerhits,computerships,in);
        }
        gp.scorecard(playerhits);
        System.out.print("\nHit ENTER key to return to menu...");
        br.readLine();
        new Printables().loadingscreen();
        System.out.println("\u000c\n\nBefore you leave, would you like to challenge the computer to beat your score...?\nType 'Yes' to do so!\n\nHit ENTER key to go back to menu...");
        if (br.readLine().equalsIgnoreCase("yes"))
            new Challenge().start(computerhits,playerships,playerhits);
        double score = gp.getScore(playerhits);
        double entered_score = -10.0;
        System.out.print("\u000c");
        System.out.println("\n\nEnter your name or nickname to register your score...");
        String name = br.readLine();
        System.out.println("\nEnter your score below...\nThe score entered now will be considered while checking top scores :-Y");
        while (true) {
            try {
                entered_score = Double.parseDouble(br.readLine());
            }
            catch (Exception e) {
                System.out.println("Please enter exact score in numerical format...");
            }
            if (entered_score!= -10.0)
                break;
        }
        if (Generator.difficulty==1) {
            score += 5.0;
            System.out.println("\nYou have received FIVE POINTS for playing in Difficulty Level - HARD\n");
        }
        if (score==entered_score) {
            System.out.println("You have earned FIVE BONUS POINTS for remembering your score ;-)");
            score += 5.0;
            if (!(name.equals("#OPTOUT#")))
                new TopScores().add(name,score);
        }
        else {
            System.out.println("You could not remember your score :-*[");
            if (!(name.equals("#OPTOUT#"))) {
                new TopScores().add(name,score);
                int a = new TopScores().add(name,score);
                if (a==1)
                    System.out.println("\nScore registered \u2417\u2417;-)");
                else
                    System.out.println("Score could not be added :(");
            }
        }
        System.out.println("\nHit ENTER key to proceed to menu...");
        br.readLine();
        new Printables().loadingscreen();
        new MAIN(0).main();
    }
    void playComputer(Board computerhits,Board playerships,Board playerhits) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Gameplay  gp            = new Gameplay();
        Board     b             = new Board();
        Generator g             = new Generator();

        String g1,g2;

        b.defaultValues(b);
        b.defaultValues(computerhits);
        b.defaultValues(playerships);

        System.out.print("\u000c");
        System.out.println("You can plot ships now...");
        Thread.sleep(2000);
        b.printBoxes(b);
        System.out.println("\nChoose and enter two starting grids to plot ships horizontally...\n");
        while (true) {
            System.out.println("Enter first grid number...");
            g1 = br.readLine();
            System.out.println("\nEnter second grid number...");
            g2 = br.readLine();
            if (!(b.verify(g1)&&b.verify(g2)))
                System.out.println("\nPlease enter vaild grid numbers and try again!");
            else {
                try {
                    b.plotShips(playerships,0,g1,g2);
                }
                catch (Exception e) {
                    System.out.println("\nPlease enter vaild grid numbers and try again!");
                    continue;
                }
                break;
            }
        }
        System.out.println("\nChoose and enter two starting grids to plot ships vertically...\n");
        while (true) {
            System.out.println("Enter first grid number...");
            g1 = br.readLine();
            System.out.println("\nEnter second grid number...");
            g2 = br.readLine();
            if (!(b.verify(g1)&&b.verify(g2)))
                System.out.println("\nPlease enter vaild grid numbers and try again!");
            else {
                try {
                    b.plotShips(playerships,1,g1,g2);
                }
                catch (Exception e) {
                    System.out.println("\nPlease enter vaild grid numbers and try again!");
                    continue;
                }
                break;
            }
        }
        b.printBoxes(playerships);
        System.out.println("\nYour ships have been placed the grid!\nComputer's turn to attack, sit back and relax ;-)...");
        Thread.sleep(6000);
        System.out.print("\u000c");
        b.printBoxes(b);
        String s = "";
        String grid = g.generateGrid();
        while (computerhits.c<playerhits.c) {
            if (s.equals("")) {
                try {
                    grid = g.generateGrid();
                    s = gp.play(computerhits,playerships,grid,false);
                    Thread.sleep(1000);
                }
                catch (Exception e) {
                    continue;
                }
            }
            else {
                try {
                    if (!(b.contents(b.addR(grid),computerhits).equals("XX"))) {
                        s = gp.play(computerhits,playerships,b.addR(grid),false);
                        Thread.sleep(1000);
                    }
                    if (!(b.contents(b.subR(grid),computerhits).equals("XX"))) {
                        s = gp.play(computerhits,playerships,b.subR(grid),false);
                        Thread.sleep(1000);
                    }
                    if (!(b.contents(b.addC(grid),computerhits).equals("XX"))) {
                        s = gp.play(computerhits,playerships,b.addC(grid),false);
                        Thread.sleep(1000);
                    }
                    if (!(b.contents(b.subC(grid),computerhits).equals("XX"))) {
                        s = gp.play(computerhits,playerships,b.subC(grid),false);
                        Thread.sleep(1000);
                    }
                }
                catch (Exception e) {
                    continue;
                }
            }
            s = "";
        }
        gp.scorecard(computerhits);
        System.out.println("\nHit ENTER key to return to menu...");
        br.readLine();
    }
}