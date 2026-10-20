public class Pawn extends ChessPiece {

    public Pawn() {
        super();
        setPieceType(PieceType.PAWN);
    }

    public Pawn(String color, ColType column, int row) {
        super(PieceType.PAWN, color, column, row);
    }

    @Override
    public boolean verifyMove(ColType newX, int newY) {
        // White moves up (+1), Black moves down (-1); one square, same column
        int direction;
        if (getColor().equals("WHITE")) {
            direction = 1;
        } else {
            direction = -1;
        }

        int rowDifference = newY- this.getY();
        //can only move one space 'forward' for that pieces color
        if (rowDifference == direction) {
            return true;
        }
        return false;
    }
}
