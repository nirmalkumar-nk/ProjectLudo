package Players;

import GameConfig.GamePlayStatus;

public class Player {

    public int x = 0;
    public int y = 0;
    public boolean isFree = false;
    public boolean isHome = false;
    public boolean toHome = false;

    public int home_x;
    public int home_y;

    public char color;
    public String name;

    protected GamePlayStatus roll(int value){
        try{
            System.out.println("Value: "+value);
            System.out.println("Rolling for: "+name);
            System.out.println("x: "+x+" y: "+y);
            int i = x;
            int j = y;
            if(isHome){
                return GamePlayStatus.PAWN_HOME;
            }else if(!isFree){
                return GamePlayStatus.PAWN_LOCKED;
            }
            while (value > 0){

                if((i>8 && j>=6 && j<=8) || (color == PlayerProperties.BLUE.getColorCode() && toHome)){//Blue Quarter
//                System.out.println("Entering Blue Quarter");
                    if(i==9 && j==6){ //changing quarter
                        i = 8;
                        j = 5;
                    }else if(color == PlayerProperties.BLUE.getColorCode() && i==14 && j==8){ //towards home
                        ++j;
                        toHome = true;
                    }else if(j==6 || (color == PlayerProperties.BLUE.getColorCode() && j==9)){ //Left Path || Journey towards home
                        --i;
                    }else if(i==14){ //Bottom Path
                        --j;
                    }else if(j==8 || (j==7 && color == PlayerProperties.BLUE.getColorCode())){// Right path || Middle Path
                        ++i;
                    }
                }else if((j<6 && i>=6 && i<=8) || (color == PlayerProperties.RED.getColorCode() && toHome)){ //Red Quarter
//                System.out.println("Entering Red Quarter");
                    if(i==6 && j==5){ //Quarter Change
                        i =5;
                        j = 6;
                    }else if(color == PlayerProperties.RED.getColorCode() && i==8 && j==0){ //towards home
                        ++i;
                        toHome = true;
                    } else if(i==6 || (color == PlayerProperties.RED.getColorCode() && i==9)){ //Top Path || Journey towards home
                        ++j;
                    } else if(j==0 /*|| (color == PlayerProperties.RED.getColor() && i==7 && j==0)*/){ //The Left Path || Changing from middle Path, Out from home
                        --i;
                    }else if(i==8 || (i==7 && color == PlayerProperties.RED.getColorCode())){ //The Bottom Path || Away from home
                        --j;
                    }
                }else if((i<6 && j>=6 && j<=8) || (color == PlayerProperties.GREEN.getColorCode() && toHome)){ //Green Quarter
//                System.out.println("Entering Green Quarter");
                    if(i==5 && j==8){ //change Quarter
//                    System.out.println("Quarter change");
                        i = 6;
                        j = 9;
                    }else if(color == PlayerProperties.GREEN.getColorCode() && i==0 && j==6){ //towards home
                        --j;
                        toHome = true;
                    }else if(j==8 || (color == PlayerProperties.GREEN.getColorCode() && j==5)){ //Right Path || Journey to home
                        ++i;
                    }else if(i==0){ //Top Path
                        ++j;
                    }else if(j==6 || (color == PlayerProperties.GREEN.getColorCode() && j==7)){ //Left Path || Middle Path
                        --i;
                    }
                } else if((j>8 && i>=6 && i<=8) || (color == PlayerProperties.YELLOW.getColorCode() && toHome)){ //Yellow Quarter
//                System.out.println("Yellow Quarter");
                    if(i==8 && j==9){ //change Quarter
//                    System.out.println("Quarter change");
                        i = 9;
                        j = 8;
                    }else if(color == PlayerProperties.YELLOW.getColorCode() && i==6 && j==14){ //towards home
                        --i;
                        toHome = true;
                    }else if(i==8 || (color == PlayerProperties.YELLOW.getColorCode() && i==5)){ //Bottom Path || Journey to Home
                        --j;
                    }else if(j==14){ //Right Path
                        ++i;
                    }else if(i==6 || (color == PlayerProperties.YELLOW.getColorCode()) && i==7){//Top Path || Middle Path
                        ++j;
                    }
                }

                --value;
//            System.out.println("\ni: "+i);
//            System.out.println("j: "+j);
                x = i;
                y = j;
                System.out.println("Remaining value: "+value+": i: "+i+" j: "+j);
                if(i==home_x && j==home_y){
                    if(value == 0){
                        isHome = true;
                        x = i;
                        y = j;
                        return GamePlayStatus.PAWN_REACHES_HOME;
                    }else {
                        return GamePlayStatus.PAWN_CANNOT_REACH_HOME;
                    }
                }
            }
            return GamePlayStatus.MOVE_SUCCESS;
        }catch (Exception e){
            System.out.println("Exception occured: "+e);
            return GamePlayStatus.UNKNOWN_ERROR;
        }
    }
}
