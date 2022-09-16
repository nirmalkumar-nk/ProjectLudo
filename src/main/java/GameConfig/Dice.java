package GameConfig;

public enum Dice {
    DICE(1, true),
    TWO(2, false),
    THREE(3, false),
    FOUR(4, false),
    FIVE(5, true),
    SIX(6, true),
    TWELVE(12, true);

    private final int value;
    private final boolean repeat;

    private Dice(int value, boolean repeat) {
        this.value = value;
        this.repeat = repeat;
    }

    int getValue() {
        return this.value;
    }

    boolean getRepeat() {
        return this.repeat;
    }
}
