import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Credits {
    Credits() {
    }
    void credits() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\u000c");
        for (int i = 15;i>0;i--) {
            for (int j = i;j>0;j--) {
                System.out.println();
            }
            System.out.println("\n\n\tCreator     -->> MANOMAY KAGALKAR\n");
            System.out.println("\tClass       -->> 10 A5\n");
            System.out.println("\tRoll number -->> 18\n");
            System.out.println("\tSchool      -->> Carmel School\n");
            System.out.println("\tSubject     -->> Computer Applications\n\t\t\t (Practicals)\n");
            System.out.println("\tBatch       -->> 2018-2019\n");
            Thread.sleep(1000);
            System.out.print("\u000c");
        }
        System.out.println("\n\t\t** CREDITS **\n");
        System.out.println("\tCreator     -->> MANOMAY KAGALKAR\n");
        System.out.println("\tClass       -->> 10 A5\n");
        System.out.println("\tRoll number -->> 18\n");
        System.out.println("\tSchool      -->> Carmel School\n");
        System.out.println("\tSubject     -->> Computer Applications\n\t\t\t (Practicals)\n");
        System.out.println("\tBatch       -->> 2018-2019\n");
        System.out.println("\n\nHit ENTER key to return to menu...");
        br.readLine();
        new Printables().loadingscreen();
        MAIN.main();
    }
}
