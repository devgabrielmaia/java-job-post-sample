package com.jobPost.hiring.enums;

public enum PersonType {
    RECRUITER("Recruiter"),
    CANDIDATE("Candidate");

    private final String label;

    PersonType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
}
