package mowers.controller.domain;

public final class WCardinalPoint implements CardinalPoint{
    static CardinalPoint next = new NCardinalPoint();
    static CardinalPoint previous = new SCardinalPoint();

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
        return "W";
    }
    @Override
    public Integer movexPosition(Integer xPosition) {
        return xPosition - 1;
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
