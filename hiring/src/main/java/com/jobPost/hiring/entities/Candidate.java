package com.jobPost.hiring.entities;

public class Candidate {
    private String name;
    private String birthday;
    private String office;
    private Job jobApplied;
    private String about;

    public Candidate(
        String name,
        String birthday,
        String office,
        Job jobApplied,
        String about
    ) {
        this.name = name;
        this.birthday = birthday;
        this.office = office;
        this.jobApplied = jobApplied;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Job getJobApplied() {
        return jobApplied;
    }

    public void setJobApplied(Job jobApplied) {
        this.jobApplied = jobApplied;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
