public class Queen extends Rook {

    public Queen() {
        super();
        this.type = PieceType.QUEEN;
    }

    public boolean verifyTarget(ColType newX, int newY) {
        return isQueenMove(newX, newY);
    }

    private boolean isQueenMove(ColType newX, int newY) {
        int columnDifference = Math.abs(newX.ordinal() - this.column.ordinal());
        int rowDifference = Math.abs(newY - this.row);

        // Queen can move like a Rook
        boolean rookMove = (columnDifference == 0 && rowDifference > 0)
            || (columnDifference > 0 && rowDifference == 0);

        // Queen can also move like a Bishop
        boolean bishopMove = columnDifference > 0
            && columnDifference == rowDifference;

        return rookMove || bishopMove;
    }
}
