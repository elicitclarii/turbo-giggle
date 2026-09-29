public class Rook extends ChessPiece {

    public Rook() {
        super();
        this.type = PieceType.ROOK;
    }

    public boolean verifyTarget(ColType newX, int newY) {
        return isRookMove(newX, newY);
    }

    private boolean isRookMove(ColType newX, int newY) {
        int columnDifference = Math.abs(newX.ordinal() - this.column.ordinal());
        int rowDifference = Math.abs(newY - this.row);

        // Rook moves horizontally or vertically
        // Make sure it is not staying in the same position
        return (columnDifference == 0 && rowDifference > 0)
            || (columnDifference > 0 && rowDifference == 0);
    }
}
