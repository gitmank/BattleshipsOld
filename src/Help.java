import java.io.*;
class Help {
    Help() {
    }
    void displayHelp() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Printables p = new Printables();
        while(true) {
            System.out.print("\u000c");
            System.out.println("\n\t\t\t*** HELP SECTION ***\n");
            System.out.println("When you select the \"Play\" option...\n");
            Thread.sleep(1500);
            System.out.println("-->> You will be asked to play a toss to set the difficulty of the game.\n");
            Thread.sleep(2500);
            System.out.println("-->> If the difficulty is decided as \"EASY\" :\n");
            Thread.sleep(1000);
            System.out.println("        * The computer will randomly plot FOUR ships on the board.");
            Thread.sleep(1000);
            System.out.println("        * The ships may be of FOUR GRIDS length or FIVE GRIDS length.");
            Thread.sleep(1000);
            System.out.println("        * Two ships will be placed vertically and two will be placed horizontally.");
            Thread.sleep(1000);
            System.out.println("        * This is because more the number of ships the greater your chances of scoring will be.\n");
            Thread.sleep(1000);
            System.out.println("-->> If the difficulty is decided as \"HARD\" :\n");
            Thread.sleep(2500);
            System.out.println("        * The computer will randomly plot THREE ships on the board.");
            Thread.sleep(1000);
            System.out.println("        * The ships may be of FOUR GRIDS length or FIVE GRIDS length.");
            Thread.sleep(1000);
            System.out.println("        * Two ships will be placed vertically and one will be placed horizontally.");
            Thread.sleep(1000);
            System.out.println("        * This is because lesser the number of ships smaller your chances of scoring will be.\n");
            Thread.sleep(1000);
            System.out.println("-->> If you have chosen to challenge the Computer...\n");
            Thread.sleep(1000);
            System.out.println("        * You will be allowed to plot FOUR ships at grids of your choice.");
            Thread.sleep(1000);
            System.out.println("        * You may plot two ships horizontally and two vertically.");
            Thread.sleep(1000);
            System.out.println("        * You may only plot ships FOUR GRIDS in length.\n");
            Thread.sleep(1500);
            System.out.println("Type 'x' to go to menu...\nPress ENTER key to read further...");
            if (br.readLine().equalsIgnoreCase("x")) {
                break;
            }
            System.out.println("-->> Signs and Symbols :\n");
            Thread.sleep(1000);
            System.out.println("        * The grids with parts of a ship will be indicated by \"++\".");
            Thread.sleep(1000);
            System.out.println("        * However, the computer's ship parts shall not be revealed to you.");
            Thread.sleep(1000);
            System.out.println("        * The grids that you have hit, but not found a ship part in will be indicated by \"!!\".");
            Thread.sleep(1000);
            System.out.println("        * The grids that you have hit and found a ship part in will be indicated by \"XX\".");
            Thread.sleep(1000);
            System.out.println("        * By default all other grids are indicated by their grid numbers.\n");
            Thread.sleep(1500);
            System.out.println("Type 'x' to go to menu...\nPress ENTER key to read further...");
            if (br.readLine().equalsIgnoreCase("x")) {
                break;
            }
            System.out.println("-->> Board and Grids :\n");
            Thread.sleep(1000);
            System.out.println("        * The playing board has EIGHT rows and EIGHT columns.");
            Thread.sleep(1000);
            System.out.println("        * The rows are numbered from 1 to 8.");
            Thread.sleep(1000);
            System.out.println("        * The columns are lettered from 'A' to 'H'.");
            Thread.sleep(1000);
            System.out.println("        * Grids are labelled from 'A1' to 'H8'.");
            Thread.sleep(1000);
            System.out.println("        * The grid labels are not case sensitive. You may enter 'a1' or 'A1' while playing.\n");
            Thread.sleep(1500);
            System.out.println("Type 'x' to go to menu...\nPress ENTER key to read further...");
            if (br.readLine().equalsIgnoreCase("x")) {
                break;
            }
            System.out.println("-->> Gameplay and Scoring :\n");
            Thread.sleep(1000);
            System.out.println("        * You wil be presented with a board on which the computer has plotted ships.");
            Thread.sleep(1000);
            System.out.println("        * You can have umlimited chances to take hits at grids.");
            Thread.sleep(1000);
            System.out.println("        * Every successful hits earns you 10 points.");
            Thread.sleep(1000);
            System.out.println("        * Every wasted hit counts against your final score.");
            Thread.sleep(1000);
            System.out.println("        * You can exit the game at any time by entering 'x' instead of a grid number");
            Thread.sleep(1000);
            System.out.println("        * Your final score will be your accuracy percentage calculated by dividing number of successful hits by total hits made.");
            Thread.sleep(1000);
            System.out.println("        * Any invalid nonsensical grid numbers entered will NOT affect your score.");
            Thread.sleep(1000);
            System.out.println("        * If your score is in TOP TEN scores till date, it will earn you a spot in the Hall Of Fame in TOP SCORES section\n");
            Thread.sleep(1500);
            System.out.println("Type 'x' to go to menu...\nPress ENTER key to read further...");
            if (br.readLine().equalsIgnoreCase("x")) {
                break;
            }
            System.out.println("-->> In case you have challenged the Computer...\n");
            Thread.sleep(1000);
            System.out.println("        * You wil be presented with a board on which you must plot ships.");
            Thread.sleep(1000);
            System.out.println("        * The computer will have same number of tries as you.");
            Thread.sleep(1000);
            System.out.println("        * The computer will try to beat your score.");
            Thread.sleep(1000);
            System.out.println("        * Every successful hits earns 10 points.");
            Thread.sleep(1000);
            System.out.println("        * Wasted hits WILL count against the score.");
            Thread.sleep(1000);
            System.out.println("Hit ENTER key to return to Menu...");
            br.readLine();
            break;
        }
        p.loadingscreen();
        MAIN.main();
    }
}