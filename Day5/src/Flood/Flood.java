package Flood;

/**
 * Created by Administrator on 13-7-25.
 */
public class Flood {
    public static final int LEN=14;
    public static final char[]COLORS={'A','B','C','D','E','F'};
    private static char[][]matrix=new char[LEN][LEN];

    public static void main(String[] args) {
        for (int x = 0; x < LEN; x++) {
            for (int y = 0; y <LEN ; y++) {
                matrix[x][y]=COLORS[(int)(Math.random()*6)];
                System.out.print(matrix[x][y]+" ");
            }
            System.out.println();
        }
    }
}
