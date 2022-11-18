package mowers.controller.domain;

public final class SCardinalPoint implements CardinalPoint {
    static CardinalPoint next = new WCardinalPoint();
    static CardinalPoint previous = new ECardinalPoint();

    @Override
    public CardinalPoint next() {
        return next;
    }
    @Override
    public CardinalPoint previous() {
        return previous;
    }
    @Override
    public String toString() {
        return "S";
    }
    @Override
    public Integer movexPosition(Integer xPosition) {
        return xPosition;
    }

    @Override
    public Integer moveyPosition(Integer yPosition) {
        return yPosition - 1;
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
