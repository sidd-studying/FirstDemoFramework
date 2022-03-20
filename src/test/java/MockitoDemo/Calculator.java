package MockitoDemo;

public class Calculator {

    CalculatorService service;

    public Calculator(CalculatorService service) {
        this.service = service;
    }

    public int add(int i, int j) {
//        return (i + j)*i;
        return service.add(i, j) * i;
    }
}
