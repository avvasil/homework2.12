package pro.sky.java.course2.homework12;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    public String answerGreeting() {
        return  "Добро пожаловать в калькулятор.";
    }
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return num1 / num2;
    }
}
