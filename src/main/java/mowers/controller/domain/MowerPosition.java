package mowers.controller.domain;

public final class MowerPosition {
    private Integer xPosition;
    private Integer yPosition;
    private CardinalPoint cardinalPoint;

    public MowerPosition(Integer xPosition, Integer yPosition, CardinalPoint cardinalPoint) {
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

    public CardinalPoint cardinalPoint() {
        return cardinalPoint;
    }

    public void setxPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    public void setCardinalPoint(CardinalPoint cardinalPoint) {
        this.cardinalPoint = cardinalPoint;
    }

    public static MowerPosition fromInstructionLine(String instructionLine) {
        String[] instructionArray = instructionLine.split(" ");

        Integer xPosition = Integer.parseInt(instructionArray[0]);
        Integer yPosition = Integer.parseInt(instructionArray[1]);

        CardinalPoint cardinalPoint = new NCardinalPoint();

        if (instructionArray.length == 3) {
            if (instructionArray[2].equals(MowerCardinalPoint.N.value())) {
                cardinalPoint = new NCardinalPoint();
            }
            if (instructionArray[2].equals(MowerCardinalPoint.S.value())) {
                cardinalPoint = new SCardinalPoint();
            }
            if (instructionArray[2].equals(MowerCardinalPoint.E.value())) {
                cardinalPoint = new ECardinalPoint();
            }
            if (instructionArray[2].equals(MowerCardinalPoint.W.value())) {
                cardinalPoint = new WCardinalPoint();
            }
        }

        return new MowerPosition(xPosition, yPosition, cardinalPoint);
    }


    public void move(String move) {
        if (move.equals("M")) {
            moveM();
        }
        if (move.equals("L")) {
            moveL();
        }
        if (move.equals("R")) {
            moveR();
        }
    }

    private void moveM() {
        this.xPosition = cardinalPoint.movexPosition(xPosition);
        this.yPosition = cardinalPoint.moveyPosition(yPosition);
    }

    private void moveL() {
        this.cardinalPoint = cardinalPoint.previous();
    }

    private void moveR() {
        this.cardinalPoint = cardinalPoint.next();
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
