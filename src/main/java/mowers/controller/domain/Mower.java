package mowers.controller.domain;

public final class Mower {
    private MowerPosition limitPosition;
    private MowerPosition initialPosition;
    private MowerPosition finalPosition;

    public Mower(MowerPosition limitPosition, MowerPosition initialPosition) {
        this.limitPosition = limitPosition;
        this.initialPosition = initialPosition;
        this.finalPosition = initialPosition;
    }

    public MowerPosition limitPosition() {
        return limitPosition;
    }

    public MowerPosition initialPosition() {
        return initialPosition;
    }

    public MowerPosition finalPosition() {
        return finalPosition;
    }

    public void run(String movement){
        //TODO - run mower
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((limitPosition == null) ? 0 : limitPosition.hashCode());
        result = prime * result + ((initialPosition == null) ? 0 : initialPosition.hashCode());
        result = prime * result + ((finalPosition == null) ? 0 : finalPosition.hashCode());
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
        if (finalPosition == null) {
            if (other.finalPosition != null)
                return false;
        } else if (!finalPosition.equals(other.finalPosition))
            return false;
        return true;
    }
}
