package mowers.controller.domain;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface Tableau {
    public List<Mower> runInstruction(String instruction);

    public List<Mower> mowers();
}
