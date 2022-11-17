package mowers.controller.domain;

public final class Mower {
    private String finalPosition;

    public Mower(String finalPosition) {
        this.finalPosition = finalPosition;
    }

    public String finalPosition() {
        return finalPosition;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        if (finalPosition == null) {
            if (other.finalPosition != null)
                return false;
        } else if (!finalPosition.equals(other.finalPosition))
            return false;
        return true;
    }
}
