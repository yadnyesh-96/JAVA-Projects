package org.v.repository;

import org.v.model.Candidate;

public interface VoterRepository {
	boolean registerVoter(Candidate candidate);
}
