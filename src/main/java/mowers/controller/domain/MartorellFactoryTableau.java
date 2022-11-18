package mowers.controller.domain;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MartorellFactoryTableau implements Tableau{
    private List<Mower> mowers;

    public List<Mower> runInstruction(Instruction instruction){
        for(MowerInstruction mowerInstruction: instruction.moversInstructions()){
            Mower mower = new Mower(instruction.limitPosition(), mowerInstruction.initialPosition());
            mowers.add(mower);

            mower.run(mowerInstruction.movement());
        }

        return mowers;
    }

    public List<Mower> mowers() {
        return mowers;
    }
}
