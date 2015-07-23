package com.marsrover;

public class Rover {

    private int x;
    private int y;
    private char direction;
    private String instructionToExploreMars;

    public Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String getPositionAndDirection() {
        return x + " " + y + " " + direction;
    }

    public void setInstructionToExploreMars(String instructionToExploreMars) {
        this.instructionToExploreMars = instructionToExploreMars;
    }

    public void go() {
        if (direction == 'E')
            direction = 'S';
        else if (direction == 'S')
            direction = 'W';
    }
}
