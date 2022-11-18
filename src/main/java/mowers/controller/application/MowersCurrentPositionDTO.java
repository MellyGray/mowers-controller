package mowers.controller.application;

import java.util.List;
import java.util.stream.Collectors;

import mowers.controller.domain.Mower;

public final class MowersCurrentPositionDTO {
    private final String currentPosition;

    public MowersCurrentPositionDTO(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String currentPosition() {
        return currentPosition;
    }

    public static MowersCurrentPositionDTO fromAggregates(List<Mower> mowers) {
        String currentPosition = mowers.stream().map(mower -> mower.currentPosition().toString())
                .collect(Collectors.joining("\\n"));

        return new MowersCurrentPositionDTO(currentPosition);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((currentPosition == null) ? 0 : currentPosition.hashCode());
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
        MowersCurrentPositionDTO other = (MowersCurrentPositionDTO) obj;
        if (currentPosition == null) {
            if (other.currentPosition != null)
                return false;
        } else if (!currentPosition.equals(other.currentPosition))
            return false;
        return true;
    }
}
