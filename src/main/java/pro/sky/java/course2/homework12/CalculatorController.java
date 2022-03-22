package pro.sky.java.course2.homework12;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService sum;
    private final CalculatorService subtract;
    private final CalculatorService multiply;
    private final CalculatorService divide;
    private final CalculatorService answerGreeting;

    public CalculatorController(CalculatorService sum, CalculatorService subtract, CalculatorService multiply,
                                CalculatorService divide, CalculatorService answerGreeting) {
        this.sum = sum;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
        this.answerGreeting = answerGreeting;
    }

    @GetMapping(path = "/calculator")
    public String answerGreeting() {
        return  answerGreeting.answerGreeting();
    }

    @GetMapping(path = "/calculator/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + sum.sum(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + subtract.subtract(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + multiply.multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
        if (num2 == 0) {
            return "Делить на ноль нельзя.";
        }
        return num1 + " / " + num2 + " = " + divide.divide(num1, num2);
    }
}
