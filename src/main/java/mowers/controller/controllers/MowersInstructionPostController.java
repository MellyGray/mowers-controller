package mowers.controller.controllers;

import java.security.Principal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mowers.controller.application.MowerController;
import mowers.controller.application.MowersDTO;
import mowers.controller.application.MowersInstructionDTO;

@RestController
public final class MowersInstructionPostController {
    private MowerController controller;

    public MowersInstructionPostController(MowerController controller) {
        this.controller = controller;
    }

    @PostMapping(value = "/mowers/move")
    public ResponseEntity<String> move(@RequestBody Request request) {
        MowersDTO mowers = controller.move(new MowersInstructionDTO(request.instruction()));

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
