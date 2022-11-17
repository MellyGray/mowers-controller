package mowers.controller.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mowers.controller.domain.Mower;
import mowers.controller.domain.Tableau;

public class MowersControllerTest {
    private MowersController controller;
    private Tableau tableau;

    @BeforeEach
    protected void setUp() {
        tableau = mock(Tableau.class);
        controller = new MowersController(tableau);
    }

    @Test
    void mowers_move_to_final_position_given_a_valid_instruction() {
        Mower firstMower = new Mower("1 3 N");
        Mower secondMower = new Mower("5 1 E");
        List<Mower> mowers = new ArrayList<Mower>();
        mowers.add(firstMower);
        mowers.add(secondMower);

        doReturn(mowers).when(tableau).mowers();

        String instruction = "5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM";
        MowersFinalPositionDTO expecteMowersResponse = new MowersFinalPositionDTO("1 3 N\n5 1 E");
        MowersFinalPositionDTO mowersResponse = controller
                .move(new MowersInstructionDTO(instruction));

        verify(tableau, atLeastOnce()).runInstruction(instruction);
        assertEquals(expecteMowersResponse, mowersResponse);
    }
}
