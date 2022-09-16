import GameConfig.GamePlayStatus;
import GameConfig.GameState;
import Players.BluePawn;
import Players.GreenPawn;

import java.util.Scanner;

public class RoughTest {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        GameState b = new GameState();
        String[][] board= b.loadBoard();
        System.out.println("Printing the Board");
        for(int i = 0; i<15; i++){
            for(int j = 0; j<15; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        BluePawn bp1 = new BluePawn("NK");
        bp1.setFree();
        System.out.println("x: "+bp1.x+" y: "+ bp1.y);

        int value = scan.nextInt();
        GamePlayStatus gps = bp1.roll(value);

        System.out.println("x: "+bp1.x+" y: "+ bp1.y);
        System.out.println(gps.getStatusMsg());

//        GreenPawn gp1 = new GreenPawn("Kumar");
//        gp1.setFree();
//        System.out.println("x: "+gp1.x+" y: "+gp1.y);
//        int value = scan.nextInt();
//
//        GamePlayStatus gps = gp1.roll(value);
//        System.out.println("x: "+gp1.x+" y: "+gp1.y);
//        System.out.println("Msg: "+gps.getStatusMsg());


    }
}
