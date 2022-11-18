package mowers.controller.domain;

public final class ECardinalPoint implements CardinalPoint {

    @Override
    public CardinalPoint next() {
        return new SCardinalPoint();
    }

    @Override
    public CardinalPoint previous() {
        return new NCardinalPoint();
    }

    @Override
    public String toString() {
        return "E";
    }

    @Override
    public Integer movexPosition(Integer xPosition) {
        return xPosition + 1;
    }

    @Override
    public Integer moveyPosition(Integer yPosition) {
        return yPosition;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }
}