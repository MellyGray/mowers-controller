package mowers.controller.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.security.test.context.support.WithMockUser;

import mowers.controller.RequestTestCase;

class MowersInstructionPostControllerTest extends RequestTestCase{
    @Test
    @WithMockUser(username = "user", password = "password", roles = "USER")
    void process_mowers_instruction_and_return_mowers_position() throws Exception {
        String instruction = "{\"instruction\":\"5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM\"}";
        String position = "{\"final_position\": \"1 3 N\n5 1 E\"}";

        assertRequestWithBody(
                "POST",
                "/mowers/move",
                instruction,
                200,
                position);
    }
}
