package com.jobPost;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

@WebServlet("/jobs")
public class ApiController extends HttpServlet {
    @Override
    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        Job job = new Job("Senior Software Engineer", new BigDecimal("120000.29"));
        response.setContentType("application/json");
        PrintWriter output = response.getWriter();
        output.print(job.toJson());
        output.flush();
    }
}
