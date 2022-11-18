package mowers.controller.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MowerTest {
    @Test
    void run_mower_to_its_final_position_first_mower() {
        String movement = "LMLMLMLMM";
        MowerPosition currentPositionExpected = new MowerPosition(1, 3, new NCardinalPoint());
        Mower mower = new Mower(new MowerPosition(5, 5, new NCardinalPoint()),
                new MowerPosition(1, 2, new NCardinalPoint()));

        mower.run(movement);

        assertEquals(currentPositionExpected, mower.currentPosition());
    }

    @Test
    void run_mower_to_its_final_position_second_mower() {
        String movement = "MMRMMRMRRM";
        MowerPosition currentPositionExpected = new MowerPosition(5, 1, new ECardinalPoint());
        Mower mower = new Mower(new MowerPosition(5, 5, new NCardinalPoint()),
                new MowerPosition(3, 3, new ECardinalPoint()));

        mower.run(movement);

        assertEquals(currentPositionExpected, mower.currentPosition());
    }
}
