package mowers.controller.domain;

public interface CardinalPoint {
    public CardinalPoint next();

    public CardinalPoint previous();

    public Integer movexPosition(Integer xPosition);

    public Integer moveyPosition(Integer yPosition);
}
