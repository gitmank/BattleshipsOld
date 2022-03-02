import java.io.*;
public class MAIN {
    static Boolean first = true;
    MAIN(int b) {
        first = false;
    }
    public static void main(String[] args) throws Exception {
        main();
    }
    public static void main() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Printables p = new Printables();
        Menu menu = new Menu();
        if(first) {
            Printables.welcomescreen();
            Printables.loadingscreen();
            Printables.logo();
        }
        int menuoption = 0;
        menu.display();
        menuoption = menu.collect();
        switch (menuoption) {
            case 1:
                Generator g = new Generator();
                Board playerhits = new Board();
                Board computerhits = new Board();
                Board playerships = new Board();
                Board computerships = new Board();

                p.loadingscreen();

                System.out.println("\nChoose your difficulty...\n\n\t\t1) Easy\n\t\t2) Hard\n\t\t3) Play a short fun toss game to decide the difficulty!");
                System.out.println("\n\tEnter an option number...\n\tEntering anything invalid will start the toss game X-E");
                String a = br.readLine();
                if (a.charAt(0) == '1') {
                    g.setDifficulty(0);
                } else if (a.charAt(0) == '2') {
                    g.setDifficulty(1);
                } else {
                    p.loadingscreen();
                    g.tossDifficulty();
                }
                new Play().playUser(playerhits, computerships, computerhits, playerships);
                break;
            case 2:
                p.loadingscreen();
                new Help().displayHelp();
                break;
            case 3:
                p.loadingscreen();
                new Credits().credits();
                break;
            case 4:
                p.loadingscreen();
                new TopScores().display();
                break;
            case 5:
                p.loadingscreen();
                new About().display();
                break;
            case 6:
                System.out.println("\n\n\t\tType \"M\" to go back to menu...\n\n\t\tPress ENTER key to confirm exit...");
                if (br.readLine().equalsIgnoreCase("m")) {
                    new MAIN(0).main();
                } else {
                    p.gameover();
                    System.out.println("\n\n\t\t--x--YOU MAY CLOSE THE WINDOW--x--");
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + menuoption);
        }
    }
}
