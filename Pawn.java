public class Pawn extends ChessPiece{

    public Pawn(){
        super();
        this.type = PieceType.PAWN;
    }

    //the following code was adopted and modified from Lab2

    public boolean verifyTarget(ColType targetColumn, int targetRow) {
        return isForwardMove(targetColumn, targetRow);
    }

    private boolean isForwardMove(ColType targetColumn, int targetRow) {
        if (targetColumn != this.column) {
            return false;
        }
        int direction;
        // white pieces start on row 2, increment on +1 ->> Black pieces start on row 7, decrement on -1
        if (this.color.equalsIgnoreCase("White")) {
            direction = 1;
        } else {
            direction = -1;
        }
        int rowDifference = targetRow - this.row;
        //can only move one space 'forward' for that pieces color
        if (rowDifference == direction) {
            return true;
        }return false;
    }

}