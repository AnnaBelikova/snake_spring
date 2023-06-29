package org.game.snake;

public class Snake {

    int startLength = 1;
    public Snake( int length, int maxLength) {
        if(length > 0 && length <= maxLength){
            startLength = length;
        }
    }
}
