package com.jobPost.hiring.entities;

import com.jobPost.hiring.enums.Errors;
import com.jobPost.hiring.enums.HiringStatus;
import com.jobPost.hiring.exceptions.HiringError;

import java.util.ArrayList;

public class HiringProcess {
    private Recruiter recruiter;
    private final ArrayList<Recruiter> previousRecruiter;
    private final Candidate candidate;
    private final Job job;
    private final ArrayList<StepProcess> stepProcess;
    private HiringStatus status;

    public HiringProcess(
        Recruiter recruiter,
        Candidate candidate,
        Job job,
        ArrayList<StepProcess> stepProcess,
        HiringStatus status
    ) {
        this.recruiter = recruiter;
        this.candidate = candidate;
        this.job = job;
        this.stepProcess = stepProcess;
        this.previousRecruiter = new ArrayList<Recruiter>();
        this.status = status;
    }

    public StepProcess currentStep() {
        return this.stepProcess
            .stream()
            .filter(StepProcess::isOpened)
            .findFirst()
            .orElseGet(
                () -> this.stepProcess.get(this.stepProcess.size() - 1)
            );
    }

    public void completeCurrentStep() throws HiringError {
        StepProcess currentStep = this.currentStep();
        if (!currentStep.isOpened()) {
            throw new HiringError(Errors.STEP_ALREADY_COMPLETED.getMessage());
        }
        currentStep.complete();
    }

    public void changeRecruiter(Recruiter recruiter) {
        this.previousRecruiter.add(this.recruiter);
        this.recruiter = recruiter;
    }

    public Boolean hasOpenedStep() {
        return this.stepProcess.stream().anyMatch(StepProcess::isOpened);
    }

    public void hire() throws HiringError {
        if (this.hasOpenedStep()) {
            throw new HiringError(Errors.MUST_COMPLETE_STEPS.getMessage());
        }
        this.status = HiringStatus.HIRED;
    }

    public ArrayList<Recruiter> getPreviousRecruiter() {
        return this.previousRecruiter;
    }

    public Recruiter getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(Recruiter recruiter) {
        this.recruiter = recruiter;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public Job getJob() {
        return job;
    }

    public ArrayList<StepProcess> getStepProcess() {
        return stepProcess;
    }

    public void addExtraStepProcess(StepProcess stepProcess) {
        this.stepProcess.add(stepProcess);
    }

    public HiringStatus getStatus() {
        return this.status;
    }
}
