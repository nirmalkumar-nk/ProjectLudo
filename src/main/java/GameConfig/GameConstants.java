package GameConfig;

public class GameConstants {

    public enum Coordinates{

        BLUE_HOME(9, 9),
        RED_HOME(9, 5),
        GREEN_HOME(5, 5),
        YELLOW_HOME(5, 9),

        BLUE_START(9,7 ),
        RED_START(7,5),
        GREEN_START(5, 7),
        YELLOW_START(7, 9);


        int x;
        int y;
        Coordinates(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return x;
        }

        public int getY(){
            return y;
        }
    }
}
