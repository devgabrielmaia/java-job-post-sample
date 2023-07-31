package com.jobPost;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
//        Class<Job> jobReflection = Job.class;
//        for (Method method : jobReflection.getMethods()) {
//            Annotation[] anotation = method.getAnnotations();
//            method.invoke(jobReflection)
//        }
    }

    private static void query() {
        try {
            SqlDatabase conn = new SqlDatabase(
                    "postgresql",
                    "localhost",
                    "jobpost",
                    "postgres",
                    "123456",
                    5432
            );

            ResultSet result = conn.query();
            while (result.next()) {
                System.out.println(result.getString("title"));
            }

        } catch (SQLException error) {
            System.out.println(error);
        }
    }
}