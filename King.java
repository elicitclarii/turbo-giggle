public class King extends Queen {

    public King() {
        super();
        setPieceType(PieceType.KING);
    }

    public King(String color, ColType column, int row) {
        super(color, column, row);   // queen constr -> king inheritance 
        setPieceType(PieceType.KING);    // then overwrite the inherited type
    }

    @Override
    public boolean verifyMove(ColType newX, int newY) {
        // A King moves like a Queen, but only for ONE square
        return super.verifyMove(newX, newY)
            && Math.max(columnDistance(newX), rowDistance(newY)) == 1;
    }
}