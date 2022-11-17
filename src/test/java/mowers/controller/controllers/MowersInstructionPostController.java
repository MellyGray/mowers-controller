package mowers.controller.controllers;

import org.junit.jupiter.api.Test;

import mowers.controller.RequestTestCase;

public class MowersInstructionPostController extends RequestTestCase{
    @Test
    void process_mowers_instruction_and_return_mowers_position() throws Exception {
        String instruction = "{\"instruction\":\"5 5 1 2 N LMLMLMLMM 3 3 E MMRMMRMRRM\"}";
        String position = "{\"position\": \"1 3 N 5 1 E\"}";

        assertRequestWithBody(
                "POST",
                "/mowers/move",
                instruction,
                200,
                position);
    }
}
