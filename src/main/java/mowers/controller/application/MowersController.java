package mowers.controller.application;

import org.springframework.stereotype.Service;

import mowers.controller.domain.Tableau;

@Service
public final class MowersController {
    private Tableau tableau;

    public MowersController(Tableau tableau){
        this.tableau = tableau;
    }

    public MowersFinalPositionDTO move(MowersInstructionDTO instruction) {
        tableau.runInstruction(instruction.instruction());

        return MowersFinalPositionDTO.fromAggregates(tableau.mowers());
    }
}
