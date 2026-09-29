public class Chessboard{

    private static final int max_Row = 8;
    private static final int min_Row = 1;
    // private static final ColType column; final declarations have to be used, aslso we pass the column in as a parameter each time, doesn't need to be a stored attribute - danny

    //enum types ensure that it would be within the bounds so as 
    //long as it is not null and the rows are within bounds it passes

    public boolean withinChessboard(ColType x, int y) {
        return x != null && y >= min_Row && y <= max_Row;
    }

}

// Clari's Notes -  check if the enum ColType field is 
//          getting the parameter correctly