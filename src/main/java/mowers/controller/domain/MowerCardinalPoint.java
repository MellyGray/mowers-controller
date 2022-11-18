package mowers.controller.domain;

public enum MowerCardinalPoint {
    ANY("ANY"),
    N("N"),
    E("E"),
    S("S"),
    W("W"),;

    private String value;

    MowerCardinalPoint(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}