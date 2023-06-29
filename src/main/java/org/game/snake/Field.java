package org.game.snake;

public class Field {
    private long id;
    private int col;

    private int row;

    private int snakeLength;

    Snake snake;

    public Field() {
        this.id = -1;
        this.col = 9;
        this.row = 9;
        this.snakeLength = 2;
        this.snake = new Snake(snakeLength, col);
    }
    public long getId() {
    return id;
}
    public void setId(long id) {
        this.id = id;
    }

    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSnakeLength() {
        return snakeLength;
    }
    public void setSnakeLength(int snakeLength) {
        this.snakeLength = snakeLength;
    }

//    public Field(long id, int col, int row, int snakeLength) {
//        this.id = id;
//        this.col = col;
//        this.row = row;
//        this.snake = new Snake(snakeLength, col);
//    }

}
