package org.example.je_lab2.servlets;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.je_lab2.CalculationStrategy;
import org.example.je_lab2.SumCalculationStrategy;
import org.example.je_lab2.calculations.SumOfTerms;
import org.example.je_lab2.model.Result;

@WebServlet(name = "calculate", value = "/calculate")
public class SumServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=UTF-8");

        CalculationStrategy strategy = new SumCalculationStrategy();
        Result result = strategy.calculate(request);

        request.setAttribute("result", result);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/sum.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
