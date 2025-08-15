package org.trayvilla.votingapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.trayvilla.votingapp.model.Poll;
import org.trayvilla.votingapp.services.PollService;

import java.util.List;

@RestController
@RequestMapping("/api/polls")
public class PollController {

    private final PollService pollService;

    public PollController(PollService pollService) {
        this.pollService = pollService;
    }

    @PostMapping
    public Poll createPoll(@RequestBody Poll poll){
        return pollService.createPoll(poll);
    }

    @GetMapping
    public List<Poll> getAllPolls(){
        return pollService.getAllPolls();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Poll> getPolls(@PathVariable Long id){
        return pollService.getPollById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
