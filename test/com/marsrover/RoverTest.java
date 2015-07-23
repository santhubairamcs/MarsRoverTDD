package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {

    @Test
    public void shouldRoverGivesTwoThreeNWhenItIsAtTwoThreePositionAndInNorthDirection() {
        Rover rover = new Rover(2, 3, 'N');

        assertEquals("2 3 N", rover.getPositionAndDirection());
    }
}

