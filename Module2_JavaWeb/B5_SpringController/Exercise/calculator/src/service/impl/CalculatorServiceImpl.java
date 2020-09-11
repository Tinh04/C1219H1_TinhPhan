package service.impl;

import org.springframework.stereotype.Service;
import service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String Calculate(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return String.valueOf(operand1 + operand2);
            case "-":
                return String.valueOf(operand1 - operand2);
            case "x":
                return String.valueOf(operand1 * operand2);
            case "/":
                if (operand2 != 0) {
                    return String.valueOf(operand1 / operand2);
                } else {
//                    throw new RuntimeException("operation can't divide");
                    return "operation can't divide";
                }
            default:
                return "invalid operation";
        }
    }
}
