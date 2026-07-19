package org.v.service;

import org.v.model.Candidate;
import org.v.repository.VoterRepository;
import org.v.repository.VoterRepositoryImpl;

public class VoterServiceImpl implements VoterService {

	private VoterRepository repo = new VoterRepositoryImpl();

	@Override
	public boolean registerVoter(Candidate candidate) {
		if (candidate == null) {
			return false;
		}

		if (candidate.getAge() < 18) {
			return false;
		}
		
		return repo.registerVoter(candidate);
	}

}
