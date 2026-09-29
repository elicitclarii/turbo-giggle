public class Bishop extends ChessPiece {

    public Bishop() {
        super();
        this.type = PieceType.BISHOP;
    }

    public boolean verifyTarget(ColType newX, int newY) {
        return isBishopMove(newX, newY);
    }

    private boolean isBishopMove(ColType newX, int newY) {
        int columnDifference = Math.abs(newX.ordinal() - this.column.ordinal());
        int rowDifference = Math.abs(newY - this.row);

        // Bishop moves diagonally
        // The column and row distances must be equal
        // Make sure it is not staying in the same position
        return columnDifference > 0
            && columnDifference == rowDifference;
    }
}
