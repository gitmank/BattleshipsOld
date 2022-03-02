import java.io.*;
class Menu {
    Menu() {
    }
    void display() throws Exception {
        Printables p = new Printables();
        System.out.print("\u000c");
        p.menu();
        Thread.sleep(650);
        System.out.println("\n\t-->  1) PLAY");
        Thread.sleep(650);
        System.out.println("\n\t-->   2) HELP");
        Thread.sleep(650);
        System.out.println("\n\t-->    3) CREDITS");
        Thread.sleep(650);
        System.out.println("\n\t-->     4) TOP SCORES");
        Thread.sleep(650);
        System.out.println("\n\t-->      5) --ABOUT--");
        Thread.sleep(650);
        System.out.println("\n\t-->       6) X- EXIT -X");
        System.out.println("\nEnter option number of your choice from 1 - 6...");
    }
    int collect() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i =0;
        while (true) {
            try {
                i = Integer.parseInt(br.readLine());
                if ((i>0)&&(i<7))
                    break;
                System.out.println("\nPlease enter valid option number from 1 - 6 only!");
            }
            catch (Exception e) {
                System.out.println("\nPlease enter valid option number from 1 - 6 only!");
                continue;
            }
        }
        return i;
    }
}