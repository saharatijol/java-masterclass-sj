import java.awt.*;
import java.util.Arrays;
import email.EmailValidator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fixed");
        EmailValidator checkEmail = new EmailValidator();
        System.out.println(checkEmail.isEmailValid("sandy.cheeks@email.com"));
    }
}