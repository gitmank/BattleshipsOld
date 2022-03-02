import java.io.*;
class About {
    About() {
    }
    void display() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t\t\t\t** ABOUT **\n");
        System.out.println("Battleship (also Battleships or Sea Battle) is a guessing game for two players.\nIt is played on ruled grids (paper or board) on which each players fleet of\nships (including battleships) are marked.\n\nThe locations of the fleets are concealed from the other player.\nPlayers alternate turns calling \"hits\" at the other player's ships, and the objective\nof the game is to destroy the opposing player's ships.\n");
        System.out.println("Battleship is known worldwide as a pencil and paper game which dates from World War I.\nIt was published by various companies as a pad-and-pencil game in the 1930s,\nand was released as a plastic board game by Milton Bradley in 1967.\nThe game has spawned electronic versions, video games, smart device apps and a film.\n");
        System.out.println("\nHit ENTER key to return to menu...");
        br.readLine();
        new Printables().loadingscreen();
        MAIN.main();
    }
}