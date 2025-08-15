package org.trayvilla.votingapp.services;

import org.springframework.stereotype.Service;
import org.trayvilla.votingapp.Repository.PollRepository;
import org.trayvilla.votingapp.model.Poll;

@Service
public class PollService {

    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }
}
