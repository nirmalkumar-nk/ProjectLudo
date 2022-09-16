package Players;

import GameConfig.GameConstants;
import GameConfig.GamePlayStatus;

public class BluePawn extends Player implements PlayerActions {

    BluePawn(){  //to restrict object creation without a name

    }

    public BluePawn(String name){
        super.home_x = GameConstants.Coordinates.BLUE_HOME.getX();
        super.home_y = GameConstants.Coordinates.BLUE_HOME.getY();
        super.color = PlayerProperties.BLUE.getColorCode();
        super.name = PlayerProperties.BLUE.getColor()+"_"+name;
    }

    @Override
    public void setFree() { //when set free the Pawns will be ready to move and placed in the first box for them to roll
        super.x = GameConstants.Coordinates.BLUE_START.getX();
        super.y = GameConstants.Coordinates.BLUE_START.getY();
        super.isFree = true;
    }

    @Override
    public GamePlayStatus roll(int value) {
        return super.roll(value);
    }
}
