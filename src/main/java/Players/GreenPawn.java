package Players;

import GameConfig.GameConstants;
import GameConfig.GamePlayStatus;

public class GreenPawn extends Player implements PlayerActions {

    GreenPawn(){ //to restrict object creation without a name

    }

    public GreenPawn(String name){
        super.home_x = GameConstants.Coordinates.GREEN_HOME.getX();
        super.home_y = GameConstants.Coordinates.GREEN_HOME.getY();
        super.color = PlayerProperties.GREEN.getColorCode();
        super.name = PlayerProperties.GREEN.getColor()+"_"+name;
    }

    @Override
    public void setFree() { //when set free the Pawns will be ready to move and placed in the first box for them to roll
        super.x = GameConstants.Coordinates.GREEN_START.getX();
        super.y = GameConstants.Coordinates.GREEN_START.getY();
        super.isFree = true;
    }

    @Override
    public GamePlayStatus roll(int value) {
        return super.roll(value);
    }
}
