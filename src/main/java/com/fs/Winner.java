package com.fs;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Winner {

	public static void main(String[] args) throws ParseException {
		System.out.println("Computing Winner of the Election");

		Candidate c1 = new Candidate("A", "GM", "20/08/1985", 105);
		Candidate c2 = new Candidate("B", "MS", "20/08/1986", 50);
		Candidate c3 = new Candidate("C", "BS", "20/08/1987", 75);
		Candidate c4 = new Candidate("A", "GM", "20/08/1984", 105);

		List<Candidate> candidateList = new ArrayList<>();
		candidateList.add(c1);
		candidateList.add(c2);
		candidateList.add(c3);
		candidateList.add(c4);

		Candidate winner = computeWinner(candidateList);
		System.out.println(winner.getFirstName() + "-" + winner.getSurName() + winner.getDob());

	}

	private static Candidate computeWinner(List<Candidate> candidateList) {

		Candidate winner = null;
		List<Candidate> reComuteCandidates = new ArrayList<>();
		for (Candidate candidate : candidateList) {

			if (winner == null) {
				winner = candidate;
			} else {
				if (candidate.getVotes() > winner.getVotes()) {
					winner = candidate;
				} else if (candidate.getVotes() == winner.getVotes()) {
					reComuteCandidates.add(winner);
					reComuteCandidates.add(candidate);
				}
			}
		}

		if (!reComuteCandidates.isEmpty()) {
			Optional<Candidate> firstNameCandidateWinner = reComuteCandidates.stream()
					.sorted((object1, object2) -> object1.getFirstName().compareTo(object2.getFirstName())).findFirst();

			winner = firstNameCandidateWinner.get();
			final String winnerFirstName = winner.getFirstName();
			boolean sameFirstNameExists = reComuteCandidates.stream()
					.anyMatch(candidate -> candidate.getFirstName().equals(winnerFirstName));

			if (sameFirstNameExists) {
				Optional<Candidate> surNameCandidateWinner = reComuteCandidates.stream()
						.sorted((object1, object2) -> object1.getSurName().compareTo(object2.getSurName())).findFirst();

				winner = surNameCandidateWinner.get();
				final String winnerSurName = winner.getSurName();
				boolean sameSurNameExists = reComuteCandidates.stream()
						.anyMatch(candidate -> candidate.getSurName().equals(winnerSurName));
				
				if(sameSurNameExists) {
					// Compute on DOB
					
					reComuteCandidates.sort((o1,o2) -> o1.getDob().compareTo(o2.getDob()));
					winner = reComuteCandidates.get(0);
				}
			}
		}

		return winner;
	}

}
