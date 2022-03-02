import java.io.*;
public class Printables {
    static void welcomescreen() throws Exception {
        String line[] = new String[5];
        line[0] = "---W-------------W----E E E E----L----------C-C------O-----M-------M---E E E E-----";
        line[1] = "----W-----W-----W-----E----------L--------C--------O---O---M-M---M-M---E-----------";
        line[2] = "-----W----W----W------E E E------L--------C-------O-----O--M---M---M---E E E-------";
        line[3] = "------W-W---W-W-------E----------L--------C--------O---O---M---M---M---E-----------";
        line[4] = "-------W-----W--------E E E E----L L L L----C-C------O-----M-------M---E E E E-----";
        for (int k = 3;k>0;k--) {
            System.out.println("\u000C");
            System.out.println("\n\n");
            for (int i = 0;i<5;i++) {
                System.out.println();
                for (int j = 0;j<line[i].length();j++) {
                    System.out.print(line[i].charAt(j));
                    Thread.sleep(5);
                }
            }
            Thread.sleep(1500);
        }
    }
    static void loadingscreen() throws Exception {
        System.out.print("\u000C");
        for(int i=1;i<6;i++) {
            System.out.print("\t\t  Loading\n\t\t");
            for(int j=1;j<=6;j++) {
                System.out.print("===");
                Thread.sleep(100);
                System.out.print(">>>");
            }
            System.out.print("\u000C");
        }
    }
    static void logo() throws Exception {
        String line[] = new String[10];
        line[0] = "-----B-B-B-------A----T-T-T-T-T--T-T-T-T-T--L--------E-E-E-E-----";
        line[1] = "-----B----B-----A-A-------T----------T------L--------E-----------";
        line[2] = "-----B-B-B-----A-A-A------T----------T------L--------E-E-E-------";
        line[3] = "-----B----B---A-----A-----T----------T------L--------E-----------";
        line[4] = "-----B-B-B---A-------A----T----------T------L-L-L-L--E-E-E-E-----";
        line[5] = "--------------------------------------S-S-S---H-----H---I-I-I-I-I---P-P-P------S-S-S--------";
        line[6] = "------------------------------------S---------H-----H-------I-------P----P---S--------------";
        line[7] = "--------------------------------------S-S-----H-H-H-H-------I-------P-P-P------S-S----------";
        line[8] = "------------------------------------------S---H-----H-------I-------P--------------S--------";
        line[9] = "-----------------------------------S-S--S-----H-----H---I-I-I-I-I---P-------S-S--S----------";
        System.out.println("\u000C");
        System.out.println("\tBattleShip\u2122");
        System.out.println("\t  Ivasion on land...Revenge at sea\u00A9");
        for (int k = 1;k>0;k--) {
            System.out.println("\n");
            for (int i = 0;i<10;i++) {
                for (int j = 0;j<line[i].length();j++) {
                    System.out.print(line[i].charAt(j));
                    Thread.sleep(10);
                }
                System.out.println();
            }
        }
    }
    void gameover() throws Exception {
        String line[] = new String[10];
        line[0] = "------------G-G-G--------A------M-------M--E-E-E-E-----";
        line[1] = "----------G-------------A-A-----M-M---M-M--E-----------";
        line[2] = "---------G----G-G-G----A-A-A----M---M---M--E-E-E-------";
        line[3] = "----------G---G---G---A-----A---M-------M--E-----------";
        line[4] = "------------G-G---G--A-------A--M-------M--E-E-E-E-----";
        line[5] = "-----------------------------------O----V-------V--E-E-E-E---R--R-R-----------";
        line[6] = "---------------------------------O---O---V-----V---E---------R-----R----------";
        line[7] = "--------------------------------O-----O---V---V----E-E-E-----R--R-R-----------";
        line[8] = "---------------------------------O---O-----V-V-----E---------R-R-R------------";
        line[9] = "-----------------------------------O--------V------E-E-E-E---R-----R----------";
        System.out.println("\u000C");
        for (int k = 3;k>0;k--) {
            System.out.println("\n\n");
            for (int i = 0;i<10;i++) {
                System.out.println(line[i]);
                Thread.sleep(200);
            }
            if (k==2)
                System.out.println("\u000C");
        }
    }
    void heads() throws Exception {
        String line[] = new String[5];
        line[0] = "--H-------H---E-E-E-E------A------D-D-----------S-S-S------";
        line[1] = "--H-------H---E-----------A-A-----D---D-------S------------";
        line[2] = "--H-H-H-H-H---E-E-E------A-A-A----D----D--------S-S--------";
        line[3] = "--H-------H---E---------A-----A---D---D-------------S------";
        line[4] = "--H-------H---E-E-E-E--A-------A--D-D---------S-S-S--------";
        for (int i = 0;i<5;i++) {
            System.out.println(line[i]);
            Thread.sleep(100);
        }
    }
    void tails() throws Exception {
        String line[] = new String[5];
        line[0] = "----T-T-T-T-T-----A------I-I-I-I-I---L----------S-S-S-----";
        line[1] = "--------T--------A-A---------I-------L--------S-----------";
        line[2] = "--------T-------A-A-A--------I-------L----------S-S-------";
        line[3] = "--------T------A-----A-------I-------L--------------S-----";
        line[4] = "--------T-----A-------A--I-I-I-I-I---L-L-L-L--S-S-S-------";
        for (int i = 0;i<5;i++) {
            System.out.println(line[i]);
            Thread.sleep(100);
        }
    }
    void menu() throws Exception {
        String line[] = new String[5];
        line[0] = "-----M-------M---E-E-E-E--N------N---U-----U-----";
        line[1] = "-----M-M---M-M---E--------N-N----N---U-----U-----";
        line[2] = "-----M---M---M---E-E-E----N--N---N---U-----U-----";
        line[3] = "-----M-------M---E--------N----N-N---U-----U-----";
        line[4] = "-----M-------M---E-E-E-E--N------N----U U U------";
        for (int i = 0;i<5;i++) {
            System.out.println(line[i]);
            Thread.sleep(100);
        }
    }
}
