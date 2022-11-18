package mowers.controller.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MowerPositionTest {
    @Test
    void convert_from_instruction_line_to_mower_position() {
        String instructionLine = "3 3 E";
        MowerPosition mowerPositionExpected = new MowerPosition(3, 3, "E");

        assertEquals(mowerPositionExpected, MowerPosition.fromInstructionLine(instructionLine));
    }
}
