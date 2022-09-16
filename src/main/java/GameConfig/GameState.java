package GameConfig;

import java.io.File;
import java.io.FileInputStream;

public class GameState {

    String path = "/Users/nirmalkumarp/Q/Garage/Preparation/DS/ProjectLudo/src/main/resources/LudoBoard";

    String board[][] = new String[15][15];

    public String[][] loadBoard(){
        File boardFile = new File(path);
        int c = 0; //character to read the file
        int i=0, j=0;
        try(FileInputStream boardFin = new FileInputStream(boardFile)) {
            while((c = boardFin.read()) != -1){
                if(c == '\n'){
                    i++;
                    j=0;
                }else{
                    board[i][j] = ""+(char)c;
                    j++;
                }
            }

        }catch (Exception e){
            System.out.println("Exception occured while loading the Board: "+e);
        }
        return board;
    }
}
