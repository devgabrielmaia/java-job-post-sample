package com.jobPost.hiring.entities;

public class Recruiter {
    private String name;
    private final Boolean employer;

    public Recruiter(String name, Boolean employer) {
        this.name = name;
        this.employer = employer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isEmployer() {
        return this.employer;
    }
}
