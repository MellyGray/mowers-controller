package mowers.controller.domain;

public final class Mower {
    private MowerPosition limitPosition;
    private MowerPosition initialPosition;
    private MowerPosition currentPosition;

    public Mower(MowerPosition limitPosition, MowerPosition initialPosition) {
        this.limitPosition = limitPosition;
        this.initialPosition = initialPosition;
        this.currentPosition = initialPosition;
    }

    public MowerPosition limitPosition() {
        return limitPosition;
    }

    public MowerPosition initialPosition() {
        return initialPosition;
    }

    public MowerPosition currentPosition() {
        return currentPosition;
    }

    public void run(String movement) {
        if (movement.length() == 0) {
            return;
        }

        String move = String.valueOf(movement.charAt(0));

        currentPosition.move(move);

        run(movement.substring(1));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((limitPosition == null) ? 0 : limitPosition.hashCode());
        result = prime * result + ((initialPosition == null) ? 0 : initialPosition.hashCode());
        result = prime * result + ((currentPosition == null) ? 0 : currentPosition.hashCode());
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
        Mower other = (Mower) obj;
        if (limitPosition == null) {
            if (other.limitPosition != null)
                return false;
        } else if (!limitPosition.equals(other.limitPosition))
            return false;
        if (initialPosition == null) {
            if (other.initialPosition != null)
                return false;
        } else if (!initialPosition.equals(other.initialPosition))
            return false;
        if (currentPosition == null) {
            if (other.currentPosition != null)
                return false;
        } else if (!currentPosition.equals(other.currentPosition))
            return false;
        return true;
    }
}
