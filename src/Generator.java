import java.io.*;
class Generator {
    static int difficulty;
    Generator() {
        difficulty = 0;
    }
    int generate() {
        int index = 0;
        while (true) {
            double ind = Math.random()*10000;
            index = (int) ind;
            if (index<=7)
                break;
        }
        return index%10;
    }
    void tossDifficulty() throws Exception {
        Printables p = new Printables();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int d = 0;
        int b = generate();

        System.out.print("\u000c");
        System.out.println("If you win this toss you will be alllowed to set the diffficulty ;-P\nBut if you lose...:-E");
        System.out.println("Enter heads if you want it easy or tails if you want to play it tough...\nDon't think twice ;-/");
        System.out.println("Enter any other nonsense and we will make it easy for ourselves ;>|");
        String choice = br.readLine();

        System.out.println("\u000c");
        for (int i = 0;i<15;i++) {
            System.out.print("STARTING TOSS...".charAt(i));
            Thread.sleep(50);
        }
        Thread.sleep(500);

        System.out.println("\n");
        if (choice.equalsIgnoreCase("heads"))
            a = 0;
        if (choice.equalsIgnoreCase("tails"))
            a = 1;
        else if ((!choice.equalsIgnoreCase("heads"))&&(!choice.equalsIgnoreCase("tails"))) {
            System.out.println("We shall stand by our word and setup an unfair battleground :-9");
            Thread.sleep(1000);
            d = -101;
        }

        for (int i = 0;i<4;i++) {
            p.heads();
            Thread.sleep(500);
            System.out.print("\u000c");
            System.out.println("\n\n\n\n\n\n");
            p.tails();
            Thread.sleep(500);
            System.out.print("\u000c");
        }

        if (b>3) {
            b = 1;
        }
        else {
            b = 0;
        }
        if (a==b) {
            System.out.print("\u000c");
            if (a==0) {
                p.heads();
            }
            else {
                p.tails();
            }
            System.out.println("You won the toss!\nAll will be as you wished :-X");
            difficulty = a;
        }
        else {
            System.out.print("\u000c");
            if (a==1) {
                p.heads();
            }
            else {
                p.tails();
            }
            System.out.println("You lost the toss\nPrepare youself for a tough game xD");
            difficulty = 1;
        }
        if (d == -101)
            setDifficulty(1);
        Thread.sleep(4000);
        p.loadingscreen();
    }
    String generateGrid() {
        Board b = new Board();
        return b.convert(generate())+ String.valueOf(generate());
    }
    void setDifficulty(int a) {
        difficulty = a;
    }
}