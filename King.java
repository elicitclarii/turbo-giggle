public class King extends Queen {

    public King() {
        super();
        this.type = PieceType.KING;
    }

    public boolean verifyTarget(ColType newX, int newY) {
        return isKingMove(newX, newY);
    }

    private boolean isKingMove(ColType newX, int newY) {
        int columnDifference = Math.abs(newX.ordinal() - this.column.ordinal());
        int rowDifference = Math.abs(newY - this.row);

        // King can move one square in any direction
        // It cannot stay in the same position
        return columnDifference <= 1
            && rowDifference <= 1
            && (columnDifference > 0 || rowDifference > 0);
    }
}
