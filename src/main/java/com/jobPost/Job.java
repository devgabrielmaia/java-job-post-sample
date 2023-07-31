package com.jobPost;

import org.json.JSONObject;

import java.math.BigDecimal;

public class Job {
    private String title;
    private BigDecimal salary;

    public Job(String title, BigDecimal salary) {
        this.title = title;
        this.salary = salary;
    }

    public String toJson() {
        JSONObject json = new JSONObject();
        json.put("title", this.title);
        json.put("salary", this.salary);
        return json.toString();
    }
}