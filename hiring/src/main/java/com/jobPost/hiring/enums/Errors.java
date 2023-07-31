package com.jobPost.hiring.enums;

public enum Errors {
    STEP_ALREADY_COMPLETED("Step has already been completed", 1),
    MUST_BE_EMPLOYER("The Recruiter should be employer", 2),
    MUST_COMPLETE_STEPS("Must complete all steps", 3);

    private final String message;
    private final Integer code;

    Errors(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getCode() {
        return this.code;
    }
}
