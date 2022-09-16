package Players;

import GameConfig.GameConstants;
import GameConfig.GamePlayStatus;

public class YellowPawn extends Player implements PlayerActions {

    YellowPawn(){ //to restrict object creation without a name

    }

    public YellowPawn(String name){
        super.home_x = GameConstants.Coordinates.YELLOW_HOME.getX();
        super.home_y = GameConstants.Coordinates.YELLOW_HOME.getY();
        super.color = PlayerProperties.YELLOW.getColorCode();
        super.name = PlayerProperties.YELLOW.getColor()+"_"+name;
    }

    @Override
    public void setFree() { //when set free the Pawns will be ready to move and placed in the first box for them to roll
        super.x = GameConstants.Coordinates.YELLOW_START.getX();
        super.y = GameConstants.Coordinates.YELLOW_START.getY();
        super.isFree = true;
    }

    @Override
    public GamePlayStatus roll(int value) {
        return super.roll(value);
    }
}
