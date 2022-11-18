package mowers.controller.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class InstructionTest {
    @Test   
    void convert_from_instruction_string_to_instruction() {
        String instruction = "5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM";
        List<MowerInstruction> mowersInstructions = new ArrayList<MowerInstruction>();
        mowersInstructions.add(new MowerInstruction(MowerPosition.fromInstructionLine("1 2 N"), "LMLMLMLMM"));
        mowersInstructions.add(new MowerInstruction(MowerPosition.fromInstructionLine("3 3 E"), "MMRMMRMRRM"));

        Instruction instructionExpected = new Instruction(new MowerPosition(5, 5, MowerCardinalPoint.ANY.value()),
                mowersInstructions);

        assertEquals(instructionExpected, Instruction.fromInstructionString(instruction));
    }
}
