package org.game.snake;

public class Field {
    private final long id;
    public int col;

    public int row;

    public Field() {
        this.id = -1;
        this.col = 9;
        this.row = 9;
    }

    public Field(long id, int col, int row) {
        this.id = id;
        this.col = col;
        this.row = row;
    }

    public long getId() {
        return id;
    }
}
