import java.awt.*;
import java.util.Arrays;
import email.EmailValidator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fixed");
        EmailValidator checkEmail = new EmailValidator();
        System.out.println(checkEmail.isEmailValid("sandy.cheeks@email.com"));
        System.out.println(rentalYield(1300, 250000));
    }

    public static double rentalYield(double rent, double origPrice) {
        double result = 0;
        double annualIncome = rent * 12;
        result = (annualIncome / origPrice) * 100;
        return result;
    }
}