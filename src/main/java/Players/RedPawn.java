package Players;

import GameConfig.GameConstants;
import GameConfig.GamePlayStatus;

public class RedPawn extends Player implements PlayerActions {

    RedPawn(){ //to restrict object creation without a name

    }

    public RedPawn(String name){
        super.home_x = GameConstants.Coordinates.RED_HOME.getX();
        super.home_y = GameConstants.Coordinates.RED_HOME.getY();
        super.color = PlayerProperties.RED.getColorCode();
        super.name = PlayerProperties.RED.getColor()+"_"+name;
    }

    @Override
    public void setFree() { //when set free the Pawns will be ready to move and placed in the first box for them to roll
        super.x = GameConstants.Coordinates.RED_START.getX();
        super.y = GameConstants.Coordinates.RED_START.getY();
        super.isFree = true;
    }

    @Override
    public GamePlayStatus roll(int value) {
        return super.roll(value);
    }
}
