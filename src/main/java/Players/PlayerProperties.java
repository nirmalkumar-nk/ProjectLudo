package Players;

public enum PlayerProperties {
    BLUE('b', "Blue"),
    RED('r', "Red"),
    GREEN('g', "Green"),
    YELLOW('y', "Yellow");


    char code;
    String color;
    PlayerProperties(char code, String color){
        this.code = code;
        this.color = color;
    }

    public char getColorCode(){
        return code;
    }

    public String getColor() {
        return color;
    }
}
