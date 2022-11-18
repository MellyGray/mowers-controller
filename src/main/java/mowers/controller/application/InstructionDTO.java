package mowers.controller.application;

public final class InstructionDTO {
    private final String instruction;

    public InstructionDTO(String instruction) {
        this.instruction = instruction;
    }

    public String instruction() {
        return instruction;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((instruction == null) ? 0 : instruction.hashCode());
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
        InstructionDTO other = (InstructionDTO) obj;
        if (instruction == null) {
            if (other.instruction != null)
                return false;
        } else if (!instruction.equals(other.instruction))
            return false;
        return true;
    }
}
