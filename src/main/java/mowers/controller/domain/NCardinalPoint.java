package mowers.controller.domain;

public final class NCardinalPoint implements CardinalPoint {
    static CardinalPoint next = new ECardinalPoint();
    static CardinalPoint previous = new WCardinalPoint();
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
        return "N";
    }

    @Override
    public Integer movexPosition(Integer xPosition) {
        return xPosition;
    }

    @Override
    public Integer moveyPosition(Integer yPosition) {
        return yPosition + 1;
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
