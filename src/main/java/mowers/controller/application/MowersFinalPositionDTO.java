package mowers.controller.application;

import java.util.List;
import java.util.stream.Collectors;

import mowers.controller.domain.Mower;

public final class MowersFinalPositionDTO {
    private final String finalPosition;

    public MowersFinalPositionDTO(String finalPosition) {
        this.finalPosition = finalPosition;
    }

    public String finalPosition() {
        return finalPosition;
    }

    public static MowersFinalPositionDTO fromAggregates(List<Mower> mowers) {
        String finalPosition = mowers.stream().map(mower -> mower.finalPosition().toString())
                .collect(Collectors.joining("\n"));

        return new MowersFinalPositionDTO(finalPosition);
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
        MowersFinalPositionDTO other = (MowersFinalPositionDTO) obj;
        if (finalPosition == null) {
            if (other.finalPosition != null)
                return false;
        } else if (!finalPosition.equals(other.finalPosition))
            return false;
        return true;
    }
}
