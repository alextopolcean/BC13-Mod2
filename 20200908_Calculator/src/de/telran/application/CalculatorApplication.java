package de.telran.application;

import de.telran.data.Calculator;
import de.telran.data.UserIneraction;
import static de.telran.data.UserIneraction.getParameter;

public class CalculatorApplication {
    public static void main(String[] args) {

        double a = getParameter();
        double b = getParameter();
        char operation = UserIneraction.operation();
        Calculator.calculation(a, b, operation);
        UserIneraction.closeScanner();
    }
}
