package com.jobPost.hiring.contracts;

@FunctionalInterface
public interface NotifierCallback {
    void send(String message);
}
