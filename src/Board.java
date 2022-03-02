import java.io.*;

class Board {
    String line[] = new String[17];
    String mid[][] = new String[8][8];
    int points,c;
    Board() {
        points = 0;
        c = 0;
    }
    Board(int p,int chances) {
        points = p;
        c = chances;
    }
    void defaultValues(Board b) {
        for (int i = 0;i<8;i++) {
            for (int j = 0,col = 'A';j<8;j++,col++) {
                b.mid[i][j] = ((char)col)+(""+(i+1));
            }
        }
    }
    String addC(String s) {
        String a = "";
        char c = convert(convert(s.charAt(0))+1);
        int  r = Integer.parseInt(s.substring(1));
        a += c;
        a += r;
        if (verify(a))
            return a;
        else
            return subC(s);
    }
    String subC(String s) {
        String a = "";
        char c = convert(convert(s.charAt(0))-1);
        int  r = Integer.parseInt(s.substring(1));
        a += c;
        a += r;
        if (verify(a))
            return a;
        else
            return addC(s);
    }
    String addR(String s) {
        int row = Integer.parseInt(s.substring(1));
        char col = s.charAt(0);
        String a = col + String.valueOf(++row);
        if (verify(a))
            return a;
        else
            return subR(s);
    }
    String subR(String s) {
        int row = Integer.parseInt(s.substring(1));
        char col = s.charAt(0);
        String a = col + String.valueOf(--row);
        if (verify(a))
            return a;
        else
            return addR(s);
    }
    String label(String s,Board b) {
        int col = convert(s.charAt(0));
        int row = Integer.parseInt(s.substring(1));
        return b.mid[row][col];
    }
    void setBoxes(Board b) {
        b.line[0] = "==================================================================";
        b.line[1] = "||  "+mid[0][0]+"  ||  "+mid[0][1]+"  ||  "+mid[0][2]+"  ||  "+mid[0][3]+"  ||  "+mid[0][4]+"  ||  "+mid[0][5]+"  ||  "+mid[0][6]+"  ||  "+mid[0][7]+"  ||";
        b.line[2] = "==================================================================";
        b.line[3] = "||  "+mid[1][0]+"  ||  "+mid[1][1]+"  ||  "+mid[1][2]+"  ||  "+mid[1][3]+"  ||  "+mid[1][4]+"  ||  "+mid[1][5]+"  ||  "+mid[1][6]+"  ||  "+mid[1][7]+"  ||";
        b.line[4] = "==================================================================";
        b.line[5] = "||  "+mid[2][0]+"  ||  "+mid[2][1]+"  ||  "+mid[2][2]+"  ||  "+mid[2][3]+"  ||  "+mid[2][4]+"  ||  "+mid[2][5]+"  ||  "+mid[2][6]+"  ||  "+mid[2][7]+"  ||";
        b.line[6] = "==================================================================";
        b.line[7] = "||  "+mid[3][0]+"  ||  "+mid[3][1]+"  ||  "+mid[3][2]+"  ||  "+mid[3][3]+"  ||  "+mid[3][4]+"  ||  "+mid[3][5]+"  ||  "+mid[3][6]+"  ||  "+mid[3][7]+"  ||";
        b.line[8] = "==================================================================";
        b.line[9] = "||  "+mid[4][0]+"  ||  "+mid[4][1]+"  ||  "+mid[4][2]+"  ||  "+mid[4][3]+"  ||  "+mid[4][4]+"  ||  "+mid[4][5]+"  ||  "+mid[4][6]+"  ||  "+mid[4][7]+"  ||";
        b.line[10]= "==================================================================";
        b.line[11]= "||  "+mid[5][0]+"  ||  "+mid[5][1]+"  ||  "+mid[5][2]+"  ||  "+mid[5][3]+"  ||  "+mid[5][4]+"  ||  "+mid[5][5]+"  ||  "+mid[5][6]+"  ||  "+mid[5][7]+"  ||";
        b.line[12]= "==================================================================";
        b.line[13]= "||  "+mid[6][0]+"  ||  "+mid[6][1]+"  ||  "+mid[6][2]+"  ||  "+mid[6][3]+"  ||  "+mid[6][4]+"  ||  "+mid[6][5]+"  ||  "+mid[6][6]+"  ||  "+mid[6][7]+"  ||";
        b.line[14]= "==================================================================";
        b.line[15]= "||  "+mid[7][0]+"  ||  "+mid[7][1]+"  ||  "+mid[7][2]+"  ||  "+mid[7][3]+"  ||  "+mid[7][4]+"  ||  "+mid[7][5]+"  ||  "+mid[7][6]+"  ||  "+mid[7][7]+"  ||";
        b.line[16]= "==================================================================";
    }
    void plotShips(Board b,int diff) {
        Generator g = new Generator();
        int s1 = g.generate(),s2 = g.generate(),s3 = g.generate();
        switch (s1) {
            case 0:
                b.mid[s1][s2] = "++";
                b.mid[s1+1][s2] = "++";
                b.mid[s1+2][s2] = "++";
                b.mid[s1+3][s2] = "++";
                b.mid[s1+4][s2] = "++";
                break;
            case 1:
                b.mid[s1][s2] = "++";
                b.mid[s1+1][s2] = "++";
                b.mid[s1+2][s2] = "++";
                b.mid[s1+3][s2] = "++";
                b.mid[s1+4][s2] = "++";
                break;
            case 2:
                b.mid[s1][s2] = "++";
                b.mid[s1+1][s2] = "++";
                b.mid[s1+2][s2] = "++";
                b.mid[s1+3][s2] = "++";
                b.mid[s1+4][s2] = "++";
                break;
            case 3:
                b.mid[s1][s2] = "++";
                b.mid[s1+1][s2] = "++";
                b.mid[s1+2][s2] = "++";
                b.mid[s1+3][s2] = "++";
                b.mid[s1+4][s2] = "++";
                break;
            case 4:
                b.mid[s1][s2] = "++";
                b.mid[s1+1][s2] = "++";
                b.mid[s1+2][s2] = "++";
                b.mid[s1+3][s2] = "++";
                break;
            case 5:
                b.mid[s1-1][s2] = "++";
                b.mid[s1][s2] = "++";
                b.mid[s1+1][s2] = "++";
                b.mid[s1+2][s2] = "++";
                break;
            case 6:
                b.mid[s1-2][s2] = "++";
                b.mid[s1-1][s2] = "++";
                b.mid[s1][s2] = "++";
                b.mid[s1+1][s2] = "++";
                break;
            case 7:
                b.mid[s1][s2] = "++";
                b.mid[s1-1][s2] = "++";
                b.mid[s1-2][s2] = "++";
                b.mid[s1-3][s2] = "++";
                b.mid[s1-4][s2] = "++";
                break;
        }
        int s4 = (s1+s2)/2;
        switch (s4) {
            case 0:
                b.mid[s3][s4] = "++";
                b.mid[s3][s4+1] = "++";
                b.mid[s3][s4+2] = "++";
                b.mid[s3][s4+3] = "++";
                b.mid[s3][s4+4] = "++";
                break;
            case 1:
                b.mid[s3][s4] = "++";
                b.mid[s3][s4+1] = "++";
                b.mid[s3][s4+2] = "++";
                b.mid[s3][s4+3] = "++";
                b.mid[s3][s4+4] = "++";
                break;
            case 2:
                b.mid[s3][s4] = "++";
                b.mid[s3][s4+1] = "++";
                b.mid[s3][s4+2] = "++";
                b.mid[s3][s4+3] = "++";
                b.mid[s3][s4+4] = "++";
                break;
            case 3:
                b.mid[s3][s4] = "++";
                b.mid[s3][s4+1] = "++";
                b.mid[s3][s4+2] = "++";
                b.mid[s3][s4+3] = "++";
                b.mid[s3][s4+4] = "++";
                break;
            case 4:
                b.mid[s3][s4] = "++";
                b.mid[s3][s4+1] = "++";
                b.mid[s3][s4+2] = "++";
                b.mid[s3][s4+3] = "++";
                break;
            case 5:
                b.mid[s3][s4-1] = "++";
                b.mid[s3][s4] = "++";
                b.mid[s3][s4+1] = "++";
                b.mid[s3][s4+2] = "++";
                break;
            case 6:
                b.mid[s3][s4-2] = "++";
                b.mid[s3][s4-1] = "++";
                b.mid[s3][s4] = "++";
                b.mid[s3][s4+1] = "++";
                break;
            case 7:
                b.mid[s3][s4-4] = "++";
                b.mid[s3][s4-3] = "++";
                b.mid[s3][s4-2] = "++";
                b.mid[s3][s4-1] = "++";
                b.mid[s3][s4] = "++";
                break;
        }
        switch (s2) {
            case 0:
                b.mid[s2][s1] = "++";
                b.mid[s2+1][s1] = "++";
                b.mid[s2+2][s1] = "++";
                b.mid[s2+3][s1] = "++";
                b.mid[s2+4][s1] = "++";
                break;
            case 1:
                b.mid[s2][s1] = "++";
                b.mid[s2+1][s1] = "++";
                b.mid[s2+2][s1] = "++";
                b.mid[s2+3][s1] = "++";
                b.mid[s2+4][s1] = "++";
                break;
            case 2:
                b.mid[s2][s1] = "++";
                b.mid[s2+1][s1] = "++";
                b.mid[s2+2][s1] = "++";
                b.mid[s2+3][s1] = "++";
                b.mid[s2+4][s1] = "++";
                break;
            case 3:
                b.mid[s2][s1] = "++";
                b.mid[s2+1][s1] = "++";
                b.mid[s2+2][s1] = "++";
                b.mid[s2+3][s1] = "++";
                b.mid[s2+4][s1] = "++";
                break;
            case 4:
                b.mid[s2][s1] = "++";
                b.mid[s2+1][s1] = "++";
                b.mid[s2+2][s1] = "++";
                b.mid[s2+3][s1] = "++";
                break;
            case 5:
                b.mid[s2-1][s1] = "++";
                b.mid[s2][s1] = "++";
                b.mid[s2+1][s1] = "++";
                b.mid[s2+2][s1] = "++";
                break;
            case 6:
                b.mid[s2-2][s1] = "++";
                b.mid[s2-1][s1] = "++";
                b.mid[s2][s1] = "++";
                b.mid[s2+1][s1] = "++";
                break;
            case 7:
                b.mid[s2][s1] = "++";
                b.mid[s2-1][s1] = "++";
                b.mid[s2-2][s1] = "++";
                b.mid[s2-3][s1] = "++";
                b.mid[s2-4][s1] = "++";
                break;
        }
        if (diff==0) {
            switch (s3) {
                case 0:
                    b.mid[s4][s3] = "++";
                    b.mid[s4][s3+1] = "++";
                    b.mid[s4][s3+2] = "++";
                    b.mid[s4][s3+3] = "++";
                    break;
                case 1:
                    b.mid[s4][s3] = "++";
                    b.mid[s4][s3+1] = "++";
                    b.mid[s4][s3+2] = "++";
                    b.mid[s4][s3+3] = "++";
                    break;
                case 2:
                    b.mid[s4][s3] = "++";
                    b.mid[s4][s3+1] = "++";
                    b.mid[s4][s3+2] = "++";
                    b.mid[s4][s3+3] = "++";
                    break;
                case 3:
                    b.mid[s4][s3] = "++";
                    b.mid[s4][s3+1] = "++";
                    b.mid[s4][s3+2] = "++";
                    b.mid[s4][s3+3] = "++";
                    break;
                case 4:
                    b.mid[s4][s3] = "++";
                    b.mid[s4][s3+1] = "++";
                    b.mid[s4][s3+2] = "++";
                    b.mid[s4][s3+3] = "++";
                    break;
                case 5:
                    b.mid[s4][s3-1] = "++";
                    b.mid[s4][s3] = "++";
                    b.mid[s4][s3+1] = "++";
                    b.mid[s4][s3+2] = "++";
                    break;
                case 6:
                    b.mid[s4][s3-2] = "++";
                    b.mid[s4][s3-1] = "++";
                    b.mid[s4][s3] = "++";
                    b.mid[s4][s3+1] = "++";
                    break;
                case 7:
                    b.mid[s4][s3-3] = "++";
                    b.mid[s4][s3-2] = "++";
                    b.mid[s4][s3-1] = "++";
                    b.mid[s4][s3] = "++";
                    break;
            }
        }
    }
    void plotShips(Board b,int dir,String s1,String s2) {
        int c1 = Integer.parseInt(s1.substring(1))-1;
        int c2 = Integer.parseInt(s2.substring(1))-1;
        int r1 = convert(s1.charAt(0));
        int r2 = convert(s2.charAt(0));
        if (dir == 0) {
            switch(r1) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    b.mid[c1][r1]   = "++";
                    b.mid[c1][r1+1] = "++";
                    b.mid[c1][r1+2] = "++";
                    b.mid[c1][r1+3] = "++";
                    break;
                case 5:
                case 6:
                case 7:
                    b.mid[c1][r1-3] = "++";
                    b.mid[c1][r1-2] = "++";
                    b.mid[c1][r1-1] = "++";
                    b.mid[c1][r1]   = "++";
                    break;
            }
            switch(r2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    b.mid[c2][r2] = "++";
                    b.mid[c2][r2+1] = "++";
                    b.mid[c2][r2+2] = "++";
                    b.mid[c2][r2+3] = "++";
                    break;
                case 5:
                case 6:
                case 7:
                    b.mid[c2][r2-3] = "++";
                    b.mid[c2][r2-2] = "++";
                    b.mid[c2][r2-1] = "++";
                    b.mid[c2][r2] = "++";
                    break;
            }
        }
        if (dir == 1) {
            switch(c1) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    b.mid[c1][r1] = "++";
                    b.mid[c1+1][r1] = "++";
                    b.mid[c1+2][r1] = "++";
                    b.mid[c1+3][r1] = "++";
                    break;
                case 5:
                case 6:
                case 7:
                    b.mid[c1-3][r1] = "++";
                    b.mid[c1-2][r1] = "++";
                    b.mid[c1-1][r1] = "++";
                    b.mid[c1][r1] = "++";
                    break;
            }
            switch(c2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    b.mid[c2][r2] = "++";
                    b.mid[c2+1][r2] = "++";
                    b.mid[c2+2][r2] = "++";
                    b.mid[c2+3][r2] = "++";
                    break;
                case 5:
                case 6:
                case 7:
                    b.mid[c2-3][r2] = "++";
                    b.mid[c2-2][r2] = "++";
                    b.mid[c2-1][r2] = "++";
                    b.mid[c2][r2] = "++";
                    break;
            }
        }
    }
    boolean checkMove(String grid,Board b) {
        try {
            grid = grid.toUpperCase();
            int row = Integer.parseInt(grid.substring(1))-1;
            int col = (int) grid.charAt(0)-65;
            if (b.mid[row][col].equals("++"))
                return true;
            else {
                return false;
            }
        }
        catch (Exception e) {
            return false;
        }
    }
    boolean checkMove(Board b,String grid) {
        grid = grid.toUpperCase();
        int row = Integer.parseInt(grid.substring(1))-1;
        int col = (int) convert(grid.charAt(0));
        if (b.mid[row][col].equals("++"))
            return true;
        else {
            return false;
        }
    }
    void hitShip(String grid,Board b1,Board b2) {
        try {
            grid = grid.toUpperCase();
            int row = Integer.parseInt(grid.substring(1))-1;
            int col = grid.charAt(0)-65;
            b1.mid[row][col] = "XX";
            b2.mid[row][col] = grid;
            b1.points += 10;
            System.out.println("You scored 10 points!\n");
        }
        catch (Exception e) {
            System.out.println("Please enter valid grid number!");
        }
    }
    void missShip(String grid,Board b) {
        grid = grid.toUpperCase();
        int row = Integer.parseInt(grid.substring(1))-1;
        int col = grid.charAt(0)-65;
        b.mid[row][col] = "!!";
    }
    void printBoxes(Board b) {
        b.setBoxes(b);
        for (int i = 0;i<17;i++) {
            System.out.println(b.line[i]);
        }
    }
    int convert(char a) {
        if ((a>='a')&&(a<='h')||(a>='A')&&(a<='H')) {
            int col = a;
            col -= 65;
            if (col<8)
                return col;
            else
                return col-32;
        }
        else
            return -101;
    }
    char convert(int a) {
        switch (a) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            case 3:
                return 'D';
            case 4:
                return 'E';
            case 5:
                return 'F';
            case 6:
                return 'G';
            case 7:
                return 'H';
            default:
                return 'Z';
        }
    }
    String convert(char a,int b) {
        String c = "";
        c += (char) a;
        c+= String.valueOf(b);
        return c;
    }
    boolean verify(String grid) {
        try {
            grid = grid.toLowerCase();
            boolean length = false,row = false,col = false;
            if (grid.length()==2)
                length = true;
            if (convert(grid.charAt(0))!=-101)
                col = true;
            if ((Integer.parseInt(grid.substring(1))>0)&&(Integer.parseInt(grid.substring(1))<9))
                row = true;
            if (row&&col&&length)
                return true;
            return false;
        }
        catch (Exception e) {
            return false;
        }
    }
    int countShips(Board b) {
        int c = 0;
        for (int i = 0;i<8;i++) {
            for (int j = 0;j<8;j++) {
                if (b.mid[i][j].equals("++"))
                    c++;
            }
        }
        return c;
    }
    String contents(String grid,Board b) {
        int i = convert(grid.charAt(0));
        int j = Integer.parseInt(grid.substring(1));
        return b.mid[i][j];
    }
}