package GameConfig;

public enum GamePlayStatus {


    //Pawn Errors
    PAWN_LOCKED(501, "Pawn in lock, cannot be moved."),
    PAWN_HOME(502, "Pawn is safe home, let us not disturb it."),
    PAWN_CANNOT_REACH_HOME(503, "The roll value cannot take Pawn home. Exact roll needed."),


    //Unknown error
    UNKNOWN_ERROR(999, "Unknown error occurred, shall be an exception"),

    //Success Moves
    MOVE_SUCCESS(201, "Pawn move was successful"),
    PAWN_REACHES_HOME(202, "Pawn reached home successfully");

    private int statusCode;
    private String statusMsg;
    GamePlayStatus(int statusCode, String statusMsg){
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }

    public int getStatusCode(){
        return statusCode;
    }

    public String getStatusMsg(){
        return statusMsg;
    }
}
