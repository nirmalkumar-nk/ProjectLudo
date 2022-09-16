package Players;

import GameConfig.GamePlayStatus;

public interface PlayerActions {
    void setFree();
    GamePlayStatus roll(int value);
}
