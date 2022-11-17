package mowers.controller.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MowerControllerTest {
    private MowersController controller;

    @BeforeEach
    protected void setUp() {
        controller = new MowersController();
    }

    @Test
    void mowers_move_to_final_position_given_a_valid_instruction() {
        MowersFinalPositionDTO expecteMowersResponse = new MowersFinalPositionDTO("1 3 N 5 1 E");
        MowersFinalPositionDTO mowersResponse = controller
                .move(new MowersInstructionDTO("5 5 1 2 N LMLMLMLMM 3 3 E MMRMMRMRRM"));

        assertEquals(expecteMowersResponse, mowersResponse);
    }
}
