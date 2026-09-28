public class Knight extends ChessPiece{

    public Knight(){
        super();
        this.type = PieceType.KNIGHT;
    }

    //the following code was adopted and modified from Lab2
    public boolean verifyTarget(ColType newX, int newY){
        return isKnightMove(newX, newY);
    }

    private boolean isKnightMove(ColType newX, int newY){
        int columnDifference = Math.abs(newX.ordinal() - this.column.ordinal());
        int rowDifference = Math.abs(newY - this.row);

        return (columnDifference == 2 && rowDifference == 1)
            || (columnDifference == 1 && rowDifference == 2);
    }
}