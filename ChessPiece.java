public abstract class ChessPiece {

    // private = encapsulation: only ChessPiece code can touch the data directly.
    // Subclasses read it through the getters and the protected helpers below.
    private PieceType type;
    private String color;
    private ColType column;
    private int row;

    // Empty constructor (required by the lab)
    public ChessPiece() {
    }

    // Constructor with a parameter for each field (required by the lab)
    public ChessPiece(PieceType typeIn, String colorIn, ColType x, int y) {
        this.type = typeIn;
        setPieceColor(colorIn);   // reuse the validation instead of duplicating it
        this.column = x;
        this.row = y;
    }

    public PieceType getPieceType() { return type; }
    public String getColor()        { return color; }
    public ColType getX()           { return column; }
    public int getY()               { return row; }

    // protected: only subclasses set their own type. A Pawn object can never be re-labelled ROOK from outside.
    protected final void setPieceType(PieceType typeIn) { this.type = typeIn; }

    // Validates so an invalid color is never stored
    public final void setPieceColor(String color) {
        if (!"WHITE".equals(color) && !"BLACK".equals(color)) {
            throw new IllegalArgumentException("This color cannot be applied, it must be either WHITE or BLACK");
        }
        this.color = color;
    }

    public void setX(ColType columnLetter) { this.column = columnLetter; }
    public void setY(int rowNum)           { this.row = rowNum; }

    // Each concrete piece supplies its own rule. This is what the polymorphic call in run dispatches to.
    public abstract boolean verifyMove(ColType newX, int newY);

    // ---- Shared movement helpers: written once here, reused by every subclass ----

    protected int columnDistance(ColType newX) {
        return Math.abs(newX.ordinal() - column.ordinal());
    }

    protected int rowDistance(int newY) {
        return Math.abs(newY - row);
    }

    // Horizontal or vertical, and not staying in place
    protected boolean isStraightMove(ColType newX, int newY) {
        int c = columnDistance(newX);
        int r = rowDistance(newY);
        return (c == 0 && r > 0) || (c > 0 && r == 0);
    }

    // Equal column and row distance, and not staying in place
    protected boolean isDiagonalMove(ColType newX, int newY) {
        int c = columnDistance(newX);
        return c > 0 && c == rowDistance(newY);
    }
}