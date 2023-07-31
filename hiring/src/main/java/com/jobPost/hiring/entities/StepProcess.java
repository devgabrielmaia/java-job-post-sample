package com.jobPost.hiring.entities;

import com.jobPost.hiring.enums.StepStatus;

public class StepProcess {
    private String title;
    private String note;
    private StepStatus status;

    public StepProcess(String title) {
        this.title = title;
        this.status = StepStatus.OPENED;
    }

    public void complete() {
        this.status = StepStatus.COMPLETED;
    }

    public Boolean isCompleted() {
        return this.status.equals(StepStatus.COMPLETED);
    }

    public Boolean isOpened() {
        return this.status.equals(StepStatus.OPENED);
    }

    public Boolean isSkipped() {
        return this.status.equals(StepStatus.SKIPPED);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
