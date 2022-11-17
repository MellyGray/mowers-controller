package mowers.controller.controllers;

import java.security.Principal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mowers.controller.application.MowersController;
import mowers.controller.application.MowersFinalPositionDTO;
import mowers.controller.application.MowersInstructionDTO;

@RestController
public final class MowersInstructionPostController {
    private MowersController controller;

    public MowersInstructionPostController(MowersController controller) {
        this.controller = controller;
    }

    @PostMapping(value = "/mowers/move")
    public ResponseEntity<String> move(@RequestBody Request request) {
        MowersFinalPositionDTO mowers = controller.move(new MowersInstructionDTO(request.instruction()));

        return new ResponseEntity<String>(mowers.finalPosition(), HttpStatus.OK);
    }
}

final class Request {
    private String instruction;

    String instruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
