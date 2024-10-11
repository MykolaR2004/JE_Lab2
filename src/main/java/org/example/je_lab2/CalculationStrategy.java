package org.example.je_lab2;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.example.je_lab2.model.Result;

import java.util.List;

public interface CalculationStrategy {
    Result calculate(HttpServletRequest request);
}

