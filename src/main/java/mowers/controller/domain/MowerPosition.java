package mowers.controller.domain;

public final class MowerPosition {
    private Integer xPosition;
    private Integer yPosition;
    private String cardinalPoint;

    public MowerPosition(Integer xPosition, Integer yPosition, String cardinalPoint) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.cardinalPoint = cardinalPoint;
    }

    public Integer xPosition() {
        return xPosition;
    }

    public Integer yPosition() {
        return yPosition;
    }

    public String cardinalPoint() {
        return cardinalPoint;
    }

    public static MowerPosition fromInstructionLine(String instructionLine) {
        String[] instructionArray = instructionLine.split(" ");

        Integer xPosition = Integer.parseInt(instructionArray[0]);
        Integer yPosition = Integer.parseInt(instructionArray[1]);
        String cardinalPoint = instructionArray.length == 2 ? MowerCardinalPoint.ANY.value() : instructionArray[2];

        return new MowerPosition(xPosition, yPosition, cardinalPoint);
    }

    @Override
    public String toString() {
        return xPosition + " " + yPosition + " " + cardinalPoint;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((xPosition == null) ? 0 : xPosition.hashCode());
        result = prime * result + ((yPosition == null) ? 0 : yPosition.hashCode());
        result = prime * result + ((cardinalPoint == null) ? 0 : cardinalPoint.hashCode());
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
        MowerPosition other = (MowerPosition) obj;
        if (xPosition == null) {
            if (other.xPosition != null)
                return false;
        } else if (!xPosition.equals(other.xPosition))
            return false;
        if (yPosition == null) {
            if (other.yPosition != null)
                return false;
        } else if (!yPosition.equals(other.yPosition))
            return false;
        if (cardinalPoint == null) {
            if (other.cardinalPoint != null)
                return false;
        } else if (!cardinalPoint.equals(other.cardinalPoint))
            return false;
        return true;
    }
}
