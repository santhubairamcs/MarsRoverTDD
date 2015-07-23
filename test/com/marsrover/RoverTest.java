package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {

    @Test
    public void shouldRoverGivesTwoThreeNWhenItIsAtTwoThreePositionAndInNorthDirection() {
        Rover rover = new Rover(2, 3, 'N');

        assertEquals("2 3 N", rover.getPositionAndDirection());
    }

    @Test
    public void shouldRoverGivesFourThreeSWhenItIsAtTwoThreePositionAndInSouthDirection() {
        Rover rover = new Rover(4, 3, 'S');

        assertEquals("4 3 S", rover.getPositionAndDirection());
    }

    @Test
    public void shouldRoverGivesOneTwoSWhenItIsAtOneTwoEastAndTurnRight() {
        Rover rover = new Rover(1, 2, 'E');
        rover.setInstructionToExploreMars("R");

        rover.go();

        assertEquals("1 2 S", rover.getPositionAndDirection());
    }
}

