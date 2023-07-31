package com.jobPost.hiring.factories;

import com.jobPost.hiring.entities.Candidate;
import com.jobPost.hiring.entities.Job;

public class CandidateFactory {
    // TODO - refactor
    public static Candidate makeFromRepository(
        String name,
        String birthday,
        String office,
        Job jobApplied,
        String about
    ) {
        return new Candidate(
            name,
            birthday,
            office,
            jobApplied,
            about
        );
    }
}
