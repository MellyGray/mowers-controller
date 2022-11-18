package mowers.controller.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MowerTest {
    @Test
    void run_mower_to_its_final_position() {
        String movement = "LMLMLMLMM";
        MowerPosition finalPositionExpected = new MowerPosition(1, 3, MowerCardinalPoint.N.value());
        Mower mower = new Mower(new MowerPosition(5, 5, MowerCardinalPoint.ANY.value()),
                new MowerPosition(1, 2, MowerCardinalPoint.N.value()));

        mower.run(movement);

        assertEquals(finalPositionExpected, mower.finalPosition());
    }
}
