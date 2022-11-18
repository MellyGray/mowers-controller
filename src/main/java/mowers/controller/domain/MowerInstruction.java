package mowers.controller.domain;

public final class MowerInstruction {
    private MowerPosition initialPosition;
    private String movement;
    
    public MowerInstruction(MowerPosition initialPosition, String movement) {
        this.initialPosition = initialPosition;
        this.movement = movement;
    }

    public MowerPosition initialPosition() {
        return initialPosition;
    }

    public String movement() {
        return movement;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((initialPosition == null) ? 0 : initialPosition.hashCode());
        result = prime * result + ((movement == null) ? 0 : movement.hashCode());
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
        MowerInstruction other = (MowerInstruction) obj;
        if (initialPosition == null) {
            if (other.initialPosition != null)
                return false;
        } else if (!initialPosition.equals(other.initialPosition))
            return false;
        if (movement == null) {
            if (other.movement != null)
                return false;
        } else if (!movement.equals(other.movement))
            return false;
        return true;
    }
}
