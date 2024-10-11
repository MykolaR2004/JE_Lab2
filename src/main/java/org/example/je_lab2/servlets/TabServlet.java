package org.example.je_lab2.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.example.je_lab2.CalculationStrategy;
import org.example.je_lab2.TabulationCalculationStrategy;
import org.example.je_lab2.model.Result;

@WebServlet(name = "tabulate", value = "/tabulate")
public class TabServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=UTF-8");

        CalculationStrategy strategy = new TabulationCalculationStrategy();
        Result result = strategy.calculate(request);

        request.setAttribute("result", result);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/tabulation.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

