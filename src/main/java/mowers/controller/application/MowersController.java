package mowers.controller.application;

import org.springframework.stereotype.Service;

import mowers.controller.domain.Instruction;
import mowers.controller.domain.Tableau;

@Service
public final class MowersController {
    private Tableau tableau;

    public MowersController(Tableau tableau){
        this.tableau = tableau;
    }

    public MowersCurrentPositionDTO move(InstructionDTO request) {
        tableau.runInstruction(Instruction.fromInstructionString(request.instruction()));

        return MowersCurrentPositionDTO.fromAggregates(tableau.mowers());
    }
}
