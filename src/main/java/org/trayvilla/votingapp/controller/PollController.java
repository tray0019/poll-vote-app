package org.trayvilla.votingapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.trayvilla.votingapp.model.Poll;
import org.trayvilla.votingapp.request.Vote;
import org.trayvilla.votingapp.services.PollService;

import java.util.List;

@RestController
@RequestMapping("/api/polls")
@CrossOrigin(origins = {"http://localhost:4200/",
        "https://poll-vote-app-frontend.onrender.com/"})
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

    // POST
    // VOTE
    // -> Service

    /**
     *
     * @param vote
     */
    @PostMapping("/vote")
    public void vote(@RequestBody Vote vote){
         pollService.vote(vote.getPollId(), vote.getOptionIndex());
    }


    @GetMapping("/healthz")
    public String ok(){
        return "ok";
    }

}
