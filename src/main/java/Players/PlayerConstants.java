package Players;

public class PlayerConstants {
    public enum Coordinates{
        BLUE_HOME(0,0);

        int x;
        int y;
        Coordinates(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
