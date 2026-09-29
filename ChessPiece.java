abstract class ChessPiece{

    // private doesn't allow subclass to directly access the attributes, changed to protected so they can access w .this -danny 
    protected PieceType type;
    protected String color;
    protected ColType column;
    protected int row;

    public ChessPiece(PieceType typeIn, String colorIn, ColType x, int y){
        this.type = typeIn;
        this.color = colorIn;
        this.column = x;
        this.row = y;
    }

    public ChessPiece(){
        // empty doesn't need to be assigned to itself, only when you're passing values in, otherwise you're just assigning the null values twice -danny
        // this.type = type;
        // this.color = color;
        // this.column = column;
        // this.row = row;
    }

    public PieceType getPieceType(){
        return type;
    }

    public String getColor(){
        return color;
    }

    public ColType getX(){
        return column;
    }

    public int getY(){
        return row;
    }

    public void setPieceType(PieceType typeIn){
        this.type = typeIn;
    }

    //changed to &&, WHITE OR BLACK should be accepted, but not when it's neither color, also has to throw exception so it doesn't set the color anyway -danny
    public void setPieceColor(String color){
        if (!"WHITE".equals(color) && !"BLACK".equals(color)) {
            throw new IllegalArgumentException("This color cannot be applied, it must be either WHITE or BLACK");
        }
        this.color = color;
    }

    public void setY(int rowNum){
        this.row = rowNum;
    }

    public void setX(ColType columnLetter){
        this.column = columnLetter;
    }

    abstract boolean verifyTarget(ColType newX, int newY);

}