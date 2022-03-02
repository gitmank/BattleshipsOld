import java.io.*;
class TopScores {
    TopScores() {
    }
    void display() throws Exception {
        BufferedReader fr = new BufferedReader(new FileReader("topscores.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t\t*** HALL OF FAME ***\n");
        try {
            if (count() > 0) {
                String[] names = new String[count()];
                double[] scores = new double[count()];
                for (int i = 0;i<count();i++) {
                    names[i]   = fr.readLine();
                    scores[i] = Double.parseDouble(fr.readLine());
                }
                for (int i = 0;i<count();i++) {
                    for (int j = 0;j<count()-i-1;j++) {
                        if (scores[j]>scores[j+1]) {
                            double temp = scores[j];
                            scores[j] = scores[j+1];
                            scores[j+1] = temp;
                            String tempS = names[j];
                            names[j] = names[j+1];
                            names[j+1] = tempS;
                        }
                    }
                }
                int rank = 1;
                for (int i = count()-1;i>=count()-10;i--) {
                    System.out.println("\n\t"+rank+" -->\t"+names[i]+"\t\t"+scores[i]);
                    Thread.sleep(1000);
                    rank++;
                }
            }
            else {
                System.out.println("\tNO SCORES TO DISPLAY YET (+_+)...\n\n\tYou have a chance to be the first user in the Hall of Fame ;-)");
            }
        }
        catch (Exception e) {
        }
        fr.close();
        System.out.println("\n\nHit ENTER to return to main menu...");
        br.readLine();
        new Printables().loadingscreen();
        new MAIN(0).main();
    }
    int add(String name,double score) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("topscores.txt",true));
            PrintWriter    pw = new PrintWriter(bw);
            pw.println(name+"\n"+score);
            pw.close();
            return 1;
        }
        catch (Exception e) {
            return 0;
        }
    }
    int count() throws Exception {
        BufferedReader fr = new BufferedReader(new FileReader("topscores.txt"));
        try {
            int i = 0;
            String S = "";
            while (S!=null) {
                S = fr.readLine();
                i++;
            }
            fr.close();
            return (i-1)/2;
        }
        catch (Exception e) {
            return 0;
        }
    }
}