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
        for (int index = 0; index < instructionToExploreMars.length(); index++) {
            char instruction = instructionToExploreMars.charAt(index);
            if (instruction == 'R'){
                turnRight();
            }
            else if (instruction == 'L') {
                turnLeft();
            }
            else if (instruction == 'M') {
                move();
            }
        }
    }

    private void move() {
        if (direction == 'E')
            x++;
        else if (direction == 'W')
            x--;
        else if (direction == 'N')
            y++;
        else if (direction == 'S')
            y--;
    }

    private void turnLeft() {
        if (direction == 'E')
            direction = 'N';
        else if (direction == 'N')
            direction = 'W';
        else if (direction == 'W')
            direction = 'S';
        else if (direction == 'S')
            direction = 'E';
    }

    private void turnRight() {
        if (direction == 'E')
            direction = 'S';
        else if (direction == 'S')
            direction = 'W';
        else if (direction == 'W')
            direction = 'N';
        else if (direction == 'N')
            direction = 'E';
    }
}
