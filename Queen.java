public class Queen extends Rook {

    public Queen() {
        super();
        setPieceType(PieceType.QUEEN);
    }

    public Queen(String color, ColType column, int row) {
        super(color, column, row);   // Rook -> queen inheritance chain
        setPieceType(PieceType.QUEEN);    // then overwrite the inherited type
    }

    @Override
    public boolean verifyMove(ColType newX, int newY) {
        // Inherited Rook rule (straight lines) OR the diagonal rule.
        // Queen extends Rook, so the diagonal part has to be added here
        return super.verifyMove(newX, newY) || isDiagonalMove(newX, newY);
    }
}