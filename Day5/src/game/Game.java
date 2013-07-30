package game;



import java.util.Random;
import java.util.Scanner;


/**
 * Created by Administrator on 13-7-25.
 */
public class Game {
    int n ;
    public Game(){}
    public Game(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public  static void start(){

        Game game=new Game();
        System.out.println("S "+"M "+"L ");
        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        if(s.equalsIgnoreCase("s")) {
            game.setN(5);
        }
        else if(s.equalsIgnoreCase("M"))  {
           game.setN(10);
        }
        else if(s.equalsIgnoreCase("L")) {
            game.setN(15);
        }
        int Matrix[][] = new int[game.getN()][game.getN()];
        Random random = new Random();
        for(int i=0;i<Matrix.length;i++){
            for (int j = 0; j <Matrix.length; j++) {
                Matrix[i][j] = random.nextInt(6);
                System.out.print("  " + Matrix[i][j]);
            }
            System.out.println();
        }
    }
    public void playGame(){
    }
}

