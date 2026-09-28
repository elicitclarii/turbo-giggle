abstract class ChessPiece{

    PieceType type;
    String color;
    ColType column;
    int row;

    public ChessPiece(PieceType typeIn, String colorIn, ColType x, int y){
        this.type = typeIn;
        this.color = colorIn;
        this.column = x;
        this.row = y;
    }

    public ChessPiece(){
        this.type = type;
        this.color = color;
        this.column = column;
        this.row = row;
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

    public void setPieceColor(String color){
        if (!color.equals("WHITE")|| !color.equals("BLACK")){
            System.out.println("This color cannot be applied, it must be either white or black");
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