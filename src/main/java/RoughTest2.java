import GameConfig.GamePlayStatus;
import Players.RedPawn;
import Players.YellowPawn;

import java.util.Scanner;

public class RoughTest2 {
    public static void main(String args[]){
        RedPawn rp1 = new RedPawn("KK");
        RedPawn rp2 = new RedPawn("NK");
//
//        System.out.println("Nrp1 name: "+rp1.name);
//        System.out.println("Nrp1 name: "+rp2.name);
//
//        rp1.setFree();
//        System.out.println("x: "+rp1.x+" y: "+ rp1.y);
        Scanner scan = new Scanner(System.in);
//        int roll = scan.nextInt();
//        GamePlayStatus gps = rp1.roll(roll);
//        System.out.println(gps.getStatusMsg());

        YellowPawn yp1 = new YellowPawn("SK");

        System.out.println("yp1 name: "+yp1.name);

        yp1.setFree();
        System.out.println("x: "+yp1.x+" y: "+yp1.y);
        int value = scan.nextInt();
        System.out.println("x: "+yp1.x+" y: "+yp1.y);
        GamePlayStatus gps2 = yp1.roll(value);
        System.out.println(gps2.getStatusMsg());
    }
}
