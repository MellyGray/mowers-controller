package mowers.controller.domain;

import java.util.ArrayList;
import java.util.List;

public final class Instruction {
    private MowerPosition limitPosition;
    private List<MowerInstruction> moversInstructions;

    public Instruction(MowerPosition limitPosition, List<MowerInstruction> moversInstructions) {
        this.limitPosition = limitPosition;
        this.moversInstructions = moversInstructions;
    }

    public MowerPosition limitPosition() {
        return limitPosition;
    }

    public List<MowerInstruction> moversInstructions() {
        return moversInstructions;
    }

    public static Instruction fromInstructionString(String instruction) {
        String[] instructionLines = instruction.split("\n");
        List<MowerInstruction> moversInstructions = new ArrayList<MowerInstruction>();
        MowerPosition limitPosition = MowerPosition.fromInstructionLine("0 0");

        for (int i = 0; i < instructionLines.length; i++) {
            if (i == 0) {
                limitPosition = MowerPosition.fromInstructionLine(instructionLines[0]);
                continue;
            }
            moversInstructions.add(
                    new MowerInstruction(MowerPosition.fromInstructionLine(instructionLines[i]),
                            instructionLines[i + 1]));
            i++;
        }

        return new Instruction(limitPosition, moversInstructions);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((limitPosition == null) ? 0 : limitPosition.hashCode());
        result = prime * result + ((moversInstructions == null) ? 0 : moversInstructions.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Instruction other = (Instruction) obj;
        if (limitPosition == null) {
            if (other.limitPosition != null)
                return false;
        } else if (!limitPosition.equals(other.limitPosition))
            return false;
        if (moversInstructions == null) {
            if (other.moversInstructions != null)
                return false;
        } else if (!moversInstructions.equals(other.moversInstructions))
            return false;
        return true;
    }
}
