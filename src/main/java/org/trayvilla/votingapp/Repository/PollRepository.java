package org.trayvilla.votingapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.trayvilla.votingapp.model.Poll;

@Repository
public interface PollRepository extends JpaRepository<Poll, Long> {

}
